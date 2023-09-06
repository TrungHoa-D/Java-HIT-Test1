import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private int classID;
    private int numberOfStudent;
    private ArrayList<Student> students= new ArrayList<>();
    public ArrayList<Student> searchByName(String name) {
        ArrayList<Student> ans= new ArrayList<>();
        for(Student i: students)
        {
            if(i.getName().equals(name)) ans.add(i);
        }
        return  ans;
    }
    public void input(int iD, int num, ArrayList<Student> stu)
    {
        classID=iD;
        numberOfStudent=num;
        students=stu;
    }
    public void output() {
        System.out.println("Ma lop: "+classID);
        System.out.println("So hoc sinh: "+numberOfStudent);
        for(Student i : students)
            i.output();
    }
    public Classroom(int classID, int numberOfStudent, ArrayList<Student> students) {
        this.classID = classID;
        this.numberOfStudent = numberOfStudent;
        this.students = students;
    }

    public Classroom() {
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
