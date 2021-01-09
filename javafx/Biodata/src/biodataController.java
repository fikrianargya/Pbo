package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class biodataController {
    public TextField textNim;
    public TextField textNama;
    public TextField textUmur;
    public TextField textJurusan;

    private Koneksi Koneksi = new Koneksi();

    public void buttonSendOnClick(ActionEvent actionEvent) {
        String nim = textNim.getText();
        String nama = textNama.getText();
        String umur = textUmur.getText();
        String jurusan = textJurusan.getText();

        textNim.setText("");
        textNama.setText("");
        textUmur.setText("");
        textJurusan.setText("");

        //input data ke tabel pesan pada database pbo-reguler
        String query ="INSERT INTO biodatamahasiswa(nim, nama, umur, jurusan) VALUES(" + nim + ", '" + nama + "', '" + umur + "', '" + jurusan + "')";
        int hasil = Koneksi.manipulasiData(query);

        if (hasil == 1) {
            System.out.println("Data berhasil ditambah ke dalam database");
        }
    }
}