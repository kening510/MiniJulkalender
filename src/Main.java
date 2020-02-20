import Facade.CalenderFacade;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        CalenderFacade calenderFacade = new CalenderFacade(stage);
        calenderFacade.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
