/**
 * @Author Darren Fisher
 * @Version 1.0
 * Worked with TA during office hours, Wilson, Melissa E
 * Discussed with Barrett Shannon and Megan Khoury
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

//			sizeTotal = (sizeTotal % gen.size()) + gen.size();
//
//			return gen.getCell(sizeTotal);

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