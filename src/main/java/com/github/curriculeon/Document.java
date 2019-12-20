package com.github.curriculeon;

import java.io.*;
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
    public void write(String contentToBeWritten) {
    }

    @Override
    public void write(Integer lineNumber, String valueToBeWritten) {
    }

    @Override
    public String read(Integer lineNumber) {
        return null;
    }

    @Override
    public String read() {
        return null;
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
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
