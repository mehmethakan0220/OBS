package Personel;

import java.util.ArrayList;

public class Students {
    private ArrayList<Student> students;

    Students(){
        this.students = new ArrayList<Student>();
    }

    public void add(Student student){
        this.students.add(student);
    }
    public void remove(Student student){
        this.students.remove(student);
    }
}
