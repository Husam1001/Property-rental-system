package modle.Login;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
//        String seed = "ipNumber";
//        String myIpValue = "192.168.0.1";
//
//        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
//        encryptor.setPassword("hh");
//        String encrypted= encryptor.encrypt(myIpValue);
//        System.out.println(encrypted);
//
//        String decrypted = encryptor.decrypt(encrypted);
//        System.out.println(decrypted);
        File myfile=new File("src/file/myFile.txt");
//        PrintWriter out = new PrintWriter(new FileWriter(myfile, true));
//        for (int i=0;i<5;i++) {
//            out.print("Hello world");
//            out.append(',');
//        }
//        out.println("Hello using println");
//        out.print("Hello");
//        out.close();
//      //  FileReader myfile=new FileReader("src/file/myFile.txt");
//        BufferedReader out1=new BufferedReader(new FileReader(myfile));
//        String st;
//        while ((st = out1.readLine()) != null)
//
//        System.out.println(st.replace(',',' '));
        Scanner read=new Scanner(myfile);
        read.useDelimiter("%%%%");
        try {
        while (read.hasNext()){
            System.out.println(read.next());
            System.out.println(read.next());
            System.out.println(read.next());
        }
        }catch (Exception exception){ System.out.println(exception); }
}
}
