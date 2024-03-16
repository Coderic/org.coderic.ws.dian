//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.16 a las 06:57:08 AM COT 
//


package oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2 package. 
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

    private final static QName _UBLExtensions_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "UBLExtensions");
    private final static QName _UBLExtension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "UBLExtension");
    private final static QName _ExtensionAgencyID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionAgencyID");
    private final static QName _ExtensionAgencyName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionAgencyName");
    private final static QName _ExtensionAgencyURI_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionAgencyURI");
    private final static QName _ExtensionContent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionContent");
    private final static QName _ExtensionReason_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionReason");
    private final static QName _ExtensionReasonCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionReasonCode");
    private final static QName _ExtensionURI_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionURI");
    private final static QName _ExtensionVersionID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionVersionID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UBLExtensionsType }
     * 
     */
    public UBLExtensionsType createUBLExtensionsType() {
        return new UBLExtensionsType();
    }

    /**
     * Create an instance of {@link UBLExtensionType }
     * 
     */
    public UBLExtensionType createUBLExtensionType() {
        return new UBLExtensionType();
    }

    /**
     * Create an instance of {@link ExtensionAgencyIDType }
     * 
     */
    public ExtensionAgencyIDType createExtensionAgencyIDType() {
        return new ExtensionAgencyIDType();
    }

    /**
     * Create an instance of {@link ExtensionAgencyNameType }
     * 
     */
    public ExtensionAgencyNameType createExtensionAgencyNameType() {
        return new ExtensionAgencyNameType();
    }

    /**
     * Create an instance of {@link ExtensionAgencyURIType }
     * 
     */
    public ExtensionAgencyURIType createExtensionAgencyURIType() {
        return new ExtensionAgencyURIType();
    }

    /**
     * Create an instance of {@link ExtensionContentType }
     * 
     */
    public ExtensionContentType createExtensionContentType() {
        return new ExtensionContentType();
    }

    /**
     * Create an instance of {@link ExtensionReasonType }
     * 
     */
    public ExtensionReasonType createExtensionReasonType() {
        return new ExtensionReasonType();
    }

    /**
     * Create an instance of {@link ExtensionReasonCodeType }
     * 
     */
    public ExtensionReasonCodeType createExtensionReasonCodeType() {
        return new ExtensionReasonCodeType();
    }

    /**
     * Create an instance of {@link ExtensionURIType }
     * 
     */
    public ExtensionURIType createExtensionURIType() {
        return new ExtensionURIType();
    }

    /**
     * Create an instance of {@link ExtensionVersionIDType }
     * 
     */
    public ExtensionVersionIDType createExtensionVersionIDType() {
        return new ExtensionVersionIDType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UBLExtensionsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UBLExtensionsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "UBLExtensions")
    public JAXBElement<UBLExtensionsType> createUBLExtensions(UBLExtensionsType value) {
        return new JAXBElement<UBLExtensionsType>(_UBLExtensions_QNAME, UBLExtensionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UBLExtensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UBLExtensionType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "UBLExtension")
    public JAXBElement<UBLExtensionType> createUBLExtension(UBLExtensionType value) {
        return new JAXBElement<UBLExtensionType>(_UBLExtension_QNAME, UBLExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionAgencyIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtensionAgencyIDType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionAgencyID")
    public JAXBElement<ExtensionAgencyIDType> createExtensionAgencyID(ExtensionAgencyIDType value) {
        return new JAXBElement<ExtensionAgencyIDType>(_ExtensionAgencyID_QNAME, ExtensionAgencyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionAgencyNameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtensionAgencyNameType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionAgencyName")
    public JAXBElement<ExtensionAgencyNameType> createExtensionAgencyName(ExtensionAgencyNameType value) {
        return new JAXBElement<ExtensionAgencyNameType>(_ExtensionAgencyName_QNAME, ExtensionAgencyNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionAgencyURIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtensionAgencyURIType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionAgencyURI")
    public JAXBElement<ExtensionAgencyURIType> createExtensionAgencyURI(ExtensionAgencyURIType value) {
        return new JAXBElement<ExtensionAgencyURIType>(_ExtensionAgencyURI_QNAME, ExtensionAgencyURIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionContentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtensionContentType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionContent")
    public JAXBElement<ExtensionContentType> createExtensionContent(ExtensionContentType value) {
        return new JAXBElement<ExtensionContentType>(_ExtensionContent_QNAME, ExtensionContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionReasonType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtensionReasonType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionReason")
    public JAXBElement<ExtensionReasonType> createExtensionReason(ExtensionReasonType value) {
        return new JAXBElement<ExtensionReasonType>(_ExtensionReason_QNAME, ExtensionReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionReasonCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtensionReasonCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionReasonCode")
    public JAXBElement<ExtensionReasonCodeType> createExtensionReasonCode(ExtensionReasonCodeType value) {
        return new JAXBElement<ExtensionReasonCodeType>(_ExtensionReasonCode_QNAME, ExtensionReasonCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionURIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtensionURIType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionURI")
    public JAXBElement<ExtensionURIType> createExtensionURI(ExtensionURIType value) {
        return new JAXBElement<ExtensionURIType>(_ExtensionURI_QNAME, ExtensionURIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionVersionIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtensionVersionIDType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionVersionID")
    public JAXBElement<ExtensionVersionIDType> createExtensionVersionID(ExtensionVersionIDType value) {
        return new JAXBElement<ExtensionVersionIDType>(_ExtensionVersionID_QNAME, ExtensionVersionIDType.class, null, value);
    }

}
