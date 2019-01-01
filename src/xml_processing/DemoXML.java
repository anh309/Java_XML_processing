package xml_processing;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DemoXML {
	public static void main(String[] args) {
		
		try {
			//create a DocumentBuilder
			DocumentBuilderFactory bF = DocumentBuilderFactory.newInstance();
			DocumentBuilder b = bF.newDocumentBuilder();
			
			//read file data.xml 
			File file = new File("data.xml");
			Document d = b.parse(file);
			
			//get and display name of root node => unit
			Element root = d.getDocumentElement();
			System.out.println(root.getNodeName());
			
			NodeList ls = root.getElementsByTagName("employee");
			Element nv0 = (Element)ls.item(0);
			
			String ten = nv0.getElementsByTagName("name").item(0).getTextContent();
			System.out.println(ten);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
