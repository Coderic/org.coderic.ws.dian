//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.16 a las 06:57:08 AM COT 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FirstShipmentAvailibilityDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestProposalAcceptanceDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PromotionalEventTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubmissionDateType;


/**
 * 
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *                &lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;
 *                &lt;ccts:DictionaryEntryName&gt;Promotional Event. Details&lt;/ccts:DictionaryEntryName&gt;
 *                &lt;ccts:Definition&gt;Agree can be renamed as PromotionalEvents&lt;/ccts:Definition&gt;
 *                &lt;ccts:ObjectClass&gt;Promotional Event&lt;/ccts:ObjectClass&gt;
 *             &lt;/ccts:Component&gt;
 * </pre>
 * 
 *          
 * 
 * <p>Clase Java para PromotionalEventType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionalEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PromotionalEventTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubmissionDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FirstShipmentAvailibilityDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestProposalAcceptanceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PromotionalSpecification" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalEventType", propOrder = {
    "promotionalEventTypeCode",
    "submissionDate",
    "firstShipmentAvailibilityDate",
    "latestProposalAcceptanceDate",
    "promotionalSpecification"
})
public class PromotionalEventType {

    @XmlElement(name = "PromotionalEventTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PromotionalEventTypeCodeType promotionalEventTypeCode;
    @XmlElement(name = "SubmissionDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubmissionDateType submissionDate;
    @XmlElement(name = "FirstShipmentAvailibilityDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FirstShipmentAvailibilityDateType firstShipmentAvailibilityDate;
    @XmlElement(name = "LatestProposalAcceptanceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestProposalAcceptanceDateType latestProposalAcceptanceDate;
    @XmlElement(name = "PromotionalSpecification", required = true)
    protected List<PromotionalSpecificationType> promotionalSpecification;

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Promotional Event. Promotional Event Type Code. Code&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;A code signifying the type of this promotional event. Examples can be: Holiday, Seasonal Event, Store Closing, Trade Item Introduction&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Promotional Event&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;Promotional Event Type Code&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link PromotionalEventTypeCodeType }
     *     
     */
    public PromotionalEventTypeCodeType getPromotionalEventTypeCode() {
        return promotionalEventTypeCode;
    }

    /**
     * Define el valor de la propiedad promotionalEventTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalEventTypeCodeType }
     *     
     */
    public void setPromotionalEventTypeCode(PromotionalEventTypeCodeType value) {
        this.promotionalEventTypeCode = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Promotional Event. Submission. Date&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;The date on which a proposal for this promotional event was submitted.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Promotional Event&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;Submission&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Date. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link SubmissionDateType }
     *     
     */
    public SubmissionDateType getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Define el valor de la propiedad submissionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionDateType }
     *     
     */
    public void setSubmissionDate(SubmissionDateType value) {
        this.submissionDate = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Promotional Event. First Shipment Availibility Date. Date&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;The first day that products will be available to ship from buyer to seller if the proposal for this promotional event is accepted.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Promotional Event&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;First Shipment Availibility Date&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Date. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link FirstShipmentAvailibilityDateType }
     *     
     */
    public FirstShipmentAvailibilityDateType getFirstShipmentAvailibilityDate() {
        return firstShipmentAvailibilityDate;
    }

    /**
     * Define el valor de la propiedad firstShipmentAvailibilityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstShipmentAvailibilityDateType }
     *     
     */
    public void setFirstShipmentAvailibilityDate(FirstShipmentAvailibilityDateType value) {
        this.firstShipmentAvailibilityDate = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Promotional Event. Latest_ Proposal Acceptance Date. Date&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;The deadline for acceptance of this promotional event.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Promotional Event&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTermQualifier&gt;Latest&lt;/ccts:PropertyTermQualifier&gt;
     *                      &lt;ccts:PropertyTerm&gt;Proposal Acceptance Date&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Date&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Date. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link LatestProposalAcceptanceDateType }
     *     
     */
    public LatestProposalAcceptanceDateType getLatestProposalAcceptanceDate() {
        return latestProposalAcceptanceDate;
    }

    /**
     * Define el valor de la propiedad latestProposalAcceptanceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestProposalAcceptanceDateType }
     *     
     */
    public void setLatestProposalAcceptanceDate(LatestProposalAcceptanceDateType value) {
        this.latestProposalAcceptanceDate = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Promotional Event. Promotional Specification&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;A specification for a promotional event.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;1..n&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Promotional Event&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;Promotional Specification&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Promotional Specification&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Promotional Specification&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                Gets the value of the promotionalSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionalSpecificationType }
     * 
     * 
     */
    public List<PromotionalSpecificationType> getPromotionalSpecification() {
        if (promotionalSpecification == null) {
            promotionalSpecification = new ArrayList<PromotionalSpecificationType>();
        }
        return this.promotionalSpecification;
    }

}
