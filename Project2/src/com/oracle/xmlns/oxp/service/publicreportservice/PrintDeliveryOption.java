
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrintDeliveryOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintDeliveryOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="printNumberOfCopy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="printOrientation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="printRange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="printSide" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="printTray" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="printerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintDeliveryOption", propOrder = {
    "printNumberOfCopy",
    "printOrientation",
    "printRange",
    "printSide",
    "printTray",
    "printerName"
})
public class PrintDeliveryOption {

    @XmlElement(required = true, nillable = true)
    protected String printNumberOfCopy;
    @XmlElement(required = true, nillable = true)
    protected String printOrientation;
    @XmlElement(required = true, nillable = true)
    protected String printRange;
    @XmlElement(required = true, nillable = true)
    protected String printSide;
    @XmlElement(required = true, nillable = true)
    protected String printTray;
    @XmlElement(required = true, nillable = true)
    protected String printerName;

    /**
     * Gets the value of the printNumberOfCopy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintNumberOfCopy() {
        return printNumberOfCopy;
    }

    /**
     * Sets the value of the printNumberOfCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintNumberOfCopy(String value) {
        this.printNumberOfCopy = value;
    }

    /**
     * Gets the value of the printOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOrientation() {
        return printOrientation;
    }

    /**
     * Sets the value of the printOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOrientation(String value) {
        this.printOrientation = value;
    }

    /**
     * Gets the value of the printRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintRange() {
        return printRange;
    }

    /**
     * Sets the value of the printRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintRange(String value) {
        this.printRange = value;
    }

    /**
     * Gets the value of the printSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintSide() {
        return printSide;
    }

    /**
     * Sets the value of the printSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintSide(String value) {
        this.printSide = value;
    }

    /**
     * Gets the value of the printTray property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintTray() {
        return printTray;
    }

    /**
     * Sets the value of the printTray property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintTray(String value) {
        this.printTray = value;
    }

    /**
     * Gets the value of the printerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterName() {
        return printerName;
    }

    /**
     * Sets the value of the printerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterName(String value) {
        this.printerName = value;
    }

}
