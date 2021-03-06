package by.it.poprugo.jd02_07_mine;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class ValidatorXSD {
    public static void main(String[] args) {
        String language = XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI;
        String filename = "D:\\IT\\JD_2018\\JD2018-03-22\\src\\by\\it\\poprugo\\jd02_07_mine\\Order+XSD.xml";
        String schemaName = "D:\\IT\\JD_2018\\JD2018-03-22\\src\\by\\it\\poprugo\\jd02_07_mine\\Order.xsd";
        SchemaFactory schemaFactory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaName);
        try {
            Schema schema = schemaFactory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(filename);
            validator.validate(source);
            System.out.println("OK");

        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
