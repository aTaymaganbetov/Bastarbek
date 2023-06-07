package com.example.bastarbek.model;

import com.example.bastarbek.model.method1.Answer;
import com.example.bastarbek.model.method1.Question;
import com.example.bastarbek.model.method2.QuestionSecond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionsBase {

    public static List<Question> getFirstQuestionsBase() {
        List<Question> questions = new ArrayList<>();
        Question question1 = new Question("answer1");
        question1.setText("1. Тәуекелдерді басқару мәселелеріне жауапты құрылымдық бөлімше:");
        question1.getAnswers().add(new Answer("answer1", "+Тәуекелдерді басқару және ішкі бақылау департаменті"));
        question1.getAnswers().add(new Answer("answer2", "Пайдалану департаменті"));
        question1.getAnswers().add(new Answer("answer3", "Маркетинг департаменті"));
        question1.getAnswers().add(new Answer("answer4", "Заң департаменті"));
        questions.add(question1);

        Question question2 = new Question("answer1");
        question2.setText("2. Негізгі тәуекелдер:");
        question2.getAnswers().add(new Answer("answer1", "+Тәуекелдер картасының қызыл және қызғылт сары аймақтарына түсетін тәуекелдер"));
        question2.getAnswers().add(new Answer("answer2", "Тәуекелдер картасының көк және көгілдір аймақтарына түсетін тәуекелдер"));
        question2.getAnswers().add(new Answer("answer3", "Тәуекелдер картасының ақ және сары аймақтарына түсетін тәуекелдер"));
        question2.getAnswers().add(new Answer("answer4", "Тәуекелдер картасының жасыл және қызғылт аймақтарына түсетін тәуекелдер"));
        questions.add(question2);

        Question question3 = new Question("answer1");
        question3.setText("3. Туындау кезінде «KEGOC» АҚ-ның қол жеткізген мақсаттарында көрініс табатын және өз стратегиясын табыспен іске асыруға кедергі келтіретін кез келген оқиға немесе іс-қимыл:");
        question3.getAnswers().add(new Answer("answer1", "+Тәуекел"));
        question3.getAnswers().add(new Answer("answer2", "Фактор"));
        question3.getAnswers().add(new Answer("answer3", "Оқиға"));
        question3.getAnswers().add(new Answer("answer4", "Әрекет"));
        questions.add(question3);

        Question question4 = new Question("answer1");
        question4.setText("4. «KEGOC» АҚ басшылығы мен қызметкерлері шешімдер қабылдайтын және тәуекелдер мен мүмкіндіктердің оңтайлы  арақатынасын назарға ала отырып, өзінің операциялық және өзге де қызметін жүзеге асыратын ішкі орта көрсеткіші");
        question4.getAnswers().add(new Answer("answer1", "+Тәуекел мәдениеті"));
        question4.getAnswers().add(new Answer("answer2", "Тәуекел факторы"));
        question4.getAnswers().add(new Answer("answer3", "Тәуекел әрекеті"));
        question4.getAnswers().add(new Answer("answer4", "Тәуекел оқиғасы"));
        questions.add(question4);

        Question question5 = new Question("answer1");
        question5.setText("5. «KEGOC» АҚ-ның стратегиялық мақсаттарға қол жеткізуіне елеулі түрде әсер етпейтін мақсатты көрсеткіштерден ауытқудың қолайлы деңгейі");
        question5.getAnswers().add(new Answer("answer1", "+Тәуекелдерге төзімділік"));
        question5.getAnswers().add(new Answer("answer2", "Тәуекелдерге төзімсіздік"));
        question5.getAnswers().add(new Answer("answer3", "Тәуекелдерге шығындылық"));
        question5.getAnswers().add(new Answer("answer4", "Тәуекелдерге жеткіліксіздік"));
        questions.add(question5);

        Question question6 = new Question("answer1");
        question6.setText("6. Іске асуы шығынға әкелген, сәйкестендірілген тәуекел (операциялық, қаржылық және басқа тәуекел):");
        question6.getAnswers().add(new Answer("answer1", "+Іске асқан тәуекел"));
        question6.getAnswers().add(new Answer("answer2", "Істен шыққан тәуекел"));
        question6.getAnswers().add(new Answer("answer3", "Іске асырылмаған тәуекел"));
        question6.getAnswers().add(new Answer("answer4", "Топтық тәуекел"));
        questions.add(question6);

        Question question7 = new Question("answer1");
        question7.setText("7. Тәуекелді іске асыруға ықпал ететін себеп");
        question7.getAnswers().add(new Answer("answer1", "+Тәуекел факторы"));
        question7.getAnswers().add(new Answer("answer2", "Тәуекел мәдениеті"));
        question7.getAnswers().add(new Answer("answer3", "Тәуекел әрекеті"));
        question7.getAnswers().add(new Answer("answer4", "Тәуекел оқиғасы"));
        questions.add(question7);

        Question question8 = new Question("answer1");
        question8.setText("8. «KEGOC» АҚ Даму стратегиясы,  «KEGOC» АҚ Бизнес-жоспарының (Даму жоспары) мақсаттарына, міндеттеріне қол жеткізуге және іс-шараларын орындауға теріс әсер етуі мүмкін ішкі және сыртқы оқиғаларды анықтау:");
        question8.getAnswers().add(new Answer("answer1", "+Тәуекелдерді сәйкестендіру"));
        question8.getAnswers().add(new Answer("answer2", "Тәуекелдерді жұптастыру"));
        question8.getAnswers().add(new Answer("answer3", "Тәуекелдерді шоғырландыру"));
        question8.getAnswers().add(new Answer("answer4", "Тәуекелдерді рәсімдеу"));
        questions.add(question8);

        Question question9 = new Question("answer1");
        question9.setText("9. Ішкі процестермен, ұйымдастырушылық құрылыммен, адами ресрустармен, Компания активтерімен байланысты және Компанияның операциялық қызметі шеңберінде пайда болатын тәуекелдер факторлары ... жатады.");
        question9.getAnswers().add(new Answer("answer1", "+Ішкі тәуекел факторларына"));
        question9.getAnswers().add(new Answer("answer2", "Сыртқы тәуекел факторларына"));
        question9.getAnswers().add(new Answer("answer3", "Ішінара тәуекел факторларына"));
        question9.getAnswers().add(new Answer("answer4", "Жалпы тәуекел факторларына"));
        questions.add(question9);

        Question question10 = new Question("answer1");
        question10.setText("10. Компанияның операциялық қызметінен тыс пайда болатын және Компания қызметіне тәуелсіз тәуекелдер факторы ... жатады.");
        question10.getAnswers().add(new Answer("answer1", "+Сыртқы тәуекел факторларына"));
        question10.getAnswers().add(new Answer("answer2", "Ішкі тәуекел факторларына"));
        question10.getAnswers().add(new Answer("answer3", "Ішінара тәуекел факторларына"));
        question10.getAnswers().add(new Answer("answer4", "Жалпы тәуекел факторларына"));
        questions.add(question10);

        return questions;
    }

    public static List<QuestionSecond> getSecondQuestionsBase() {
        List<QuestionSecond> questions = new ArrayList<>();
        QuestionSecond question1 = new QuestionSecond();
        question1.setText("1. Туындаған кезде \"KEGOC\" АҚ-ның мақсаттарына қол жеткізуінде көрсетіле және өз стратегиясын табысты іске асыруға кедергі келтіре алатын кез келген мүмкін болар оқиға немесе іс-қимыл:");
        question1.setCorrectAnswers(
                new ArrayList<String>(
                        List.of(
                                "Тәуекел"
                        )
                )
        );
        questions.add(question1);

        QuestionSecond question2 = new QuestionSecond();
        question2.setText("2. Өзінің атқарымдық міндеттеріне қарай тәуекел айқындаған барлық басқару қырлары үшін, атап айтқанда, «KEGOC» АҚ-дағы тәуекелдің іске асырылу ықтималдығын азайту және/немесе тәуекелдің іске асырылуынан салдарлардың мүмкін болар әсерін төмендету үшін жауапты тұлға (еңбеккер/құрылымдық бөлімше):");
        question2.setCorrectAnswers(
                new ArrayList<String>(
                        Arrays.asList(
                                "Тәуекел иесі", "Тәуекелдің иесі"
                        )
                )
        );
        questions.add(question2);

        QuestionSecond question3 = new QuestionSecond();
        question3.setText("3. Ұйымның табиғатын айқындайды және тәуекелдерге қатысты саясат пен мейлінше аз талаптарды белгілейтін құжаттар әзірлеуді, ішкі мәдениетті жақсартуды, күнделікті бизнес жүргізудегі ажырамас бөлік ретінде барлық ұйымдастыру деңгейлерінде этикалық құндылықтарды, тәуекел-менеджмент ұғымын, тәртіпті,  процестер мен іс-тәжірибені арттыруды қарастырады:");
        question3.setCorrectAnswers(
                new ArrayList<String>(
                        List.of(
                                "Ішкі орта"
                        )
                )
        );
        questions.add(question3);

        QuestionSecond question4 = new QuestionSecond();
        question4.setText("4. Ұйымның табиғатын айқындайды және тәуекелдерге қатысты саясат пен мейлінше аз талаптарды белгілейтін құжаттар әзірлеуді, ішкі мәдениетті жақсартуды, күнделікті бизнес жүргізудегі ажырамас бөлік ретінде барлық ұйымдастыру деңгейлерінде этикалық құндылықтарды, тәуекел-менеджмент ұғымын, тәртіпті,  процестер мен іс-тәжірибені арттыруды қарастырады:");
        question4.setCorrectAnswers(
                new ArrayList<String>(
                        List.of(
                                "Ішкі орта"
                        )
                )
        );
        questions.add(question4);

        QuestionSecond question5 = new QuestionSecond();
        question5.setText("5. Ұйымның мақсаттарына жетуге әсер ете алатын ішкі және сыртқы және ішкі оқиғалар айқындалады: ");
        question5.setCorrectAnswers(
                new ArrayList<String>(
                        Arrays.asList(
                                "Тәуекелдерді сәйкестендіру", "Тәуекелді сәйкестендіру"
                        )
                )
        );
        questions.add(question5);

        QuestionSecond question6 = new QuestionSecond();
        question6.setText("6. Тәуекелдер туындау және әсер ету тұрғысынан оларды басқару туралы шешім қабылдау үшін негіз ретінде талданады:");
        question6.setCorrectAnswers(
                new ArrayList<String>(
                        Arrays.asList(
                                "Тәуекелдерді бағалау", "Тәуекелді бағалау"
                        )
                )
        );
        questions.add(question6);

        QuestionSecond question7 = new QuestionSecond();
        question7.setText("7. Тәуекелге үн қату әдістері (қашқақтау, ұстап тұру, бақылау немесе ауыстыру) айқындалады және ұйымның тәуекелдерге төзімділік деңгейімен келісілген іс-қимылдар жоспары әзірленеді:");
        question7.setCorrectAnswers(
                new ArrayList<String>(
                        Arrays.asList(
                                "Тәуекелдерді басқару", "Тәуекелді басқару"
                        )
                )
        );
        questions.add(question7);

        QuestionSecond question8 = new QuestionSecond();
        question8.setText("8. Тәуекелдерді басқару жүйесінің жұмыс істеуін қамтамасыз ететін саясаттар мен рәсімдер жиыны - ол:");
        question8.setCorrectAnswers(
                new ArrayList<String>(
                        List.of(
                                "Бақылау"
                        )
                )
        );
        questions.add(question8);

        QuestionSecond question9 = new QuestionSecond();
        question9.setText("9. KEGOC» АҚ-да құрылымдық бөлімшелермен тәуекелдерді басқару жөніндегі есептілік үшін ұсынылатын қажетті ақпарат айқындалады:");
        question9.setCorrectAnswers(
                new ArrayList<String>(
                        Arrays.asList(
                                "Ақпарат және коммуникация", "Ақпарат, коммуникация",
                                "коммуникация және ақпарат", "коммуникация, ақпарат,"
                        )
                )
        );
        questions.add(question9);

        QuestionSecond question10 = new QuestionSecond();
        question10.setText("10. Тәуекелдерді басқару жүйесінің тұтастылығы ұдайы ізерленеді және қажет кезінде оған өзгерістер енгізіледі:");
        question10.setCorrectAnswers(
                new ArrayList<String>(
                        List.of(
                                "Мониторинг"
                        )
                )
        );
        questions.add(question10);

        return questions;
    }
}
