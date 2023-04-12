package snakeGame;

import javax.swing.*;
/*
GameFrame defines the WINDOW of the game.
It uses the JFrame Library.
 */
public class GameWindow extends JFrame {

    /*
    Constructor
     */
    GameWindow(){
       this.add(new MainMenu());
       this.setTitle("Snake"); //Sets the title of the Window
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When the exit button is clicked, the application will end.
       this.setResizable(false); //Allows the window to be resized by the user. If false, the window will not be resizable.
        this.pack();
        this.setSize(700,500);//Sets the window size
        this.setLocationRelativeTo(null);//Centers the window to the middle of the screen.
        this.setVisible(true); //Makes the window visible to the user.


    }


}