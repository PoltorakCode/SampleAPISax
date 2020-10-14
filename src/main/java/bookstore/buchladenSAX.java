package bookstore;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class buchladenSAX {

	public void display() {
		// TODO Auto-generated method stub

		try {
			SAXParserFactory fact = SAXParserFactory.newInstance();
			SAXParser sp = fact.newSAXParser();
			sp.parse("C:\\Users\\Nessi\\eclipse-workspace\\xml-sample\\buchladen.xml", new ProductHandler());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	private class ProductHandler extends DefaultHandler{

		private int count = 0;
		private String tagName = "";
		private String tagName2 = "";
		boolean bprice = false;
		boolean btitel = false;
		
		@Override
		public void characters(char[] chars, int startindex, int endindex) throws SAXException {
			//test den wert des ganzen ladens/artikel im laden
//		if(bprice) {		
//			String z = new String(chars, startindex, endindex);
//			Double i = Double.valueOf("z");	
//			bprice = false;		
//			if(bcount) {
//				String x =new String(chars, startindex, endindex);
//				int y = Integer.parseInt(x);
//				bcount = false;	
//				Double ergebnis = i*y;			
//				System.out.println("Preis all dieser Exemplare: " +ergebnis);			
//			}
//		}
			//wenn er titel sieht dann soll er sie ausgeben
			if(btitel) {		
				String z = new String(chars, startindex, endindex);
				System.out.println("Titel: " +z);
				btitel = false;	
			}

		
		}

		//Event= endElement
		//und die soll er zählen (bzw immer wenn ein book endet)
		@Override
		public void endElement(String nuri, String localname, String qualifiedname) throws SAXException {
			tagName = qualifiedname;
			if(qualifiedname.equals("book")) {this.count++;}
		}

		//wenn das Dokument zuende ist soll er das ergebene ausgeben:
		@Override
		public void endDocument() throws SAXException {
			System.out.println("Number of books: " +this.count);
		}

		//Event = startElement
		@Override
		public void startElement(String nuri, String localname, String qualifiedname, Attributes attributes)
				throws SAXException {
			if(qualifiedname.equalsIgnoreCase("price")) {bprice=true;}
			if(qualifiedname.equalsIgnoreCase("title")) {btitel=true;}
			
			//tagName2 = qualifiedname;
			//if(qualifiedname.equals("price")) {tagName2=qualifiedname.valueOf(d);}
		}
		
		
	}
	
}
