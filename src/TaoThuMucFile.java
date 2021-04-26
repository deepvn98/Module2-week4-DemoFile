import java.io.*;

public class TaoThuMucFile {
    public static void main(String[] args) throws IOException {
        File java = new File("java");
        java.mkdir();
        if (!java.exists()){
            java.createNewFile();
        }
        File file = new File("java/test1.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileReader reader = new FileReader(file);
        int c = reader.read();
        while (c != -1){
            System.out.print((char)c);
             c = reader.read();

        }
        reader.close();

        FileWriter writer = new FileWriter(file);
        String d = "me too! nice to meet you too!";
        writer.write(d);
        writer.close();

    }
}
