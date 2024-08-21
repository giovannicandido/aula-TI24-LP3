package br.org.fundatec.solidaula.model.openfile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class OpenFileMain {
    private static final String FILE_PATH = "e:\\test.txt";
    private static final String FILE_BASE_PATH = "e:\\files";

    public static void main(String[] args) throws IOException {

        File file = new File(FILE_PATH);
        // Exemplo de Interface Segregation
        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println("file content: ");
        int readByte = 0;
        try {

            while ((readByte = br.read()) != -1) {
                System.out.print((char) readByte);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        // Usando new IO
        String arquivo = Files.readString(Path.of(FILE_PATH));
    }
}
