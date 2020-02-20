package Facade;

import Controller.CalenderController;
import View.CalenderView;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class CalenderFacade {
    private Stage stage;
    private CalenderView view;
    private CalenderController calenderController;

    public CalenderFacade(Stage stage){
        this.stage = stage;
        view = new CalenderView();
        calenderController = new CalenderController(view);
        stage.setTitle("Julkalender");
        Scene scene = new Scene(view.dl,230,375);
        stage.setScene(scene);
        Image image = new Image("christmas-tree.png");
        stage.getIcons().add(image);
        scene.getStylesheets().add(CalenderFacade.class.getResource("../Style.css").toExternalForm());
        view.setUP();
        calenderController.setUpButtons();
    }

    public void show() {
        stage.show();
    }
}
