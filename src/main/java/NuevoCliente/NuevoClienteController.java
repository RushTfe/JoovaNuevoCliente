package NuevoCliente;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NuevoClienteController extends GridPane implements Initializable {

    @FXML
    private GridPane rootClienteNuevo;

    @FXML
    private TextField nombreField;

    @FXML
    private TextField apellidoField;

    @FXML
    private TextField dniField;

    @FXML
    private TextField tlfField;

    @FXML
    private TextField emailField;

    @FXML
    private DatePicker nacimientoField;

    @FXML
    private CheckBox huefanoBox;

    @FXML
    private TextArea obervacionesBox;

    @FXML
    private TextField direccionField;

    private NuevoClienteModel model;

    public NuevoClienteController() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/NuevoClienteView.fxml"));
        loader.setController(this);
        loader.setRoot(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model = new NuevoClienteModel();

        /*******************************************
         *
         * Bindeos con el modelo
         *
         *******************************************/

        model.nombreClienteProperty().bindBidirectional(nombreField.textProperty());
        model.apellidosClienteProperty().bindBidirectional(apellidoField.textProperty());
        model.dniClienteProperty().bindBidirectional(dniField.textProperty());
        model.telefonoClienteProperty().bindBidirectional(tlfField.textProperty());
        model.mailClienteProperty().bindBidirectional(emailField.textProperty());
        model.nacimientoClienteProperty().bindBidirectional(nacimientoField.valueProperty());
        model.clienteHuefanoProperty().bindBidirectional(huefanoBox.selectedProperty());
        model.observacionesClienteProperty().bindBidirectional(obervacionesBox.textProperty());
        model.direccionProperty().bindBidirectional(direccionField.textProperty());

        nacimientoField.setEditable(false);
    }

    public NuevoClienteModel getModel() {
        return model;
    }

    public TextField getDniField() {
        return dniField;
    }
}
