package dsa_binarysearchtree;

import java.util.Set;

public class PreOrderTraversalTest {
	public static void main(String[] args) {
		test1();
	}
	static void test1() {
		BinarySearchTree binarySearchTree= SampleBinarySearchTree.sampleBST1();
		PreOrderTraversalOperation operation=new PreOrderTraversalOperation(binarySearchTree);
		
		operation.perform();
		Set<Integer> visitedNodes=operation.getVisitedNodes();
		System.out.println(visitedNodes);
	}

}
