/**
 * This class is the entry point of the program.
 * @author Mahmoud Daabas
 */
public class Main {
    public static void main(String[] args) {
        XMLReader xmlReader = new XMLReader();
        Writer writer = new Writer();

        //Pass the path to the XML file and the id of the trans-unit we want to get the target value from.
        String target = xmlReader.readXMLFile("src/resources/sma_gentext.xml", "42007");
        writer.writeValueToFile(target);
    }
}