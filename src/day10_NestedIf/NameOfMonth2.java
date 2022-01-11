package day10_NestedIf;

public class NameOfMonth2 {

           public static void main(String[] args) {
            int num = 10;
            String result = ""; // temporary

            if (num >=1 && num <=12){//if the number is valid(1-12)

                if(num ==1){
                    result = "January";
                }else if(num == 2){
                    result = "Feburary";
                }else if(num == 3){
                    result = "March";
                }else if(num == 4){
                    result = "April";
                }else if(num == 5){
                    result = "May";
                }else if(num == 6){
                    result = "June";
                }else if(num == 7){
                    result = "July";
                }else if(num == 8){
                    result = "August";
                }else if(num == 9){
                    result = "September";
                }else if(num == 10){
                    result = "October";
                }else if(num == 11){
                    result = "November";
                }else{
                    result = "December";
                }


            }else{ //if the number is not valid
                result = "invalid number";
            }

            System.out.println(result);


               System.out.println("---------------------------------");

               String result5 = (num == 1)? "January" : (num == 2)? "Faburary" : (num == 3)? "March" :
               (num == 4)? "April" : (num == 5)? "May" : (num == 6)? "June" : (num == 7)? "July" : (num == 8)? "August" :
               (num == 9)? "September" : (num == 10)? "October" : (num == 11)? "November" : "December";

               System.out.println(result5);
        }
    }

