import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MainWindow extends JFrame {
    private JFrame frame = new JFrame();
    private JTextField sourceMeasurementField;
    private JComboBox<String> sourceUnitComboBox;
    private JComboBox<String> targetUnitComboBox;
    private JButton submitButton;
    private double userMeasurement;

    public MainWindow() {
        setupWindow();
        createButtons();
        createFieldsAndBoxes();
        addActionListeners();
        finalizeWindow();
    }

    private void setupWindow() {
        // Set the title for the window
        setTitle("Unit Converter");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout
        setLayout(new FlowLayout());
    }

    private void createButtons() {
        submitButton = new JButton("Submit");
    }
    private void createFieldsAndBoxes() {
        // Create 2 text fields for different measurements
        sourceMeasurementField = new JTextField(10);

        // Unit selection dropdown
        String[] units = {"Millimeters", "Centimeters", "Meters", "Kilometers", "Inches", "Feet", "Yards", "Miles"};
        sourceUnitComboBox = new JComboBox<>(units);
        targetUnitComboBox = new JComboBox<>(units);
        System.out.println(sourceUnitComboBox.getSelectedIndex());
        // Add the JComboBox and JTextFields to the frame
        add(sourceUnitComboBox);
        add(targetUnitComboBox);
        add(sourceMeasurementField);
        add(submitButton);
    }

    // get user text
    private void addActionListeners() {
        sourceMeasurementField.addActionListener(e -> {
            try {
                userMeasurement = Double.parseDouble(sourceMeasurementField.getText());
                System.out.println(userMeasurement);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number format");
            }
        });

        // store user selected units to pass to conversion method
        submitButton.addActionListener(e -> {
            String sourceUnit = (String) sourceUnitComboBox.getSelectedItem();
            System.out.println("Source unit selected -> " + sourceUnit);
            String targetUnit = (String) targetUnitComboBox.getSelectedItem();
            System.out.println("Target unit selected -> " + targetUnit);

            // pass user entered measurement information
            convertUnits(userMeasurement, sourceUnit, targetUnit);
        });
    }

    private void convertUnits(double userMeasurement, String sourceUnit, String targetUnit) {
        Conversions conversions = new Conversions();
        double results = conversions.convertMetersToFeet(userMeasurement);
        JOptionPane.showMessageDialog(frame, "test: " + results);
    }

    private void finalizeWindow() {
        // Set the size of the window
        setSize(300, 150);

        // Center the window
        setLocationRelativeTo(null);

        // Make the window visible
        setVisible(true);

        // style popup frame
        frame.setSize(300, 150);
    }

}

