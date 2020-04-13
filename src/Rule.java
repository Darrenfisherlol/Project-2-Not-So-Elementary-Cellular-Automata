/**
 * @Author Darren Fisher
 * @Version 1.0
 * Worked with TA during office hours, Wilson, Melissa E
 * Discussed with Barrett Shannon and Megan Khoury
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
		
		//Cell[] ArrayNeighborhood = new Cell[gen.size()];
		EvolvedCell nexGenNeighborhood;
		EvolvedCell[] cellnextGenNeighborhood = new EvolvedCell[gen.size()];
		
		for (int x = 0; x < gen.size(); x++) {
			//ArrayNeighborhood = getNeighborhood(x, gen, bc);
			
			nexGenNeighborhood = evolve(getNeighborhood(x, gen, bc));
			
			cellnextGenNeighborhood[x] = nexGenNeighborhood;
		}
		
		Generation nextGenCell = new Generation(cellnextGenNeighborhood);
		
		return nextGenCell;
	}
	
	public abstract int getNumSubrules();

	public abstract Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc);
	
	public abstract EvolvedCell evolve(Cell[] neighborhood);		
	
	public abstract String toString();

}