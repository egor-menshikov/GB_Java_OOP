package Sem_2.Zoo;

import java.util.List;

public class NoiseZoo {
    private List<Speakable> aspeakables;

    public NoiseZoo(List<Speakable> animals) {
        this.aspeakables = animals;
    }

    public void speakAll() {
        for (Speakable speakable : aspeakables) {
            if (speakable instanceof Cat) {
                Cat cat = (Cat) speakable;
                cat.speak();
            }

        }
    }
}
