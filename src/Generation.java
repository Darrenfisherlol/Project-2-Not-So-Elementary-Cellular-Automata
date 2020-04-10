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
    
    public Generation(String states) throws IllegalArgumentException {
    	for(int x = 0; x < states.length(); x++) {
    		if (!(CellState.getState(states.charAt(x)).equals(CellState.OFF)) && (!(CellState.getState(states.charAt(x)).equals(CellState.ON)))) {
    			throw new IllegalArgumentException();
    		}
    	}
    	
    	Cell[] cellPass = new Cell[states.length()];
    	for(int x = 0; x < cellPass.length; x++) {
    		cellPass[x] = new Cell(CellState.getState(states.charAt(x)));
    		
    	}
    	
    	for(int y = 0; y < cellPass.length; y++) {
    		cells[y] = cellPass[y];
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
    		representationOfGen = representationOfGen + cells[x].toString();
    	}
        return representationOfGen;
    }

}