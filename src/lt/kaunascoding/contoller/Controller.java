package lt.kaunascoding.contoller;

import lt.kaunascoding.model.AnimalSingleton;
import lt.kaunascoding.model.vo.IAnimal;
import lt.kaunascoding.view.Menu;

import java.util.Scanner;

public class Controller {

    public Controller() {
        int pasirinkimas = 0;
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();

        while (pasirinkimas != 3) {
            menu.showMenu();

            pasirinkimas = sc.nextInt();

            switch (pasirinkimas) {
                case 3:
                    break;
                case 1:
                    //nuskaitymas
                    AnimalSingleton.getInstance().readAnimals();
                    System.out.println("Is viso yra " + AnimalSingleton.getInstance().getAnimalsCount() + " gyvūnai");
                    break;
                case 2:
                    //info atvaizdavimas apie vieną gyvūną
                    System.out.println("Iveskite gyvūno numerį nuo 0 iki " + (AnimalSingleton.getInstance().getAnimalsCount() - 1));
                    int index = sc.nextInt();
                    IAnimal obj = AnimalSingleton.getInstance().getAnimalByIndex(index);
                    System.out.println(obj);
                    break;
            }
        }
    }
}
