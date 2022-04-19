
package POSTTEST_4;

public class Belajar extends kegiatan {
    Belajar(String nama,String nama_kegiatan,String jam_kegiatan,String durasi_kegiatan,String ket_kegiatan){
        super(nama,nama_kegiatan,jam_kegiatan,durasi_kegiatan,ket_kegiatan);
    }
    
   @Override
   public void lihat(){
        System.out.println("   Nama Anda           = "+ getnama());
        System.out.println("   Nama Kegiatan       = "+ getnama_kegiatan());
        System.out.println("   Jam Belajar         = "+ getjam_kegiatan());
        System.out.println("   Durasi Belajar      = "+ getdurasi_kegiatan());
        System.out.println("   Keterangan Belajar  = "+ getket_kegiatan());
        System.out.println("\n");

    }
   
   
}
