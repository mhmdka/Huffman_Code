package com.company;

import java.io.IOException;
import java.io.File;

public class Main {

    public static void main(String[] args) throws IOException {
	//this for testing file

        File file = new File("chars.txt");
        HuffmanTree huffman = new HuffmanTree();
        huffman.getChars(file);
    }
}
