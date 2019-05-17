package Demo2;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		Document doc = Jsoup.connect("http://example.com/").get();
		String title = doc.title();
		System.out.println(title);
	}

}
