public class Zombiee extends Musuhh implements BisaLoot1 {
   public Zombiee() {
      super("Zombie Merangkak", 150);
   }
   @Override
    public void serang_Pemain() {
    System.out.println(this.namaMusuhh + " mencakar pemain! Player -20 HP");
    }

    @Override
    public void suaraKhas() {
    System.out.println("Suara: *Rooaaarrr... *");
    }

    @Override
    public void jatuhkanItem() {
    System.out.println("Loot Drop: " + this.namaMusuhh + " menjatuhkan menjatuhkan 1x Daging Busuk!");
    }

    public static void main(String[] args) {
    Zombiee z1 = new Zombiee();

    z1.serang_Pemain();
    z1.suaraKhas();
    z1.jatuhkanItem();
}
}