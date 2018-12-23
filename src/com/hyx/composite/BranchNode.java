package com.hyx.composite;

import java.util.ArrayList;
import java.util.List;
/**
 * 枝节点
 * 
 * 
组合模式即树形结构，
叶节点和枝节点均实现节点抽象，
枝节点可以继续扩展，
叶节点默认实现父接口管理节点的方法，但不做任何操作，只操作相关属性行为的方法。
枝节点实现父接口管理节点的方法后将用变量池管理该对象用于扩展新的枝叶，同时也操作相关属性行为的方法
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
