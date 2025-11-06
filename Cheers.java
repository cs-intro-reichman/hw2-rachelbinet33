//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String  word = args[0];
        int num = Integer.parseInt(args[1]);
        char list[] = {'A','E','F','H','I','L','M','N','O','R','S','X'};
        boolean isan = false;

        for (int i = 0; i < word.length(); i++){
                for(char letter : list){
                        if (letter == word.charAt(i) || letter == Character.toUpperCase(word.charAt(i)))
                        {System.out.println("Give me " + "an " +  letter+ ": " +  letter +"!");
                        isan = true;
                        break;}
                        isan=false;
                       // else{System.out.println("Give me " + "a " +  word.charAt(i)+ ": " +  word.charAt(i) +"!");}
                                      }
                        if(!isan){System.out.println("Give me " + "a  " +  word.charAt(i)+ ": " +  word.charAt(i) +"!");}
                }       
        System.out.println("What does that spell?");
        for (int i =0; i<num+1;i++){System.out.println(word+"!!!");}                   
        }
        
}