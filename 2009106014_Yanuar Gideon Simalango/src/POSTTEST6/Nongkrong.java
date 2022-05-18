package POSTTEST6;

public class Nongkrong extends kegiatan{
    
    public Nongkrong(String nama, String nama_kegiatan, String jam_kegiatan, String durasi_kegiatan, String ket_kegiatan) {
        super(nama, nama_kegiatan, jam_kegiatan, durasi_kegiatan, ket_kegiatan);
    }
    
    @Override
   public void lihat(){
        System.out.println("   Nama Anda           = "+ getnama());
        System.out.println("   Nama Kegiatan       = "+ getnama_kegiatan());
        System.out.println("   Jam Nongkrong       = "+ getjam_kegiatan());
        System.out.println("   Lama Nongkrong      = "+ getdurasi_kegiatan());
        System.out.println("   Agenda Nongkrong    = "+ getket_kegiatan());
        System.out.println("\n");

    }

    
}
