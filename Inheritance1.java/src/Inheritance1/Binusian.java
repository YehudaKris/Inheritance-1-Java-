package Inheritance1;

public class Binusian {
    protected int binusian_id;
    protected String nama;

    Binusian(int b_id, String nama){
        this.binusian_id = b_id;
        this.nama = nama;
    }

    void set_data(int b_id, String nama){
        this.binusian_id = b_id;
        this.nama = nama;
    }

    void set_nama(String nama){
        this.nama = nama;
    }
    void set_id(int b_id){
        this.binusian_id = b_id;
    }
    int get_id(){
        return binusian_id;
    }
    String get_name(){
        return nama;
    }
}

