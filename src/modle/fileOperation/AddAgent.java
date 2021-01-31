package modle.fileOperation;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AddAgent {
    public static void main(String[] args) throws IOException {
        //addAgent("A1004","Hussein1004","Pass126");
        File file = new File("src/assets/files/property.txt");
        System.out.println(generateId(file));
    }

    public static boolean addAgent(String id, String userName, String password) throws IOException {
        File agentLogin = new File("src/modle.file/AgentLogin.txt");
        PrintWriter writer = new PrintWriter(new FileWriter(agentLogin, true));
        if (agentLogin.exists()) {
            writer.println(id + "<>" + userName + "<>" + password + "<>");
            writer.close();
            return true;
        } else System.out.println("File not Exist");
        return false;
    }



    /**
     * @param file to check the used id
     * @return unique id bashed on the give modle.file
     */
    public static int generateId(File file) throws FileNotFoundException {
        Scanner read = new Scanner(file);
        int randId = 0;
        read.useDelimiter("<>");
        ArrayList<Integer> id = new ArrayList<>();
        //read all id from the text modle.file ad store it to the arrayList
        while (read.hasNext()) {
            id.add(Integer.parseInt(read.next()));
            read.nextLine();
        }

        do {
            randId = (int) (Math.random() * (999999 - 999 + 1) + 999);
        } while (id.contains(randId));
        return randId;
    }
}
