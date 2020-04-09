/**
 * @author Darren Fisher
 * @version 1.0
 */

public class AutomatonMeasurements {


	public int hammingDistance(Generation g1, Generation g2){
		
    	if (g1.size() != g2.size()) {
    		throw new IllegalArgumentException();
    	}
    	
    	int distanceHamming = 0;
    	for (int x = 0; x < g1.size(); x++) {
    		if(g1.getCell(x) != g2.getCell(x)) {
    			distanceHamming = distanceHamming + 1;
    		}
    	}
		return distanceHamming;
	}

	public int hammingDistance(int stepNum, Automaton a){
		// Calculate the Hamming distance between two successive generations
		//(i.e., the states of the Automaton immediately before and after the given evolution step)
		
		int distancePre = 0;
    	for (int x = 0; x < g1.size(); x++) {
    		if(g1.getCell(x) != g2.getCell(x)) {
    			distancePre = distancePre + 1;
    		}
    	}
    	
		int distanceMid = 0;
    	for (int x = 0; x < g1.size(); x++) {
    		if(g1.getCell(x) != g2.getCell(x)) {
    			distanceMid = distanceMid + 1;
    		}
    	}

    	
    	int distancePost = 0;
    	for (int x = 0; x < g1.size(); x++) {
    		if(g1.getCell(x) != g2.getCell(x)) {
    			distanceHamming = distanceHamming + 1;
    		}
    	}
		return distanceHamming;
		
		
		return hamDistInt;
	}

	public int[] hammingDistances(Automaton a){
    
	}

	public int[] subruleCount(int stepNum, Automaton a){

	}

	public int[][] subruleCounts(Automaton a){

	}
}