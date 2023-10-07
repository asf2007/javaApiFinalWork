package View;

import Controller.iGetView;
import Model.NoteBook;

import java.util.List;

public class View implements iGetView {


    @Override
    public void printAllNoteBooks(List<NoteBook> noteBooks) {
        System.out.println("-----------------------ноутбуки---------------------------------");
        for (NoteBook note : noteBooks
             ) {
            System.out.println(note);
        }
        System.out.println("-------------------------------------------------------------------");
    }
}
