import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImageCard extends JPanel {
    private String title;
    private String imagePath;
    
    public ImageCard(String title, String imagePath) {
        this.title = title;
        this.imagePath = imagePath;
        
        initializeCard();
        setupClickListener();
    }
    
    private void initializeCard() {
        setPreferredSize(new Dimension(200, 200));
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0)); 
        
        add(createImagePanel(), BorderLayout.CENTER);
        add(createTitlePanel(), BorderLayout.SOUTH);
    }

        private void setupClickListener() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!imagePath.isEmpty()) {
                    showImagePopup();
                }
            }
        });
    }

private void showImagePopup() {
    JFrame popupFrame = new JFrame(title);
    popupFrame.setSize(400, 450);
    popupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    popupFrame.setLayout(new BorderLayout());

    try {
        ImageIcon originalIcon = new ImageIcon(imagePath);
        if (originalIcon.getImage() == null) {
            JOptionPane.showMessageDialog(this, 
                "Image not found: " + imagePath, 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //create Image display
        Image scaledImage = originalIcon.getImage()
            .getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
        JScrollPane imageScrollPane = new JScrollPane(imageLabel);
        
        // Settings up descpanel from image display description
        JPanel descPanel = new JPanel();
        descPanel.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        descPanel.setBackground(Color.WHITE);
    
        String description;
        switch (title) {
            case "Beluga":
                description = "Only legend internet knows about this cat";
                break;
            case "Bombastic Side eye":
                description = "This cat never trust anybody even object";
                break;
            case "El gato":
                description = "idk why this cat name is el gato";
                break;
            case "uM aCtUAlLy":
                description = "Smart cat and a bit annoying when trying to argue with";
                break;
            case "THIS IS THE ROCK":
                description = "Dwayne Johnson but cat";
                break;
            case "Overreacted":
                description = "Playing victim mfs be like";
                break;
            case "Tf you still up?":
                description = "He stayed up all night trying to finish his OOP assignment. Legend says he's still working on it to this day.";
                break;
            case "Moment dikasih tugas":
                description = "This Cat hates OOP assigment so much";
                break;
            case "Yang penting dapat KP":
                description = "This cat will do anything just to get Credit Points";
                break;
            case "Looking at my assigment":
                description = "This cat always cries whenever he gets an OOP assignment. Still crying, still coding... poor cat.";
                break;
            case "Kucingnya koh rei":
                description = "This cat always appear when you're chatting with someone called Reinaldo Lewis Lordianto";
                break;
            case "Mantap":
                description = "This is the only cat that stays positive when getting OOP assignment";
                break;
            case "Khalid kashmiri":
                description = "This cat is a fierce warrior, riding a horse and soaring high in the name of his religion!";
                break;
            case "Usman abdul jalil sisha":
                description = "This cat is pursuing knowledge, but still believe in his religion";
                break;
            case "ya'qub Qamar Ad-Din Dibiazah":
                description = "This cat is leading a kingdom of cats, many cats respect him for his wisdom";
                break;
            default:
                description = "if you see this then i forgot to add the description for this cat";
        }
        
        JTextArea descText = new JTextArea(description);
        descText.setWrapStyleWord(true);
        descText.setLineWrap(true);
        descText.setEditable(false);
        descText.setBackground(Color.WHITE);
        descText.setFont(new Font("Arial", Font.PLAIN, 14));
        descPanel.add(descText);
        
        popupFrame.add(imageScrollPane, BorderLayout.CENTER);
        popupFrame.add(descPanel, BorderLayout.SOUTH);
        popupFrame.setLocationRelativeTo(null);
        popupFrame.setVisible(true);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,
            "Error loading image: " + imagePath,
            "Error",
            JOptionPane.ERROR_MESSAGE);
    }
}
    
    public String getTitle() {
        return title;
    }
    
    public String getImagePath() {
        return imagePath;
    }
    
    private JPanel createImagePanel() {
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBackground(Color.WHITE);
        
        if (imagePath == null || imagePath.isEmpty()) {
            addEmptyPlaceholder(imagePanel);
        } else {
            try {
                ImageIcon originalIcon = new ImageIcon(imagePath);
                if (originalIcon.getImage() == null) {
                    addErrorPlaceholder(imagePanel, "Image not found");
                } else {
                    Image scaledImage = originalIcon.getImage()
                        .getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                    JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
                    imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    imagePanel.add(imageLabel, BorderLayout.CENTER);
                }
            } catch (Exception e) {
                addErrorPlaceholder(imagePanel, "Invalid image");
            }
        }
        
        return imagePanel;
    }
    
    private void addEmptyPlaceholder(JPanel panel) {
        JLabel placeholder = new JLabel("", SwingConstants.CENTER);
        placeholder.setOpaque(true);
        placeholder.setBackground(new Color(240, 240, 240));
        placeholder.setPreferredSize(new Dimension(200, 170));
        panel.add(placeholder, BorderLayout.CENTER);
    }
    
    private void addErrorPlaceholder(JPanel panel, String message) {
        JLabel placeholder = new JLabel(message, SwingConstants.CENTER);
        placeholder.setForeground(Color.GRAY);
        placeholder.setFont(new Font("Arial", Font.ITALIC, 12));
        panel.add(placeholder, BorderLayout.CENTER);
    }
    
    private JPanel createTitlePanel() {
        JPanel titlePanel = new JPanel();
        titlePanel.setPreferredSize(new Dimension(0, 30));
        titlePanel.setBackground(Color.WHITE);
        
        JLabel titleLabel = new JLabel(title, SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        titlePanel.add(titleLabel);
        
        return titlePanel;
    }
    
    @Override
    public String toString() {
        return "ImageCard: " + title;
    }
}
