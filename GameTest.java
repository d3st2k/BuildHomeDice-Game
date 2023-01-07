import java.util.*;
import java.util.List;

import javax.swing.*;

public class GameTest {

    // Method to get a random number
    static Random random = new Random();

    // Naming the two players that are gonna play the game
    public static String s1 = "Player1";
    public static String s2 = "Player2";

    /** Method main in which something is executed
     * @param args - this class arguments
     */
    public GameTest() {
        int width = 500;
        int height = 300;

        // Calling DiceTester class
        DiceTester tester = new DiceTester(width, height);

        // Giving parameters for this class
        tester.repositionSentence(50, 50);

        /** Creating the lists where all the points that are won are saved
        */ 
        
        // List for player 1 points
        List numberOfPoints1 = new ArrayList();
        // List for player 2 points
        List numberOfPoints2 = new ArrayList();
        // List of points that are needed to win
        List neededPoints = new ArrayList(Arrays.asList(3, 3, 4, 5, 6));
        // List that we can use to see how much points each player has
        List intersectionPoints1 = new ArrayList();
        List intersectionPoints2 = new ArrayList();

        // Boolean variable with which we check, which player has won after collecting all the needed points
        boolean loop = intersectionPoints1.containsAll(neededPoints) || intersectionPoints2.containsAll(neededPoints);

        // Variables that dont allow it so that a player have the same number of points twice on the list
        // It isn't allowed based on the game rules, because double points aren't needed except for the windows
        boolean player1Contains_3_once = false;
        boolean player2Contains_3_once = false;
        int i = 0;

        // While loop that throws the dice until one player wins
        // The while loop stops when the 'loop' variable turn false
        while (loop != true) {

            // For starters we throw the dice and we get some random point 1-6
            JOptionPane.showMessageDialog(null, "Throw your dice player 1");
            int dice = random.nextInt(6) + 1;
            System.out.println(s1 + " got: " + dice);

            // Saving the points that have fallen in the list
            numberOfPoints1.add(dice);

            // To see that needed points to win are present in the list, create a new variable
            // So the position that is returned from the list and since it gets returned as object, we cast it to int
            int player1Points = (int) numberOfPoints1.get(i);

            // if - checking to see what the list contains and what not for player 1
            if (neededPoints.contains(player1Points)) {
                if (intersectionPoints1.contains(6) || intersectionPoints1.contains(5)
                        || intersectionPoints1.contains(4) || intersectionPoints1.contains(3)) {
                    if (player1Points != 6 && player1Points != 5 && player1Points != 4 && player1Points != 3) {
                        intersectionPoints1.add(player1Points);
                    } else if (player1Points == 6 && !intersectionPoints1.contains(6)) {
                        intersectionPoints1.add(player1Points);
                    } else if (player1Points == 5 && !intersectionPoints1.contains(5)) {
                        intersectionPoints1.add(player1Points);
                    } else if (player1Points == 4 && !intersectionPoints1.contains(4)) {
                        intersectionPoints1.add(player1Points);
                    } else if (player1Points == 3 && !intersectionPoints1.contains(3)) {
                        intersectionPoints1.add(player1Points);
                    } else if (player1Points == 3 && intersectionPoints1.contains(3)) {
                        if (!player1Contains_3_once) {
                            intersectionPoints1.add(player1Points);
                            player1Contains_3_once = true;
                        }
                    }
                } else {
                    // If not one condition is met, element gets added
                    intersectionPoints1.add(player1Points);
                }
            }

            // If the list has elements, check if the first element is number 6
            // If not we clear the list, until the condition is met
            if (intersectionPoints1.size() > 0) {
                if ((int) intersectionPoints1.get(0) != 6) {
                    intersectionPoints1.clear();
                }
            }

            // If the list has completed the above condition, we check if the second element in the list is 5
            // If not, we remove the element in position [1] in list, until the condition is met
            if (intersectionPoints1.size() > 1) {
                if ((int) intersectionPoints1.get(0) == 6 && (int) intersectionPoints1.get(1) != 5) {
                    intersectionPoints1.remove(1);
                }
            }

            // Method tester works based on player 1 points
            // Draw on panel, depending on the conditions that we have places
            tester.drawer1((int) intersectionPoints1.size());

            // If player 1 has all needed points in the list
            // Then while loop ends and player 1 has won
            if (intersectionPoints1.containsAll(neededPoints) && intersectionPoints1.size() == 5) {
                System.out.println("The winner is player1. Congrats!");
                break;
            }

            // Continue with player 2
            // For starters we throw the dice and we get some random point 1-6
            JOptionPane.showMessageDialog(null, "Throw your dice player 2");
            int dice2 = random.nextInt(6) + 1;
            System.out.println(s2 + " got: " + dice2);
            // Saving the points that have fallen in the list
            numberOfPoints2.add(dice2);

            // To see that needed points to win are present in the list, create a new variable
            // So the position that is returned from the list and since it gets returned as object, we cast it to int
            int player2Points = (int) numberOfPoints2.get(i);

            // if - checking to see what the list contains and what not for player 1
            if (neededPoints.contains(player2Points)) {
                if (intersectionPoints2.contains(6) || intersectionPoints2.contains(5)
                        || intersectionPoints2.contains(4) || intersectionPoints2.contains(3)) {
                    if (player2Points != 6 && player2Points != 5 && player2Points != 4 && player2Points != 3) {
                        intersectionPoints2.add(player2Points);
                    } else if (player2Points == 6 && !intersectionPoints2.contains(6)) {
                        intersectionPoints2.add(player2Points);
                    } else if (player2Points == 5 && !intersectionPoints2.contains(5)) {
                        intersectionPoints2.add(player2Points);
                    } else if (player2Points == 4 && !intersectionPoints2.contains(4)) {
                        intersectionPoints2.add(player2Points);
                    } else if (player2Points == 3 && !intersectionPoints2.contains(3)) {
                        intersectionPoints2.add(player2Points);
                    } else if (player2Points == 3 && intersectionPoints2.contains(3)) {
                        if (!player2Contains_3_once) {
                            intersectionPoints2.add(player2Points);
                            player2Contains_3_once = true;
                        }
                    }
                } else {
                    // If not one condition is met, element gets added
                    intersectionPoints2.add(player2Points);
                }
            }

            // If the list has elements, check if the first element is number 6
            // If not we clear the list, until the condition is met
            if (intersectionPoints2.size() > 0) {
                if ((int) intersectionPoints2.get(0) != 6) {
                    intersectionPoints2.clear();
                }
            }

            // If the list has completed the above condition, we check if the second element in the list is 5
            // If not, we remove the element in position [1] in list, until the condition is met
            if (intersectionPoints2.size() > 1) {
                if ((int) intersectionPoints2.get(0) == 6 && (int) intersectionPoints2.get(1) != 5) {
                    intersectionPoints2.remove(1);
                }
            }

            // Method tester works based on player 2 points
            // Draw on panel, depending on the conditions that we have places
            tester.drawer2((int) intersectionPoints2.size());

            // If player 2 has all needed points in the list
            // Then while loop ends and player 2 has won
            if (intersectionPoints2.containsAll(neededPoints) && intersectionPoints2.size() == 5) {
                if (intersectionPoints1 != neededPoints) {
                    intersectionPoints1.clear();
                }
                System.out.println("The winner is player2. Congrats!");
                break;
            }
            i++;
        }
    }
}

