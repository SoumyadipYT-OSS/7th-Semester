import java.lang.System;

interface DetailInfo {
    void display();
    int count();
}

class Student implements DetailInfo {
    private static int maxCount = 0;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Student name: " + name);
    }

    @Override
    public int count() {
        return name.length();
    }

    public static int getMaxCount() {
        return maxCount;
    }
}


public class Q6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Netaji Subhash Chandra Bose");
        System.out.println("Name length: " + s1.count());
    }
}
