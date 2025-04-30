class Student {
    private int age;
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        if(newAge > 0) {
            age = newAge;
        }
    }

    public int getAge() {
        return age;
    }
}

public class Encaptulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("ANNAY");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
