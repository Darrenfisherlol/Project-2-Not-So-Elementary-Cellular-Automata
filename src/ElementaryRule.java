/**
 * @Author Darren Fisher
 * @Version 1.0
 */

public class ElementaryRule extends Rule{

	private int subRuleNum = 8;

	public ElementaryRule(int ruleNum) throws InvalidRuleNumException {
		super(ruleNum);
		if ((ruleNum < 0) || (ruleNum > 255)) {
			throw new InvalidRuleNumException();
		}
	}

	public int getNumSubrules(){
		return this.subRuleNum;
	}


	// neighborhood of a cell as the cell to its left, the cell itself, and the cell to its right. 
	public Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc) {
		// center, row - . O, 
		Cell[] neightborhoodCells = new Cell[3];
		neightborhoodCells[1] = gen.getCell(cellIdx);
		//left
		neightborhoodCells[0] = bc.getNeighbor(cellIdx, -1, gen);
		// right
		neightborhoodCells[2] = bc.getNeighbor(cellIdx, 1, gen);

		return neightborhoodCells;
	}

	public EvolvedCell evolve(Cell[] neighborhood) {

		if (neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.ON && neighborhood[2].getState() == CellState.ON ) {
			EvolvedCell	offSeven = new EvolvedCell(CellState.OFF , 7);
			return offSeven;
		}
		else if (neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.ON && neighborhood[2].getState() == CellState.OFF ) {
			EvolvedCell	OnSix = new EvolvedCell(CellState.ON , 6);
			return OnSix;
		}
		else if (neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.OFF && neighborhood[2].getState() == CellState.ON ) {
			EvolvedCell	OnFive = new EvolvedCell(CellState.ON , 5);
			return OnFive;
		}
		else if (neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.OFF && neighborhood[2].getState() == CellState.OFF ) {
			EvolvedCell	OffFour = new EvolvedCell(CellState.OFF , 4);
			return OffFour;
		}
		else if (neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.ON && neighborhood[2].getState() == CellState.ON ) {
			EvolvedCell	OnThree = new EvolvedCell(CellState.ON , 3);
			return OnThree;
		}
		else if (neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.ON && neighborhood[2].getState() == CellState.OFF ) {
			EvolvedCell	OnTwo = new EvolvedCell(CellState.ON , 2);
			return OnTwo;
		}
		else if (neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.OFF && neighborhood[2].getState() == CellState.ON ) {
			EvolvedCell	OnOne = new EvolvedCell(CellState.ON , 1);
			return OnOne;
		}
		else {
			EvolvedCell	OffZero = new EvolvedCell(CellState.OFF , 0);
			return OffZero;
		}
	}

	// CHECK
	public String toString(){
		String ruleTableAll = "OOO OO. O.O O.. .OO .O. ..O ...\n";
		
		
		
		
		
		
		return ruleTableAll;
	}
		
}