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
            StringBuilder builder = new StringBuilder();
            while ((readByte = br.read()) != -1) {
                builder.append((char) readByte);
            }
            System.out.println(builder.toString());
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try {
            StringBuilder builder = new StringBuilder();
            br = new BufferedReader(new FileReader(file));
            String line = null;
            System.out.println("Lendo apenas as 2 primeiras linhas:");
            int index = 0;
            do {
                line = br.readLine();
                index ++;
                builder.append(line + "\n");
            } while (line != null && index < 2);
            System.out.println(builder.toString());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("===== Fim ler duas linhas");
        // Usando new IO
        String arquivo = Files.readString(Path.of(FILE_PATH));
        System.out.println(arquivo);
        Files.readAllLines(Path.of(FILE_PATH)).forEach(System.out::println);
    }
}
