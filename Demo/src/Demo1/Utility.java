package Demo1;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Utility {

	public static void main(String args[]) throws IOException {

		Document doc = Jsoup.connect("https://www.cleartrip.com/").get();
		/*String titlee = doc.title();
		System.out.println(titlee);
		Element ele1 = doc.getElementById("FromTag");
		Element ele2 = doc.getElementById("ToTag");

		System.out.println("Element Data: " + ele1.id() + "  Element Text: "+ele1.tagName());
		System.out.println("Element Data: " + ele2.id() + "  Element Text: "+ele2.tagName());*/

	}
}
