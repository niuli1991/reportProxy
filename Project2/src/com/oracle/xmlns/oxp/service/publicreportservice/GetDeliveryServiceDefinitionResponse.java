
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getDeliveryServiceDefinitionReturn" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}DeliveryServiceDefinition"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDeliveryServiceDefinitionReturn"
})
@XmlRootElement(name = "getDeliveryServiceDefinitionResponse")
public class GetDeliveryServiceDefinitionResponse {

    @XmlElement(required = true)
    protected DeliveryServiceDefinition getDeliveryServiceDefinitionReturn;

    /**
     * Gets the value of the getDeliveryServiceDefinitionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryServiceDefinition }
     *     
     */
    public DeliveryServiceDefinition getGetDeliveryServiceDefinitionReturn() {
        return getDeliveryServiceDefinitionReturn;
    }

    /**
     * Sets the value of the getDeliveryServiceDefinitionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryServiceDefinition }
     *     
     */
    public void setGetDeliveryServiceDefinitionReturn(DeliveryServiceDefinition value) {
        this.getDeliveryServiceDefinitionReturn = value;
    }

}
