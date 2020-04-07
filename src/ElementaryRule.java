
public class ElementaryRule {

	private int ruleNum;

	public ElementaryRule(int ruleNum){
		try {
			if (ruleNum < 0 || ruleNum > 255) {
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


	// ISSUE WITH DIAGRAM bc bc 
	public Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc) {



	}

	public EvolvedCell evolve(Cell[] neightborhood){

	}

	public String toString(){

	}
		
}