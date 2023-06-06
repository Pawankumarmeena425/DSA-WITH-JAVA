package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ch_16_FileHandling {
    public static void main(String[] args) {

//        ***** Code to create a file
        File myfile = new File("CodeWithHarry.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
//            Code to Write a file

            try {
                FileWriter fw  =new FileWriter("CodeWithHarry.txt");
                fw.write("This is Java Programming Course!! \n YOu are end of this!!hfgdgd");
                fw.close();
            } catch (IOException ioException) {
                System.out.println("Unable to write in the file!!");
                ioException.printStackTrace();
            }

//            Reading a file
//        File  rf  = new File("CodeWithHarry.txt");
        File  rf  = new File("Pawan.txt");
        try {
            Scanner sc  =new Scanner(rf);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File  df  = new File("CodeWithHarry.txt");
if (df.delete()){
    System.out.println("I have Deleted the File :"+df.getName());
}
else {
    System.out.println("Something error occured while deleting the file!!");
}
    }
}
