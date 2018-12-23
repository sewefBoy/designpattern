package com.test;

import com.hyx.composite.BranchNode;
import com.hyx.composite.LeafNode;
import com.hyx.composite.Node;

public class CompositeTest {
	public static void main(String[] args) {
		Node parNode = new BranchNode("C");
		Node branNode1 = new BranchNode("֦Ҷ1");
		Node leafNode1 = new LeafNode("Ҷ��1");
		parNode.add(branNode1);
		parNode.add(leafNode1);
		branNode1.add(new BranchNode("֦Ҷ1����֦Ҷ11"));
		branNode1.add(new BranchNode("֦Ҷ1����֦Ҷ21"));
		
		parNode.display(1);
	}
}
