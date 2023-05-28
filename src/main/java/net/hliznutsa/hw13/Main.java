package net.hliznutsa.hw13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileData file1 = new FileData("readme.md", 150, "/path/to/file");
        FileData file2 = new FileData("files.txt", 100, "/path/to/file/myfile");
        FileData file3 = new FileData("firstApp.java", 200, "/path/to/file");

        fileNavigator.add("/path/to/file", file1);
        fileNavigator.add("/path/to/file/myfile", file2);
        fileNavigator.add("/path/to/file", file3);


        List<FileData> files1 = fileNavigator.find("/path/to/file");
        System.out.println("Найденные файлы:");
        for (FileData file : files1) {
            System.out.println(file.getName());
        }

        List<FileData> files2 = fileNavigator.find("/path/to/file/myfile");
        System.out.println("Найденные файлы:");
        for (FileData file : files2) {
            System.out.println(file.getName());
        }

        int maxSize = 150;
        List<FileData> filteredFiles = fileNavigator.filterBySize(maxSize);
        System.out.println("Файлы, размер которых не превышает " + maxSize + " байт:");
        for (FileData file : filteredFiles) {
            System.out.println(file.getName());
        }

//        fileNavigator.remove("/path/to/file");

        List<FileData> sortedFiles = fileNavigator.sortBySize();
        System.out.println("Отсортированные файлы по размеру:");
        for (FileData file : sortedFiles) {
            System.out.println(file.getName() + " - " + file.getSize() + " байт");
        }
    }
}

