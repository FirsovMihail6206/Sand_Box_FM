package ru.ssau.tk.fmvolna.sandbox.ui;

import ru.ssau.tk.fmvolna.sandbox.functions.TabulatedFunction;
import ru.ssau.tk.fmvolna.sandbox.functions.factory.TabulatedFunctionFactory;

import javax.swing.*;

public class WindowOfTabulated extends JDialog {

    private TabulatedFunction tabulatedFunction;

    public WindowOfTabulated(TabulatedFunctionFactory factory) {
        JDialog dialog = new JDialog();
        setModal(true);
        this.setBounds(200, 200, 400, 100);
        setLocationRelativeTo(null);
        JLabel label = new JLabel("Число точек:");
        JTextField input = new JTextField();
        JButton button = new JButton("Enter");
        button.addActionListener(e -> {
            try {
                if (input.getText().equals("") || Integer.parseInt(input.getText()) < 2) {
                    JOptionPane.showMessageDialog(dialog, "Введите корректно число точек");
                } else {
                    int size;
                    size = Integer.parseInt(input.getText());
                    Table table = new Table(size, factory);
                    table.setVisible(true);
                    tabulatedFunction = table.getFunction();
                    dispose();
                }
            } catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(dialog, "Введите корректно число точек");
            }
        });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(layout.createSequentialGroup().addComponent(label).addComponent(input)).addComponent(button));

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(label).addComponent(input)).addComponent(button));
    }

    public void setTabulatedFunction(TabulatedFunction function) {
        this.tabulatedFunction = function;
    }

    public TabulatedFunction getTabulatedFunction() {
        return tabulatedFunction;
    }
}