package Inheritance1;

public class Lecturer extends Binusian{
    private int lecturer_id;
    private String lecturer_type;
    
    Lecturer(int b_id, String nama, int lecturer_id, String lecturer_type) {
    super(b_id, nama);
    this.lecturer_id = lecturer_id;
    this.lecturer_type = lecturer_type;
    }
    
    
    void set_data (int b_id, String nama, int lecturer_id, String lecturer_type){
    super.binusian_id=b_id;
    super.nama = nama;
    this.lecturer_id = lecturer_id;
    this.lecturer_type = lecturer_type;
    }
    
    void setLecturer_id(int lecturer_id){
    this.lecturer_id = lecturer_id;
    }
    
    String get_type(){
    return lecturer_type;
    }
    
    int get_lecturer_id(){
    return lecturer_id;
    
    }
    void print_data(){
    System.out.println("Binusian ID = " + super.binusian_id);
    System.out.println("Nama = " + super.nama);
    System.out.println("Lecturer ID = " + this.lecturer_id);
    System.out.println("Lcturer Type = " + this.lecturer_type);
    }
}