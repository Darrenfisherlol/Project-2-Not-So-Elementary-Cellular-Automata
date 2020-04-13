/**
 * @Author Darren Fisher
 * @Version 1.0
 */

public class Generation {

    private Cell[] cells;

    public Generation(CellState[] states){
    	this.cells = new Cell[states.length];
        for (int x = 0; x < states.length; x++) {
        	this.cells[x] = new Cell(states[x]);
        }
    }
    
    public Generation(String states) throws IllegalArgumentException {
    	for(int x = 0; x < states.length(); x++) {
    		if (!(CellState.getState(states.charAt(x)).equals(CellState.OFF)) && (!(CellState.getState(states.charAt(x)).equals(CellState.ON)))) {
    			throw new IllegalArgumentException();
    		}
    	}
    	
    	this.cells = new Cell[states.length()];
    	for(int x = 0; x < cells.length; x++) {
    		this.cells[x] = new Cell(CellState.getState(states.charAt(x)));	
    	}
    }
    
    public Generation(Cell[] cells){
    	this.cells = new Cell[cells.length];
    	
    	for(int x = 0; x < cells.length; x++) {
    		this.cells[x] = cells[x];
    	}
    }

    public int size(){
        return cells.length;
    }

    public Cell getCell(int idx){
        return cells[idx];
    }

    // 
    public String toString(){
    	String representationOfGen = "";

    	for (int x = 0; x < cells.length; x++) {
    		representationOfGen = representationOfGen + cells[x].toString();
    	}
    	
        return representationOfGen;
    }

}