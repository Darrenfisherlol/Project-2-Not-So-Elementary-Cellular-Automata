/**
 * @author Darren Fisher
 * for test
 *
 */
public class Test {

	public static void main(String[] args) throws InvalidRuleNumException {
		
		// 15 cell rule 22 7
		Cell[] state1 = new Cell[15];
		state1[0] = new Cell(CellState.OFF);
		state1[1] = new Cell(CellState.OFF);
		state1[2] = new Cell(CellState.OFF);
		state1[3] = new Cell(CellState.OFF);
		state1[4] = new Cell(CellState.OFF);
		state1[5] = new Cell(CellState.OFF);
		state1[6] = new Cell(CellState.OFF);
		state1[7] = new Cell(CellState.ON);
		state1[8] = new Cell(CellState.OFF);
		state1[9] = new Cell(CellState.OFF);
		state1[10] = new Cell(CellState.OFF);
		state1[11] = new Cell(CellState.OFF);
		state1[12] = new Cell(CellState.OFF);
		state1[13] = new Cell(CellState.OFF);
		state1[14] = new Cell(CellState.OFF);

		Rule rule1 = new ElementaryRule(22);
		Generation gen1 = new Generation(state1);
		BoundaryConditions bf = new FixedBoundaryConditions(CellState.OFF, CellState.OFF);
		Automaton au1 = new Automaton(rule1 ,gen1, bf);
		System.out.println("Gen 1:" + gen1);
		System.out.println("init auto: " + au1);
		au1.evolve(7);
		System.out.println(au1.getHistory());
		
//		CellState[] state2 = {CellState.OFF, CellState.OFF, CellState.OFF, CellState.ON, CellState.OFF, CellState.OFF, CellState.OFF};
//		Generation gen2 = new Generation(state2);
//		System.out.println(gen2);
		
		
		
		
	}
}
