package com.yacoding.dp.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author yaCoding
 * @create 2022-05-30 下午 3:52
 */

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:/test.text");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
        br.close();
    }

}
