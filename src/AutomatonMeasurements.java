import java.io.ObjectInputStream.GetField;

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
		/**
		 *  Count the number of times each subrule is applied during the given evolution step.
		 *   (The step number must be greater than 0.) The length of the returned array is equal
		 *    to the number of subrules, and the counts are indexed by subrule number.
		 *   (Hint: The method getNumSubrules can be called on any Rule to get the number of subrules.)
		 */
		
		int[] subruleCount = new int[a.getRule().getNumSubrules()];
		
		Generation stepGen = a.getGeneration(stepNum - 1);
		
		for(int x = 0; x < stepGen.size(); x++) {
			
			EvolvedCell cellSingle = a.getRule().evolve(a.getRule().getNeighborhood(x, stepGen, a.getBoundaryConditions()));
			subruleCount[cellSingle.getSubruleNum()] = subruleCount[cellSingle.getSubruleNum()] + 1;

		}
		System.out.println("Test post for loop: ");
		return subruleCount;
	}

	public static int[][] subruleCounts(Automaton a) throws InvalidStepNumException{
	
		/**
		 * Return the subrule counts for every evolution step.
		 *  The length of the returned array is equal to the total
		 *   number of steps, and each element is an array of subrule counts.
		 */
		
		int[][] subruleStep = new int[a.getTotalSteps()][a.getRule().getNumSubrules()];
		
		int[] subruleCount;

		Generation stepGen = a.getGeneration(0);
				
		for(int x = 1; x <= a.getTotalSteps(); x++) {
			for(int y = 0; y < a.getRule().getNumSubrules();y++) {
				//System.out.println("POS loop x: " + x );
				//System.out.println("POS 2 loop y: " + y );

				subruleCount = subruleCount(x ,a);
				subruleStep[x - 1][y] = subruleCount[y];
				//System.out.println("AFFt loop x: " + x );
				//System.out.println("AFFt loop y: " + y );

				
			}
			
		}
		
		
		return subruleStep;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}