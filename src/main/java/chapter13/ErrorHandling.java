package chapter13;

import java.io.File;
import java.io.IOException;

public class ErrorHandling {
    public static void main(String[] args) {
        createNewFile();
    }
    public static void createNewFile(){
        File file = new File("/resources/nonexistent.text");
        try{
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }
}
