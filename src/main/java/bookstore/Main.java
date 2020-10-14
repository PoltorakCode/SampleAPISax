package bookstore;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Main {

	public static void main(String[] args) {
		buchladenSAX bs = new buchladenSAX();
		bs.display();
	}

}
