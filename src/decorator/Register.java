package decorator;

import decorator.beverages.*;
import decorator.condiments.*;
import java.util.Scanner;

public class Register {

    private Scanner keyboard;

    public static void main(String[] args) {
        new Register();
    }

    public Register() {
        keyboard = new Scanner(System.in);

        int mainChoice = 0;
        do {
            printBeverageMenu();
            mainChoice = keyboard.nextInt();

            Beverage beverage = null;

            switch (mainChoice) {
                case 1:
                    beverage = new DarkRoast();
                    break;
                case 2:
                    beverage = new HouseBlend();
                    break;
                case 3:
                    beverage = new Decaf();
                    break;
                case 4:
                    beverage = new Espresso();
                    break;
            }

            if (beverage != null) {
                int extraChoice = 0;

                do {
                    printCondimentMenu();
                    extraChoice = keyboard.nextInt();

                    switch (extraChoice) {
                        case 1:
                            beverage = new Mocha(beverage);
                            break;
                        case 2:
                            beverage = new SoyMilk(beverage);
                            break;
                        case 3:
                            beverage = new Whip(beverage);
                            break;
                    }

                } while (extraChoice != 4);

                System.out.println("That will be " + beverage.cost());
                System.out.println("Enjoy your " + beverage.getDescription());
            }

        } while (mainChoice != 5);
    }

    private void printBeverageMenu() {
        System.out.println("1. Dark Roast");
        System.out.println("2. House Blend");
        System.out.println("3. Decaf");
        System.out.println("4. Espresso");
        System.out.println("5. CLOSE REGISTER");
        System.out.print(">> ");
    }

    private void printCondimentMenu() {
        System.out.println("1. Mocha");
        System.out.println("2. Soy Milk");
        System.out.println("3. Whipped Cream");
        System.out.println("4. DONE");
        System.out.print(">> ");
    }
}
