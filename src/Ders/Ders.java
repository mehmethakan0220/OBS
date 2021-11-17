package Ders;

import Personel.Lecture;

public class Ders {
    private String name;
    private String prefix;
    private String no;
    private Lecture lecture;
    private double vizeNotu;
    private double finalNotu;
    private String harfNotu;
    public Ders(){
        this.prefix="ABM";
    }

    public String getHarfNotu() {
        return harfNotu;
    }

    public void setHarfNotu(String harfNotu) {
        this.harfNotu = harfNotu;
    }

    public double getVizeNotu() {
        return vizeNotu;
    }

    public void setVizeNotu(double vizeNotu) {
        this.vizeNotu = vizeNotu;
    }

    public double getFinalNotu() {
        return finalNotu;
    }

    public void setFinalNotu(double finalNotu) {
        this.finalNotu = finalNotu;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCode() {
        return this.prefix+" "+this.no;
    }

}
