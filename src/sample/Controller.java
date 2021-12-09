package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.BufferedReader;
import java.io.FileReader;

public class Controller {

    @FXML
    private Button btnLegDraga;
    @FXML
    private Button btnOsszes;
    @FXML
    private Button btnDraga;
    @FXML
    private Button btnAkcios;
    @FXML
    private Button btnFajl;
    @FXML
    private Button btnHibas;
    @FXML
    private Button btnKilep;

    public void initialize(){
        btnLegDraga.setDisable(true);
        btnOsszes.setDisable(true);
        btnDraga.setDisable(true);
        btnAkcios.setDisable(true);
        btnHibas.setDisable(true);
    }

    public void btnFajlClick(MouseEvent mouseEvent) {
        try {
            FileReader fr = new FileReader("pizza/pizzeria.csv");
            BufferedReader br = new BufferedReader(fr);

            int i = 1;
            br.readLine();
            String sor = br.readLine();
            while (sor != null) {
                Pizza p = new Pizza(sor);
                sor = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
