package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 95;

        if(score >-0 && score <=100){ // if score is valid
            if(score >=60){ //if student passed the exam
                System.out.println("Passed");
            }else{ //if student failed exam
                System.out.println("Failed");
            }
        }else{ //if the score is not valid
            System.out.println("invalid score");
        }

        System.out.println("---------------------------------");

        int age = 25;
        boolean hasId = true;

        if(hasId){// if the person has ID
            if (age>=21){ //if the person is 21 tears old or older
                System.out.println("Eligible to buy alcohol");

            }else{//if the person less than 21 years old
                System.out.println("Not eligible to buy alcohol");

            }
        }else{// if the person doesn't have ID
            System.out.println("You must have ID to buy alcohol");
        }

        System.out.println("---------------------------------");

        int number = 7;

        if(number>=1 && number<=7){
            if(number ==1){
                System.out.println("Monday");
            }
            if(number ==2){
                System.out.println("Tuesday");
            }
            if(number ==3){
                System.out.println("wednesday");
            }
            if(number ==4){
                System.out.println("Thursday");
            }

            if(number ==5){
                System.out.println("Friday");
            }
            if(number ==6){
                System.out.println("Saturday");
            }
            if(number ==7){
                System.out.println("Sunday");
            }

            /*
            if(number>=1 && number<=7){
            if(number ==1){
                System.out.println("Monday");
            }elseif(number ==2){
                System.out.println("Tuesday");
            }elseif(number ==3){
                System.out.println("wednesday");
            }elseif(number ==4){
                System.out.println("Thursday");
            }elseif(number ==5){
                System.out.println("Friday");
            }elseif(number ==6){
                System.out.println("Saturday");
            }elseif(number ==7){
                System.out.println("Sunday");
            }
             */
        }else{

        }


    }
}
