package ru.geekbrains.homework09;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson09 {
    public static void main(String[] args) {
        //Первое задание
        try {
            System.out.println(
                    FileMethod.countSeq(Paths.get("src/main/resources/file/files_for_lesson09/File1.txt"), "ие")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Второе задание
        
    }
}
