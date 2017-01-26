package test.java.utils;

import java.nio.file.FileSystems;

public class Path {

    public static String getPathDriver(){

        final String separator = FileSystems.getDefault().getSeparator();

        StringBuilder builder = new StringBuilder();
        builder.append("driver");
        builder.append(separator);
        return builder.toString();
    }
}
