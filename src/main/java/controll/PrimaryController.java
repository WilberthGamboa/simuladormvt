package controll;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import model.TableMVT;

public class PrimaryController implements Initializable {

    @FXML
    private Button btnstep;

    @FXML
    private TableColumn<TableMVT, Integer> duracion;

    @FXML
    private HBox hboxMain;

    @FXML
    private HBox hboxleft;

    @FXML
    private HBox hboxright;

    @FXML
    private TableColumn<TableMVT, Integer> llegada;

    @FXML
    private TableColumn<TableMVT, String> proceso;

    @FXML
    private TableView<TableMVT> tablaMuestra;

    @FXML
    private TableColumn<TableMVT, Integer> tamanio;

    @FXML
    private Label title;

    @FXML
    private VBox vBoxFooter;

    @FXML
    private VBox vBoxfather;

    @FXML
    private VBox vBoxtitle;

    @FXML
    private VBox vboxFatherTables;
    @FXML
    private VBox sistemaOperativo;

    ObservableList<TableMVT> list = FXCollections.observableArrayList(

        new TableMVT("A", 8000, 1, 7),
        new TableMVT("B", 14000, 2, 7),
        new TableMVT("C", 18000, 3, 4),
        new TableMVT("D", 6000, 4, 6),
        new TableMVT("E", 14000, 5, 5)
    );

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

        proceso.setCellValueFactory(new PropertyValueFactory<TableMVT,String>("proceso"));
        tamanio.setCellValueFactory(new PropertyValueFactory<TableMVT,Integer>("tamanio"));
        llegada.setCellValueFactory(new PropertyValueFactory<TableMVT,Integer>("llegada"));
        duracion.setCellValueFactory(new PropertyValueFactory<TableMVT,Integer>("duracion"));
        tablaMuestra.setItems(list);
        
    }
    
   
   
    
}
