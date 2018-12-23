package com.hyx.composite;

import java.util.ArrayList;
import java.util.List;
/**
 * ֦�ڵ�
 * 
 * 
���ģʽ�����νṹ��
Ҷ�ڵ��֦�ڵ��ʵ�ֽڵ����
֦�ڵ���Լ�����չ��
Ҷ�ڵ�Ĭ��ʵ�ָ��ӿڹ���ڵ�ķ������������κβ�����ֻ�������������Ϊ�ķ�����
֦�ڵ�ʵ�ָ��ӿڹ���ڵ�ķ������ñ����ع���ö���������չ�µ�֦Ҷ��ͬʱҲ�������������Ϊ�ķ���
 * 
 * @author sewef
 *
 */
public class BranchNode implements Node {
	private String name;
	private List<Node> childNode;

	public BranchNode(String name) {
		this.name = name;
		this.childNode = new ArrayList<Node>();
	}
	@Override
	public void display() {
		System.out.println(name);
		List<Node> nodes = getChild();
		for(Node node: nodes) {
			node.display();
		}
	}

	@Override
	public boolean add(Node node) {
		return childNode.add(node);
	}

	@Override
	public boolean remove(Node node) {
		return childNode.remove(node);
	}

	@Override
	public List<Node> getChild() {
		return childNode;
	}

	public void display(int deep) {
		String str = "";
		for(int i=0;i<=deep;i++) {
			str += "-";
		}
		System.out.println(str + name);
		List<Node> nodes = getChild();
		for(Node node: nodes) {
			deep ++;
			node.display(deep);
		}
	}
}
