package Sem_2.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> animals = new ArrayList<>();
        animals.add(new Cat("Вакса"));
        animals.add(new Dog("Джанга"));
        animals.add(new Radio());

        NoiseZoo nz = new NoiseZoo(animals);
        nz.speakAll();
    }
}
