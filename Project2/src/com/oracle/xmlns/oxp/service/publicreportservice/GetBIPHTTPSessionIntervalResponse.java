
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getBIPHTTPSessionIntervalReturn" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getBIPHTTPSessionIntervalReturn"
})
@XmlRootElement(name = "getBIPHTTPSessionIntervalResponse")
public class GetBIPHTTPSessionIntervalResponse {

    protected int getBIPHTTPSessionIntervalReturn;

    /**
     * Gets the value of the getBIPHTTPSessionIntervalReturn property.
     * 
     */
    public int getGetBIPHTTPSessionIntervalReturn() {
        return getBIPHTTPSessionIntervalReturn;
    }

    /**
     * Sets the value of the getBIPHTTPSessionIntervalReturn property.
     * 
     */
    public void setGetBIPHTTPSessionIntervalReturn(int value) {
        this.getBIPHTTPSessionIntervalReturn = value;
    }

}
