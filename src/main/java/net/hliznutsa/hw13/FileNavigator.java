package net.hliznutsa.hw13;

import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        fileMap = new HashMap<>();
    }

    public void add(String path, FileData fileData) {
        if (!path.equals(fileData.getPath())) {
            System.out.println("Ошибка: путь-ключ не соответствует пути файла");
            return;
        }
        if (fileMap.containsKey(path)) {
            List<FileData> fileList = fileMap.get(path);
            fileList.add(fileData);
        } else {
            List<FileData> fileList = new ArrayList<>();
            fileList.add(fileData);
            fileMap.put(path, fileList);
        }
    }

    public List<FileData> find(String path) {
        return fileMap.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(int maxSize) {
        List<FileData> filteredFiles = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            for (FileData fileData : fileList) {
                if (fileData.getSize() <= maxSize) {
                    filteredFiles.add(fileData);
                }
            }
        }
        return filteredFiles;
    }

    public void remove(String path) {
        fileMap.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortedFiles = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            sortedFiles.addAll(fileList);
        }
        sortedFiles.sort(Comparator.comparingInt(FileData::getSize));
        return sortedFiles;
    }
}
