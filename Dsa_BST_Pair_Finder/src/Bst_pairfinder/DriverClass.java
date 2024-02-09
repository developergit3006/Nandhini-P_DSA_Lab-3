package Bst_pairfinder;

import dsa_binarysearchtree.BinarySearchTree;
import dsa_binarysearchtree.SampleBinarySearchTree;

public class DriverClass {
	public static void main(String[] args) {
		test1();
	}
	static void test1() {
		Result result=testFinderpair(100);
		System.out.println(result);
	}
	static Result testFinderpair(int sum) {
		BinarySearchTree tree= SampleBinarySearchTree.sampleBST1();
		BinarySearchTreePairFinder finder=new BinarySearchTreePairFinder(tree,sum);
		Result result=finder.findPair();
	    System.out.println();
		return result;
				
	}

}
