


public class FixedBoundaryConditions{

private CellState left;
private CellState right;


public FixedBoundaryConditions(CellState left, CellState right){
    this.left = left;
    this.right = right;

}

public CellState getLeftState(){
    return left;
}

public CellState getRighState(){
    return right;
}

public Cell getNeighbor(int cellIdx, int offset, Generation gen){

    
}





}