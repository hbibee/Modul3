package org.example;
/**
 * Kelas TextInput untuk menyimpan teks yang diinput pengguna.
 */
public class TextInput {
    private String text;
    /**
     * Konstruktor TextInput untuk menginisialisasi teks.
     *
     * @param text teks yang diinput pengguna
     */
    public TextInput(String text) {
        this.setText(text);
    }
    /**
     * Konstruktor TextInput tanpa parameter. Menginisialisasi objek tanpa teks.
     */
    public TextInput() {
    }
    /**
     * Mengambil teks yang disimpan dalam objek TextInput.
     *
     * @return teks yang diinput pengguna
     */
    public String getText() {
        return text;
    }
    /**
     * Mengatur teks yang disimpan dalam objek TextInput.
     *
     * @param text teks yang akan disimpan dalam objek
     */
    public void setText(String text) {
        this.text = text;
    }
}


