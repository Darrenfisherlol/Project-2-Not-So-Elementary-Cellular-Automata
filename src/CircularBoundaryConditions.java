/**
 * @Author Darren Fisher
 * @Version 1.0
 */

public class CircularBoundaryConditions implements BoundaryConditions { 

	public CircularBoundaryConditions(){

	}
	
	public Cell getNeighbor(int cellIdx, int offset, Generation gen){
    
		int sizeTotal = cellIdx + offset;
		
		if(sizeTotal > gen.size() - 1) {
			sizeTotal = sizeTotal % gen.size();
			return gen.getCell(sizeTotal);
		}
		else if(sizeTotal < 0) {
			
			while (sizeTotal < 0) {
				sizeTotal =  sizeTotal + gen.size();
			}
			
			return gen.getCell(sizeTotal);
		}
		else {
			
			return gen.getCell(sizeTotal);
		}
	
	}
}