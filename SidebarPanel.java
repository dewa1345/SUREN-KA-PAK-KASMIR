import javax.swing.*;
import java.awt.*;

public class SidebarPanel extends JPanel {
    public SidebarPanel(MainContentPanel contentPanel) {
        // Set sidebar
        setBackground(new Color(50, 50, 50));
        setPreferredSize(new Dimension(200, 600));
        
        SidebarButton buttonFactory = new SidebarButton(contentPanel);

        // Create and add buttons
        addButton(buttonFactory, "Home");
        addButton(buttonFactory, "Dashboard");
        addButton(buttonFactory, "Settings");
        addButton(buttonFactory, "Fact 1");
        addButton(buttonFactory, "Fact 2");
        addButton(buttonFactory, "Fact 3");
        addButton(buttonFactory, "Kucing pelukis");
        addButton(buttonFactory, "Fact 5");

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    private void addButton(SidebarButton factory, String buttonName) {
        JButton button = factory.createButton(buttonName);
        add(Box.createVerticalStrut(10));
        add(button);
    }
}