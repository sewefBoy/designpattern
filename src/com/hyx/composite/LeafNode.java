package com.hyx.composite;

import java.util.List;
/**
 * Ò¶½Úµã
 * @author sewef
 *
 */
public class LeafNode implements Node{
	private String name;
	
	public LeafNode(String name){
		this.name = name;
	}
	@Override
	public void display() {
		System.out.println(name);
	}
	@Override
	public boolean add(Node node) {
		return false;
	}
	@Override
	public boolean remove(Node node) {
		return false;
	}
	@Override
	public List<Node> getChild() {
		return null;
	}

	public void display(int deep) {
		String str = "";
		for(int i=0;i<deep;i++) {
			str += "-";
		}
		System.out.println(str + name);
	}
}
