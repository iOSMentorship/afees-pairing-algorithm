package algorithm;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

/**
 * Created by simpumind on 3/6/17.
 */
public class MainClass {


    public static void main(String[] args) {

        Scanner lop = new Scanner(System.in);

        List<Pair> pairList = new ArrayList<>();

        int length = 5;
        List<String> names = new ArrayList<>();
        String s = "Please enter " + length + " names.";
        System.out.println(s);

        names = getNames(lop, names, 0, length);

        for (int i = 0; i < length; i++) {
            System.out.println(names.get(i));
        }

        Collections.shuffle(names);


        System.out.println(names.size());

        int counter = 0;
        for (int i =0; i< names.size(); i+=2){
            Pair pair = new Pair(names.get(counter), names.get(counter+1));
            pairList.add(pair);
            counter = counter + 2;
        }

        names.clear();

        System.out.println(pairList.size());

        for (Pair par : pairList) {
            System.out.println(par.getKey() + "and" + par.getValue());
        }


        lop.close();
    }

    private static List<String> getNames(Scanner lop, List<String> names,
                                    int index, int length) {
        String s = lop.nextLine();
        names.add(s);

        if (index < (length - 1)) {
            s = "Enter " + (length - index - 1) + " more names.";
            System.out.println(s);
            getNames(lop, names, ++index, length);
        }

        return names;
    }

}
