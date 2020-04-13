/**
 * @Author Darren Fisher
 * @Version 1.0
 * Worked with TA during office hours, Wilson, Melissa E
 */

import java.util.LinkedList;
import java.util.List;


public class Automaton {


	private Rule rule;
	private List<Generation> generation = new LinkedList<>();
	private BoundaryConditions bc;

	/**
	 * Constructor for Automaton, fill in the needed information for the computation of generation as listed below as a parameter
	 * @param rule, the rule of evolution the generation has to follow
	 * @param init, the initial state of the Generation object
	 * @param bc, the boundary conditions the generation will follow; fixed or circular.
	 */
	public Automaton(Rule rule, Generation init, BoundaryConditions bc){
		this.rule = rule;
		this.bc = bc;
		generation.add(init);
		
	}

	/**
	 * Return the rule number
	 * @return the rule number
	 */
	public Rule getRule(){
		return this.rule;
	}

	
	/**
	 * getGeneration() is supposed to return the Generation at a certain index
	 * @param step, this represents the generation index we want to get 
	 * @return Generation object, this is a certain generation that has been evolved a certain amount of times
	 * @throws InvalidStepNumException 
	 */
	public Generation getGeneration(int step) throws InvalidStepNumException{
		
		if (step < 0) {
			throw new InvalidStepNumException();
		}
		
		//if (generation.get(step) == null) {
		if (step > getTotalSteps()) {
	
		// test
			int needToEvolve = step - getTotalSteps();
			evolve(needToEvolve);
			return generation.get(step);
		}
		else {
			return generation.get(step);
		}
	}

	public BoundaryConditions getBoundaryConditions(){
		return this.bc;
	}

	/**
	 * Evolve the generation a certain amount of times
	 * @param numSteps
	 */
	public void evolve(int numSteps){
		if (numSteps > 0) {
			for (int x = 0; x < numSteps; x++) {
				generation.add(rule.evolve(generation.get(generation.size() - 1) , getBoundaryConditions()));
			}
		}
	}
	
	// -1
	public int getTotalSteps() {
		return this.generation.size() - 1; 
	}
	
	/**
	 * toString() is supposed to return a String that holds the latest generation
	 * @return String representation of generation
	 */
	public String toString(){
			String genCurrent = generation.get(generation.size() - 1).toString();
			return genCurrent;
	}

	/**
	 * Return a String representation of the whole generation list
	 * @return String representation of list generation
	 */
	public String getHistory(){
		String historyOfGen = "";
		
		for(int x = 0; x < generation.size(); x++) {
			if (x == generation.size() - 1) {
				historyOfGen = historyOfGen + (generation.get(x).toString());
			
			}
			else {
			historyOfGen = historyOfGen + (generation.get(x).toString()) + "\n";
			}
		}
		return historyOfGen;
	}
}
