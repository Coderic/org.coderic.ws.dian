//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.16 a las 06:57:08 AM COT 
//


package oasis.names.specification.ubl.schema.xsd.reminder_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.reminder_2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Reminder_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:Reminder-2", "Reminder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.reminder_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReminderType }
     * 
     */
    public ReminderType createReminderType() {
        return new ReminderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReminderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReminderType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:Reminder-2", name = "Reminder")
    public JAXBElement<ReminderType> createReminder(ReminderType value) {
        return new JAXBElement<ReminderType>(_Reminder_QNAME, ReminderType.class, null, value);
    }

}
