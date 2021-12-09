package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
}
