package Java_2023;

// input = aa bb cc
// output = cc bb aa
public class reverseString {

    public static void main(String[] args){

        String str1 = "pretty chandravanshi try ques you are king";
        String str2 = "";
        String [] words = str1.split(" ");
        for(int i = words.length-1; i>=0; i--){
            str2 = str2 + words[i] + " ";
        }
        System.out.println(str2);

    }
}
