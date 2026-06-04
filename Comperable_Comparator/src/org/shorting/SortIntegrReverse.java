package org.shorting;

import java.util.ArrayList;
import java.util.Collections;

class Number implements Comparable<Number>{

    int no;

    Number(int no){
        this.no = no;
    }

    @Override
    public int compareTo(Number n){

        // Descending
        return n.no - this.no;
    }

    public void display() {
        System.out.println(no);
    }
}

public class SortIntegrReverse {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(new Number(10));
        list.add(new Number(20));
        list.add(new Number(30));
        list.add(new Number(40));
        list.add(new Number(50));
        list.add(new Number(60));

        Collections.sort(list);

        for(Number n : list) {
            n.display();
        }
    }
}
