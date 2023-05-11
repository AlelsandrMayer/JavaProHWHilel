package net.hliznutsa.hw9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileLoggerConfigurationLoader {
    public static FileLoggerConfiguration load(String filePath) throws IOException {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String fileLine;
        String logFile = "";
        LoggingLevel logLevel = null;
        long maxSize = 0;
        String format = "";

        while ((fileLine = br.readLine()) != null) {
            String[] parts = fileLine.split(":");
            if (parts[0].equals("FILE")) {
                logFile = parts[1].trim();
            } else if (parts[0].equals("LEVEL")) {
                logLevel = LoggingLevel.valueOf(parts[1].trim());
            } else if (parts[0].equals("MAX-SIZE")) {
                maxSize = Long.parseLong(parts[1].trim());
            } else if (parts[0].equals("FORMAT")) {
                format = parts[1].trim();
            }
        }

        return new FileLoggerConfiguration(logFile, logLevel, maxSize, format);
    }
}