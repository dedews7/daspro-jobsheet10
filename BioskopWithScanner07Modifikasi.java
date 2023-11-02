import java.util.Scanner;
public class BioskopWithScanner07Modifikasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine(); 
            switch (menu) {
                case 1:
                    System.out.println("Masukkan nama: ");
                    nama = sc.nextLine();

                    boolean kursiKosong = false;
                    while (!kursiKosong) {
                        System.out.println("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.println("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data penonton berhasil diinput.");
                                kursiKosong = true;
                            } else {
                                System.out.println("Kursi sudah ditempati. Pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Nomor baris atau kolom kursi tidak valid.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0); 
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }

            System.out.println("Lanjutkan? (y/n): ");
            next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
