package Controller.Filters;

import Model.NoteBook;

import java.util.ArrayList;
import java.util.List;

public class FilterRam implements iFilter {
    private int minParam;
    private int maxParam;

    public FilterRam(int minParam, int maxParam) {
        this.minParam = minParam;
        this.maxParam = maxParam;
    }

    @Override
    public List<NoteBook> filterData(List<NoteBook> noteBooks) {
        List <NoteBook> filterNotes = new ArrayList<>();
        for (NoteBook note : noteBooks
        ) {
            if(note.getRam()>=minParam&&note.getRam()<=maxParam){
                filterNotes.add(note);
            }
        }
        return filterNotes;
    }
}
