import java.io.*;
import java.nio.charset.StandardCharsets;

public class DemoFile {
    public static void main(String[] args) throws IOException {
//Khai bao , tao file
        File file = new File("test.txt");
        if (!file.exists()){
            file.createNewFile();

        }
//Doc file
//        Sử dụng cho cả chữ cái, ký tự và ảnh...!
        FileInputStream fileInputStream = new FileInputStream(file);
        int c = fileInputStream.read();
        while ( c!=-1){
            System.out.print((char)c);
            c= fileInputStream.read();
        }
        fileInputStream.close();


//        Ghi vao File
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String write = " nice to meet you!";
        fileOutputStream.write(write.getBytes());
        fileOutputStream.close();

// Sử dụng FileReader để đọc file
//        Sử dụng chco các chữ cái , ký tự (ít dùng)
//        FileReader reader = new FileReader(file);
//        int d = reader.read();
//        while (d !=-1){
//            System.out.print((char) d);
//            d = reader.read();
//        }
//        reader.close();

//Ghi file bằng FileWrite
//        FileWriter writer = new FileWriter(file);
//        String e = " I am here!\n it is Việt Nam";
//        writer.write(e);
//        writer.close();
    }


}
