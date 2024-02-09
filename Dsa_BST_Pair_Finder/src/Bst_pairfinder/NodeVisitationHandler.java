package Bst_pairfinder;

import java.util.Set;

import dsa_binarysearchtree.Node;

public interface NodeVisitationHandler{
	
	 void handle(Node currentNode,Set<Integer>previousVisitedNodes);

}
