/**
 * @Author Darren Fisher
 * @Version 1.0
 */

public class ElementaryRule extends Rule{

	private int ruleNum;
	private int subRuleNum;

	public ElementaryRule(int ruleNum){
		super(ruleNum);
		try {
			if (ruleNum < 0 || ruleNum > 255) {
				throw new InvalidRuleNumException();
			}
		}
		catch(InvalidRuleNumException exception) {
			System.out.println("Elementary Rule: invalid rule number: " + ruleNum);
		}
		this.ruleNum = ruleNum;
	}

	public int getNumSubrules(){
		return subRuleNum;
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
			subRuleNum = 7;
			return offSeven;
		}
		else if (neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.ON && neighborhood[2].getState() == CellState.OFF ) {
			EvolvedCell	OnSix = new EvolvedCell(CellState.ON , 6);
			subRuleNum = 6;
			return OnSix;
		}
		else if (neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.OFF && neighborhood[2].getState() == CellState.ON ) {
			EvolvedCell	OnFive = new EvolvedCell(CellState.ON , 5);
			subRuleNum = 5;
			return OnFive;
		}
		else if (neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.OFF && neighborhood[2].getState() == CellState.OFF ) {
			EvolvedCell	OffFour = new EvolvedCell(CellState.OFF , 4);
			subRuleNum = 4;
			return OffFour;
		}
		else if (neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.ON && neighborhood[2].getState() == CellState.ON ) {
			EvolvedCell	OnThree = new EvolvedCell(CellState.ON , 3);
			subRuleNum = 3;
			return OnThree;
		}
		else if (neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.ON && neighborhood[2].getState() == CellState.OFF ) {
			EvolvedCell	OnTwo = new EvolvedCell(CellState.ON , 2);
			subRuleNum = 2;
			return OnTwo;
		}
		else if (neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.OFF && neighborhood[2].getState() == CellState.ON ) {
			EvolvedCell	OnOne = new EvolvedCell(CellState.ON , 1);
			subRuleNum = 1;
			return OnOne;
		}
//		else if (neightborhood[0].getState() == CellState.OFF && neightborhood[1].getState() == CellState.OFF && neightborhood[2].getState() == CellState.OFF ) {
//			EvolvedCell	OffZero = new EvolvedCell(CellState.OFF , 0);
//			return OffZero;
//		}
		else {
			EvolvedCell	OffZero = new EvolvedCell(CellState.OFF , 0);
			subRuleNum = 0;
			return OffZero;
		}
	}

	// CHECK
	public String toString(){
		String ruleTableAll = "OOO OO. O.O O.. .OO .O. ..O ...\n .   O   O   .   O   O   O   . ";
		return ruleTableAll;
	}
		
}