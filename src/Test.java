import java.util.Arrays;

/**
 * @Author Darren Fisher
 * @Version 1.0
 */
public class Test {

	public static void main(String[] args) throws InvalidRuleNumException {
		
		// 15 cell rule 22 7
		Cell[] cells = new Cell[5];
		cells[0] = new Cell(CellState.OFF);
		cells[1] = new Cell(CellState.OFF);
		cells[2] = new Cell(CellState.ON);
		cells[3] = new Cell(CellState.OFF);
		cells[4] = new Cell(CellState.OFF);


		
		Generation gen1 = new Generation(cells);
		System.out.println("Gen1 CELL: " + gen1.toString());
		
		
		
		
		
		String stateString = "..O..";
		Generation gen2 = new Generation(stateString);
		System.out.println("Gen2 STRING : " + gen2.toString());
		
		
		
//		CellState[] states = new CellState{};
//		Generation gen3 = new Generation(states);
//		System.out.println("Gen3 CELLSTATES : " + gen3.toString());

		
		
		Rule rule1 = new ElementaryRule(30);
		BoundaryConditions bf = new FixedBoundaryConditions(CellState.OFF, CellState.OFF);
		Automaton au1 = new Automaton(rule1 ,gen1, bf);
		System.out.println("Gen 1:" + gen1);
		System.out.println("init auto: " + au1);
		au1.evolve(7);
		System.out.println("test: au1 history: " + au1.getHistory());
		
		
		System.out.println("rule1 getNeighborhood: " + Arrays.deepToString(rule1.getNeighborhood(2, gen1, bf)));
		System.out.println("rule 1 to string");
		rule1.toString();
		
		Rule rule2 = new ElementaryRule(22);
		System.out.println("rule 2 to string");
		rule2.toString();
		
		
		
		
//		rule2.toString();
//		CellState[] state2 = {CellState.OFF, CellState.OFF, CellState.OFF, CellState.ON, CellState.OFF, CellState.OFF, CellState.OFF};
//		Generation gen2 = new Generation(state2);
//		System.out.println(gen2);
		
		
		
		
	}
}
