package Bst_pairfinder;

public class Pair {
	private Integer one;
	private Integer two;
	
	public Pair(Integer one, Integer two) {
		this.setOne(one);
		this.setTwo(two);
	}
	public Integer getOne() {
		return one;
	}
	public void setOne(Integer one) {
		this.one = one;
	}
	public Integer getTwo() {
		return two;
	}
	public void setTwo(Integer two) {
		this.two = two;
	}
	public String toString() {
		return String.format("[Pair: %d,%d]", one,two);
		
	}

}
