public class oopsinJava {
    //creating a new datatype
    public static class Student{
        String name;
        int rollno;
        double percentage;
    }
    public static void main(String[] args){
        Student s1 = new Student(); //declaration
        s1.name = "Akshit";
        s1.rollno = 001;
        s1.percentage = 80.01;
        System.out.println(s1.name + s1.percentage);

        Student s2 = new Student();
        s2.name = "Aditya";
        s2.rollno = 002;
        s2.percentage = 93;
        System.out.println(s2.name + s2.percentage);
    }
    
    
}
