package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 9;

        String result2 ="";
        if (number >= 1 && number <= 12) {

          switch (number) {

                case 2:
                    result2 = "28 days";
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    result2 = "30 days";
                    break;

                default:
                    result2 = "31 days";
            }
            }else {
            result2 = "Invalid Number";
        }
            System.out.println(result2);
        }
    }
