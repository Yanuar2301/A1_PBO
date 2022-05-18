
package POSTTEST6;

public class Olahraga implements kegiatann {
    String nama,nama_kegiatan,jam_kegiatan,durasi_kegiatan,ket,status;
    
    public Olahraga (String nama,String nama_kegiatan,String jam_kegiatan,String durasi_kegiatan, String ket,String status){
        this.nama = nama;
        this.nama_kegiatan = nama_kegiatan;
        this.jam_kegiatan = jam_kegiatan;
        this.durasi_kegiatan = durasi_kegiatan;
        this.ket = ket;
        this.status = status;
        
    }
    
    @Override
    public void lihat() {
        System.out.println("   Nama Anda           = "+ this.nama);
        System.out.println("   Nama Kegiatan       = "+ this.nama_kegiatan);
        System.out.println("   Jam                 = "+ this.jam_kegiatan);
        System.out.println("   Lama                = "+ this.durasi_kegiatan);
        System.out.println("   Agenda              = "+ this.ket);
        System.out.println("\n");
    }

    @Override
    public void status() {
        System.out.println("   Nama Anda           = "+ this.nama);
        System.out.println("   Nama Kegiatan       = "+ this.nama_kegiatan);
        System.out.println("   Jam                 = "+ this.jam_kegiatan);
        System.out.println("   Lama                = "+ this.durasi_kegiatan);
        System.out.println("   Status Kegiatan     = "+ this.status);
        System.out.println("\n");
    }
    
}
