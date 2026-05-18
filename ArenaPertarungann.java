import java.util.Scanner;

public class ArenaPertarungann {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Musuhh[] gelombangMonster = new Musuhh[4];

        gelombangMonster[0] = new Slimee();
        gelombangMonster[1] = new Nagaa();
        gelombangMonster[2] = new Slimee();
        gelombangMonster[3] = new Zombiee();

        System.out.println("===================");
        System.out.println(" ARENA RPG: GELOMBANG MONSTER ");
        System.out.println("===================\n");

        System.out.println(" AWAS! Sekelompok monster menghadang Anda!");

        boolean isBermainn = true;

        while (isBermainn) {

            System.out.println("\n--- STATUS MONSTER ---");

            for (int i = 0; i < gelombangMonster.length; i++) {

                if (gelombangMonster[i].healthPointt > 0) {

                    System.out.println((i + 1) + ". "
                    + gelombangMonster[i].namaMusuhh + " (HP: "
                    + gelombangMonster[i].healthPointt + ")");

                } else {
                    System.out.println((i+1) + ". " 
                    + gelombangMonster[i].namaMusuhh 
                    + " [TEWAS]");
                }
            }
            
            System.out.println("5. Kabur dari pertarungan");
            System.out.print("\npilih target monster yang ingin diserang (1/2/3/4) atau 5 untuk kabur: ");

            try {
                
                int pilihanTargett = input.nextInt();
                
                if (pilihanTargett == 5) {
                System.out.println("Anda lari terbirit-birit dari arena...");
                break;
            }
                
            if (pilihanTargett < 1 || pilihanTargett > 4) {
                throw new Exception("Pilihan tidak valid!");
            }

            int indeksMonster = pilihanTargett - 1;

            if (gelombangMonster[indeksMonster].healthPointt <= 0) {
                throw new TargetMatiException(
                    "Tindakan Ilegal: Tidak bisa menyerang monster yang sudah mati!");
            }

                System.out.print("Masukkan kekuatan serangan Anda (10-100): ");
                int power = Integer.parseInt(input.nextLine());

                System.out.print("\n>>> HASIL SERANGAN ANDA <<<");
                gelombangMonster[indeksMonster].terima_Damage(power);

                if (gelombangMonster[indeksMonster].healthPointt <= 0) {
                    System.out.println(gelombangMonster[indeksMonster].namaMusuhh + " berhasil dikalahkan!");

                if (gelombangMonster[indeksMonster] instanceof BisaLoot1) {
                        BisaLoot1 monsterLoot = (BisaLoot1) gelombangMonster[indeksMonster];
                        monsterLoot.jatuhkanItem();
                    }
                }
            
                System.out.println("\n<<< GILIRAN MONSTER MEMBALAS >>>");

                for (int i = 0; i < gelombangMonster.length; i++) {

                    if (gelombangMonster[i].healthPointt > 0) {

                        Musuhh monsterAktif = gelombangMonster[i];
                        monsterAktif.suaraKhas();

                        if (monsterAktif instanceof BisaTerbang) {
                            System.out.println("[PERINGATAN! SERANGAN UDARA TERDETEKSI]");
                            BisaTerbang monsterTerbang = (BisaTerbang) monsterAktif;
                            monsterTerbang.lepasLandas();
                            monsterTerbang.seranganUdara();
                    } else {
                        monsterAktif.serang_Pemain();
                    }
                }
            }
        }
        catch (TargetMatiException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Tekan ENTER untuk melanjutkan...");
            input.nextLine();
        }

        catch (NumberFormatException e) {
            System.out.println("INPUT HARUS ANGKA!");
            System.out.println("Tekan ENTER untuk lanjut...");
            input.nextLine();
        }

        catch (Exception e) {
            System.out.println("ERROR UMUM: " + e.getMessage());
            System.out.println("Tekan ENTER untuk melanjutkan...");
            input.nextLine();
        }

        finally {
            System.out.println("[SISTEM] Giliran selesai diproses.\n");
        }
    }

    boolean semuaMati = true;
        for (int i = 0; i < gelombangMonster.length; i++) {
            if (gelombangMonster[i].healthPointt > 0) {
                semuaMati = false;
                break;
            }
        }

        if (semuaMati) {
            System.out.println("\nSELAMAT! Anda telah menyapu bersih gelombang monster ini!");
        }
            
        input.close();
        System.out.println("Permainan Berakhir.");
            
    }
}