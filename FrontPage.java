import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontPage extends JFrame implements ActionListener{

    final int FRAME_WIDTH = 400;
    final int FRAME_HEIGHT = 700;

    public static String selectedCategory;
    public static int selectedAmountOfQuestions;
    public static String selectedQuestionDifficulty;

    JComboBox questionCategory;
    JComboBox questionNumber;
    JComboBox questionDifficulty;

    public FrontPage(){
        //sets up GUI

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creates the title
        JLabel title = new JLabel("LOCK IN!!!!!");
        title.setFont(new Font("Courier New", Font.BOLD, 30));
        title.setForeground(Color.RED);
        add(title);

        //blank label to help separate items
        JLabel blank1 = new JLabel("                                                                                                                                             ");
        add(blank1);
        JLabel blank2 = new JLabel("                                                                                                                                             ");
        add(blank2);


        //designs the label and combobox to choose pizza size
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        add(categoryLabel); //adds label

        String[] categoryChoices = { "random", "books","movies", "music","shows", "science & nature", "mythology", "sports", "geography", "history", "art", "celebrities", "animals", "vehicles"}; //choices for size
        questionCategory = new JComboBox(categoryChoices);
        questionCategory.setFont(new Font( "Courier New", Font.PLAIN, 20));
        add(questionCategory); //adds combobox

        JLabel blank3 = new JLabel("                                                                                                                                             ");
        add(blank3);


        //designs the label to tell about toppings
        JLabel numberOfQuestionLabel = new JLabel("Number of questions:");
        numberOfQuestionLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        add(numberOfQuestionLabel); //adds label

        //choices for toppings
        String[] questionAmountChoices = {"10", "20", "30", "40", "50"};

        //creates comboboxes for choosing toppings
        questionNumber = new JComboBox(questionAmountChoices);
        questionNumber.setFont(new Font( "Courier New", Font.PLAIN, 20));
        add(questionNumber); //adds first topping box

        JLabel blank4 = new JLabel("                                                                                                                                             ");
        add(blank4);


        JLabel questionDifficultyLabel = new JLabel("Type of questions:");
        questionDifficultyLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        add(questionDifficultyLabel); //adds label

        //discounted topping prices because of third
        String[] questionDifficultyChoices = { "any", "easy", "medium", "hard"};
        questionDifficulty = new JComboBox(questionDifficultyChoices);
        questionDifficulty.setFont(new Font( "Courier New", Font.PLAIN, 20));
        add(questionDifficulty); //adds third topping box

        JButton loadInvite = new JButton("Click");
        add(loadInvite);
        loadInvite.addActionListener(this);

    }

    public static void main(String[] args) {
        FrontPage example = new FrontPage();
        example.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        selectedCategory= questionCategory.getSelectedItem().toString();
        selectedAmountOfQuestions= Integer.parseInt(questionNumber.getSelectedItem().toString());
        selectedQuestionDifficulty= questionDifficulty.getSelectedItem().toString();

        Quiz quiz = new Quiz();
    }
}