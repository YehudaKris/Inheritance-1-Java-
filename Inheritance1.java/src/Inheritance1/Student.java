package Inheritance1;

public class Student extends Binusian {
    private int nim;
    private int tahun_masuk;
    private int tahun_sekarang;
   

    public Student(int b_id, String nama, int nim, int masuk, int sekarang){
        super(b_id, nama);
        this.nim = nim;
        this.tahun_masuk = masuk;
        this.tahun_sekarang = sekarang;
    }

    int calculate_semester(){
        return(tahun_sekarang - tahun_masuk)*2;
    }

    void set_data(int b_id, String nama, int nim, int masuk, int sekarang){
        super.binusian_id= b_id;
        super.nama = nama;
        this.nim = nim;
        this.tahun_masuk = masuk;
        this.tahun_sekarang = sekarang;
    }

    void print_data(){
        System.out.println("Binusian ID = " + super.binusian_id);
        System.out.println("Name = " + super.nama);
        System.out.println("Binusian NIM = " + this.nim);
        System.out.println("Tahun Masuk = " + this.tahun_masuk);
        System.out.println("Tahun Sekarang = " + this.tahun_sekarang);
        System.out.println("Semester = " + calculate_semester());
    }
}
