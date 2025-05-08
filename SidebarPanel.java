// SidebarPanel.java
import javax.swing.*;
import java.awt.*;

public class SidebarPanel extends JPanel {
    public SidebarPanel() {
        // Set sidebar properties
        setBackground(new Color(50, 50, 50));
        setPreferredSize(new Dimension(200, 600));
        
        // Create buttons for the sidebar
        JButton homeButton = new JButton("Home");
        JButton dashboardButton = new JButton("Dashboard");
        JButton settingsButton = new JButton("Settings");
        JButton Fact1 = new JButton("Fact 1");
        JButton Fact2 = new JButton("Fact 2");
        JButton Fact3 = new JButton("Fact 3");
        JButton Fact4 = new JButton("Kucing pelukis");
        JButton Fact5 = new JButton("Fact 5");
        
        // Style buttons
        styleButton(homeButton);
        styleButton(dashboardButton);
        styleButton(settingsButton);
        styleButton(Fact1);
        styleButton(Fact2);
        styleButton(Fact3);
        styleButton(Fact4);
        styleButton(Fact5);
        
        // Use BoxLayout for vertical arrangement
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        // Add buttons with some spacing
        add(Box.createVerticalStrut(10));
        add(homeButton);
        add(Box.createVerticalStrut(10));
        add(dashboardButton);
        add(Box.createVerticalStrut(10));
        add(settingsButton);
        add(Box.createVerticalStrut(10));
        add(Fact1);
        add(Box.createVerticalStrut(10));
        add(Fact2);
        add(Box.createVerticalStrut(10));
        add(Fact3);
        add(Box.createVerticalStrut(10));
        add(Fact4);
        add(Box.createVerticalStrut(10));
        add(Fact5);
        add(Box.createVerticalStrut(10));
    }
    
    private void styleButton(JButton button) {
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(70, 70, 70));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(180, 40));
    }
}