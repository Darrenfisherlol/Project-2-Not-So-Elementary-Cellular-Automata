
public abstract class Rule {


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

	}

	
	
	//Concrete Rule subclasses must also implement two methods
	public abstract int getNumSubrules(){
		//Return the number of subrules used to determine the next state of a cell from its neighborhood
	}

	public abstract Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc){

	}

	public abstract EvolvedCell evolve(Cell[] neighborhood){

	}
		
	
	//Concrete Rule subclasses must also implement two methods
	public abstract String toString(){
		//Return a string representation of the rule.
		String ruleString = Integer.toString(getRuleNum());
		return ruleString;
	}

}