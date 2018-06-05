package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	//this for testing file
        System.out.print("Enter Text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        FileWriter fWriter;
        BufferedWriter writer;
        try {
            fWriter = new FileWriter("chars.txt");
            writer = new BufferedWriter(fWriter);
            writer.write(text);
            writer.newLine();
            writer.close();
            System.err.println("Your input of " + text.length() + " characters was saved.");
        } catch (Exception e) {
            System.out.println("Error!");
        }
        HuffmanTree huffman = new HuffmanTree();
        File file = new File("chars.txt");
        huffman.getChars(file);
    }
}
