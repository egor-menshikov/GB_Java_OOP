package Lectures.Lect_3.Work;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("egor", "menshikov",37, 9999999);
        Iterator<String> iter = worker;
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
