import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CrecheKiddie extends JFrame {
    
    // panels
    private JPanel namePanel; 
    private JPanel genderPanel;
    private JPanel buttonsPanel; 
    private JPanel registerKiddiesPanel;
    private JPanel nameGenderCombinedPanel;
    private JPanel textAreaPanel;
    private JPanel mainPanel;

    // labels
    private JLabel nameLabel;
    private JLabel genderLabel;

    // text field
    private JTextField namTextField;

    // radio button
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private ButtonGroup btnsGroup;

    // buttons
    private JButton registerButton;
    private JButton displayButton;

    // text area
    private JTextArea textArea;

    // scroll panel
    private JScrollPane scrollPane;

    public CrecheKiddie() {
        super("CRECHE 4 YOUR KIDDIE");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);

        // initialize mainPanel
        mainPanel = new JPanel(new BorderLayout());

        // create panels
        namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        textAreaPanel = new JPanel(new BorderLayout());
        registerKiddiesPanel = new JPanel(new GridLayout(2, 1, 2, 5));
        nameGenderCombinedPanel = new JPanel(new BorderLayout());

        // create name label and text field
        nameLabel = new JLabel("Name:");
        namTextField = new JTextField(10);

        // create gender label and radio buttons
        genderLabel = new JLabel("Gender:");
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        btnsGroup = new ButtonGroup();
        btnsGroup.add(maleRadioButton);
        btnsGroup.add(femaleRadioButton);

        // create buttons
        registerButton = new JButton("Register kiddie");
        displayButton = new JButton("Display kiddies");

        // create the text area
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);  // Set text area as non-editable if necessary

        // create scroll pane
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // add components to name panel
        namePanel.add(nameLabel);
        namePanel.add(namTextField);

        // add components to gender panel
        genderPanel.add(genderLabel);
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);

        // add components to buttons panel
        buttonsPanel.add(registerButton);
        buttonsPanel.add(displayButton);

        // add components to textarea panel
        textAreaPanel.add(scrollPane);

        // add panels to registerKiddiesPanel
        registerKiddiesPanel.add(namePanel);
        registerKiddiesPanel.add(genderPanel);

        // add panels to nameGenderCombinedPanel
        nameGenderCombinedPanel.add(registerKiddiesPanel, BorderLayout.NORTH);

        // add panels to mainPanel
        mainPanel.add(nameGenderCombinedPanel, BorderLayout.NORTH);
        mainPanel.add(textAreaPanel, BorderLayout.SOUTH);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        // add mainPanel to frame
        add(mainPanel);

        pack();
        setVisible(true);
    }
}