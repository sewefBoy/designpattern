package com.hyx.composite;

import java.util.List;

/**
 * ³éÏó½Úµã
 * @author sewef
 *
 */
public interface Node {
	public void display();
	public void display(int deep);
	public boolean add(Node node);
	public boolean remove(Node node);
	public List<Node> getChild();
}
