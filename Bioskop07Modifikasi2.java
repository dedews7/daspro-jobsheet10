public class Bioskop07Modifikasi2 {
    public static void main(String[] args) {
        String [][] penonton = new String [4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";


                System.out.println("Jumlah baris: " + penonton.length);
        for (String[] baris : penonton) {
            System.out.println("Panjang Baris ke-: " + baris.length);
        }

        System.out.println("Data penonton:");
        for (String[] baris : penonton) {
            System.out.printf("%s \t %s\n", baris[0], baris[1]);
        }
    }
}
}
