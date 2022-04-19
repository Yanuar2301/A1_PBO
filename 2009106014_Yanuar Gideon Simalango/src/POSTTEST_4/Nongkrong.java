package POSTTEST_4;

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
   public void lihat(String status){
        System.out.println("   Nama Pemilik        = "+ getnama());
        System.out.println("   Nama Kegiatan       = "+ getnama_kegiatan());
        System.out.println("   Jam Kegiatan        = "+ getjam_kegiatan());
        System.out.println("   Durasi Kegiatan     = "+ getdurasi_kegiatan());
        System.out.println("   Keterangan Kegiatan = "+ getket_kegiatan());
        System.out.println("          Nongkrongnya "+ status);
        System.out.println("\n");

    }
}
