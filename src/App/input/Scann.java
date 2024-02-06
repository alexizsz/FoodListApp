package App.input;

import java.util.Scanner;

public class Scann {

    private final Scanner sc;

    public Scann() {
        sc = new Scanner(System.in);
    }
    public int nextInt(){
        return sc.nextInt();
    }
    public String nextLine(){
        return sc.nextLine();
    }
}
