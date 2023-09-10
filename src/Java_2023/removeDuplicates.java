package Java_2023;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicates {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to remove the duplicates");
        String inputText = scanner.nextLine();
        if(inputText==null || inputText.isBlank()){
            System.out.println("Wrong input");
        }
        String[] words = inputText.split(" ");
        Set<String> uniqueWords = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for(String word:words){
            if(!uniqueWords.contains(word)){
                uniqueWords.add(word);
                result.append(word).append(" ");
            }

        }
        System.out.println("removed string : " + result);
    }
}
