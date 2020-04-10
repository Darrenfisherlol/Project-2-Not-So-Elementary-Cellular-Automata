/**
 * @Author Darren Fisher
 * @Version 1.0
 */

public class Cell {

    private CellState state;

    // DEFAULT TO OFF
    public Cell(){
    	this.state = CellState.OFF;
    }

    public Cell(CellState state){
        this.state = state;
    }

    public CellState getState(){
        return this.state;
    }

    // CHECK TO MAKE SURE RETURN THE RIGHT THING
    public String toString(){
        String cellStateStringFormat = getState().toString();
        return cellStateStringFormat;
    }
}