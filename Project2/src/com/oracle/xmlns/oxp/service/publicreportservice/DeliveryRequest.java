
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryChannels" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}DeliveryChannels"/>
 *         &lt;element name="documentData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="dynamicDataSource" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}BIPDataSource"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryRequest", propOrder = {
    "contentType",
    "deliveryChannels",
    "documentData",
    "dynamicDataSource"
})
public class DeliveryRequest {

    @XmlElement(required = true, nillable = true)
    protected String contentType;
    @XmlElement(required = true, nillable = true)
    protected DeliveryChannels deliveryChannels;
    @XmlElement(required = true, nillable = true)
    protected byte[] documentData;
    @XmlElement(required = true, nillable = true)
    protected BIPDataSource dynamicDataSource;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the deliveryChannels property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryChannels }
     *     
     */
    public DeliveryChannels getDeliveryChannels() {
        return deliveryChannels;
    }

    /**
     * Sets the value of the deliveryChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryChannels }
     *     
     */
    public void setDeliveryChannels(DeliveryChannels value) {
        this.deliveryChannels = value;
    }

    /**
     * Gets the value of the documentData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocumentData() {
        return documentData;
    }

    /**
     * Sets the value of the documentData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocumentData(byte[] value) {
        this.documentData = ((byte[]) value);
    }

    /**
     * Gets the value of the dynamicDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link BIPDataSource }
     *     
     */
    public BIPDataSource getDynamicDataSource() {
        return dynamicDataSource;
    }

    /**
     * Sets the value of the dynamicDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BIPDataSource }
     *     
     */
    public void setDynamicDataSource(BIPDataSource value) {
        this.dynamicDataSource = value;
    }

}
