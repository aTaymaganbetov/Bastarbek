package com.example.bastarbek;

import com.example.bastarbek.model.method1.Answer;
import com.example.bastarbek.model.method1.AnswerStateInstance;
import com.example.bastarbek.model.method1.Question;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class TestMethod3Controller extends WindowFunctionality implements Initializable {


    List<Question> questions = new ArrayList<>();

    AnswerStateInstance answerState = AnswerStateInstance.getInstance();

    ToggleGroup group = new ToggleGroup();

    protected static int counter = 1;

    @FXML
    private RadioButton answer1;

    @FXML
    private RadioButton answer2;

    @FXML
    private RadioButton answer3;

    @FXML
    private RadioButton answer4;

    @FXML
    private Button nextQuestionButton;

    @FXML
    private Text questionText;

    @FXML
    protected void nextQuestionAction() {
        try {
            RadioButton selection = (RadioButton) group.getSelectedToggle();
            String selectedAnswerText = selection.getText();

            if (counter == 10) {
                checkAnswer(selectedAnswerText, questions.get(counter - 1).getCorrectAnswer().text());
                selection.setSelected(false);
                counter = 1;
                answerState.date = getTime();
                openWindowWithStage("result_first.fxml", 900, 600, StageInstance.getInstance().stage);

            } else {
                System.out.println("Selected: " + selectedAnswerText);
                checkAnswer(selectedAnswerText, questions.get(counter - 1).getCorrectAnswer().text());
                setQuestionsView(questions.get(counter));
                counter++;
                selection.setSelected(false);
            }
        } catch (RuntimeException e) {
            showAlert(
                    Alert.AlertType.INFORMATION,
                    "Қателік",
                    "Сіз дұрыс жауап таңдамадыңыз",
                    "Экранда көрсетілген төрт нұсқаның біреуін таңдаңыз"
            );
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        createQuestionsBase();

        answer1.setToggleGroup(group);
        answer2.setToggleGroup(group);
        answer3.setToggleGroup(group);
        answer4.setToggleGroup(group);

        setQuestionsView(questions.get(0));

    }

    protected void checkAnswer(String selectedAnswerText, String correctAnswerText) {
        if(selectedAnswerText.equals(correctAnswerText)) {
            answerState.results.add(true);
            System.err.println("TRUE");
        } else {
            answerState.results.add(false);
            System.err.println("FALSE");
        }
    }

    protected void setQuestionsView(Question startQuestion) {
        questionText.setText(startQuestion.getText());

        List<Answer> answers = startQuestion.getAnswers();
        startQuestion.shuffleAnswers();

        answer1.setText(answers.get(0).text());
        answer2.setText(answers.get(1).text());
        answer3.setText(answers.get(2).text());
        answer4.setText(answers.get(3).text());
    }

    protected void createQuestionsBase() {
        Question question1 = new Question("answer1");
        question1.setText("1. Қауіптер мен осалдықтардың пайда болу ықтималдығын, сондай-ақ олардың салдарын анықтауға мүмкіндік беретін әдіс:");
        question1.getAnswers().add(new Answer("answer1", "+Қауіптер мен осалдықтарды талдау әдісі (Threat and Vulnerability Assessment, TVA)"));
        question1.getAnswers().add(new Answer("answer2", "Тәуекелдерді бағалау әдісі (Risk Assessment)"));
        question1.getAnswers().add(new Answer("answer3", "Қауіпсіздікті бақылау әдісі (Security control)"));
        question1.getAnswers().add(new Answer("answer4", "Қауіпсіздік аудиті әдісі (Security Audit)"));
        questions.add(question1);

        Question question2 = new Question("answer2");
        question2.setText("2. Қауіптердің, осалдықтардың және олардың салдарының пайда болу ықтималдығын талдау негізінде тәуекел деңгейін анықтауға мүмкіндік беретін әдіс:");
        question2.getAnswers().add(new Answer("answer1", "Қауіптер мен осалдықтарды талдау әдісі (Threat and Vulnerability Assessment, TVA)"));
        question2.getAnswers().add(new Answer("answer2", "+Тәуекелдерді бағалау әдісі (Risk Assessment)"));
        question2.getAnswers().add(new Answer("answer3", "Қауіпсіздікті бақылау әдісі (Security control)"));
        question2.getAnswers().add(new Answer("answer4", "Қауіпсіздік аудиті әдісі (Security Audit)"));
        questions.add(question2);

        Question question3 = new Question("answer3");
        question3.setText("3. Ақпараттың ағып кетуіне немесе басқа да ауыр зардаптарға жол бермеу үшін ықтимал шабуылдар мен қауіпсіздіктің бұзылуын ерте анықтауға мүмкіндік беретін әдіс:");
        question3.getAnswers().add(new Answer("answer1", "Қауіптер мен осалдықтарды талдау әдісі (Threat and Vulnerability Assessment, TVA)"));
        question3.getAnswers().add(new Answer("answer2", "Тәуекелдерді бағалау әдісі (Risk Assessment)"));
        question3.getAnswers().add(new Answer("answer3", "+Қауіпсіздікті бақылау әдісі (Security control)"));
        question3.getAnswers().add(new Answer("answer4", "Қауіпсіздік аудиті әдісі (Security Audit)"));
        questions.add(question3);

        Question question4 = new Question("answer4");
        question4.setText("4. Ақпараттық қауіпсіздік жүйесінің белгіленген стандарттар мен реттеуші талаптарға сәйкестігін тексеруге мүмкіндік беретін әдіс:");
        question4.getAnswers().add(new Answer("answer1", "Қауіптер мен осалдықтарды талдау әдісі (Threat and Vulnerability Assessment, TVA)"));
        question4.getAnswers().add(new Answer("answer2", "Тәуекелдерді бағалау әдісі (Risk Assessment)"));
        question4.getAnswers().add(new Answer("answer3", "Қауіпсіздікті бақылау әдісі (Security control)"));
        question4.getAnswers().add(new Answer("answer4", "+Қауіпсіздік аудиті әдісі (Security Audit)"));
        questions.add(question4);

        Question question5 = new Question("answer1");
        question5.setText("5. Тәуекелдерді бағалауды, тәуекелдерді азайту шараларын жоспарлауды және олардың іске асырылуын бақылауды қоса алғанда, ақпараттық қауіпсіздік тәуекелдерін басқару стратегиясын әзірлеуге мүмкіндік беретін әдіс:");
        question5.getAnswers().add(new Answer("answer1", "+Тәуекелдерді басқару әдісі (Risk Management)"));
        question5.getAnswers().add(new Answer("answer2", "Тәуекелдерді бағалау әдісі (Risk Assessment)"));
        question5.getAnswers().add(new Answer("answer3", "Қауіпсіздікті бақылау әдісі (Security control)"));
        question5.getAnswers().add(new Answer("answer4", "Қауіпсіздік аудиті әдісі (Security Audit)"));
        questions.add(question5);

        Question question6 = new Question("answer2");
        question6.setText("6. Ақпараттық қызметті қолайлы уақытты алу мүмкіндігі қалай аталады:");
        question6.getAnswers().add(new Answer("answer1", "Тұтастық"));
        question6.getAnswers().add(new Answer("answer2", "+Қолжетімділік"));
        question6.getAnswers().add(new Answer("answer3", "Құпиялылық"));
        question6.getAnswers().add(new Answer("answer4", "Толықтық"));
        questions.add(question6);

        Question question7 = new Question("answer1");
        question7.setText("7. Алынған ақпараттың өзектілігін және дәйектілігін, бұзылудан және рұқсатсыз өзгертуден қорғалғанын білдіретін қасиеті:");
        question7.getAnswers().add(new Answer("answer1", "+Тұтастық"));
        question7.getAnswers().add(new Answer("answer2", "Қолжетімділік"));
        question7.getAnswers().add(new Answer("answer3", "Құпиялылық"));
        question7.getAnswers().add(new Answer("answer4", "Толықтық"));
        questions.add(question7);

        Question question8 = new Question("answer1");
        question8.setText("8. Ақпаратқа рұқсатсыз қол жеткізуден қорғау ол :");
        question8.getAnswers().add(new Answer("answer1", "+Құпиялылық"));
        question8.getAnswers().add(new Answer("answer2", "Қолжетімділік"));
        question8.getAnswers().add(new Answer("answer3", "Тұтастық"));
        question8.getAnswers().add(new Answer("answer4", "Толықтық"));
        questions.add(question8);

        Question question9 = new Question("answer1");
        question9.setText("9.  Ақпарат қауіпсіздігінің бұзылу қаупін тудыратын жағдайлар мен факторлар жиынтығы:");
        question9.getAnswers().add(new Answer("answer1", "+Ақпараттық қауіпсіздіктің қаупі"));
        question9.getAnswers().add(new Answer("answer2", "Тұтастықты бұзу қаупі"));
        question9.getAnswers().add(new Answer("answer3", "Қолжетімділік қаупі"));
        question9.getAnswers().add(new Answer("answer4", "Тәуекел қаупі"));
        questions.add(question9);

        Question question10 = new Question("answer2");
        question10.setText("10. Ақпараттық жүйеде сақталған кез-келген ақпаратты өзгерту мүмкіндігіне байланысты қатерлер:");
        question10.getAnswers().add(new Answer("answer1", "Ақпараттық қауіпсіздіктің қаупі"));
        question10.getAnswers().add(new Answer("answer2", "+Тұтастықты бұзу қаупі"));
        question10.getAnswers().add(new Answer("answer3", "Қолжетімділік қаупі"));
        question10.getAnswers().add(new Answer("answer4", "Тәуекел қаупі"));
        questions.add(question10);
    }
}
