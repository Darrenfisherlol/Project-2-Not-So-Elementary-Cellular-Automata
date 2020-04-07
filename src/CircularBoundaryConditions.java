/**
 * @Author Darren Fisher
 * @Version 1.0
 */

public class CircularBoundaryConditions implements BoundaryConditions { 

	public CircularBoundaryConditions(){

	}
	
	// MAKE SURE WORKS
	public Cell getNeighbor(int cellIdx, int offset, Generation gen){
    
		if (cellIdx + offset >= gen.size()) {
			int sizeTotal = cellIdx + offset;
			sizeTotal = sizeTotal % gen.size();
			return gen.getCell(sizeTotal);
		}
		else {
			int sizeTotalNegative = cellIdx + offset;
			
			if (sizeTotalNegative >= 0) {
				return gen.getCell(gen.size() - sizeTotalNegative);
			}
			else {
				return gen.getCell(gen.size() - (sizeTotalNegative * -1));

			}
		}
		
		
	}
}