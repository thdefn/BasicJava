package ObjectOriented.Concept;

import java.util.Scanner;

public class 모스부호테스트 {
    public static void main(String[] args) {
        String[] morseCode={
                ".-","-...","-.-.","-..",".","..-.","--.","....","..", //A-I
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.", //J-R
                "...","-","..-","...-",".--","-..-","-.--","--..", "-----", //S-0
                ".----","..---","...--","....-",".....","-....","--...","---..","----." //1-9
        };
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int ascii = 0;
        for(int i=0;i<str.length();i++){
            ascii = (int) str.charAt(i); //char을 int로 바꿔주면 ascii 값
            if(ascii>=65 && ascii<=90){
                ascii = ascii - 65;
            } else if (ascii>=97 && ascii<=122) {
                ascii = ascii - 97;
            } else if(ascii>=48 && ascii<=57){
                ascii = ascii - 22;
            }
            System.out.println(morseCode[ascii]);
        }
    }
}
