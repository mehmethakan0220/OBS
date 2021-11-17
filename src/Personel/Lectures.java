package Personel;

import java.util.ArrayList;

public class Lectures {
    private ArrayList<Lecture> lectures;
    private int lastId = 0;

    public Lectures(){
        this.lectures = new ArrayList<Lecture>();
    }
    private int incId(){
        this.lastId +=1;
        return this.lastId;
    }
    public void add(Lecture lecture){
        lecture.setId(incId());
        this.lectures.add(lecture);
    }

    public void remove(Lecture lecture){
        this.lectures.remove(lecture);
    }
    public void list(){
        for(Lecture lecture:this.lectures){
            System.out.println(lecture.getFullName());
        }
    }
}
