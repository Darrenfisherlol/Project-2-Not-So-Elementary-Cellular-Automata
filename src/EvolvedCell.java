/**
 * @Author Darren Fisher
 * @Version 1.0
 */

public class EvolvedCell extends Cell{

// ElementaryRule defines the subruleNum 
    private int subruleNum;

    public EvolvedCell(CellState state, int subruleNum){
        this.subruleNum = subruleNum;

    }

    public int getSubruleNum(){
        return subruleNum;
    }
}