package Controller;

import Controller.Filters.FilterFirm;
import Controller.Filters.FilterHard;
import Controller.Filters.FilterModel;
import Controller.Filters.FilterRam;

import java.util.Scanner;

public class Controller {
private iGetModel model;
private iGetView view;

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    public void run()
    {
        boolean getNewIter = true;
        while(getNewIter)
        {

            System.out.println("1 - вывести список ноутбуков");
            System.out.println("2 - фильтр по оперативной памяти");
            System.out.println("3 - фильтр по жесткому диску");
            System.out.println("4 - фильтр по фирме");
            System.out.println("5 - фильтр по моделе");
            System.out.println("0 - выход");
            System.out.println("Введите команду: ");
            Scanner scanner = new Scanner(System.in);
            int com = Integer.parseInt(scanner.nextLine());
                switch (com) {
                    case 0:
                        getNewIter = false;
                        System.out.println("Выход из программы");
                        break;
                    case 1:
                        view.printAllNoteBooks(model.getNoteBooks());


                        break;
                    case 2:
                        System.out.println("Ведите минимальное значение ОЗУ");
                        int minOzu = Integer.parseInt(scanner.nextLine());
                        System.out.println("Введите максимальное значение ОЗУ");
                        int maxOzu = Integer.parseInt(scanner.nextLine());
                        view.printAllNoteBooks(new FilterRam(minOzu, maxOzu).filterData(model.getNoteBooks()));
                        break;
                    case 3:
                        System.out.println("Ведите минимальное значение ПЗУ");
                        int minHard = Integer.parseInt(scanner.nextLine());
                        System.out.println("Введите максимальное значение ПЗУ");
                        int maxHard = Integer.parseInt(scanner.nextLine());
                        view.printAllNoteBooks(new FilterHard(minHard, maxHard).filterData(model.getNoteBooks()));
                        break;
                    case 4:
                        System.out.println("Введите наименование фирмы");
                        String firmParam = scanner.nextLine();
                        view.printAllNoteBooks(new FilterFirm(firmParam).filterData(model.getNoteBooks()));
                        break;
                    case 5:
                        System.out.println("Введите наименование модели");
                        String modelParam = scanner.nextLine();
                        view.printAllNoteBooks(new FilterModel(modelParam).filterData(model.getNoteBooks()));
                        break;

            }

        }

    }

}
