package snakeGame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Class containing the content of the application.
 */
public class Menu extends JPanel implements ActionListener {

    //determines the size of the board to play the game on
    private final int b_Width = 300;
    private final int b_Height = 300;

    //size of the snake and apple
    private final int dot_Size = 10;

    //max number of possible dots on board
    //in other words the number of squares on the board the snake can move in
    private final int all_Dots = 900;

    //rabdom position for apple
    private final int rand_Pos = 29;
    private final int delay = 140;

    // x and y coords of snake joints
    private final int x[] = new int[all_Dots];
    private final int y[] = new int[all_Dots];

    private int dots;
    private int apple_x;
    private int apple_y;

    //for timer
    private Timer timer;

    //images for icons
    private Image ball;
    private Image apple;
    private Image head;


//loads immages for the game
    private void loadImage()
    {
        //image for dot
        ImageIcon iid = new ImageIcon("resources/png-clipart-dot-dot.png");
        ball = iid.getImage();

        //image for apple
        ImageIcon iia = new ImageIcon("resources/apple.jpg");
        apple = iia.getImage();

        ImageIcon iih = new ImageIcon("resources/snake_head.jpg");
        head = iih.getImage();



    }
    //creating apple on display
    private void locateApple()
    {
        //sets random position for x value of apple
        int r = (int) (Math.random() * rand_Pos);
        apple_x = ((r* dot_Size));

        //sets random position for y value of apple
        r = (int) (Math.random() * rand_Pos);
        apple_y = ((r * dot_Size));
    }

    //checking if apple was collected by the snake
    private void checkApple()
    {
        if((x[0] == apple_x) && (y[0] == apple_y))
        {
            dots++;
            locateApple();
        }
    }


    //creating the game
    private void gameCreate(){
        //size of snake body
        dots = 3;

        for(int i = 0; i < dots; i++)
        {
            x[i] = 50 - i * 10;
            y[i] = 50;

        }


        locateApple();

        timer = new Timer(delay, this);
        timer.start();
    }


    public Menu() {
        setBorder(new EmptyBorder(10, 10, 10, 10)); //Creates an empty border that takes up space.
        setLayout(new GridBagLayout());//Sets the layout manager our JPanel object will use.

        GridBagConstraints gbc = new GridBagConstraints();//Creates an object that will allow us to manipulate JPanel
        //components using our own constraints.
        gbc.gridwidth = GridBagConstraints.REMAINDER; //"Use REMAINDER to specify that the component's
        // display area will be from gridx to the last cell in the row. "

        gbc.anchor = GridBagConstraints.NORTH; //"used when the component is smaller than its display area.
        // It determines where, within the display area, to place the component.

        add(new JLabel("<html><h1>Welcome To Snake</h1></html>"),gbc);
        add(new JLabel("<html><h3><u>Developed by Kelly, Terry, and Joshua</u></h3></html>"),gbc);

        gbc.anchor = GridBagConstraints.CENTER; //Will center the component when 'gbc' is used
        gbc.fill = GridBagConstraints.HORIZONTAL; //Resizes the component horizontally
        gbc.insets = new Insets(15,0,0,0);

        JPanel deButtons = new JPanel(new GridBagLayout()); //Creates buttons using a GridBagLayout Manager
        //The following code creates the buttons for the main menu
        deButtons.add(new JButton("Start"),gbc);
        deButtons.add(new JButton("How To Play"),gbc);
        deButtons.add(new JButton("Exit"), gbc);


        gbc.weighty = 1;
        add(deButtons,gbc); //Add the buttons to the window

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}