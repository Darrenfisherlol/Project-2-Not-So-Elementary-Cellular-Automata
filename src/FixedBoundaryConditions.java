/**
 * @Author Darren Fisher
 * @Version 1.0
 * Worked with TA during office hours, Wilson, Melissa E
 */

public class FixedBoundaryConditions implements BoundaryConditions {

	private CellState left;
	private CellState right;


	public FixedBoundaryConditions(CellState left, CellState right){
		this.left = left;
		this.right = right;
	}

	public CellState getLeftState(){
		return left;
	}

	public CellState getRightState(){
		return right;
	}

	public Cell getNeighbor(int cellIdx, int offset, Generation gen){
		
		int total = cellIdx + offset;
		
		if (total > gen.size() - 1) {
			Cell cellRight = new Cell(getRightState());
			return cellRight;
		}
		else if (total < 0) {
			Cell cellLeft = new Cell(getLeftState());
			return cellLeft;
		}
		else {
			
			return gen.getCell(total);
		}
	}

}