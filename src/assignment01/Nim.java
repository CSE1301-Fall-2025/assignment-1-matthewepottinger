import java.util.Scanner;

public class Nim {
    public static void main (String [] args) {	
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Nim! In this game you pull 1 or 2 sticks off the pile, trying to pull the last stick! Do your best to beat the computer!");
        System.out.print("How many sticks does your pile start with? ");
        int numSticks = scan.nextInt();

        while (numSticks > 0) {
            System.out.print("How many sticks do you pull? ");
            int sticksPulled = scan.nextInt();
            numSticks = (numSticks - sticksPulled);
            if (sticksPulled != 1 && sticksPulled != 2) {
                System.out.println("You can only pull 1 or 2 sticks!");
                numSticks = (numSticks + sticksPulled);
            }
            else if (numSticks < 0) {
                System.out.println("You can't pull more sticks than are left in the pile!");
                numSticks = (numSticks + sticksPulled);
            }
            else {
                System.out.println("The number of sticks is now " + numSticks + ".");
                double chance = Math.random();
                if (numSticks == 0) {
                    System.out.println("You pulled the last stick! Congratulations, you won!");
                }
                else if (chance >= 0.5) {
                    numSticks = (numSticks - 1);
                    System.out.println("The computer pulled 1 stick, the number of sticks is now " + numSticks + ".");
                    if (numSticks == 0) {
                        System.out.println("Sorry, the computer pulled the last stick, better luck next time...");
                    }
                }
                else {
                    numSticks = (numSticks - 2);
                    if (numSticks < 0) {
                        numSticks++;
                        System.out.println("The computer pulled 1 stick, the number of sticks is now " + numSticks + ".");
                    }
                    else {
                        System.out.println("The computer pulled 2 sticks, the number of sticks is now " + numSticks + ".");
                    }
                    if (numSticks == 0) {
                        System.out.println("Sorry, the computer pulled the last stick, better luck next time...");
                    }
                }

            }

        }
        System.out.println("Thank you for playing!");

    }
}
