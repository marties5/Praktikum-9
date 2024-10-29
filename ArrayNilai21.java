import java.util.Scanner;

public class ArrayNilai21 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int[] NilaiAkhir = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Nilai Akhir KE-" + i + " : ");
            NilaiAkhir[i] = Input.nextInt();
        }
        for (int i = 0; i < NilaiAkhir.length; i++) {
            System.out
                    .println("Mahasiswa ke-" + i + (NilaiAkhir[i] < 70 ? " Tidak lulus" : " Lulus!")
                            + " Dengan nilai : "
                            + NilaiAkhir[i]);
        }
        Input.close();
    }
}
