package com.example.demo1;

public class OutputFile
{
    String path;

    OutputFile(String path)
    {
        this.path = path;
    }
    OutputFile()
    {
        this.path = "..//";
    }

    public String getPath() {
        return path;
    }
}
