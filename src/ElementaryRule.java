/**
 * @Author Darren Fisher
 * @Version 1.0
 */

public class ElementaryRule extends Rule{

	private final int SUBRULEFINAL = 8;
	
	public ElementaryRule(int ruleNum) throws InvalidRuleNumException {
		super(ruleNum);
		
		if ((ruleNum < 0) || (ruleNum > 255)) {
			throw new InvalidRuleNumException();
		}
	}

	
	public int getNumSubrules(){
		return this.SUBRULEFINAL;
	}

	
	public Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc) {
		// center, row - . O, 
		Cell[] neightborhoodCells = new Cell[3];
		
		neightborhoodCells[1] = gen.getCell(cellIdx);
		
		neightborhoodCells[0] = bc.getNeighbor(cellIdx, -1, gen);
		
		neightborhoodCells[2] = bc.getNeighbor(cellIdx, 1, gen);

		return neightborhoodCells;
	}

	public EvolvedCell evolve(Cell[] neighborhood) {

		String ruleNumBin = Integer.toBinaryString(getRuleNum());
		ruleNumBin = String.format("%08d", Integer.parseInt(ruleNumBin));
		String OffOnReturn = "";
		for (int x = 0; x < ruleNumBin.length(); x++) {
			if(ruleNumBin.charAt(x) == '1') {
				OffOnReturn = OffOnReturn + "O";
			}
			else {
				OffOnReturn = OffOnReturn + ".";
			}
		}
				
		if (neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.ON && neighborhood[2].getState() == CellState.ON ) {
			EvolvedCell	offSeven = new EvolvedCell(CellState.getState(OffOnReturn.charAt(0)), 7);
			return offSeven;
		}
		else if (neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.ON && neighborhood[2].getState() == CellState.OFF ) {
			EvolvedCell	OnSix = new EvolvedCell(CellState.getState(OffOnReturn.charAt(1)) , 6);
			return OnSix;
		}
		else if (neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.OFF && neighborhood[2].getState() == CellState.ON ) {
			EvolvedCell	OnFive = new EvolvedCell(CellState.getState(OffOnReturn.charAt(2)) , 5);
			return OnFive;
		}
		else if (neighborhood[0].getState() == CellState.ON && neighborhood[1].getState() == CellState.OFF && neighborhood[2].getState() == CellState.OFF ) {
			EvolvedCell	OffFour = new EvolvedCell(CellState.getState(OffOnReturn.charAt(3)) , 4);
			return OffFour;
		}
		else if (neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.ON && neighborhood[2].getState() == CellState.ON ) {
			EvolvedCell	OnThree = new EvolvedCell(CellState.getState(OffOnReturn.charAt(4)) , 3);
			return OnThree;
		}
		else if (neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.ON && neighborhood[2].getState() == CellState.OFF ) {
			EvolvedCell	OnTwo = new EvolvedCell(CellState.getState(OffOnReturn.charAt(5)) , 2);
			return OnTwo;
		}
		else if (neighborhood[0].getState() == CellState.OFF && neighborhood[1].getState() == CellState.OFF && neighborhood[2].getState() == CellState.ON ) {
			EvolvedCell	OnOne = new EvolvedCell(CellState.getState(OffOnReturn.charAt(6)) , 1);
			return OnOne;
		}
		else {
			EvolvedCell	OffZero = new EvolvedCell(CellState.getState(OffOnReturn.charAt(7)) , 0);
			return OffZero;
		}
	}

	public String toString(){
		String ruleTableAll = "OOO OO. O.O O.. .OO .O. ..O ...\n";
		String binaryRule = Integer.toBinaryString(getRuleNum());
		
		System.out.println("1 test" + binaryRule);
		
		// make string to keep 0001111
		binaryRule = String.format("%08d", Integer.parseInt(binaryRule));
				
		System.out.println("2 test" + binaryRule);
		
		binaryRule = binaryRule.replace('0', '.');
		binaryRule = binaryRule.replace('1', 'O');

		System.out.println("3 test" + binaryRule);
		
		StringBuilder strbuilder = new StringBuilder();
		strbuilder.append(" ");
		
		
		for (int x = 0; x < binaryRule.length(); x++) {
			if (x == binaryRule.length() - 1) {
				strbuilder.append(binaryRule.charAt(x) + " ");
				
			}
			else {
			strbuilder.append(binaryRule.charAt(x));
			strbuilder.append("   ");
			}
		}
		System.out.println("5 test final: " + ruleTableAll);
		ruleTableAll = ruleTableAll + strbuilder.toString();
		return ruleTableAll;
	}
}



