package dsa_binarysearchtree;

import java.util.Set;
import java.util.LinkedHashSet;
import Bst_pairfinder.NodeVisitationHandler;


public class PreOrderTraversalOperation {
	
	private BinarySearchTree binaryTree;
	private Set<Integer> visitedNodes;
	
	private NodeVisitationHandler nodeVisitationHandler;
	
	public PreOrderTraversalOperation(BinarySearchTree binaryTree) {
		this.binaryTree=binaryTree;
		this.visitedNodes=new LinkedHashSet<Integer>();
	}
	
    public void perform() {
    	preOrderInternal(binaryTree.getRoot());
   
    }
    private void preOrderInternal(Node node) {
    	if(node==null) {
    		return;
    	}
    	
    	if(this.nodeVisitationHandler !=null) {
    		this.nodeVisitationHandler.handle(node,visitedNodes);
    	}
    	
    	this.visitedNodes.add(node.getData());
    	preOrderInternal(node.getLeftNode());
    	preOrderInternal(node.getRightNode());
    }
    public Set<Integer> getVisitedNodes(){
    	return this.visitedNodes;
    }
	public void setNodeVisitationHandler(NodeVisitationHandler nodeVisitationHandler) {
		this.nodeVisitationHandler=nodeVisitationHandler;
	}
}
