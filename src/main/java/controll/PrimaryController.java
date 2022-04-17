package controll;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import model.Paso;
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
    @FXML
    private VBox mvt;
    @FXML
    private VBox so;
    @FXML
    private RowConstraints pane0;

    @FXML
    private RowConstraints pane1;

    @FXML
    private RowConstraints pane2;

    @FXML
    private RowConstraints pane3;

    @FXML
    private RowConstraints pane4;

    @FXML
    private GridPane panelGrid;

    @FXML
    void actualizarPantalla(MouseEvent event) {
        double h = hboxright.getHeight();
        so.setMaxHeight(h*.15625);
      //  pane0.setMaxHeight(h*.125);
        if (x.getPaso()>=1) {
           
            System.out.println(x.getPaso());

            panelGrid.setVisible(true);
            pane0.setMaxHeight(h*.125);
            panelGrid.setMaxHeight(h*.125);
            if (x.getPaso()>=2) {
                pane1.setMaxHeight(h*.21875);
                panelGrid.setMaxHeight(h*.22);
                if (x.getPaso()>=3) {
                    pane2.setMaxHeight(h*.28125);
                    panelGrid.setMaxHeight(h*.50125);
                    if (x.getPaso()>=4) {
                        pane3.setMaxHeight(h*.9375);
                        panelGrid.setMaxHeight(h*.59500);
                        if (x.getPaso()>=5) {
                            pane4.setMaxHeight(h*.21875);
                            panelGrid.setMaxHeight(h*.81375);
                            
                            if (x.getPaso()>=6) {
                                
                                                            }
                        }
                    }
                }
                
            }
           

           
        }

    }
   
    @FXML
    void paso(ActionEvent event) {
        x.setPaso(x.getPaso()+1);
        
        System.out.println(x.getPaso());
        
        
        
       
     // hboxright.getChildren().remove(0);

        


    }
   
    ObservableList<TableMVT> list = FXCollections.observableArrayList(

        new TableMVT("A", 8000, 1, 7),
        new TableMVT("B", 14000, 2, 7),
        new TableMVT("C", 18000, 3, 4),
        new TableMVT("D", 6000, 4, 6),
        new TableMVT("E", 14000, 5, 5)
    );
    Paso x = new Paso();

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
