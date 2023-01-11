import java.util.List;

public class FisierTXT extends Fisier {
    public FisierTXT(String fileName) {
        super(fileName);
        this.fileName += ".txt";
    }

    @Override
    public void add(List<Element> listaOfElements) {

    }

    @Override
    public int countTxtFiles() {
        return 1;
    }

    @Override
    public void accept(Visitor visitor){
    }
}