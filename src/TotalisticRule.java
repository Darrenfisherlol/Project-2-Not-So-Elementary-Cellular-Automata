
public class TotalisticRule extends Rule {

	private int subRules;

	public TotalisticRule(int ruleNum) throws InvalidRuleNumException{
		super(ruleNum);
		
			if (ruleNum < 0 || ruleNum > 64)
			throw new InvalidRuleNumException();
		
	}

	public int getNumSubrules(){
		return subRules;
	}

	
	public Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc){
		
		Cell[] neightborhoodCells = new Cell[5];
		neightborhoodCells[2] = gen.getCell(cellIdx);
		//left
		neightborhoodCells[0] = bc.getNeighbor(cellIdx, -2, gen);
		neightborhoodCells[1] = bc.getNeighbor(cellIdx, -1, gen);
		// right
		neightborhoodCells[3] = bc.getNeighbor(cellIdx, 1, gen);
		neightborhoodCells[4] = bc.getNeighbor(cellIdx, 2, gen);

		return neightborhoodCells;
	}

	public EvolvedCell evolve(Cell[] neighborhood){
		
//		if (neightborhood[0].getState() == CellState.ON) {
//			EvolvedCell	offSeven = new EvolvedCell(CellState.OFF , 7);
//			subRuleNum = 7;
//			return offSeven;
//		}
		
		int counterOn = 0;
		for(int x = 0; x < neighborhood.length;x++) {
			if(neighborhood[x].getState() == CellState.ON)
				counterOn = counterOn + 1;
		}
		
		if (counterOn == 0) {
			EvolvedCell zero = new EvolvedCell(CellState.OFF, 0);
			return zero;
		}
		else if (counterOn == 1) {
			EvolvedCell one = new EvolvedCell(CellState.ON, 1);
			return one;
		}
		else if (counterOn == 2) {
			EvolvedCell two = new EvolvedCell(CellState.ON, 2);
			return two;
		}
		else if (counterOn == 3) {
			EvolvedCell three = new EvolvedCell(CellState.ON, 3);
			return three;
		}
		else if (counterOn == 4) {
			EvolvedCell four = new EvolvedCell(CellState.ON, 4);
			return four;
		}
		else {
			//5
			EvolvedCell five = new EvolvedCell(CellState.ON, 5);
			return five;

		}
	}

	// CHECK 
	public String toString(){
		String tableCopy = "5 4 3 2 1 0\\n. O . O O .";
		return tableCopy;
	}
}