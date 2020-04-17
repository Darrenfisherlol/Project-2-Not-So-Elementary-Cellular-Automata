/**
 * @Author Darren Fisher
 * @Version 1.0
 * Worked with TA during office hours, Wilson, Melissa E
 * Discussed with 
 */

public class AutomatonMeasurements {

	public static int hammingDistance(Generation g1, Generation g2) throws IllegalArgumentException{
		
    	if (g1.size() != g2.size()) {
    		throw new IllegalArgumentException();
    	}
    	
    	int distanceHamming = 0;
    	
    	for (int x = 0; x < g1.size(); x++) {
    		if(g1.getCell(x).getState() != g2.getCell(x).getState()) {
    			distanceHamming = distanceHamming + 1;
    		}
    	}
		return distanceHamming;
	}

	public static int hammingDistance(int stepNum, Automaton a) throws InvalidStepNumException{
		if (stepNum < 0) {
			throw new InvalidStepNumException();
		}
		
		Generation preGen = a.getGeneration(stepNum - 1);
		Generation midGen = a.getGeneration(stepNum);
		
		int distanceHamming = hammingDistance(preGen, midGen);
		return distanceHamming;
	}
	
	public static int[] hammingDistances(Automaton a) throws InvalidStepNumException{
		int[] distanceHammingArray = new int[a.getTotalSteps()];
    	
    	// this might contain the errors when running tests
		for(int x = 0; x < a.getTotalSteps(); x++) {
			distanceHammingArray[x] = hammingDistance(x + 1, a);
		}
		
		return distanceHammingArray;
	}

	public static int[] subruleCount(int stepNum, Automaton a) throws InvalidStepNumException{
		
		int[] subruleCount = new int[6];
		int subRuleNum = 0;
		Generation stepGen = a.getGeneration(stepNum);
		
		if (stepNum > 0) {
			
			for(int x = 0; x < stepGen.size(); x++) {				
				
				
				subruleCount[x] = subRuleNum;
				subRuleNum = 0;
			}
			
			
			
		return subruleCount;
		}
		return subruleCount;
	}

	public static int[][] subruleCounts(Automaton a){
	
		int[][] subruleStep = new int[a.getTotalSteps()][a.getTotalSteps()];
		
		
		return subruleStep;
	}
}