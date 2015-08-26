
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
 *         &lt;element name="hasReportAccessReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "hasReportAccessReturn"
})
@XmlRootElement(name = "hasReportAccessResponse")
public class HasReportAccessResponse {

    protected boolean hasReportAccessReturn;

    /**
     * Gets the value of the hasReportAccessReturn property.
     * 
     */
    public boolean isHasReportAccessReturn() {
        return hasReportAccessReturn;
    }

    /**
     * Sets the value of the hasReportAccessReturn property.
     * 
     */
    public void setHasReportAccessReturn(boolean value) {
        this.hasReportAccessReturn = value;
    }

}
