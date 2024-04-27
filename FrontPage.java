import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;



public class FrontPage extends JFrame implements ActionListener {

    final int FRAME_WIDTH = 650;
    final int FRAME_HEIGHT = 650;

    public static String selectedCategory;
    public static int selectedAmountOfQuestions;
    public static String selectedQuestionDifficulty;

    JComboBox questionCategory;
    JComboBox questionNumber;
    JComboBox questionDifficulty;
    private Clip menuClip;
    private Clip quizClip;

    public FrontPage() {
        //sets up GUI

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(20, 46, 54));

        //creates the title
        JLabel title = new JLabel("LOCK IN!!!");
        title.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
        title.setForeground(new Color(248, 228, 204));
        title.setHorizontalAlignment(JLabel.CENTER);
        add(title);

        //blank label to help separate items
        JLabel blank1 = new JLabel("                                                                                                                                             ");
        add(blank1);
        JLabel blank2 = new JLabel("                                                                                                                                             ");
        add(blank2);


        //designs the label and combobox to choose pizza size
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        categoryLabel.setForeground(new Color(255, 255, 255));
        categoryLabel.setBackground(new Color(25, 25, 25));
        add(categoryLabel); //adds label

        String[] categoryChoices = {"random", "books", "movies", "music", "shows", "science & nature", "mythology", "sports", "geography", "history", "art", "celebrities", "animals", "vehicles"}; //choices for size
        questionCategory = new JComboBox(categoryChoices);
        questionCategory.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        questionCategory.setForeground(new Color(255, 255, 255));
        questionCategory.setBackground(new Color(25, 25, 25));
        add(questionCategory); //adds combobox

        JLabel blank3 = new JLabel("                                                                                                                                             ");
        add(blank3);


        //designs the label to tell about toppings
        JLabel numberOfQuestionLabel = new JLabel("Number of questions:");
        numberOfQuestionLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        numberOfQuestionLabel.setForeground(new Color(255, 255, 255));
        numberOfQuestionLabel.setBackground(new Color(25, 25, 25));
        add(numberOfQuestionLabel); //adds label

        //choices for toppings
        String[] questionAmountChoices = {"10", "20", "30", "40", "50"};

        //creates comboboxes for choosing toppings
        questionNumber = new JComboBox(questionAmountChoices);
        questionNumber.setFont(new Font("Courier New", Font.PLAIN, 20));
        questionNumber.setForeground(new Color(255, 255, 255));
        questionNumber.setBackground(new Color(25, 25, 25));
        add(questionNumber); //adds first topping box

        JLabel blank4 = new JLabel("                                                                                                                                             ");
        add(blank4);


        JLabel questionDifficultyLabel = new JLabel("Difficulty:");
        questionDifficultyLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        questionDifficultyLabel.setForeground(new Color(255, 255, 255));
        questionDifficultyLabel.setBackground(new Color(25, 25, 25));
        add(questionDifficultyLabel); //adds label

        //discounted topping prices because of third
        String[] questionDifficultyChoices = {"any", "easy", "medium", "hard"};
        questionDifficulty = new JComboBox(questionDifficultyChoices);
        questionDifficulty.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        questionDifficulty.setForeground(new Color(255, 255, 255));
        questionDifficulty.setBackground(new Color(25, 25, 25));
        add(questionDifficulty); //adds third topping box

        JButton loadInvite = new JButton("Ready");
        loadInvite.setBounds(535, 475, 100, 25);
        loadInvite.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        loadInvite.setForeground(new Color(173, 35, 94));
        loadInvite.setBackground(new Color(25, 25, 25));
        loadInvite.setHorizontalAlignment(JTextField.CENTER);
        add(loadInvite);
        loadInvite.addActionListener(this);

    }

    public static void main(String[] args) {
        FrontPage example = new FrontPage();
        example.setVisible(true);
        File menuFile = new File("C:/Users/solom/Downloads/menumusic.wav");
        AudioInputStream menuStream = null;
        try {
            menuStream = AudioSystem.getAudioInputStream(menuFile);
        } catch (UnsupportedAudioFileException | IOException e) {
            throw new RuntimeException(e);
        }
        try {
            example.menuClip = AudioSystem.getClip();
            example.menuClip.open(menuStream);
            example.menuClip.loop(Clip.LOOP_CONTINUOUSLY);
            example.menuClip.start();
        } catch (LineUnavailableException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        selectedCategory = questionCategory.getSelectedItem().toString();
        selectedAmountOfQuestions = Integer.parseInt(questionNumber.getSelectedItem().toString());
        selectedQuestionDifficulty = questionDifficulty.getSelectedItem().toString();

        if (menuClip != null) {
            menuClip.stop();
            menuClip.close();
        }
        dispose();
        File quizFile = new File("C:/Users/solom/Downloads/HungarianDance.wav");
        AudioInputStream quizStream = null;
        try {
            quizStream = AudioSystem.getAudioInputStream(quizFile);
            quizClip = AudioSystem.getClip();
            quizClip.open(quizStream);
            quizClip.loop(Clip.LOOP_CONTINUOUSLY);
            quizClip.start();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            ex.printStackTrace();
        }

        Quiz quiz = new Quiz();
        }
    }