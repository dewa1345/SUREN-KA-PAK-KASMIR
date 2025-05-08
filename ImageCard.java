import javax.swing.*;
import java.awt.*;

public class ImageCard extends JPanel {
    public ImageCard(String title, String imagePath) {
        
        setPreferredSize(new Dimension(200, 200));
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0)); 
        
       
        add(createImagePanel(imagePath, 200), BorderLayout.CENTER);
        
        
        add(createTitlePanel(title, 30), BorderLayout.SOUTH);
    }
    
    private JPanel createImagePanel(String imagePath, int imageSize) {
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBackground(Color.WHITE);
        
        try {
            ImageIcon originalIcon = new ImageIcon(imagePath);
            Image scaledImage = originalIcon.getImage()
                .getScaledInstance(imageSize, imageSize, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
            imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
            imagePanel.add(imageLabel, BorderLayout.CENTER);
        } catch (Exception e) {
            JLabel placeholder = new JLabel("No Image", SwingConstants.CENTER);
            placeholder.setForeground(Color.GRAY);
            imagePanel.add(placeholder);
        }
        
        return imagePanel;
    }
    
    private JPanel createTitlePanel(String title, int titleHeight) {
        JPanel titlePanel = new JPanel();
        titlePanel.setPreferredSize(new Dimension(0, titleHeight));
        titlePanel.setBackground(Color.WHITE);
        
        JLabel titleLabel = new JLabel(title, SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        titlePanel.add(titleLabel);
        
        return titlePanel;
    }
}

