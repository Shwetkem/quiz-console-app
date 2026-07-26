import java.util.Scanner;

public class
QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "What is Earth?","Planet", "A cake", "A pencil", "Something idk", "Planet");
        questions[1] = new Question(2, "What is JAVA?","A programming language", "A cake", "A pencil", "Something idk", "A programming language");
        questions[2] = new Question(3, "What is H2O?","Beverage", "Water", "A pencil", "Something idk", "Water");
        questions[3] = new Question(4, "What is SRMIST?","College", "School", "Hospital", "Something idk", "College");
        questions[4] = new Question(5, "What is Life?","Philosophical question dude", "Don't care to answer", "A gift", "Something idk", "A gift");
    }

    int i = 0;
    public void playQuiz(){
        Scanner input = new Scanner(System.in);
        for(Question ques : questions){
            System.out.println("Q"+ques.getId()+". "+ques.getQuestion());
            System.out.println();
            System.out.println("1. "+ques.getOpt1());
            System.out.println("2. "+ques.getOpt2());
            System.out.println("3. "+ques.getOpt3());
            System.out.println("4. "+ques.getOpt4());
            System.out.println();
            selection[i++] = input.nextLine();
        }
        input.close();
    }    
    public void displayScore(){

            int score = 0;
            int option;

            for(int i=0; i<questions.length; i++){
                String userAnswer = "";
                option = Integer.parseInt(selection[i]);
                Question q = questions[i];
                if(option == 1){
                    userAnswer = q.getOpt1();
                }
                else if(option == 2){
                    userAnswer = q.getOpt2();
                }
                else if(option == 3){
                    userAnswer = q.getOpt3();
                }
                else if(option == 4){
                    userAnswer = q.getOpt4();
                }
                else{
                    continue;
                }
                
                if(userAnswer.equals(q.getAnswer())){
                score++;
            }
            }
            System.out.println("Your score is: "+score);
        }    
}