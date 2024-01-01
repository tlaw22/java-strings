public class App {
    public static void main(String[] args) throws Exception {
        String sep = "================================================"; // seperator for each step.
        String a = "hello   ";
        String str = "ABC123DEFG";
        String extractSTR = str.substring(8);  // extract out a portion of the string
        String extractSTR2 = str.substring(3, 5); 
        System.out.println(extractSTR2);
        System.out.println(sep);
        String Num1 = "hello";
        String Num2 = "world";
        if(Num1.equals("hello")){
            System.out.println("success!");   // always use the .euqals() method to compare strings
        }
        if (Num2.equalsIgnoreCase("woRld")){
            System.out.println("System Failure!");
        }
        char selectCharacter = Num2.charAt(2);
        System.out.println(selectCharacter);
        String search = "Searching the world wide web";
        int x = search.indexOf("web");
        System.out.println(sep);
        System.out.println(x);
        int y = search.indexOf("the", 5);
        System.out.println(y);
        System.out.println(sep);
        int z = search.lastIndexOf("world");
        System.out.println(z);
    }
}
