package snakeGame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class howToPlayMenu extends JPanel{
        public howToPlayMenu() {
                setBorder(new EmptyBorder(10, 10, 10, 10)); //Creates an empty border that takes up space.
                setLayout(new GridBagLayout());//Sets the layout manager our JPanel object will use.

                GridBagConstraints gbc = new GridBagConstraints();//Creates an object that will allow us to manipulate JPanel
                //components using our own constraints.
                GridBagConstraints gbc2 = new GridBagConstraints();
                gbc.gridwidth = GridBagConstraints.REMAINDER; //"Use REMAINDER to specify that the component's
                // display area will be from gridx to the last cell in the row. "

                gbc.anchor = GridBagConstraints.NORTH; //"used when the component is smaller than its display area.
                // It determines where, within the display area, to place the component.


                JLabel t = new JLabel();
                add(new JLabel("<html><h1>How to Play</h1></html>"), gbc);
                add(new JLabel("<html><h3>How to move:<h3></html>"), gbc);

                gbc.anchor = GridBagConstraints.EAST;
                add(new JLabel("<html><p1>Up Arrow Key: use the up arrow key to move the snake up</p1>"), gbc);
                add(new JLabel("<html><p1>Down Arrow Key: use the down arrow key to move the snake down</p1>"), gbc);
                add(new JLabel("<html><p1>Left Arrow Key: use the left arrow key to move the snake up</p1>"), gbc);
                add(new JLabel("<html><p1>Right Arrow Key: use the right arrow key to move the snake up</p1>"), gbc);


        }
}
