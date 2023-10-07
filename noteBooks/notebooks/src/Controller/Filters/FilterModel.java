package Controller.Filters;

import Model.NoteBook;

import java.util.ArrayList;
import java.util.List;

public class FilterModel implements iFilter{
    private String filterParam;

    public FilterModel(String filterParam) {
        this.filterParam = filterParam;
    }

    @Override
    public List<NoteBook> filterData(List<NoteBook> noteBooks) {
        List <NoteBook> filterNotes = new ArrayList<>();
        for (NoteBook note : noteBooks
             ) {
            if(note.getModel().toLowerCase().contains(this.filterParam.toLowerCase())){
                filterNotes.add(note);
            }
        }
        return filterNotes;
    }
}
