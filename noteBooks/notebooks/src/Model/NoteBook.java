package Model;

public class NoteBook {
    private String model;
    private String firm;
    private int ram;
    private int hard;

    public NoteBook(String model, String firm, int ram, int hard) {
        this.model = model;
        this.firm = firm;
        this.ram = ram;
        this.hard = hard;
    }

    public String getModel() {
        return model;
    }

    public String getFirm() {
        return firm;
    }

    public int getRam() {
        return ram;
    }

    public int getHard() {
        return hard;
    }
    @Override
    public String toString() {
        return "Ноутбук [модель=" + this.model + ", фирма=" + this.firm + ", ОЗУ=" + this.ram + ", ПЗУ=" + this.hard +"]";
    }
}
