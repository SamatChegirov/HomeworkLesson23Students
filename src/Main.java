/*Student деген класс тузунуз (свойства: name, age, group).
ArrayList тузуп аны 10 студент менен толтурунуз.
1) Бардык студенттердин маалыматтарын консолго чыгарыныз.
2) Ошол ArrayList ти группасы боюнча фильтрация кылып 2 жаны листке
салыныз(Java,JavaScript)
3) Жашы 19 дан 23 ко чейинки студенттерди жаны листке салыныз.
4) Аты "A"тамгасынан башталган студенттерди жаны листке салыныз
Ар бир иш аракет учун озунчо метод тузуп, ал методдорду main класска чакырып иштетиниз.
Маанилер main класстан берилуусу керек.*/

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Asan", 21, "Java"));
        students.add(new Student("Uson", 23, "JS"));
        students.add(new Student("Kanat", 19, "Java"));
        students.add(new Student("Sanat", 25, "JS"));
        students.add(new Student("Talant", 31, "Java"));
        students.add(new Student("Jannat", 35, "JS"));
        students.add(new Student("Turat", 18, "Java"));
        students.add(new Student("Murat", 20, "JS"));
        students.add(new Student("Aktan", 40, "Java"));
        students.add(new Student("Sovet", 45, "Java"));

        /*Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        InfoOfStudents infoOfStudents = new InfoOfStudents();
        System.out.println("Java group: ");
        ArrayList<Student> java = new ArrayList<>();
        for (Student s : students) {
            if (s.getGroup().equals("Java")) {
                java.add(s);
                System.out.println(s);
            }
        }
        System.out.println("JS group: ");
        ArrayList<Student> js = new ArrayList<>();
        for (Student s : students) {
            if (s.getGroup().equals("JS")) {
                js.add(s);
                System.out.println(s);
            }
        }

        System.out.println("SymbolA students: ");
        ArrayList<Student> symbolA = new ArrayList<>();
        for (Student s : students) {
            if (s.getName().startsWith("A")) {
                symbolA.add(s);
                System.out.println(s);
            }
        }
        System.out.println("Age 19-23: ");
        ArrayList<Student> age = new ArrayList<>();
        for (Student s : students) {
            if (s.getAge() > 19 && s.getAge() < 23) {
                age.add(s);
                System.out.println(s);
            }
        }


        /*System.out.println("Java group: ");
        System.out.println(infoOfStudents.javaStudents(students));

        System.out.println("JS group: ");
        System.out.println(infoOfStudents.jsStudents(students));

        System.out.println("Age 19-23: ");
        System.out.println(infoOfStudents.yearsStudents(students));

        System.out.println("Symbol A: ");
        System.out.println(infoOfStudents.nameASymbolStudents(students));*/


    }
}