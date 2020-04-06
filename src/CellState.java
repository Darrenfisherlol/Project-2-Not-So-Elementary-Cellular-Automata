import java.util.HashMap;
import java.util.Map;

public enum CellState {

	 OFF('.'),
	 ON('O');



    private char symbol;


    
    // MAKE SURE HashMap is good
    private static Map<Character, CellState> SYMBOL_TO_STATE = new HashMap<>();
    static {

        // OFF ('.')
        // on ('O')

        SYMBOL_TO_STATE.put('.', OFF);
        SYMBOL_TO_STATE.put('O', ON);

    }


    // what else??
    private CellState(char symbol){
        this.symbol = symbol;
        
    }

    public static CellState getState(char symbol){
        return SYMBOL_TO_STATE.get(symbol);
    }

    // Check to make sure it retruns the correct value
    public String toString(){
        String ChartoStringReturn = String.valueOf(symbol);
        return ChartoStringReturn;
    }

}