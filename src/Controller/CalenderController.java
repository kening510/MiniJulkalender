package Controller;

import Model.CalenderModel;
import Model.IObserver;
import View.CalenderView;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.time.LocalDate;

public class CalenderController implements IObserver {
    private CalenderView calenderView;
    private CalenderModel calenderModel = new CalenderModel();


    public CalenderController(CalenderView calenderView) {
        this.calenderView = calenderView;

        calenderModel.addObserver(this);
        calenderModel.loadPoems();
    }

    public void setUpButtons() {
        for (Button button : calenderView.buttonList) {
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    getTextByClicking(button);
                }
            });
        }
    }

    public void getTextByClicking(Button clickedButton) {
        int index = Integer.parseInt(clickedButton.getText()) - 1;
        LocalDate localDate = LocalDate.now();

        if (localDate.getDayOfMonth() >= index + 1 && localDate.getMonth().getValue() == 2) {
            String poem = calenderModel.getPoemByIndex(index);
            calenderView.showPoem(poem);
        }
    }


    @Override
    public void updatePoems() {
        System.out.println("poems loaded");
    }
}
