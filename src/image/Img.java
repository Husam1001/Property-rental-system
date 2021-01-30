package image;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class Img {

    public static void main(String[] args) throws IOException {
       File file = new File("src/image/a.jpg");
//        try {
//
        File destination = new File("src/file",file.getName());

        FileUtils.copyFile(file,destination);
//            file.renameTo(destination);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        try {
//            copy(file,destination);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

        private static void copy(File src, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            // buffer size 1K
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buf)) > 0) {
                os.write(buf, 0, bytesRead);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
