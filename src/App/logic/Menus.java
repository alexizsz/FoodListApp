package App.logic;

import App.Users.Users;
import App.input.Scann;
import App.list.CurrentList;

import java.util.InputMismatchException;

public class Menus {

    private static Scann sc = new Scann();

    static CurrentList currentList = new CurrentList();
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
        System.out.println("""
                \s
                 1 - Create Shopping List
                 2 - Edit Existing Shopping List
                 3 - Wallet
                 4 - Exit\s""");
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
                        System.out.println("The value of your wallet is currently: " + currentCash.getCurrentWallet());
                        mainMenu();
                        break;
                    case 4:
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
    public static void editListMenu(){

    }
    public static void searchItemMenu(){

    }
    public static void shoppingListMenu(){
        System.out.println("""
                    Welcome to the shoppingListMenu!
                    1 - Add items
                    2 - Delete items
                    3 - See current list
                    4 - Go back
                    5 - Exit""");
        int menuChoice = sc.nextInt();
        boolean startStop = false;
        do {
            try {
                startStop = false;
                switch (menuChoice){
                    case 1:
                        System.out.println("This will be the: Add items to list menu");
                        createNewList();
                        break;
                    case 2:
                        System.out.println("This will be the: Delete items to list menu");
                        break;
                    case 3:
                        System.out.println("This will be the: See current list menu");
                        break;
                    case 4:
                        mainMenu();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("You need to choose a correct number from the menu");
                        shoppingListMenu();
                }
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("please choose a correct number from the menu");
                shoppingListMenu();
            }

        }while (startStop);
    }
    public static void createNewList(){
        if (currentList.isListExists() == false){
            System.out.println("You dont seem to have created a list yet, lets do it!");
        }else {
            System.out.println("Here is your current list: \n" + currentList.getItems());
        }

    }
    public static void seeAllItems(){

    }
    public static void deleteItemsFromList(){

    }
    public static void seeCurrentItemsInList(){

    }

}
