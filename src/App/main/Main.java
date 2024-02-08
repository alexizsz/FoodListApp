package App.main;
import App.input.Scann;
import App.logic.Menus;

public class Main {
    public static void main(String[] args) {



        /*-Current = What i should be working on right now and is doable right away.
         * -Mid = self explanatory.
         * -Future = What ideas exist but not currently doable without implementing future stuff.
         *
         *TODO-
         *  -Create shell for the app. - DONE
         *  -Create menu logics
         *       -Main menu(current) - DONE
         *       -Creating shopping list menu(current) - DONE
         *           -Allow to create from list template & favorite/frequently purchased items(future).
         *       -Editing existing list menu(future)
         *       -Viewing previous lists/purchases(future)
         *       -Searching for items(future)
         *       -Setting(future)
         * APIS -
         *       -Research APIs(mid)
         *       -Integrate APIs(mid)
         * USER PERSONALIZATION -
         *       -User authentication system for different people and for shared lists.(future)
         * FRONTEND LOGIC -
         *       -Create ui in a website to begin with? Research best way to go with this app.(future)
         *       -Optimize for mobile users(future)
         *       -Personal ui depending on who logged in? Simplified to dark mode etc. Not too much focus.(future)
         *
         * */
        Scann sc = new Scann();
        System.out.println("Welome to your shopping list!");
        Menus.setupMenu();


    }
}