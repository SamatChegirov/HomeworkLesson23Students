import java.util.ArrayList;


public class InfoOfStudents implements MethodStudents{
    @Override
    public String javaStudents(ArrayList<Student> students) {
        for (Student s : students) {
            if (s.getGroup().equals("Java")) {
                System.out.println(s);
            }
        }
        return "";
    }

    @Override
    public String jsStudents(ArrayList<Student> students) {
        for (Student s : students) {
            if (s.getGroup().equals("JS")) {
                System.out.println(s);
            }
        }
        return "";
    }

    @Override
    public int yearsStudents(ArrayList<Student> students) {
        for (Student s : students) {
            if (s.getAge() > 19 && s.getAge() < 23) {
                System.out.println(s);
            }
        }
        return 0;
    }

    @Override
    public String nameASymbolStudents(ArrayList<Student> students) {
        for (Student s : students){
            if (s.getName().startsWith("A")) {
                System.out.println(s);
            }
        }
        return "";
    }
}
