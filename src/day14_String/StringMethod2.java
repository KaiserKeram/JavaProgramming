package day14_String;

public class StringMethod2 {
    
    public static void main(String[] args) {
        
        String str = "Java is fun, I love learning Java";
        
        String str2 = str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        System.out.println("--------------------------");
        
        String email = "JohnSmith@yahoo.com";
        String email2 = email.replace("yahoo","gmail");

        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

        System.out.println("--------------------------");

        String sentence = "Java Java 1 1 1 1 1 2 2 2 2 3 3 3 3 ";
        String sentence2 = sentence.replace("Java", "");
        String sentence3 = sentence2.replace("   ", "");

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);
        System.out.println("sentence3 = " + sentence3);

        String s3 = "Java";

        s3 = s3.replace("a", "e");
        System.out.println("s3 = " + s3);

        System.out.println("----------------------------------");

        String result = "Java Java Java";
        //result = result.replace("Java", "Python");
        result = result.replaceFirst("Java", "Python");
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#","Java");
        System.out.println(result2);

    }
}
