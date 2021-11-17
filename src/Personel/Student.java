package Personel;

import Ders.Ders;
import Ders.Dersler;

public class Student extends Personel {
    private Dersler dersler;
    private int degree;

    public Student() {
        this.dersler = new Dersler();
    }

    public void addLesson(Ders ders){
        this.dersler.add(ders);
    }

    public int getDegree() {
        return degree;
    }

    private void incDegree(int degree) {
        this.degree +=1;
    }
}
