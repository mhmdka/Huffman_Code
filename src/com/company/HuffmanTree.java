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
        this.countHolder= new Node[26];
        Node temp;
        int ch;
        int counter=0;
        int i=0;
        for(char a:"abcdefghijklmnopqrstuvwxyz".toCharArray()){
            reader = new BufferedReader(new FileReader(file));
            char toSearch = a;
            counter=0;
            while((ch=reader.read())!=-1){
                if(a==(char)ch){
                    counter++;
                }
            }if(counter>0) {
                temp = new Node();
                temp.setName(toSearch);
                temp.setCount(counter);
                countHolder[i] = temp;
                i++;
            }
        }
        Arrays.sort(countHolder);
    }

}
