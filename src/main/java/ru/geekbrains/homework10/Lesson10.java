package ru.geekbrains.homework10;

import javax.swing.*;
import java.io.IOException;

public class Lesson10 {
    public static void main(String[] args) {
        //первое задание
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new Server(8189);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Client();
            }
        });
        //второе задание
        try {
            OkHttpRequest.Request("https://ya.ru");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
