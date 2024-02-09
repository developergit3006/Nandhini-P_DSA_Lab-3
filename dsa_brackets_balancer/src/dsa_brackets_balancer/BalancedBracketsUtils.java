package dsa_brackets_balancer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BalancedBracketsUtils {
	public static Set<BracketPair> getAllPredefinedBrackets(){
		Set<BracketPair> predefinedBrackets= new HashSet<BracketPair>();
		predefinedBrackets.add(new BracketPair('(',')'));
		predefinedBrackets.add(new BracketPair('[',']'));
		predefinedBrackets.add(new BracketPair('{','}'));
		predefinedBrackets.add(new BracketPair('<','>'));
		
		return predefinedBrackets;
	}
	public static Set<Character> getOpenBracketCharsSet(){ 
	    Set<BracketPair> predefinedBrackets = getAllPredefinedBrackets();
	    Set<Character> result = new HashSet<Character>();
	    
	    Iterator<BracketPair> iterator = predefinedBrackets.iterator();
	    while (iterator.hasNext()) {
	        BracketPair bracketPair = iterator.next();
	        result.add(bracketPair.getOpenChar());			
	    }		
	    return result;
	}
		public static Set<Character> getCloseBracketCharsSet(){ 
		    Set<BracketPair> predefinedBrackets = getAllPredefinedBrackets();
		    Set<Character> result = new HashSet<Character>();
		    
		    Iterator<BracketPair> iterator = predefinedBrackets.iterator();
		    while (iterator.hasNext()) {
		        BracketPair bracketPair = iterator.next();
		        result.add(bracketPair.getCloseChar());			
		    }		
		    return result;
		}
		
		public static Character getOpenBracketChar(Character closeBracket) {
		    Set<BracketPair> predefinedBrackets = getAllPredefinedBrackets();
		    for (BracketPair predefinedBracket : predefinedBrackets) {
		        if (predefinedBracket.getCloseChar().equals(closeBracket)) {
		            return predefinedBracket.getOpenChar();
		        }
		    }
		    return null;
		}      

}
