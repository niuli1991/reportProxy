
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateFormatsLabelValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateFormatsLabelValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listOfTemplateFormatLabelValue" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfTemplateFormatLabelValue"/>
 *         &lt;element name="templateAvailableLocales" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfString"/>
 *         &lt;element name="templateID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateFormatsLabelValues", propOrder = {
    "listOfTemplateFormatLabelValue",
    "templateAvailableLocales",
    "templateID",
    "templateType",
    "templateURL"
})
public class TemplateFormatsLabelValues {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfTemplateFormatLabelValue listOfTemplateFormatLabelValue;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString templateAvailableLocales;
    @XmlElement(required = true, nillable = true)
    protected String templateID;
    @XmlElement(required = true, nillable = true)
    protected String templateType;
    @XmlElement(required = true, nillable = true)
    protected String templateURL;

    /**
     * Gets the value of the listOfTemplateFormatLabelValue property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTemplateFormatLabelValue }
     *     
     */
    public ArrayOfTemplateFormatLabelValue getListOfTemplateFormatLabelValue() {
        return listOfTemplateFormatLabelValue;
    }

    /**
     * Sets the value of the listOfTemplateFormatLabelValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTemplateFormatLabelValue }
     *     
     */
    public void setListOfTemplateFormatLabelValue(ArrayOfTemplateFormatLabelValue value) {
        this.listOfTemplateFormatLabelValue = value;
    }

    /**
     * Gets the value of the templateAvailableLocales property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getTemplateAvailableLocales() {
        return templateAvailableLocales;
    }

    /**
     * Sets the value of the templateAvailableLocales property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setTemplateAvailableLocales(ArrayOfString value) {
        this.templateAvailableLocales = value;
    }

    /**
     * Gets the value of the templateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateID() {
        return templateID;
    }

    /**
     * Sets the value of the templateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateID(String value) {
        this.templateID = value;
    }

    /**
     * Gets the value of the templateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * Sets the value of the templateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateType(String value) {
        this.templateType = value;
    }

    /**
     * Gets the value of the templateURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateURL() {
        return templateURL;
    }

    /**
     * Sets the value of the templateURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateURL(String value) {
        this.templateURL = value;
    }

}
