package org.example.class21;

interface FileReader{
    void read();
}
// Created by Microsoft
public class ExcelFile implements FileReader{

    public void read(){
        System.out.println("Reading an Excel file");
    }
}

// Created by Notepad++
class TxtFile implements FileReader{
    public void read(){
        System.out.println("Reading Text file");
    }

}
