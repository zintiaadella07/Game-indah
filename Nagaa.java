public class Nagaa extends Musuhh implements BisaTerbang, BisaLoot1 {
   public Nagaa() {
      super("Nagaa Api Biru", 500);
   }

    @Override
    public void serang_Pemain() {
        System.out.println(namaMusuhh + " menyemburkan nafas Api Biru! Player -50 HP");
    }
    @Override
    public void suaraKhas() {
        System.out.println(this.namaMusuhh + " PRRROOOOOOOTTTTTTT");
    }

    @Override 
    public void lepasLandas() {
        System.out.println(this.namaMusuhh + " terbang tinggi! Sulit diserang.");
    }

    @Override
    public void seranganUdara() {
        System.out.println(this.namaMusuhh + " menyemburkan badai api! Pemain -80 HP.");
    }
    
    @Override
    public void jatuhkanItem() {
        System.out.println("Loot Drop: " + this.namaMusuhh + " menjatuhkan Sisik Nagaa Api!");
    }

    public static void main(String[] args) {
    Nagaa naga1 = new Nagaa();

    naga1.serang_Pemain();
    naga1.suaraKhas();
    naga1.lepasLandas();
    naga1.seranganUdara();
    naga1.jatuhkanItem();
}
}