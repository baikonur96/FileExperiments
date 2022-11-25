import javax.sound.sampled.AudioFormat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        String path = "C:/Users/Diagnost/Desktop/";
        String out = path + "result/";
        String in = path + "archive.zip";
        FileInputStream inputStream = new FileInputStream(in);
        ZipInputStream zipInput = new ZipInputStream(inputStream);
        while (true){
            System.out.println("цикл 1");
            ZipEntry entry = zipInput.getNextEntry();
            System.out.println(entry);
            System.out.println(entry.getName());
            if (entry == null){
                break;
            }
            File file = new File(out + entry.getName());
            if (entry.isDirectory()){
                file.mkdirs();
            }else {
                byte[] bytes = zipInput.readAllBytes();
                Files.write(Paths.get(file.getAbsolutePath()), bytes, StandardOpenOption.CREATE);
//                file.createNewFile();
//                FileOutputStream  outputStream = new FileOutputStream(file);
//                byte[] buffer = new byte[1024];
//                int len;
//                while ((len = zipInput.read(buffer)) > 0){
//                    outputStream.write(buffer, 0, len);
                }
//                outputStream.flush();
//                outputStream.close();

 //           }
        }


















    }
// TODO: 25.11.2022  Архивация дерево папок в ZIP
//        String path = "C:/Users/Diagnost/Desktop/";
//        String in = path + "folder";
//        String out = path + "archive.zip";
//        FileOutputStream outputStream = new FileOutputStream(out);
//        ZipOutputStream zipOut = new ZipOutputStream(outputStream);
//        writeFileToZip(new File(in), zipOut, "");
//        zipOut.flush();
//        zipOut.close();
//        outputStream.close();
//    }
//    public  static void writeFileToZip(File file, ZipOutputStream zipOut, String path) throws Exception{
//        if (file.isDirectory()){
//            String folder = path + file.getName() + "/";
//            ZipEntry entry = new ZipEntry(folder);
//            zipOut.putNextEntry(entry);
//            zipOut.closeEntry();
//            File[] files = file.listFiles();
//            for (File subfile : files) {
//                writeFileToZip(subfile, zipOut, folder);
//            }
//            return;
//        }
//        ZipEntry entry = new ZipEntry(path + file.getName());
//        zipOut.putNextEntry(entry);
//        byte[] bytes = Files.readAllBytes((Paths.get(file.getAbsolutePath())));
//        zipOut.write(bytes);
//    }


    // TODO: 25.11.2022 Архивация Нескольких файлов в zip
//        String path = "C:/Users/Diagnost/Desktop/";
//       String[] in = {"IMG_3636.JPG", "text.txt", "output.txt"};
//       String out = path + "archive.zip";
//       FileOutputStream outputStream = new FileOutputStream(out);
//        ZipOutputStream zipOut = new ZipOutputStream(outputStream);
//        for (String fileName : in) {
//            File file = new File(path + fileName);
//            ZipEntry entry = new ZipEntry(file.getName());
//            zipOut.putNextEntry(entry);
//            byte[] data = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
//            zipOut.write(data);
//        }
//        zipOut.flush();
//        zipOut.close();
//        outputStream.close();


//       String path = "C:/Users/Diagnost/Desktop/";
//       String in = path + "IMG_3636.JPG";
//       String out = path + "archive.zip";
//       File file = new File(path);
//       FileOutputStream outputStream = new FileOutputStream(out);
//        ZipOutputStream zipOut = new ZipOutputStream(outputStream);
//        ZipEntry entry = new ZipEntry(new File(in).getName());
//        zipOut.putNextEntry(entry);
//        byte[] data = Files.readAllBytes(Paths.get(in));
//        zipOut.write(data);
//        zipOut.flush();
//        zipOut.close();
//        outputStream.close();

//       Files.writeString(Paths.get(path), "lol\n", StandardOpenOption.CREATE);

//       String data = Files.readString(Paths.get(path));
//        System.out.println(data);

//        FileOutputStream outputStream = new FileOutputStream(path);
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 100; i++){
//            builder.append(i + "\n");
//        }
//        outputStream.write(builder.toString().getBytes());
//        outputStream.flush();
//        outputStream.close();

//       StringBuilder builder = new StringBuilder();
//       FileInputStream inputStream = new FileInputStream(path);
//        while (true)
//        {
//            int code = inputStream.read();
//            if (code < 0){
//                break;
//            }
//            builder.append((char) code);
//        }
//        inputStream.close();
//        System.out.println(builder);



}