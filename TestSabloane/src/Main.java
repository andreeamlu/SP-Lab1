import java.util.ArrayList;

import static java.util.List.of;

public class Main {
    public static void main(String[] args) {
        Element subDirectory = new Director(new ArrayList<>(of(
                new FisierSVG("ceva"),
                new FisierTXT("informatii"))), "Diverse");
        Element firstDirectory = new Director(new ArrayList<>(of(new FisierMP3("muzica"),
                subDirectory)), "Melodii");
        Visitor countVisitor = new CountVisitor();
        countVisitor.visitElement(firstDirectory);
    }
}