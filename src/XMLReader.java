import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * This class handles the reading of the XML File.
 * @Author Mahmoud Daabas
 */
public class XMLReader {

    /**
     * Reads the XML File that exists in the path sent in the parameter then returns the target value.
     * @param filePath Path to the XML file that will be read.
     * @param id The id of the trans-unit to get the target value from.
     * @return The value of the target element if found. If not found, returns the default value "Value not found."
     */
    public String readXMLFile(String filePath, String id){
        //Default return value.
        final String defaultValue = "Value not found.";
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new File(filePath));
            NodeList nodeList = document.getElementsByTagName("trans-unit");

            //Loop through the node list to find the wanted value.
            for (int i = 0; i < nodeList.getLength(); i++) {
                String nodeValue = String.valueOf(nodeList.item(i).getAttributes().getNamedItem("id").getNodeValue());
                if (nodeValue.equals(id)){
                    Element element = (Element) nodeList.item(i);
                    String targetValue = element.getElementsByTagName("target").item(0).getTextContent();
                    return targetValue;
                }
            }

            return defaultValue;
        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.err.println("Error occurred while reading the XML File.");
            throw new RuntimeException(e);
        }
    }
}
