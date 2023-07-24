package Lectures.Lect_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Foo foo1 = new Foo() {
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
