package Class;

public class main {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Aditya";

        myAcc.setPass("1234");

        Student s1 = new Student("Aditya", 2110991621);
        System.out.println(s1.rollno);

    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}

class BankAccount {
    public String username;
    private String password;

    void setPass(String pass) {
        password = pass;
    }
}

class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}
