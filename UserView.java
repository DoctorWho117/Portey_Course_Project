import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserView extends JFrame{
    JButton showNumbersButton = new JButton("ПОКАЗАТЬ ЧИСЛА");
    JButton showNumberButton = new JButton("ПОКАЗАТЬ ЧИСЛО");
    JButton calculateSumButton = new JButton("СУММА");
    JButton calculateEvenButton = new JButton("СУММА ЧЁТНЫХ");
    JButton calculateOddButton = new JButton("СУММА НЕЧЁТНЫХ");
    JButton calculateQuotientButton = new JButton("ЧАСТНОЕ");
    JButton eraseTextButton = new JButton("ОЧИСТИТЬ");
    JTextArea textArea = new JTextArea();
    JTextField showNumberTextField = new JTextField();
    JTextField showFromTextField = new JTextField();
    JTextField showToTextField = new JTextField();
    JTextField calculateFromTextField = new JTextField();
    JTextField calculateToTextField = new JTextField();
    JTextField divisibleTextField = new JTextField();
    JTextField divisorTextField = new JTextField();
    JLabel warningTextArea = new JLabel();
    JLabel showNumberLabel = new JLabel("Номер числа");
    JLabel showFromLabel = new JLabel("От");
    JLabel showToLabel = new JLabel("До");
    JLabel calculateFromLabel = new JLabel("От");
    JLabel calculateToLabel = new JLabel("До");
    JLabel divisibleLabel = new JLabel("Делимое");
    JLabel divisorLabel = new JLabel("Делитель");

    /*JTextArea textArea = new JTextArea(35,40)*/;

    public UserView(Control control){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(100,30);
        setSize(500,1000);
        setTitle("Задача Фибоначчи");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(25,25,435,450);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(25,25,435,450);
        panel.add(scrollPane);

        showNumbersButton.setBounds(25,500,200,40);
        showNumbersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String from = showFromTextField.getText();
                    if (from.trim().isEmpty()|Integer.parseInt(from)<1)
                        throw new NumberFormatException();
                    String to = showToTextField.getText();
                    if (to.trim().isEmpty()|Integer.parseInt(from)>Integer.parseInt(to)|Integer.parseInt(to)==Integer.parseInt(from))
                        throw new NumberFormatException();
                    String text = textArea.getText();
                    textArea.setText(text.concat(control.showNumbers(Integer.parseInt(from),Integer.parseInt(to))));
                    warningTextArea.setText("");
                } catch (NumberFormatException exception) {
                    warningTextArea.setText("Некорректный ввод!");
                }
            }
        });
        panel.add(showNumbersButton);
        showFromLabel.setBounds(240,500,30,40);
        panel.add(showFromLabel);
        showFromTextField.setBounds(275,505,50,30);
        panel.add(showFromTextField);
        showToLabel.setBounds(335,500,25,40);
        panel.add(showToLabel);
        showToTextField.setBounds(365,505,50,30);
        panel.add(showToTextField);

        showNumberButton.setBounds(25,550,200,40);
        showNumberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String number = showNumberTextField.getText();
                    if (number.trim().isEmpty()|Integer.parseInt(number)<1)
                        throw new NumberFormatException();
                    String text = textArea.getText();
                    textArea.setText(text.concat(control.showNumber(Integer.parseInt(number))));
                    warningTextArea.setText("");
                } catch (NumberFormatException exception) {
                    warningTextArea.setText("Некорректный ввод!");
                }
            }
        });
        panel.add(showNumberButton);
        showNumberLabel.setBounds(240,550,100,40);
        panel.add(showNumberLabel);
        showNumberTextField.setBounds(350,555,50,30);
        panel.add(showNumberTextField);

        calculateSumButton.setBounds(25,630,200,40);
        calculateSumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String from = calculateFromTextField.getText();
                    if (from.trim().isEmpty()|Integer.parseInt(from)<1)
                        throw new NumberFormatException();
                    String to = calculateToTextField.getText();
                    if (to.trim().isEmpty()|Integer.parseInt(from)>Integer.parseInt(to)|Integer.parseInt(to)==Integer.parseInt(from))
                        throw new NumberFormatException();
                    String text = textArea.getText();
                    textArea.setText(text.concat(control.getSum(Integer.parseInt(from),Integer.parseInt(to))));
                    warningTextArea.setText("");
                } catch (NumberFormatException exception) {
                    warningTextArea.setText("Некорректный ввод!");
                }
            }
        });
        panel.add(calculateSumButton);

        calculateOddButton.setBounds(25,680,200,40);
        calculateOddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String from = calculateFromTextField.getText();
                    if (from.trim().isEmpty()|Integer.parseInt(from)<1)
                        throw new NumberFormatException();
                    String to = calculateToTextField.getText();
                    if (to.trim().isEmpty()|Integer.parseInt(from)>Integer.parseInt(to)|Integer.parseInt(to)==Integer.parseInt(from))
                        throw new NumberFormatException();
                    String text = textArea.getText();
                    textArea.setText(text.concat(control.getOdd(Integer.parseInt(from),Integer.parseInt(to))));
                    warningTextArea.setText("");
                } catch (NumberFormatException exception) {
                    warningTextArea.setText("Некорректный ввод!");
                }
            }
        });
        panel.add(calculateOddButton);

        calculateEvenButton.setBounds(25,730,200,40);
        calculateEvenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String from = calculateFromTextField.getText();
                    if (from.trim().isEmpty()|Integer.parseInt(from)<1)
                        throw new NumberFormatException();
                    String to = calculateToTextField.getText();
                    if (to.trim().isEmpty()|Integer.parseInt(from)>Integer.parseInt(to)|Integer.parseInt(to)==Integer.parseInt(from))
                        throw new NumberFormatException();
                    String text = textArea.getText();
                    textArea.setText(text.concat(control.getEven(Integer.parseInt(from),Integer.parseInt(to))));
                    warningTextArea.setText("");
                } catch (NumberFormatException exception) {
                    warningTextArea.setText("Некорректный ввод!");
                }
            }
        });
        panel.add(calculateEvenButton);

        calculateFromLabel.setBounds(240,680,30,40);
        panel.add(calculateFromLabel);
        calculateFromTextField.setBounds(275,685,50,30);
        panel.add(calculateFromTextField);
        calculateToLabel.setBounds(335,680,25,40);
        panel.add(calculateToLabel);
        calculateToTextField.setBounds(365,685,50,30);
        panel.add(calculateToTextField);

        calculateQuotientButton.setBounds(25,820,200,40);
        calculateQuotientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String divisible = divisibleTextField.getText();
                    if (divisible.trim().isEmpty()|Integer.parseInt(divisible)<1)
                        throw new NumberFormatException();
                    String divisor = divisorTextField.getText();
                    if (divisor.trim().isEmpty()|Integer.parseInt(divisor)<1)
                        throw new NumberFormatException();
                    String text = textArea.getText();
                    textArea.setText(text.concat(control.divide(Integer.parseInt(divisible),Integer.parseInt(divisor))));
                    warningTextArea.setText("");
                } catch (NumberFormatException exception) {
                    warningTextArea.setText("Некорректный ввод!");
                }
            }
        });
        panel.add(calculateQuotientButton);

        divisibleLabel.setBounds(270,780,70,40);
        panel.add(divisibleLabel);
        divisibleTextField.setBounds(275,825,50,30);
        panel.add(divisibleTextField);
        divisorLabel.setBounds(365,780,70,40);
        panel.add(divisorLabel);
        divisorTextField.setBounds(365,825,50,30);
        panel.add(divisorTextField);

        eraseTextButton.setBounds(25,900,200,40);
        eraseTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                showNumberTextField.setText("");
                showFromTextField.setText("");
                showToTextField.setText("");
                calculateFromTextField.setText("");
                calculateToTextField.setText("");
                divisibleTextField.setText("");
                divisorTextField.setText("");
                warningTextArea.setText("");
            }
        });
        panel.add(eraseTextButton);

        warningTextArea.setBounds(235,900,200,40);
        panel.add(warningTextArea);

        setContentPane(panel);


        setVisible(true);
    }
}
