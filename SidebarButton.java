import javax.swing.*;
import java.awt.*;

public class SidebarButton {
    private MainContentPanel contentPanel;

    public SidebarButton(MainContentPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public JButton createButton(String buttonName) {
        JButton button = new JButton(buttonName);
        styleButton(button);
        
        // Add action listener to all buttons
    button.addActionListener(e -> {
    if (buttonName.equals("Kucing pelukis")) {
        showImagePopup();
    }
    contentPanel.shuffleCards();
    });

        return button;
    }

    private void styleButton(JButton button) {
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(70, 70, 70));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(180, 40));
    }

    private void showImagePopup() {
        JFrame popupFrame = new JFrame("Image Viewer");
        popupFrame.setSize(400, 400);
        popupFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ImageIcon originalIcon = new ImageIcon("pelukis.jpeg");
        if (originalIcon.getImage() == null) {
            JOptionPane.showMessageDialog(null, 
                "Image not found: pelukis.jpeg", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Image scaledImage = originalIcon.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(scaledImage));
        popupFrame.add(new JScrollPane(imageLabel));
        
        popupFrame.setLocationRelativeTo(null);
        popupFrame.setVisible(true);
    }
}
