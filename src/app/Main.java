package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Если Вы хотите перевести мили в киллометры нажмите 1, если киллометры в мили нажмите 2");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Введите расстояние");
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bufferedReader.readLine());
        if (n == 1) System.out.println(Convert_Miles_To_Kilometers(m));
        //if (n== 2) System.out.println(Convert_Kilometers_To_Miles(m));


    }
    public static double Convert_Miles_To_Kilometers(int miles){
        return miles/0.62137;
    }

}
