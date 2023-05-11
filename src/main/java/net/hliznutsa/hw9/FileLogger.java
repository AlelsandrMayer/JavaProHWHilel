package net.hliznutsa.hw9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

class FileLogger {
    private FileLoggerConfiguration config;
    private File logFile;
    private long currentSize;
    private BufferedWriter writer;

    public FileLogger(FileLoggerConfiguration config) throws IOException {
        this.config = config;
        this.logFile = new File(config.getFile());
        this.currentSize = logFile.length();
        this.writer = new BufferedWriter(new FileWriter(logFile, true));
    }

    public void debug(String message) throws IOException, FileMaxSizeReachedException {
        if (config.getLevel() == LoggingLevel.DEBUG) {
            String logMessage = String.format(config.getFormat(), LocalDateTime.now(), "DEBUG", message);
            writeLog(logMessage);
        }
    }

    public void info(String message) throws IOException, FileMaxSizeReachedException {
        if (config.getLevel() == LoggingLevel.DEBUG || config.getLevel() == LoggingLevel.INFO) {
            String logMessage = String.format(config.getFormat(), LocalDateTime.now(), "INFO", message);
            writeLog(logMessage);
        }
    }

    private void writeLog(String message) throws IOException {
        if (currentSize + message.length() > config.getMaxSize()) {
            String newFileName = "logs" + now() + ".txt";
            logFile.renameTo(new File(newFileName));
            logFile = new File(config.getFile());
            currentSize = 0;
            writer = new BufferedWriter(new FileWriter(logFile, true));
        }

        writer.write(message);
        writer.newLine();
        writer.flush();
        currentSize += message.length();
    }
}
