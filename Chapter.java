package SPBLab2;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
	private String name;
	private List<SubChapter> subchapters = new ArrayList<>();

	public Chapter(String name) {
		this.name = name;
	}

	public int createSubChapter(String b1) {
		SubChapter b = new SubChapter(b1);
		this.subchapters.add(b);
		return this.subchapters.size();

	}

	public SubChapter getSubChapter(int index) {
		SubChapter a = new SubChapter();
		for (int i = 0; i < this.subchapters.size(); ++i) {
			if (i == index) {
				return this.subchapters.get(i);
			}
		}
		return a;

	}

	public Chapter() {

	}

	@Override
	public String toString() {
		return "Chapter [name=" + name + "]";
	}

}
