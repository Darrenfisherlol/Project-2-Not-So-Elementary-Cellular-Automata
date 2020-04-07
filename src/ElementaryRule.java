/**
 * @Author Darren Fisher
 * @Version 1.0
 */

public class ElementaryRule {

	private int ruleNum;

	public ElementaryRule(int ruleNum){
		try {
			if (ruleNum < 0 || ruleNum > 256) {
				throw new InvalidRuleNumException();
			}
		}
		catch(InvalidRuleNumException exception) {
			System.out.println("Elementary Rule: invalid rule number");
		}
		this.ruleNum = ruleNum;
	}

	public int getNumSubrules(){

	}


	// neighborhood of a cell as the cell to its left, the cell itself, and the cell to its right. 
	public Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc) {
		// center, row - . O, 
		Cell[] neightborhoodCells = new Cell[3];
		
		


	}

	public EvolvedCell evolve(Cell[] neightborhood){

	}

	public String toString(){

		String ruleTableRep = "";
		
		
		
		
		
		
		
		return ruleTanleRep;
	}
		
}