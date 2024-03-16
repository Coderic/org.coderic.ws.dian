
package org.coderic.ws.dian.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfNumberRangeResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNumberRangeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberRangeResponse" type="{http://schemas.datacontract.org/2004/07/NumberRangeResponse}NumberRangeResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNumberRangeResponse", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", propOrder = {
    "numberRangeResponse"
})
public class ArrayOfNumberRangeResponse {

    @XmlElement(name = "NumberRangeResponse", nillable = true)
    protected List<NumberRangeResponse> numberRangeResponse;

    /**
     * Gets the value of the numberRangeResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the numberRangeResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberRangeResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberRangeResponse }
     * 
     * 
     */
    public List<NumberRangeResponse> getNumberRangeResponse() {
        if (numberRangeResponse == null) {
            numberRangeResponse = new ArrayList<NumberRangeResponse>();
        }
        return this.numberRangeResponse;
    }

}
