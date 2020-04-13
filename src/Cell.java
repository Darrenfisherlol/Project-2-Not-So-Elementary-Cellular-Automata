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

    public String toString(){
        String cellStateStringFormat = getState().toString();
        return cellStateStringFormat;
    }
}