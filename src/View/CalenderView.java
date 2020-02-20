package View;

import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class CalenderView {
    public HBox designLayout = new HBox();
    private VBox buttonLayout = new VBox();
    private VBox buttonLayout2 = new VBox();
    public HBox dl = new HBox();
    public List<Button> buttonList = new ArrayList<>();
    private ScrollPane scrollPane = new ScrollPane();


    public void setUP(){
        int buttonNr = 0;
        for (int i = 0; i <12 ; i++) {
            Button button = new Button("" + ++buttonNr);
            button.setMinWidth(30);
            if(buttonNr%2 == 0){
                button.setId("even");
            }else{
                button.setId("odd");
            }
            button.setMaxHeight(10);
            buttonList.add(button);
            buttonLayout.getChildren().add(button);
        }
        for (int i = 12; i <24 ; i++) {
            Button button = new Button("" + ++buttonNr);
            button.setMinWidth(30);
            if(buttonNr%2 == 0){
                button.setId("even");
            }else{
                button.setId("odd");
            }
            button.setMaxHeight(10);
            buttonList.add(button);
            buttonLayout2.getChildren().add(button);
        }
        dl.getChildren().add(designLayout);
        designLayout.getChildren().add(buttonLayout);
        designLayout.getChildren().add(buttonLayout2);
        designLayout.getChildren().add(scrollPane);

        scrollPane.setContent(buttonLayout);
        scrollPane.setContent(buttonLayout2);

        buttonLayout.setSpacing(5);
        buttonLayout.setPadding(new Insets(10));

        buttonLayout2.setSpacing(5);
        buttonLayout2.setPadding(new Insets(10));
    }

    public void showPoem(String poem) {
        Alert alert = new Alert(Alert.AlertType.NONE, poem, ButtonType.FINISH);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("christmas-tree.png"));
        alert.showAndWait();
    }
}
