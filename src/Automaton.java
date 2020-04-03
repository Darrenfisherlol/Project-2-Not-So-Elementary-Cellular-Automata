import java.util.List;


public class Automaton {


private Rule rule;
private List<Generation> generation = new List<>();
private BoundaryConditions bc;


public Automaton(Rule rule, Generation init, BoundaryConditions bc){
    this.rule = rule;
    // GENERATION INIT
    this.bc = bc;
}

public Rule getRule(){
    return rule;
}

// CHECK
public Generation getGeneration(int step){
    return generation.get(step);
}

public BoundaryConditions getBoundaryConditions(){
    return bc;
}

public void evolve(int numSteps){

}

public String toString(){

}

public String getHistory(){

}

}