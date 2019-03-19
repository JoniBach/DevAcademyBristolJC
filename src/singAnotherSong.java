import java.util.Scanner;

public class singAnotherSong {

    private void singAgain(){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("The duck song?");
        int ducks = myScanner.nextInt();

            String word = "ducks";
            for(int i = ducks; i > 0; i--) {
                System.out.println(" " + word + " little ducks went swimming one day");
                System.out.println("over the hill and far away");
                System.out.println("Mother duck said, “Quack quack quack quack”");
                System.out.println("And only" + word + "little ducks came back!");
                if (i == 1) {
                    System.out.println("And all the little ducks came back.");
                }
                    else {
                    int newNum = i - 1;
                    if (newNum == 1) {
                        word = "bottle";
                    }
                    System.out.println();
                }

            }
    }
    public static void main(String[] args) {
        singAnotherSong duckSong = new singAnotherSong();
        duckSong.singAgain();

    }

}
