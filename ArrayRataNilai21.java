import java.util.Scanner;

public class ArrayRataNilai21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSiswa = 0;
        System.out.print("Masukkan jumlah siswa : ");
        jumlahSiswa = input.nextInt();
        int[] nilaiMahasiswa = new int[jumlahSiswa];
        double total = 0, rataNilai;
        int siswaLulus = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] > 70) {
                siswaLulus += 1;
            }
        }
        rataNilai = total / nilaiMahasiswa.length;
        System.out.println("Rata-Rata nilai Mahasiswa : " + rataNilai);
        System.out.println("Mahasiswa dengan nilai lebih dari 70 sebanyak: " + siswaLulus);

        input.close();
    }
}
