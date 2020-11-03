package ru.geekbrains.homework09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMethod {
    public static int countSeq(Path filePath, String seq) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
            StringBuilder str = new StringBuilder();
            int count = 0;
            int nextChar;
            while ((nextChar = reader.read()) != -1) {
                if (str.length() < seq.length()) {
                    str.append((char) nextChar);
                    continue;
                }
                if (str.toString().equals(seq))
                    count++;
                str.deleteCharAt(0);
                str.append((char) nextChar);
            }
            return count;
        }
    }

    public static void joinFilesText(Path dirPath, Path newFilePath) throws IOException {
        Files.createFile(newFilePath);
        try (BufferedWriter writer = Files.newBufferedWriter(newFilePath, StandardCharsets.UTF_8)) {
            for (File file : dirPath.toFile().listFiles()) {
                if (!file.isDirectory()) {
                    try (BufferedReader reader = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8)) {
                        while (reader.ready())
                            writer.write(reader.readLine() + "\n");
                    }
                }
            }
            System.out.println("Сшивание завершено");
        }
    }

    public static void rmRf(Path path) throws NullPointerException {
        for (File file : path.toFile().listFiles()) {
            if (file.isDirectory())
                rmRf(file.toPath());
            else {
                System.out.println("Файл " + file.getName() + " удалён");
                file.delete();
            }
        }
        System.out.println("Папка " + String.valueOf(path.getFileName()) + " удалена");
        path.toFile().delete();
//        System.out.println("Папка " + String.valueOf(path.getFileName()) + " удалена");
//        path.toFile().delete();
    }
}
