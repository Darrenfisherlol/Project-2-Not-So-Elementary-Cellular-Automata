/**
 * @Author Darren Fisher
 * @Version 1.0
 */

abstract class Rule {

	private int ruleNum;

	protected Rule( int ruleNum) {
		this.ruleNum = ruleNum;
	}
	
	// non abstract
	public int getRuleNum(){
		return ruleNum;
	}

	// non abstract
	public Generation evolve(Generation gen, BoundaryConditions bc){
		// apply the rule to a given Generation, subject to
		//the given boundary conditions,
		//to calculate the next Generation. 
		//(Hint: Use the abstract methods described above.)
		
	}
	
	//Concrete Rule subclasses must also implement two methods
	abstract int getNumSubrules();
	//Return the number of subrules used to determine the
	//next state of a cell from its neighborhood

//	 Apply the rule to a cell with the given neighborhood.
//	 The method returns a new EvolvedCell that represents
//	 the cell in the next generation.
	abstract Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc);
	
	
//	 Apply the rule to a cell with the given neighborhood.
//	 The method returns a new EvolvedCell that represents the cell in the next generation.
	abstract EvolvedCell evolve(Cell[] neighborhood);		
	
	//Concrete Rule subclasses must also implement two methods
	public String toString(){
		//Return a string representation of the rule.
		String ruleString = Integer.toString(getRuleNum());
		return ruleString;
	}

}