import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin lop hoc: ");
        System.out.println("Nhap ma lop: " );
        int classID=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap so hoc sinh: ");
        int num=sc.nextInt();
        sc.nextLine();
        ArrayList<Student> students= new ArrayList<>();
        for(int i=1;i<=num;i++) {
            System.out.println("Nhap thong tin hoc sinh thu "+i);
            System.out.println("Nhap ten hoc sinh");
            String name=sc.nextLine();
            System.out.println("Nhap tuoi hoc sinh");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap gioi tinh hoc sinh");
            String gender=sc.nextLine();
            System.out.println("Nhap ma hoc sinh: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap dia chi hoc sinh");
            System.out.println("Nhap tinh/ thanh pho: ");
            String city=sc.nextLine();
            System.out.println("Nhap huyen/ quan: ");
            String district=sc.nextLine();
            Address address= new Address(city,district);
            System.out.println("Nhap gpa: ");
            double gpa= sc.nextDouble();
            sc.nextLine();
            Student student= new Student(name, age, gender, id, address, gpa);
            students.add(student);
        }
        Classroom classroom= new Classroom(classID, num, students);
        System.out.println("Nhap ten can tim: ");
        String name=sc.nextLine();
        ArrayList<Student> find= classroom.searchByName(name);
        for(Student i : find) i.output();
    }
}