package org.example.class21;

/* Create a class File that will have the following behaviors: open(), edit(), close() and fields like name and size.
Edit and close are implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that
will provide specific implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text,
to open .doc file we need Microsoft word to be installed etc.Create a tester class and call all of the methods from
these classes.

 */

public abstract class File {

    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }
    public abstract void open();
    public void edit(){
        System.out.println("Editing file");
    }
    public void close(){
        System.out.println("Closing file");
    }
    public void prinInfo(){
        System.out.println(name+" "+size);
    }

}
class JavaFile extends File{


    public JavaFile(String name, int size) {
        super(name, size);
    }
    @Override
    public void open() {
        System.out.println("We need Notepad++ or sublime text to open JavaFile");
    }
}
class WordFile extends File{

    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("We need Microsoft Word to open WorFile");
    }
}
class PdfFile extends File{

    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF file");
    }
}