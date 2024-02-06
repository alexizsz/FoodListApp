package App.menu;

import App.Users.Users;
import App.input.Scann;

import java.util.InputMismatchException;

public class Menus {

    private static Scann sc = new Scann();

    static Users currentUser = new Users();
    static Users currentCash = new Users();
    public static void setupMenu(){
        System.out.println("What is your name?");
        currentUser.setUserName(sc.nextLine());
        System.out.println("And please say how much money you have to spend: ");
        currentCash.setCurrentWallet(sc.nextInt());
        System.out.println("Welcome " + currentUser.getUserName() + ", your current wallet contains: " + currentCash.getCurrentWallet());
        mainMenu();
    }
    public static void mainMenu(){
        System.out.println(" " +
                "1 - Create Shopping List" +
                "\n 2 - Edit Existing Shopping List" +
                "\n 3 - Search for items" +
                "\n 4 - Wallet" +
                "\n 5 - Exit ");
        int menuChoice = sc.nextInt();
        boolean startStop;
        do {
            startStop = false;
            try{
                switch (menuChoice){
                    case 1:
                        System.out.println("This will be the : Create shopping list menu");
                        shoppingListMenu();
                        break;
                    case 2:
                        System.out.println("This will be the : edit existing shopping list menu");
                        editListMenu();
                        break;
                    case 3:
                        System.out.println("This will be the : Search for items menu");
                        searchItemMenu();
                        break;
                    case 4:
                        System.out.println("The value of your wallet is currently: " + currentCash.getCurrentWallet());
                        mainMenu();
                        break;
                    case 5:
                        System.out.println("Thanks for shopping!");
                        System.exit(0);
                         break;
                    default:
                        System.out.println("You need to chose a correct number from the menu, 1-4!");
                        mainMenu();
                }


            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("You have to choose a number in the menu, 1-4!");
                mainMenu();
            }
        }while (startStop);
    }
    public static void shoppingListMenu(){

    }
    public static void editListMenu(){

    }
    public static void searchItemMenu(){

    }

}
