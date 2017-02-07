/**
 * Created by william on 2/7/17.
 */

public class counter {

    public counter(){

    }

    int total;

    public int add(){
        total++;
        return total;
    }

    public int subtract(){
        total--;
        return total;
    }

    public int clear(){
        total = 0;
        return total;
    }
}
