import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.ArrayList;

public class MainContentPanel extends JPanel {
    private JPanel cardGrid;
    private ArrayList<ImageCard> cards;
    private boolean isShuffled = false;

    public MainContentPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(230, 230, 230));
        
        // Initialize cards list
        cards = new ArrayList<>();
        createCards();
        
        setupCardGrid();
        addCardsToGrid();
        
        JScrollPane scrollPane = new JScrollPane(cardGrid);
        scrollPane.setBorder(null);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void createCards() {
        cards.add(new ImageCard("Beluga", "image.png"));
        cards.add(new ImageCard("Bombastic Side eye", "sus.png"));
        cards.add(new ImageCard("El gato", "el.png"));
        cards.add(new ImageCard("uM aCtUAlLy", "Nerd.png"));
        cards.add(new ImageCard("THIS IS THE ROCK", "rock.png"));
        cards.add(new ImageCard("Overreacted", "over.png"));
        cards.add(new ImageCard("Tf you still up?", "tf.png"));
        cards.add(new ImageCard("Moment dikasih tugas", "dikasih.png"));
        cards.add(new ImageCard("Yang penting dapat KP", "kp.png"));
        cards.add(new ImageCard("Looking at my assigment", "cry.png"));
        cards.add(new ImageCard("Kucingnya koh rei", "koh.png"));
        cards.add(new ImageCard("Mantap", "mancap.png"));
        cards.add(new ImageCard("Khalid kashmiri", "Khalid.png"));
        cards.add(new ImageCard("Usman abdul jalil sisha", "usman.png"));
        cards.add(new ImageCard("ya'qub Qamar Ad-Din Dibiazah", "ya.png"));
        
    }

    private void setupCardGrid() {
        cardGrid = new JPanel(new GridLayout(4, 4, 5, 5));
        cardGrid.setBackground(new Color(230, 230, 230));
        cardGrid.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }

    private void addCardsToGrid() {
        cardGrid.removeAll();
        for (ImageCard card : cards) {
            cardGrid.add(card);
        }
    }

     // Change cards order
    public void shuffleCards() {
        if (isShuffled) {
            cardGrid.removeAll();
            Collections.sort(cards, (c1, c2) -> {
                return c1.getTitle().compareTo(c2.getTitle());
            });
        } else {
            Collections.shuffle(cards);
        }
        
        isShuffled = !isShuffled;
        addCardsToGrid();
        cardGrid.revalidate();
        cardGrid.repaint();
    }
}