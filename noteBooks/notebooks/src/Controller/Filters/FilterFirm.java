package Controller.Filters;

import Model.NoteBook;

import java.util.ArrayList;
import java.util.List;

public class FilterFirm implements iFilter{
    private String filterParam;

    public FilterFirm(String filterParam) {
        this.filterParam = filterParam;
    }

    @Override

    public List<NoteBook> filterData(List<NoteBook> noteBooks) {
        List <NoteBook> filterNotes = new ArrayList<>();
        for (NoteBook note : noteBooks
             ) {
            if(note.getFirm().toLowerCase().contains(this.filterParam.toLowerCase())){
                filterNotes.add(note);
            }

        }
        return filterNotes;
    }
}
