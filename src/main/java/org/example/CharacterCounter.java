package org.example;
import java.util.Scanner;
/**
 * Kelas CharacterCounter untuk menghitung jumlah huruf besar dan huruf kecil dalam sebuah teks.
 * Mengimplementasikan antarmuka TextAnalyzer dan mewarisi kelas TextInput.
 */
public class CharacterCounter extends TextInput implements TextAnalyzer {
    private final TextInput input;
    private int upperCaseCount = 0;
    private int lowerCaseCount = 0;
    /**
     * Konstruktor CharacterCounter untuk menginisialisasi objek dengan teks yang diinput.
     *
     * @param input objek TextInput yang menyimpan teks pengguna
     */
    public CharacterCounter(TextInput input) {
        this.input = input;
    }
    /**
     * Menganalisis teks dan menghitung jumlah huruf besar dan huruf kecil.
     */
    @Override
    public void analyzeText() {
        calculateLetterCounts(input.getText());
    }
    /**
     * Menghitung jumlah huruf besar dan huruf kecil dalam teks.
     *
     * @param text teks yang akan dianalisis
     */
    private void calculateLetterCounts(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                upperCaseCount++;
            } else if (Character.isLowerCase(text.charAt(i))) {
                lowerCaseCount++;
            }
        }
    }
    /**
     * Menampilkan hasil analisis, yaitu jumlah huruf besar dan huruf kecil.
     */
    @Override
    public void displayResults() {
        System.out.println("Jumlah huruf besar: " + upperCaseCount);
        System.out.println("Jumlah huruf kecil: " + lowerCaseCount);
    }
    /**
     * Metode utama (main) untuk menjalankan program CharacterCounter.
     * Mengambil input dari pengguna, melakukan analisis, dan menampilkan hasilnya.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan kata atau kalimat: ");
        TextInput userInput = new TextInput(scanner.nextLine());

        // Membuat instance dan menjalankan analisis
        CharacterCounter counter = new CharacterCounter(userInput);
        counter.analyzeText();
        counter.displayResults();
    }
}