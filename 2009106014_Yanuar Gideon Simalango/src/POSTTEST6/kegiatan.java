
package POSTTEST6;



class kegiatan {
    protected String nama_kegiatan;
    protected String jam_kegiatan;
    protected String durasi_kegiatan;
    protected String ket_kegiatan;
    protected String nama;    
    
    
    public kegiatan(String nama,String nama_kegiatan,String jam_kegiatan,String durasi_kegiatan,String ket_kegiatan){
        this.nama_kegiatan = nama_kegiatan;
        this.jam_kegiatan = jam_kegiatan;
        this.durasi_kegiatan = durasi_kegiatan;
        this.ket_kegiatan = ket_kegiatan;
        this.nama = nama;
    }

    
    protected void setnama(String nama){
        this.nama = nama;
    }
    
    protected void setnama_kegiatan(String nama_kegiatan){
        this.nama_kegiatan = nama_kegiatan;
    }
    
    protected void setjam_kegiatan(String jam_kegiatan){
        this.jam_kegiatan = jam_kegiatan;
    }
    
    protected void setdurasi_kegiatan (String durasi_kegiatan){
        this.durasi_kegiatan = durasi_kegiatan;
    }
    
    protected void setket_kegiatan(String ket_kegiatan){
        this.ket_kegiatan = ket_kegiatan;
    }
    
    
    protected String getnama(){
        return this.nama;
    }
    
    protected String getnama_kegiatan(){
        return this.nama_kegiatan;
    }
    
    protected String getjam_kegiatan(){
        return this.jam_kegiatan;
    }
    
    protected String getdurasi_kegiatan(){
        return this.durasi_kegiatan;  
    }
  
    protected String getket_kegiatan(){
        return this.ket_kegiatan;
    }
    
    
    
    
    public void lihat(){
        System.out.println("   Nama Pemilik        = "+ getnama());
        System.out.println("   Nama Kegiatan       = "+ getnama_kegiatan());
        System.out.println("   Jam Kegiatan        = "+ getjam_kegiatan());
        System.out.println("   Durasi Kegiatan     = "+ getdurasi_kegiatan());
        System.out.println("   Keterangan Kegiatan = "+ getket_kegiatan());
        System.out.println("\n");

    }
    

    
    
    
    
    
    
}
