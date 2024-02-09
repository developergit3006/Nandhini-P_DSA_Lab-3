package Bst_pairfinder;

import java.util.Set;

import dsa_binarysearchtree.BinarySearchTree;
import dsa_binarysearchtree.Node;
import dsa_binarysearchtree.PreOrderTraversalOperation;

public class BinarySearchTreePairFinder implements NodeVisitationHandler{

	private BinarySearchTree tree;
	private Integer sumValue;
	private Result result;
	
	public BinarySearchTreePairFinder(BinarySearchTree tree, Integer sumValue) {
		this.tree=tree;
		this.sumValue=sumValue;
		this.result=new Result();
	}
	
	public Result findPair() {
		PreOrderTraversalOperation operation=new PreOrderTraversalOperation(tree);
		operation.setNodeVisitationHandler(this);
		operation.perform();
		return this.result;
	}
	

	@Override
	public void handle(Node currentNode, Set<Integer> previousVisitedNodes) {
         
		System.out.println();
		System.out.printf("Current Node : %s", currentNode);
		System.out.println();
		System.out.printf("Previously Visited Nodes : %s", previousVisitedNodes);
		System.out.println();
		
		Integer currentNodeData=currentNode.getData();
		Integer difference=(sumValue-currentNodeData);
		if(previousVisitedNodes.contains(difference)) {
			System.out.printf("Match Identified: Sum %d, Difference: %d", sumValue,difference);
			System.out.println();
			this.result.setFound(Boolean.TRUE);
			Pair newPair=new Pair(currentNodeData,difference);
			this.result.getPairs().add(newPair);
		}
		
	}


}
