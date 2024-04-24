import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener {

    String[] questions = {
            "Test: Which country is Jonathan from?",
            "Test: What class is this assignment for?",
            "Test: Who is the shortest of the four?"
    };

    String[][] options = {
            {"St. Lucia", "Trinidad and Tobago", "Anguilla", "Antigua and Barbuda"},
            {"DSCI 105", "CSI 121", "CSI 120", "DSCI 125"},
            {"Declan", "Oscar", "Michael", "Jonathan"}
    };

    char[] answers = {'D', 'B', 'A'};

    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_questions = questions.length;
    int result;
    int seconds = 10;

    JFrame frame = new JFrame();
    JTextField textfield = new JTextField();
    JTextArea textarea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();

    Timer shotclock = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            seconds--;
            seconds_left.setText(String.valueOf(seconds));
            if (seconds<=0) {
                displayAnswer();
            }
        }
    });

    public Quiz() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.getContentPane().setBackground(new Color(20, 46, 54));
        frame.setLayout(null);
        frame.setResizable(false);

        textfield.setBounds(0, 0, 650, 50);
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(248, 228, 204));
        textfield.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);

        textarea.setBounds(0, 50, 650, 50);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(25, 25, 25));
        textarea.setForeground(new Color(248, 228, 204));
        textarea.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);

        buttonA.setBounds(0, 100, 100, 100);
        buttonA.setFont(new Font("Eras", Font.BOLD, 35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");
        buttonA.setBackground(new Color(255, 255, 255));

        buttonB.setBounds(0, 200, 100, 100);
        buttonB.setFont(new Font("Eras", Font.BOLD, 35));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");
        buttonB.setBackground(new Color(255, 255, 255));

        buttonC.setBounds(0, 300, 100, 100);
        buttonC.setFont(new Font("Eras", Font.BOLD, 35));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");
        buttonC.setBackground(new Color(255, 255, 255));

        buttonD.setBounds(0, 400, 100, 100);
        buttonD.setFont(new Font("Eras", Font.BOLD, 35));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");
        buttonD.setBackground(new Color(255, 255, 255));

        answer_labelA.setBounds(125, 100, 500, 100);
        answer_labelA.setBackground(new Color(20, 46, 54));
        answer_labelA.setForeground(new Color(248, 228, 204));
        answer_labelA.setFont(new Font("Bookman Old Style", Font.PLAIN, 35));

        answer_labelB.setBounds(125, 200, 500, 100);
        answer_labelB.setBackground(new Color(20, 46, 54));
        answer_labelB.setForeground(new Color(248, 228, 204));
        answer_labelB.setFont(new Font("Bookman Old Style", Font.PLAIN, 35));

        answer_labelC.setBounds(125, 300, 500, 100);
        answer_labelC.setBackground(new Color(20, 46, 54));
        answer_labelC.setForeground(new Color(248, 228, 204));
        answer_labelC.setFont(new Font("Bookman Old Style", Font.PLAIN, 35));

        answer_labelD.setBounds(125, 400, 500, 100);
        answer_labelD.setBackground(new Color(20, 46, 54));
        answer_labelD.setForeground(new Color(248, 228, 204));
        answer_labelD.setFont(new Font("Bookman Old Style", Font.PLAIN, 35));

        seconds_left.setBounds(535, 511, 100, 100);
        seconds_left.setBackground(new Color(25, 25, 25));
        seconds_left.setForeground((new Color(173, 35, 94)));
        seconds_left.setFont(new Font("Eras", Font.BOLD, 60));
        seconds_left.setBorder(BorderFactory.createBevelBorder(3));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        time_label.setBounds(535, 475, 100, 25);
        time_label.setForeground(new Color(173, 35, 94));
        time_label.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        time_label.setText("LOCK IN");

        number_right.setBounds(225, 225, 200, 100);
        number_right.setBackground(new Color(25, 25, 25));
        number_right.setForeground(new Color(255, 255, 255));
        number_right.setFont(new Font("Bookman Old Style", Font.BOLD, 5));
        number_right.setBorder(BorderFactory.createBevelBorder(2));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);

        percentage.setBounds(225, 325, 200, 100);
        percentage.setBackground(new Color(25, 25, 25));
        percentage.setForeground(new Color(255, 255, 255));
        percentage.setFont(new Font("Bookman Old Style", Font.BOLD, 5));
        percentage.setBorder(BorderFactory.createBevelBorder(2));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        frame.add(textfield);
        frame.add(textarea);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
        frame.add(seconds_left);
        frame.add(time_label);

        frame.setVisible(true);

        nextQuestion();
    }

    public void nextQuestion() {
        if (index >= total_questions) {
            results();
        } else {
            textfield.setText("Question " + (index + 1));
            textarea.setText(questions[index]);
            answer_labelA.setText(options[index][0]);
            answer_labelB.setText(options[index][1]);
            answer_labelC.setText(options[index][2]);
            answer_labelD.setText(options[index][3]);
            shotclock.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (e.getSource() == buttonA) {
            answer = 'A';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        if (e.getSource() == buttonB) {
            answer = 'B';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }

        if (e.getSource() == buttonC) {
            answer = 'C';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }

        if (e.getSource() == buttonD) {
            answer = 'D';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        displayAnswer();
    }

    public void displayAnswer() {
        shotclock.stop();
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (answers[index] != 'A') {
            answer_labelA.setForeground(new Color(173, 35, 94));
        }
        if (answers[index] != 'B') {
            answer_labelB.setForeground(new Color(173, 35, 94));
        }
        if (answers[index] != 'C') {
            answer_labelC.setForeground(new Color(173, 35, 94));
        }
        if (answers[index] != 'D') {
            answer_labelD.setForeground(new Color(173, 35, 94));
        }

        Timer pause = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer_labelA.setForeground(new Color(248, 228, 204));
                answer_labelB.setForeground(new Color(248, 228, 204));
                answer_labelC.setForeground(new Color(248, 228, 204));
                answer_labelD.setForeground(new Color(248, 228, 204));

                answer = ' ';
                seconds = 10;
                seconds_left.setText(String.valueOf(seconds));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
                index++;
                nextQuestion();
            }
        });
        pause.setRepeats(false);
        pause.start();
    }


    public void results() {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        result = (int)(correct_guesses/(double)total_questions *100);

        textfield.setText("Results:");
        textarea.setText("");
        answer_labelA.setText("");
        answer_labelB.setText("");
        answer_labelC.setText("");
        answer_labelD.setText("");

        number_right.setText("("+correct_guesses+"/"+total_questions+")");
        number_right.setForeground(new Color(248, 228, 204));
        number_right.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
        percentage.setText(result+"%");
        percentage.setForeground(new Color(248, 228, 204));
        percentage.setFont(new Font("Bookman Old Style", Font.BOLD, 30));

        frame.add(percentage);
        frame.add(number_right);

        if (result >= 70) {
            JLabel passMessage = new JLabel("Bad day to be a wrong question, stay locked in");
            passMessage.setBounds(100, 475, 500, 25);
            passMessage.setForeground(new Color(39, 148, 39)); // Green color for pass message
            passMessage.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
            frame.add(passMessage);
        } else {
            JLabel failMessage = new JLabel("... you needa lock in fr");
            failMessage.setBounds(100, 475, 500, 25);
            failMessage.setForeground(new Color(206, 54, 54)); // Red color for fail message
            failMessage.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
            frame.add(failMessage);
        }
    }
}
