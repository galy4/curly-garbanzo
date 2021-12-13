package com.luxoft.files;

import java.io.*;

public class FileExample {

    public static void main(String[] args) throws IOException {

        File file1 = new File("~/нужное/work/ИТМО/java_projects/jvm/curly-garbanzo/src/main/java/com/luxoft/files/testFile.txt");

        File file2 = new File("src/main/java/com/luxoft/files/testFile.txt");

        final String directory = "src/main/java/com/luxoft/files";

        File file3 = new File(directory, "testFile.txt");

        printFileProperties(file2);
        System.out.println("-------------------");
//        printFileProperties(file3);
        getAllFiles(file3);
        System.out.println("-------------------");
        fileFilter(file2);
        System.out.println("-------------------");
        readFile(file2);
        readFileAnother(file2);
        System.out.println("-------------------");
//        writeToFile("Hello", file3);
        appendToFile("Whaaat", file2);

    }

    private static void printFileProperties(File file){
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath() + "/n relative path: " + file.getPath());
        System.out.println(file.getParent());
        System.out.println("Can read? :" + file.canRead());
        System.out.println("file exists? :" + file.exists());
        System.out.println("file size: " + file.length());
        System.out.println(file.lastModified());
        file.isDirectory();

    }

    private static void getAllFiles(File file){
        File dir = new File(file.getParent());
        File[] files = dir.listFiles();
        for(File f:files)
            System.out.println(f.getName());
    }

    //FileFilter
    private static void fileFilter(File file){
        File dir = new File(file.getParent());
        File[] files = dir.listFiles();
        FileFilter txtFilter = (f)->{
            return (f.getName().endsWith(".txt") || f.getName().endsWith(".png"));
        };
        for(File file1:files){
            if(txtFilter.accept(file1))
                System.out.println(file1.getName());
        }
    }

    //read file
    private static void readFile(File file) throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line!=null){
            System.out.println(line);
            line = reader.readLine();
        }
    }

    //another one
    private static void readFileAnother(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        System.out.println("File size: " + fis.available());
        int i = 0;
        while((i = fis.read())!=-1)
            System.out.print((char)i);
        fis.close();

        //read file as bytes array
//        byte[] bytes = new byte[fis.available()];
//        fis.read(bytes, 0, fis.available());
    }

    public static void writeToFile(String s, File file) throws IOException{
        FileOutputStream fos = new FileOutputStream("src/main/java/com/luxoft/files/testFile.txt");
        byte[] buffer = s.getBytes();
        fos.write(buffer, 0, buffer.length);
        fos.close();
    }

    private static void appendToFile(String s, File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(file)
        );
        StringBuilder builder = new StringBuilder();
        String line = bufferedReader.readLine();
        while (line!=null){
            builder.append(line);
            builder.append(System.lineSeparator());
            line = bufferedReader.readLine();
        }
        builder.append(s);

        FileOutputStream fos = new FileOutputStream(file);
        byte[] buffer = builder.toString().getBytes();
        fos.write(buffer, 0, buffer.length);
        fos.close();
    }


}
