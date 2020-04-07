/**
 * @Author Darren Fisher
 * @Version 1.0
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

	public CellState getRighState(){
		return right;
	}

	public Cell getNeighbor(int cellIdx, int offset, Generation gen){
		
		if (cellIdx + offset >= gen.size()) {
			return gen.getCell(gen.size() - 1);
		}
		else {
			return gen.getCell(0);
		}
	}

}