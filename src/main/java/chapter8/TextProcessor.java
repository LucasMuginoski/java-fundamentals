package chapter8;

public class TextProcessor {
    public static void main(String[] args){
        contWords("I love Test Automation University");
        reverseString("Hello TAU!");
        System.out.println();
        addSpaces("HeyWorldsItsMeLucas");
    }
    public static void contWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words: ", numberOfWords);
        System.out.println(message);

        for (int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }
    public static void reverseString(String string){
        for (int i = string.length()-1; i >= 0; i--){
            System.out.print(string.charAt(i));
        }
    }
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for (int i=0; i<modifiedText.length(); i++){
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
