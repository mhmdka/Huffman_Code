package com.company;
import java.io.*;
import java.util.Arrays;


public class HuffmanTree {
    private Node root;
    private Node[] countHolder;

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void getChars(File file) throws IOException {
        BufferedReader reader;
        int [] numberOfCharacters= new int[26];
        //Node temp;
        int ch;
        int counter=0;
        int i=0;
        int j = 97;
        for(char a:"abcdefghijklmnopqrstuvwxyz".toCharArray()){
            reader = new BufferedReader(new FileReader(file));
            char toSearch = a;
            counter=0;
            while((ch=reader.read())!=-1){
                if(a==(char)ch){
                    counter++;
                }
            }
                numberOfCharacters[i] = counter;        //this will show me which character has a certain value
                i++;

        }
        PrintWriter writer = new PrintWriter("output.txt");

        for(i = 0;i<numberOfCharacters.length;i++){
            writer.println((char)j+"-->"+numberOfCharacters[i]);
            j++;
        }
        writer.close();
        //Arrays.sort(countHolder);
    }

}
