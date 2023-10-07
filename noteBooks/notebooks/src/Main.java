import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.MakeNoteBookList;
import Model.NoteBook;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NoteBook> notes = new ArrayList<>();
        notes.add(new NoteBook("E500", "Lenovo", 10, 500));
        notes.add(new NoteBook("E300", "Lenovo", 2, 300));
        notes.add(new NoteBook("GL7", "MSI", 14, 700));
        notes.add(new NoteBook("lll", "Sony", 5, 500));
        iGetModel model = new MakeNoteBookList(notes);
        iGetView view = new View();
        new Controller(model, view).run();
    }
}