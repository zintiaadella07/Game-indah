public class Slimee extends Musuhh implements BisaLoot1 {
   public Slimee() {
      super("Slimee Asam", 50);
   }
    @Override
    public void serang_Pemain() {
        System.out.println(this.namaMusuhh + " melompat dan menyemprotkan ludah! Player -15 HP");
    }

    @Override
    public void suaraKhas() {
        System.out.println("Suara: *Blub... blub... blub...*");
    }
    @Override
    public void jatuhkanItem() {
    System.out.println("Loot Drop: " + this.namaMusuhh + " menjatuhkan 1x Potion Penyembuh!");
    }

    public static void main(String[] args) {
    Slimee slime1 = new Slimee();

    slime1.serang_Pemain();
    slime1.suaraKhas();
    slime1.jatuhkanItem();
}
}