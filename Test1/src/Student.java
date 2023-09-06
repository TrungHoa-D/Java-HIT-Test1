public class Student extends Person{
    private int id;
    private Address address;
    private double gpa;

    public void input(String ten, int tuoi, String gt, int ma, Address dc, double diem)
    {
        super.input(ten, tuoi, gt);
        id=ma;
        address=dc;
        gpa=diem;
    }
    public void output()
    {
        super.output();
        System.out.println("Ma sinh vien: "+id);
        address.output();
        System.out.println("Diem tich luy: "+gpa);
        System.out.println("-------------------------------------------------");
    }
    public Student(String name, int age, String gender, int id, Address address, double gpa) {
        super(name, age, gender);
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
