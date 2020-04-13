
public class TotalisticRule extends Rule {

	private final int SUBRULE = 6;

	public TotalisticRule(int ruleNum) throws InvalidRuleNumException{
		super(ruleNum);
		
			if (ruleNum < 0 || ruleNum > 63)
			throw new InvalidRuleNumException();
		
	}

	public int getNumSubrules(){
		return SUBRULE;
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
		
		String binaryRule = Integer.toBinaryString(getRuleNum());
		binaryRule = String.format("%06d", Integer.parseInt(binaryRule));
		
		String OffOnReturn = "";
		for (int x = 0; x < binaryRule.length(); x++) {
			if(binaryRule.charAt(x) == '1') {
				OffOnReturn = OffOnReturn + "O";
			}
			else {
				OffOnReturn = OffOnReturn + ".";
			}
		}
			
		
		int counterOn = 0;
		for(int x = 0; x < neighborhood.length; x++) {
			if(neighborhood[x].getState() == CellState.ON)
				counterOn = counterOn + 1;
		}
		
//		EvolvedCell	offSeven = new EvolvedCell(CellState.getState(OffOnReturn.charAt(0)), 7);
//		return offSeven;

		if (counterOn == 0) {
			EvolvedCell zero = new EvolvedCell(CellState.getState(OffOnReturn.charAt(5)), 0);
			return zero;
		}
		else if (counterOn == 1) {
			EvolvedCell one = new EvolvedCell(CellState.getState(OffOnReturn.charAt(4)), 1);
			return one;
		}
		else if (counterOn == 2) {
			EvolvedCell two = new EvolvedCell(CellState.getState(OffOnReturn.charAt(3)), 2);
			return two;
		}
		else if (counterOn == 3) {
			EvolvedCell three = new EvolvedCell(CellState.getState(OffOnReturn.charAt(2)), 3);
			return three;
		}
		else if (counterOn == 4) {
			EvolvedCell four = new EvolvedCell(CellState.getState(OffOnReturn.charAt(1)), 4);
			return four;
		}
		else {
			//5
			EvolvedCell five = new EvolvedCell(CellState.getState(OffOnReturn.charAt(0)), 5);
			return five;

		}
	}

	// CHECK 
	public String toString(){
		String ruleTableAll = "5 4 3 2 1 0\n";
		String binaryRule = Integer.toBinaryString(getRuleNum());
		System.out.println("total 1: " + binaryRule);
		// make string to keep 0001111
		binaryRule = String.format("%06d", Integer.parseInt(binaryRule));
				
		System.out.println("total 2: " + binaryRule);
		binaryRule = binaryRule.replace('0', '.');
		binaryRule = binaryRule.replace('1', 'O');

		System.out.println("total 3: " + binaryRule);
		
		StringBuilder strbuilder = new StringBuilder();
		
		System.out.println(binaryRule);
		for (int x = 0; x < binaryRule.length(); x++) {
			if (x == binaryRule.length() - 1) {
				
				strbuilder.append(binaryRule.charAt(x));
			}
			else {
			strbuilder.append(binaryRule.charAt(x));
			strbuilder.append(" ");
			}
			
		}
		ruleTableAll = ruleTableAll + strbuilder.toString();
		System.out.println(ruleTableAll);
		return ruleTableAll;
	}
}

