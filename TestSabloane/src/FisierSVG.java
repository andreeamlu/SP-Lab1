import java.util.List;

public class FisierSVG extends Fisier {
    public FisierSVG(String fileName) {
        super(fileName);
        this.fileName += ".svg";
    }

    @Override
    public void add(List<Element> listaOfElements) {

    }

    @Override
    public int countTxtFiles() {
        return 0;
    }

    @Override
    public void accept(Visitor visitor){
    }
}