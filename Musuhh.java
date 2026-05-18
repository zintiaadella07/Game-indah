public abstract class Musuhh {
    protected String namaMusuhh;
    protected int healthPointt;

    public Musuhh(String name, int hp) {
        this.namaMusuhh = name;
        this.healthPointt = hp;
    }
    public abstract void serang_Pemain();

    public void suaraKhas() {

    }
    public void lepasLandas() {

    }
    public void seranganUdara() {
        
    }
    public void jatuhkanItem() {

    }
    public void terima_Damage(int damagee) {
        this.healthPointt -= damagee;
        System.out.println(this.namaMusuhh + " terkena serangan! Sisa HP: " + this.healthPointt);
    }
}