package Inheritance1;

public class Inheritance1 {
    public static void main(String[] args){
        Student Yehuda = new Student(111,"Yehuda", 7890,2020,2023);

        System.out.println("Semester Sekarang = " + Yehuda.calculate_semester());
        Yehuda.print_data();

        Lecturer Yehuda2 = new Lecturer(222,"Roni", 1234, "Mentor");
        Yehuda2.print_data();
    }
}
