package net.hliznutsa.hw9;

class FileLoggerConfiguration {
    private String file;
    private LoggingLevel level;
    private long maxSize;
    private String format;

    public FileLoggerConfiguration(String file, LoggingLevel level, long maxSize, String format) {
        this.file = file;
        this.level = level;
        this.maxSize = maxSize;
        this.format = format;
    }

    public String getFile() {

        return file;
    }

    public LoggingLevel getLevel() {

        return level;
    }

    public long getMaxSize() {

        return maxSize;
    }

    public String getFormat() {
        return format;
    }
}
