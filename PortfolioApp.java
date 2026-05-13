/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myinformation;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PortfolioApp {

    private JFrame frame;
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public PortfolioApp() {
        // 1️⃣ Create main JFrame
        frame = new JFrame("My Portfolio");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // center on screen

        // 2️⃣ Create main panel with CardLayout (for switching pages)
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // 3️⃣ Create individual panels
        mainPanel.add(createCoverPanel(), "Cover");
        mainPanel.add(createAboutPanel(), "About");
        mainPanel.add(createSkillsPanel(), "Skills");
        mainPanel.add(createProjectsPanel(), "Projects");
        mainPanel.add(createContactPanel(), "Contact");

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    // 🔹 Cover Panel
    private JPanel createCoverPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(135, 206, 250)); // light blue

        JLabel title = new JLabel("Welcome to My Portfolio", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 32));

        JButton enterBtn = new JButton("Enter");
        enterBtn.setFont(new Font("Arial", Font.PLAIN, 18));
        enterBtn.addActionListener(e -> cardLayout.show(mainPanel, "About"));

        panel.add(title, BorderLayout.CENTER);
        panel.add(enterBtn, BorderLayout.SOUTH);

        return panel;
    }

    // 🔹 About Panel
    private JPanel createAboutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("About Me");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextArea aboutText = new JTextArea("Hi! I am Munzhedzi, a passionate developer.\nI love coding and building projects that solve real problems.");
        aboutText.setFont(new Font("Arial", Font.PLAIN, 18));
        aboutText.setLineWrap(true);
        aboutText.setWrapStyleWord(true);
        aboutText.setEditable(false);
        aboutText.setBackground(panel.getBackground());
        aboutText.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton nextBtn = new JButton("Next");
        nextBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextBtn.addActionListener(e -> cardLayout.show(mainPanel, "Skills"));

        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(aboutText);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(nextBtn);

        return panel;
    }

    // 🔹 Skills Panel
    private JPanel createSkillsPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Skills");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel skillsList = new JLabel("Java | C++ | HTML | CSS | Problem Solving");
        skillsList.setFont(new Font("Arial", Font.PLAIN, 20));
        skillsList.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton nextBtn = new JButton("Next");
        nextBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextBtn.addActionListener(e -> cardLayout.show(mainPanel, "Projects"));

        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(skillsList);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(nextBtn);

        return panel;
    }

    // 🔹 Projects Panel
    private JPanel createProjectsPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Projects");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextArea projectsText = new JTextArea(
                "1. Student Management System\n" +
                "2. Restaurant Ordering System\n" +
                "3. Personal Portfolio App"
        );
        projectsText.setFont(new Font("Arial", Font.PLAIN, 20));
        projectsText.setLineWrap(true);
        projectsText.setWrapStyleWord(true);
        projectsText.setEditable(false);
        projectsText.setBackground(panel.getBackground());
        projectsText.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton nextBtn = new JButton("Next");
        nextBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextBtn.addActionListener(e -> cardLayout.show(mainPanel, "Contact"));

        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(projectsText);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(nextBtn);

        return panel;
    }

    // 🔹 Contact Panel
    private JPanel createContactPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Contact Me");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel contactInfo = new JLabel("Email: your@email.com | Phone: 0123456789");
        contactInfo.setFont(new Font("Arial", Font.PLAIN, 20));
        contactInfo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton backBtn = new JButton("Back to Start");
        backBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        backBtn.addActionListener(e -> cardLayout.show(mainPanel, "Cover"));

        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(contactInfo);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(backBtn);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PortfolioApp());
    }
}
