import java.util.List;

public class FisierMP3 extends Fisier {
    public FisierMP3(String fileName) {
        super(fileName);
        this.fileName += ".mp3";
    }

    @Override
    public void add(List<Element> listaOfElements) {

    }

    @Override
    public int countTxtFiles() {
        return 0;
    }

    @Override
    public void accept(Visitor visitor)
    {}
}