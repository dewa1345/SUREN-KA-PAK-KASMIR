// TopBar.java
import javax.swing.*;
import java.awt.*;

public class TopBar extends JPanel {
    public TopBar() {
        // Set top bar properties
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(200, 45));
        
        // Change layout to BorderLayout
        setLayout(new BorderLayout());
        
        // Create a panel for the left-aligned text
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftPanel.setBackground(Color.BLACK);
        leftPanel.setOpaque(false); // Make transparent
        
        // Add text label to left panel
        JLabel titleLabel = new JLabel("KUCING MEME");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 15));
        leftPanel.add(titleLabel);
        
        // Create a panel for the right-aligned buttons (keeping your existing button code)
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, -5));
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.setOpaque(false); // Make transparent
        
        // Create buttons (your existing code)
        JButton discordButton = new JButton("Join Discord");
        discordButton.setBackground(new Color(65, 105, 225));
        JButton donateButton = new JButton("Donate");
        donateButton.setBackground(new Color(50, 205, 50));
        
        // Style buttons (your existing code)
        styleButton(discordButton);
        styleButton(donateButton);
        
        // Add buttons to button panel (instead of directly to TopBar)
        buttonPanel.add(discordButton);
        buttonPanel.add(donateButton);
        
        // Add both panels to the main TopBar
        add(leftPanel, BorderLayout.WEST);
        add(buttonPanel, BorderLayout.EAST);
        
        // Adjust padding if needed
        setBorder(BorderFactory.createEmptyBorder(7, 10, 5, 0));
    }
    
    private void styleButton(JButton button) {
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(7, 5, 5, 5));
        button.setPreferredSize(new Dimension(100, 35));
    }
}