package Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalenderModel extends Observerable {
    private List<String> poems = new ArrayList<>();

    public void loadPoems() {
        String txt = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader("RedbirdLove.txt"));
            for (int i = 1; i < 25; i++) {
                txt = bf.readLine();
                poems.add(txt);
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
        notifyObservers();
    }

    public String getPoemByIndex(int index) {
        return poems.get(index);
    }
}

