/**
 * @Author Darren Fisher
 * @Version 1.0
 */

public class Generation {

    
    private Cell[] cells;


    public Generation(CellState[] states){
        Cell[] cellsCopy = new Cell[states.length];
        
        for (int x = 0; x < states.length; x++) {
        	
        	cellsCopy[x] = new Cell(states[x]);
        	
        }
        this.cells = cellsCopy;
    }

    public Generation(String states){
    	try {
    		for(int x = 0; x < states.length(); x++) {
    			if (states.charAt(x) != '.' || states.charAt(x) != 'O') {
    				throw new IllegalArgumentException();
    			}
    		}
    	}
    	catch (IllegalArgumentException exception) {
    		System.out.println("Generation: String state is not a symbol");
    	}
    }

    public Generation(Cell[] cells){
    	Cell[] cellsCopyImmutable = cells;
    	this.cells = cellsCopyImmutable;
    	
    }

    public int size(){
        return cells.length;
    }

    public Cell getCell(int idx){
        return cells[idx];
    }

    // TEST THIS
    public String toString(){
    	String representationOfGen = "";

    	for (int x = 0; x < cells.length; x++) {
    		representationOfGen = representationOfGen + cells[x];
    	}
        return representationOfGen;
    }

}