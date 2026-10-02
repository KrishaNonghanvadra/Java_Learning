//create a class

class Student {
    int rno;
    String name;
    float marks;
    int total = 100;

    void changename(String newname){
        name = newname;
    }

    void greeting(){
        System.out.println("hello my name is: "+ name); //output: Krisha
        System.out.println("Hello my name is: "+ this.name); //output: Krisha
    }

    //creating object using other object

    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    //Student neha = new Student(1,"Neha shrma", 45.2);
    //here, this keyword will replace with neha
    Student (int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student (){
        // this.rno = 15;
        // this.name = "Krisha";
        // this.marks = 91.3f;

        //this is how you calling constrcture from another constructer
        // here, this keyword replacce with Student(class name)
        this (45,"sneha", 86.2f);
    }
}

public class Introduction{
    public static void main(String[] args){
        //stores 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 student roll no, name, marks
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        //just declaring 
        Student kunal;

        //initialize
        kunal = new Student();
        
        //in one line
        Student student1 = new Student();

        
        // before having value
        
        System.out.println(student1); // output: Student@251a69d7
        System.out.println(student1.rno); //output: 0
        System.out.println(student1.name); //output: null
        System.out.println(student1.marks); //output: 0.0

        // student1.rno = 13;
        // student1.name = "kunal";
        // student1.marks = 56.3f;
        // student1.total = 99;

        //after giving value

        System.out.println(student1); // output: Student@251a69d7
        System.out.println(student1.rno); // output: 13
        System.out.println(student1.name); // output: kunal
        System.out.println(student1.marks); // output: 56.3
        System.out.println(student1.total); //output : 100

        student1.changename("kayra");
        student1.greeting();

        Student random = new Student(student1);

        Student one = new Student();
        Student two = one; //copying reference of one both one and two are pointing same referennce

        one.name = "Priti";
        System.out.println(two.name);
    }

    
}