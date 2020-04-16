/**
 * @Author Darren Fisher
 * @Version 1.0
 * Worked with TA during office hours, Wilson, Melissa E
 * Discussed with Barrett Shannon and Megan Khoury
 */

public class Generation {

    private Cell[] cells;

    public Generation(CellState[] states){
    	this.cells = new Cell[states.length];
        for (int x = 0; x < states.length; x++) {
        	this.cells[x] = new Cell(states[x]);
        }
    }
    
    //TEST instead of .equals to use == bc Captial does not matter & idk what to do tbh
    public Generation(String states) throws IllegalArgumentException {
    	for(int x = 0; x < states.length(); x++) {
    		if (!(CellState.getState(states.charAt(x)) == (CellState.OFF)) && (!(CellState.getState(states.charAt(x)) == (CellState.ON)))) {
    			throw new IllegalArgumentException();
    		}
    	}
    	
    	this.cells = new Cell[states.length()];
    	for(int x = 0; x < states.length(); x++) {
    		this.cells[x] = new Cell(CellState.getState(states.charAt(x)));	
    	}
    }
    
    public Generation(Cell[] cells){

    	this.cells = new Cell[cells.length];
    	// 		(Cell) even if evolved treat it as cell
    	for(int x = 0; x < cells.length; x++) {
    		//this.cells[x] = cells[x];
    		
    		if(cells[x] instanceof EvolvedCell) {
    			EvolvedCell ec = (EvolvedCell) cells[x];
    			this.cells[x] = new EvolvedCell(ec.getState(), ec.getSubruleNum());
    		}
    			
        	else {
        		this.cells[x] = new Cell(cells[x].getState());
        		}
    	}
    }

    public int size(){
        return cells.length;
    }

    public Cell getCell(int idx){
    	//Cell cellCopy = new Cell(cells[idx].getState());
       // return new Cell(cells[idx].getState());
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