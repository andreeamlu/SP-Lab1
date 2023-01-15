package SPBLab2;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String name;
	private List<Image> img = new ArrayList<>();
	private List<Paragraph> par = new ArrayList<>();
	private List<Table> tab = new ArrayList<>();

	public SubChapter(String name) {

		this.name = name;
	}

	public SubChapter() {

	}

	public void createNewParagraph(String b1) {
		Paragraph b = new Paragraph(b1);
		this.par.add(b);
	}

	public void createNewImage(String b1) {
		Image b = new Image(b1);
		this.img.add(b);
	}

	public void createNewTable(String b1) {
		Table b = new Table(b1);
		this.tab.add(b);
	}

	public void print() {
		System.out.println("Subchapter: " + this.name);
		for (int i = 0; i < this.par.size(); ++i) {
			System.out.println("Paragraph: " + this.par.get(i));
		}
		for (int i = 0; i < this.img.size(); ++i) {
			System.out.println("Image with name: " + this.img.get(i));
		}
		for (int i = 0; i < this.tab.size(); ++i) {
			System.out.println("Table with Title: " + this.tab.get(i));
		}
	}

	@Override
	public String toString() {
		return "SubChapter [name=" + name + "]";
	}

}
