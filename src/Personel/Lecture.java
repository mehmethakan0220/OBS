package Personel;

import Ders.Ders;
import Ders.Dersler;

public class Lecture extends Personel{
    private String degree;
    private Dersler dersler;
    public Lecture(){
        this.dersler = new Dersler();
    }
    public void addLesson(Ders ders){
        this.dersler.add(ders);
    }

    public void removeLesson(Ders ders){
        this.dersler.remove(ders);
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
