/**
 * @Author Darren Fisher
 * @Version 1.0
 * Worked with TA during office hours, Wilson, Melissa E
 */

public class AutomatonMeasurements {


	
	
	/*hammingDistance(Generation g1, Generation g2)
	 * 
	 * hammingDistance(int stepNum, Automaton a)
	 * 
	 * 
	 */
	
	
	
	
	
	
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
		
		int hamDistAll = 0;
		int preMidDistance = 0;		
		int midPostDistance = 0;		

//		Generation pre;
//		Generation mid;
//		Generation post = a.getGeneration(stepNum + 1);
//		
//		if (stepNum - 1 > 0) {
//			pre = a.getGeneration(stepNum - 1);
//			mid = a.getGeneration(stepNum);
//			
//			for (int x = 0; x < pre.size(); x++) {
//	    		if(pre.getCell(x) != mid.getCell(x)) {
//	    			hamDistAll = hamDistAll + 1;
//	    		}
//	    	}
//			
//			for (int x = 0; x < mid.size(); x++) {
//	    		if(mid.getCell(x) != post.getCell(x)) {
//	    			hamDistAll = hamDistAll + 1;
//	    		}
//	    	}
//			return hamDistAll;
//		}
//		
//		if (stepNum > 0) {
//			mid = a.getGeneration(stepNum);
//			
//			for (int x = 0; x < mid.size(); x++) {
//	    		if(mid.getCell(x) != post.getCell(x)) {
//	    			hamDistAll = hamDistAll + 1;
//	    		}
//	    	}
//			return hamDistAll;	
//		}
//			
//		
//		
//		
//		
		return hamDistAll;
	}

	public int[] hammingDistances(Automaton a){
		int[] hammingDis = new int[a.getTotalSteps()];
		
		
		
		
		
		
		return hammingDis;
	}

	public int[] subruleCount(int stepNum, Automaton a){
		
		
		int[] subruleCount = new int[a.getRule().getNumSubrules()];
		
		//Generation genSubRule = a.getGeneration(stepNum);
		
		
		
		
		
		return subruleCount;
	}

	public int[][] subruleCounts(Automaton a){
		int[][] subruleStep = new int[a.getTotalSteps()][a.getTotalSteps()];
		int step = 0;
		int subrule = 0;
		
		
		
		
		return subruleStep;
	}
}