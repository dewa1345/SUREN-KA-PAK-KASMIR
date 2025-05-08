import javax.swing.*;
import java.awt.*;

public class MainContentPanel extends JPanel {
    public MainContentPanel() {
        // Create the main container with BorderLayout
        setLayout(new BorderLayout());
        setBackground(new Color(230, 230, 230));
        
        // Create your 4x4 grid panel (exactly as before)
        JPanel cardGrid = new JPanel(new GridLayout(4, 4, 5, 5));
        cardGrid.setBackground(new Color(230, 230, 230));
        cardGrid.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        // Add your 16 cards (unchanged)
        cardGrid.add(new ImageCard("Beluga", "image.png"));
        cardGrid.add(new ImageCard("Bombastic Side eye", "sus.png"));
        cardGrid.add(new ImageCard("El gato", "el.png"));
        cardGrid.add(new ImageCard("uM aCtUAlLy", "Nerd.png"));
        cardGrid.add(new ImageCard("THIS IS THE ROCK", "rock.png"));
        cardGrid.add(new ImageCard("Overreacted", "over.png"));
        cardGrid.add(new ImageCard("Tf you still up?", "tf.png"));
        cardGrid.add(new ImageCard("Moment dikasih tugas", "dikasih.png"));
        cardGrid.add(new ImageCard("Yang penting dapat KP", "kp.png"));
        cardGrid.add(new ImageCard("Looking at my assigment", "cry.png"));
        cardGrid.add(new ImageCard("Kucingnya koh rei", "koh.png"));
        cardGrid.add(new ImageCard("Mantap", "mancap.png"));
        cardGrid.add(new ImageCard("Khalid kashmiri", "Khalid.png"));
        cardGrid.add(new ImageCard("Usman abdul jalil sisha", "usman.png"));
        cardGrid.add(new ImageCard("ya'qub Qamar Ad-Din Dibiazah", "ya.png"));
        // Add empty panel if you have less than 16 cards
        // cardGrid.add(new JPanel()); // Uncomment if you only have 15 cards
        
        // Make the grid scrollable
        JScrollPane scrollPane = new JScrollPane(cardGrid);
        scrollPane.setBorder(null); // Remove border
        
        // Add to main panel
        add(scrollPane, BorderLayout.CENTER);
    }
}