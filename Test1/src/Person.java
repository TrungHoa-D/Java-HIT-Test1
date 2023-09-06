public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public void input(String ten, int tuoi, String gt)
    {
        name=ten;
        age=tuoi;
        gender=gt;
    }
    public void output()
    {
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("Gioi tinh: "+gender);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
