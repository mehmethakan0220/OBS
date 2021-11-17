import Ders.*;
import Personel.*;

import Taslak.Templates;

import java.io.IOException;
import java.util.Scanner;

import static Taslak.Templates.*;

public class Main {
    static Dersler dersler = new Dersler();
    static Lectures lectures = new Lectures();

    public static void main(String[] args) {
        System.out.println("----- Bilgi Sistemi-----");
        Scanner scanner = new Scanner(System.in);




        while (true){

            anaTaslak();
            switch (scanner.nextInt()){
                case 1://Personel
                    personelTaslak();
                    personelProcess(scanner);
                    break;
                case 2://Ogrenci
                    ogrenciTaslak();
                    break;
                case 0://Cik
                    break;
                default:
                    System.out.println("Uygun işlem bulunamadi!.");
            }
        }

    }
    public static void personelProcess(Scanner scanner){
        switch (scanner.nextInt()){
            case 1://Personel Ekle
                Lecture lecture = new Lecture();
                System.out.print("Personelin Adı Soyadı\t:");
                lecture.setFullName(scanner.nextLine());

                System.out.print("Personel Derecesi\t:");
                lecture.setDegree(scanner.nextLine());

                System.out.print("Personel Unvanı\t:");
                lecture.setFame(scanner.nextLine());
                System.out.print("Personel Telefon\t:");
                lecture.setPhone(scanner.nextLine());
                System.out.print("Personel E-mail\t:");
                lecture.seteMail(scanner.nextLine());
                lectures.add(lecture);
                break;
            case 2://Personel Sil
                lectures.list();
                System.out.println("");
        }
    }
}
