package com.Quizapplication;

public class Game {
    Question[] questions=new Question[3];
    Player player=new Player();
    String[] data={"Which of the following is not a Java features?",
            "what is used to find and fix bugs in the Java programs?",
            "what is the return type of hashCode() method in the Object class?" };
    String[] options1={"Dynamic","JVM","Object"};
    String[] options2={"Object oriented","JRE","int"};
    String[] options3={"use pointers","JDK","long"};
    String[] options4={"Architecture neutral","JDB","void"};
    int[] answers={3,4,2};
    public void initGame(){
        for(int i=0;i<3;i++){
            questions[i]=new Question();
            questions[i].question=data[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }
    }
    public void play(){
        player.getDetails();
        for (int i=0;i<3;i++){
            boolean status=questions[i].askQuestion();
            if(status==true){
                System.out.println("congrats..!");
                player.score=player.score+5;
            }
            else{
                System.out.println("sorry..!");
                player.score=player.score-5;
            }
        }
        System.out.println(player.name+"your score is "+player.score);
    }
}
