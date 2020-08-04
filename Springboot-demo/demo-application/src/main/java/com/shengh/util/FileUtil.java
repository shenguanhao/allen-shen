package com.shengh.util;

import org.apache.logging.log4j.util.Strings;

import java.io.*;

public class FileUtil {
    public static void readFileByBytes(String fileName) throws Exception {
        File file = new File(fileName);
        InputStream in = null;
        StringBuffer sb = new StringBuffer();

        if (file.isFile() && file.exists()) {
            byte[] tempbytes = new byte[1024];
            int byteread = 0;
            in = new FileInputStream(file);
            while ((byteread = in.read(tempbytes)) != -1) {
                String str = new String(tempbytes, 0, byteread);
                sb.append(str);
            }
        }

        if(Strings.isNotEmpty(sb)){
            System.out.println(sb.toString());
        }
    }

    public static void readFileByLine(String name) throws Exception{
        try {
            File file = new File(name);
            InputStreamReader inputReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader bf = new BufferedReader(inputReader);
            // 按行读取字符串
            String str;
            while ((str = bf.readLine()) != null) {
                String s_iso88591 = new String(str.getBytes("utf-8"),"ISO-8859-1");
                str = new String(s_iso88591.getBytes("ISO-8859-1"),"utf-8");
                System.out.println(str);
            }
            bf.close();
            inputReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {
//        String fileName = "D:/1.properties";
//        //readFileByBytes(fileName);
//        readFileByLine(fileName);
        String a="12344afa";
        System.out.println(a.substring(-2));
    }
}
