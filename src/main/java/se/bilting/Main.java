package se.bilting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ulf");
        list.add("Arne");
        list.add("Gunnar");
        list.add("Bengt");
        list.add("ragnar");
        list.add("anna");


        Comparator<String> cmp = new StringLengthComparator();
        Collections.sort(list, cmp );



        Predicate<String> tester = new ContainsE();
        list.removeIf(tester);

//        //Förr, Anonym inre class
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Comparator<String> lcmp = (s1, s2) -> s1.length() - s1.length();
        Collections.sort(list, lcmp );
        list.removeIf(s->s.contains("e"));

        IO.println(list);
        IO.println(lcmp.getClass().getName());


    }
}



class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

class ContainsE implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.contains("e");
    }
}