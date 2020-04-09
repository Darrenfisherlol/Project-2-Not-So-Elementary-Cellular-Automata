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
		
		Cell[] cellArrayNeighborhood = new Cell[gen.size()];
		EvolvedCell nexGenNeighborhood;
		Cell[] cellnextGenNeighborhood = new Cell[gen.size()];
		
		for (int x = 0; x < gen.size(); x++) {
			cellArrayNeighborhood = getNeighborhood(x, gen, bc);
			nexGenNeighborhood = evolve(cellArrayNeighborhood);
			cellnextGenNeighborhood[x] = nexGenNeighborhood;
		}
		
		Generation nextGenCell = new Generation(cellnextGenNeighborhood);
		
		return nextGenCell;
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