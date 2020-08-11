package com.github.curriculeon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author leon on 16/11/2018.
 */
public class Document implements DocumentInterface {

    private final FileWriter fileWriter;
    private final File file;

    public Document(String fileName) throws IOException {
        this(new File(fileName));
    }

    public Document(File file) throws IOException {
        this.file = file;
        this.fileWriter = new FileWriter(file);
    }

    @Override
    public void write(String contentToBeWritten) throws IOException {
        this.fileWriter.write(contentToBeWritten);
        fileWriter.flush();
    }

    @Override
    public void write(Integer lineNumber, String valueToBeWritten) {
    }

    @Override
    public String read(Integer lineNumber) throws IOException {
        return  null;
    }

    @Override
    public String read() throws IOException {
        String filePath = file.getPath();
        //String filePath = file.getAbsolutePath();
        // String filePath = file.getCanonicalPath();
        Path path = Paths.get(filePath);
        //String readFile = Files.readAllLines(path).get(0);
        String readFile = Files.readAllLines(file.toPath()).get(0);

        return readFile;
        //return null;
    }

    @Override
    public void replaceAll(String stringToReplace, String replacementString) {
    }

    @Override
    public void overWrite(String content) {
    }

    public List<String> toList() {
        return null;
    }

    @Override
    public File getFile() {
        return file;
        //return null;
    }

    @Override
    public String toString() {
        try {
            return read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
