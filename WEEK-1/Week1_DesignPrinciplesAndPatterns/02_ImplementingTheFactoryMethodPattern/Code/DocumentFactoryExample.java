public class DocumentFactoryExample {
    public static void main(String[] args) {
        Creator wordCreator = new WordCreator();
        FileType wordFile = wordCreator.buildDocument();
        wordFile.display();

        Creator pdfCreator = new PdfCreator();
        FileType pdfFile = pdfCreator.buildDocument();
        pdfFile.display();

        Creator excelCreator = new ExcelCreator();
        FileType excelFile = excelCreator.buildDocument();
        excelFile.display();
    }
}

interface FileType {
    void display();
}

class WordFile implements FileType {
    public void display() {
        System.out.println("Launching Word File...");
    }
}

class PdfFile implements FileType {
    public void display() {
        System.out.println("Launching PDF File...");
    }
}

class ExcelFile implements FileType {
    public void display() {
        System.out.println("Launching Excel File...");
    }
}

abstract class Creator {
    public abstract FileType buildDocument();
}

class WordCreator extends Creator {
    public FileType buildDocument() {
        return new WordFile();
    }
}

class PdfCreator extends Creator {
    public FileType buildDocument() {
        return new PdfFile();
    }
}

class ExcelCreator extends Creator {
    public FileType buildDocument() {
        return new ExcelFile();
    }
}
