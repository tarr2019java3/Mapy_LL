package pl.sda.szkola;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Student student = new Student("Jan", "Nowak");
        Student student1 = new Student("Marcin", "Kowalski");
        Student student2 = new Student("Mariusz", "Kwiatkowski");
        Student student4 = new Student("Magda ", " Kot ");
        Student student5 = new Student("Sandra ", "Las");
        Student student6 = new Student("Marek", "Karton");
        Student student7 = new Student("Andrzej", "Parapet");
        Student student8 = new Student("Adam", "Alkohol");
        Student student9 = new Student("Wong", "Koronawirus");
        Student student10 = new Student("Mateusz", "Barman");
        Student student11 = new Student("Ania ", "Monitor");
        Student student3 = new Student("Maria", "Kosztowna");

        School school = new School("UMK", "Torun");
        School school1 = new School("SDA", "Gdansk");
        School school2 = new School("CED", "Bygdoszcz");


        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(student5);
        studentList1.add(student6);
        studentList1.add(student7);
        studentList1.add(student8);

        List<Student> studentList2 = new ArrayList<Student>();
        studentList2.add(student9);
        studentList2.add(student10);
        studentList2.add(student11);

        Map<School, List<Student>> mapa = new HashMap<School, List<Student>>();

        mapa.put(school, studentList);
        mapa.put(school1, studentList1);
        mapa.put(school2, studentList2);


        for (Map.Entry<School, List<Student>> entry : mapa.entrySet()) {
            System.out.println(" - " + entry.getKey().getName());
            System.out.println();
            for (Student s : entry.getValue()) {
                System.out.println("    - " + s.getName() + " " + s.getLastname());



            }
        }
    }
}
