package Ders;

import java.util.ArrayList;

public class Dersler {
    private ArrayList<Ders> dersler;

    public Dersler() {
        this.dersler = new ArrayList<Ders>();
    }
    public void add(Ders ders){
        this.dersler.add(ders);
    }
    public void remove(Ders ders){
        this.dersler.remove(ders);
    }
    public void list(){
        for(Ders ders:this.dersler){
            System.out.println("────────────LESSON──────────────");
            System.out.println("NAME\t:"+ders.getName());
            System.out.println("CODE\t:"+ders.getCode());
            System.out.println("LECTURE\t:"+ders.getLecture());
        }
    }
}
