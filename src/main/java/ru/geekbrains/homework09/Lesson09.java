package ru.geekbrains.homework09;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Paths;

public class Lesson09 {
    public static void main(String[] args) {
        //Первое задание
        try {
            System.out.println(
                    FileMethod.countSeq(Paths.get("src/main/resources/file/files_for_lesson09/1/File1.txt"), "ие")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Второе задание
        try {
            FileMethod.joinFilesText(Paths.get("src/main/resources/file/files_for_lesson09/1"),
                    Paths.get("src/main/resources/file/files_for_lesson09/1/new1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Третье задание
        try {
            FileMethod.rmRf(Paths.get("src/main/resources/file/files_for_lesson09/2"));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
