/**
 * @author Darren Fisher
 * for test
 *
 */
public class Test {

	public static void main(String[] args) {
		
		
		CellState[] state1 = {CellState.OFF, CellState.ON, CellState.OFF};
		CellState[] state2 = {CellState.OFF, CellState.OFF, CellState.OFF, CellState.ON, CellState.OFF, CellState.OFF, CellState.OFF};

		Generation gen1 = new Generation(state1);
		Generation gen2 = new Generation(state2);
		

	}
}
