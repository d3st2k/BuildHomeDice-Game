
import javax.swing.*;
import java.awt.*;
/** 
 * Class which extends JPanel class, which is used for program testing
 */
public class DiceTester extends JPanel {
    // Width and height of JPanel DiceTester
    public int width;
    public int height;

    // Naming the two players that are gonna play the dice game
    public static String s1 = "Player1";
    public static String s2 = "Player2";

    // Positions in which all information is gonna be put from this class
    public int xPosition;
    public int yPosition;

    // Two variables which determine which player is better at the game 
    public int progressOfPlayer1InGame = 0;
    public int progressOfPlayer2InGame = 0;

    /**Constructor of class DiceTester
     * @param w - Gjeresia
     * @param h - Lartesia 
     * @param JFrame - Inicializimi i kornizes
     */
    public DiceTester(int w, int h) {
        width = w;
        height = h;
        JFrame myFrame = new JFrame();
        myFrame.getContentPane().add(this);

        // Displaying the graphical window
        myFrame.setTitle("Dice thrower");
        myFrame.setSize(width, height);
        myFrame.setVisible(true);
    }

    /** Method which will paint the JPanel with "Graphics G"
     * @param g - Brusha me te cilen behet ngjyrosja
     */
    public void paintComponent(Graphics g) {
        // We use the methods of brush "g" to paint and fill the window
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.black);

        // Appointing the statical strings and positioning them in positions "x" and "y"
        g.drawString(s1, xPosition, yPosition);
        g.drawString(s2, xPosition + 200, yPosition);

        // To use brush "g" even outside of this method, we create dy new classes that inherit the properties of this method
        Drawing(g);
        Drawing2(g);
    }

    /** Method Drawing makes the connection with the paintComponent method and uses its properties*/ 
    public void Drawing(Graphics g) {

        // Here we select what to draw in the panel depending from the points that player 1 has gotten
        // And cuz the brush "g" is inherited from paintComponent, we can use the methods with any imports or extra class

        // Here is draw the base of the house in square form if the dice thrown is 6
        if (progressOfPlayer1InGame == 1) {
            g.setColor(Color.black);
            g.drawLine(xPosition, yPosition + 60, xPosition + 40, yPosition + 60);
            g.drawLine(xPosition, yPosition + 60, xPosition, yPosition + 100);
            g.drawLine(xPosition + 40, yPosition + 60, xPosition + 40, yPosition + 100);
            g.drawLine(xPosition, yPosition + 100, xPosition + 40, yPosition + 100);
            
        } 

        // Here is drawn the top part of the house, together with the base
        else if (progressOfPlayer1InGame == 2) {
            g.setColor(Color.black);
            g.drawLine(xPosition, yPosition + 60, xPosition + 20, yPosition + 30);
            g.drawLine(xPosition + 20, yPosition + 30, xPosition + 40, yPosition + 60);
            g.drawLine(xPosition, yPosition + 60, xPosition + 40, yPosition + 60);
            g.drawLine(xPosition, yPosition + 60, xPosition, yPosition + 100);
            g.drawLine(xPosition + 40, yPosition + 60, xPosition + 40, yPosition + 100);
            g.drawLine(xPosition, yPosition + 100, xPosition + 40, yPosition + 100);
        } 

        // Here is drawn the door and the latter parts from the last 'else if'
        else if (progressOfPlayer1InGame == 3) {
            g.setColor(Color.black);
            g.drawLine(xPosition, yPosition + 60, xPosition + 20, yPosition + 30);
            g.drawLine(xPosition + 20, yPosition + 30, xPosition + 40, yPosition + 60);
            g.drawLine(xPosition, yPosition + 60, xPosition + 40, yPosition + 60);
            g.drawLine(xPosition, yPosition + 60, xPosition, yPosition + 100);
            g.drawLine(xPosition + 40, yPosition + 60, xPosition + 40, yPosition + 100);
            g.drawLine(xPosition + 15, yPosition + 100, xPosition + 15, yPosition + 90);
            g.drawLine(xPosition + 25, yPosition + 100, xPosition + 25, yPosition + 90);
            g.drawLine(xPosition + 15, yPosition + 90, xPosition + 25, yPosition + 90);
            g.drawLine(xPosition, yPosition + 100, xPosition + 40, yPosition + 100);
        } 

        // Here is drawn the window in the right side of the house, as well as all the parts from the last 'else if'
        else if (progressOfPlayer1InGame == 4) {
            g.setColor(Color.black);
            g.drawLine(xPosition, yPosition + 60, xPosition + 20, yPosition + 30);
            g.drawLine(xPosition + 20, yPosition + 30, xPosition + 40, yPosition + 60);
            g.drawLine(xPosition, yPosition + 60, xPosition + 40, yPosition + 60);
            g.drawLine(xPosition, yPosition + 60, xPosition, yPosition + 100);
            g.drawLine(xPosition + 40, yPosition + 60, xPosition + 40, yPosition + 100);
            g.drawLine(xPosition + 15, yPosition + 100, xPosition + 15, yPosition + 90);
            g.drawLine(xPosition + 25, yPosition + 100, xPosition + 25, yPosition + 90);
            g.drawLine(xPosition + 15, yPosition + 90, xPosition + 25, yPosition + 90);
            g.drawLine(xPosition, yPosition + 100, xPosition + 40, yPosition + 100);
            g.drawLine(xPosition + 5, yPosition + 77, xPosition + 12, yPosition + 70);
            g.drawLine(xPosition + 5, yPosition + 70, xPosition + 12, yPosition + 77);
        } 

        // Here is drawn the window in the left side of the house, as well as all the parts from the last 'else if' 
        else if (progressOfPlayer1InGame == 5) {
            g.setColor(Color.black);
            g.drawLine(xPosition, yPosition + 60, xPosition + 20, yPosition + 30);
            g.drawLine(xPosition + 20, yPosition + 30, xPosition + 40, yPosition + 60);
            g.drawLine(xPosition, yPosition + 60, xPosition + 40, yPosition + 60);
            g.drawLine(xPosition, yPosition + 60, xPosition, yPosition + 100);
            g.drawLine(xPosition + 40, yPosition + 60, xPosition + 40, yPosition + 100);
            g.drawLine(xPosition + 15, yPosition + 100, xPosition + 15, yPosition + 90);
            g.drawLine(xPosition + 25, yPosition + 100, xPosition + 25, yPosition + 90);
            g.drawLine(xPosition + 15, yPosition + 90, xPosition + 25, yPosition + 90);
            g.drawLine(xPosition, yPosition + 100, xPosition + 40, yPosition + 100);
            g.drawLine(xPosition + 5, yPosition + 77, xPosition + 12, yPosition + 70);
            g.drawLine(xPosition + 5, yPosition + 70, xPosition + 12, yPosition + 77);
            g.drawLine(xPosition + 28, yPosition + 77, xPosition + 35, yPosition + 70);
            g.drawLine(xPosition + 28, yPosition + 70, xPosition + 35, yPosition + 77);

            // If progressOfPlayer1InGame arrives till here, then it means the player has won the game
            // and in the panel is displayed the string: game is over
            g.drawString("The winner is Player1", xPosition, yPosition + 150);
        }
    }

    // Here we select what to draw in the panel depending from the points that player 2 has gotten
    // And cuz the brush "g" is inherited from paintComponent, we can use the methods with any imports or extra class
    public void Drawing2(Graphics g) {

        // Here is drawn the base of the house, but in a different position from the earlier base
        if (progressOfPlayer2InGame == 1) {
            g.setColor(Color.black);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 240, yPosition + 60);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 200, yPosition + 100);
            g.drawLine(xPosition + 240, yPosition + 60, xPosition + 240, yPosition + 100);
            g.drawLine(xPosition + 200, yPosition + 100, xPosition + 240, yPosition + 100);
        } 
        
        // Here is drawn the top part of the house, together with the base
        else if (progressOfPlayer2InGame == 2) {
            g.setColor(Color.black);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 220, yPosition + 30);
            g.drawLine(xPosition + 220, yPosition + 30, xPosition + 240, yPosition + 60);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 240, yPosition + 60);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 200, yPosition + 100);
            g.drawLine(xPosition + 240, yPosition + 60, xPosition + 240, yPosition + 100);
            g.drawLine(xPosition + 200, yPosition + 100, xPosition + 240, yPosition + 100);
        } 
        
        // Here is drawn the door and the latter parts from the last 'else if'
        else if (progressOfPlayer2InGame == 3) {
            g.setColor(Color.black);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 220, yPosition + 30);
            g.drawLine(xPosition + 220, yPosition + 30, xPosition + 240, yPosition + 60);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 240, yPosition + 60);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 200, yPosition + 100);
            g.drawLine(xPosition + 240, yPosition + 60, xPosition + 240, yPosition + 100);
            g.drawLine(xPosition + 215, yPosition + 100, xPosition + 215, yPosition + 90);
            g.drawLine(xPosition + 225, yPosition + 100, xPosition + 225, yPosition + 90);
            g.drawLine(xPosition + 215, yPosition + 90, xPosition + 225, yPosition + 90);
            g.drawLine(xPosition + 200, yPosition + 100, xPosition + 240, yPosition + 100);
        } 
        
        // Here is drawn the window in the right side of the house, as well as all the parts from the last 'else if'
        else if (progressOfPlayer2InGame == 4) {
            g.setColor(Color.black);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 220, yPosition + 30);
            g.drawLine(xPosition + 220, yPosition + 30, xPosition + 240, yPosition + 60);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 240, yPosition + 60);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 200, yPosition + 100);
            g.drawLine(xPosition + 240, yPosition + 60, xPosition + 240, yPosition + 100);
            g.drawLine(xPosition + 215, yPosition + 100, xPosition + 215, yPosition + 90);
            g.drawLine(xPosition + 225, yPosition + 100, xPosition + 225, yPosition + 90);
            g.drawLine(xPosition + 215, yPosition + 90, xPosition + 225, yPosition + 90);
            g.drawLine(xPosition + 200, yPosition + 100, xPosition + 240, yPosition + 100);
            g.drawLine(xPosition + 205, yPosition + 77, xPosition + 212, yPosition + 70);
            g.drawLine(xPosition + 205, yPosition + 70, xPosition + 212, yPosition + 77);
        } 
        
        // Here is drawn the window in the left side of the house, as well as all the parts from the last 'else if' 
        else if (progressOfPlayer2InGame == 5) {
            g.setColor(Color.black);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 220, yPosition + 30);
            g.drawLine(xPosition + 220, yPosition + 30, xPosition + 240, yPosition + 60);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 240, yPosition + 60);
            g.drawLine(xPosition + 200, yPosition + 60, xPosition + 200, yPosition + 100);
            g.drawLine(xPosition + 240, yPosition + 60, xPosition + 240, yPosition + 100);
            g.drawLine(xPosition + 215, yPosition + 100, xPosition + 215, yPosition + 90);
            g.drawLine(xPosition + 225, yPosition + 100, xPosition + 225, yPosition + 90);
            g.drawLine(xPosition + 215, yPosition + 90, xPosition + 225, yPosition + 90);
            g.drawLine(xPosition + 200, yPosition + 100, xPosition + 240, yPosition + 100);
            g.drawLine(xPosition + 205, yPosition + 77, xPosition + 212, yPosition + 70);
            g.drawLine(xPosition + 205, yPosition + 70, xPosition + 212, yPosition + 77);
            g.drawLine(xPosition + 228, yPosition + 77, xPosition + 235, yPosition + 70);
            g.drawLine(xPosition + 228, yPosition + 70, xPosition + 235, yPosition + 77);
            

             // If progressOfPlayer2InGame arrives till here, then it means the player has won the game
            // and in the panel is displayed the string: game is over
            g.drawString("The winner is Player2", xPosition + 200, yPosition + 150);
        }
    }

    /** Metoda drawer1 e mundeson qe ne baze te variables progressOfPlayer1BasedOnPoints te vizatohet diqka ne JFrame
    */ 
    public void drawer1(int progressOfPlayer1BasedOnPoints) {
        // This method applies for player 1
        progressOfPlayer1InGame = progressOfPlayer1BasedOnPoints;
        // Method that redraws JFrame depending on the condition
        this.repaint();
    }
    /** Method drawer1 makes it possible that based in variable progressOfPlayer2BasedOnPoints to draw something in JFrame
    */ 
    public void drawer2(int progressOfPlayer2BasedOnPoints) {
        // This method applies for player 2
        progressOfPlayer2InGame = progressOfPlayer2BasedOnPoints;
        // Method that redraws JFrame depending on the condition
        this.repaint();
    }

    /** Method repositionSentence can help us place text, image or something based on parameters
    */ 
    public void repositionSentence(int x, int y) {
        xPosition = x;
        yPosition = y;
        this.repaint();
    }
}