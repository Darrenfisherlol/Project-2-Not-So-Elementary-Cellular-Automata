/**
 * @Author Darren Fisher
 * @Version 1.0
 */

abstract class Rule {

	private int ruleNum;

	protected Rule(int ruleNum) {
		this.ruleNum = ruleNum;
	}
	
	public int getRuleNum(){
		return ruleNum;
	}

	public Generation evolve(Generation gen, BoundaryConditions bc){
		// apply the rule to a given Generation, subject to
		//the given boundary conditions,
		//to calculate the next Generation. 
		//(Hint: Use the abstract methods described above.)
		
		
		
		
	}
	
	abstract int getNumSubrules();

	abstract Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc);
	
	abstract EvolvedCell evolve(Cell[] neighborhood);		
	
	public String toString(){
		//Return a string representation of the rule.
		String ruleString = Integer.toString(getRuleNum());
		return ruleString;
	}

}