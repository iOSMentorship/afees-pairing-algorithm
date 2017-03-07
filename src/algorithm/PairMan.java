package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by simpumind on 3/6/17.
 */
public class PairMan {

    List<String[]> pairs = new ArrayList<>();

    public void setPairs(String name1, String name2){
        this.pairs.add(new String[]{name1, name2});
    }

    public List<String[]> getPairs(){
        return pairs;
    }



    @Override
    public String toString() {
        return "PairMan{" +
                "pairs=" + pairs +
                '}';
    }
}
