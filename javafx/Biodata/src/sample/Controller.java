package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textNama;
    public TextField textNim;
    public TextField textUsia;
    public TextField textJurusan;

    private Koneksi Koneksi = new Koneksi();

    public void ButtonOnClick(ActionEvent actionEvent) {
        String nim = textNim.getText();
        String nama = textNama.getText();
        String usia = textUsia.getText();
        String jurusan = textJurusan.getText();

        textNim.setText("");
        textNama.setText("");
        textUsia.setText("");
        textJurusan.setText("");

        //input data ke tabel pesan pada database pbo-reguler
        String query = "INSERT INTO biodatamahasiswa(Nim, Nama, Usia, Jurusan) VALUES(" + nim + ", '" + nama + "', '" + usia + "', '" + jurusan + "')";
        int hasil = Koneksi.manipulasiData(query);

        if (hasil == 1) {
            System.out.println("Data berhasil ditambah ke dalam database");
        }
    }
}