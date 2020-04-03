
public class Rule {


private int ruleNum;

protected Rule( int ruleNum) {
    this.ruleNum = ruleNum;
}

public int getRuleNum(){
    return ruleNum;
}

public Generation evolve(Generation gen, BoundaryConditions bc){

}

public int getNumSubrules(){

}

public Cell[] getNeighborhood(int cellIdx, Generation gen, BoundaryConditions bc){

}

public EvolvedCell evolve(Cell[] neighborhood){

}

public String toString(){

}

}