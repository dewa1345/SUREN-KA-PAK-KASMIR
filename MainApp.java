// MainApp.java
import javax.swing.*;
import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        // Create and set up the main window
        JFrame frame = new JFrame("Kucing meme");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 630);

        
        // Create main container with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Create and add the sidebar (from our separate class)
        SidebarPanel sidebar = new SidebarPanel();
        mainPanel.add(sidebar, BorderLayout.WEST);
        
        // Create and add the main content area
        MainContentPanel content = new MainContentPanel();
        mainPanel.add(content, BorderLayout.CENTER);

        TopBar topBar = new TopBar();
        mainPanel.add(topBar, BorderLayout.PAGE_START);
        
        // Add the main panel to the frame
        frame.add(mainPanel);
        
        // Center the window and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}