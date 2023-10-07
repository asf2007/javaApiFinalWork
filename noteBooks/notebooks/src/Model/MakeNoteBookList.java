package Model;

import Controller.iGetModel;

import java.util.List;

public class MakeNoteBookList implements iGetModel {
    private List<NoteBook> noteBooks;

    public MakeNoteBookList(List<NoteBook> noteBooks) {
        this.noteBooks = noteBooks;
    }

    public List<NoteBook> getNoteBooks() {
        return noteBooks;
    }
}
