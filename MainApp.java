import javax.swing.*;
import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        // set up main window
        JFrame frame = new JFrame("Kucing meme");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 630);

        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // content panel
        MainContentPanel content = new MainContentPanel();
        
        // content panel sidebar
        SidebarPanel sidebar = new SidebarPanel(content);
        mainPanel.add(sidebar, BorderLayout.WEST);
        
        mainPanel.add(content, BorderLayout.CENTER);

        TopBar topBar = new TopBar();
        mainPanel.add(topBar, BorderLayout.PAGE_START);
        
        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}