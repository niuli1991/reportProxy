
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
 *         &lt;element name="hasReportAccessInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "hasReportAccessInSessionReturn"
})
@XmlRootElement(name = "hasReportAccessInSessionResponse")
public class HasReportAccessInSessionResponse {

    protected boolean hasReportAccessInSessionReturn;

    /**
     * Gets the value of the hasReportAccessInSessionReturn property.
     * 
     */
    public boolean isHasReportAccessInSessionReturn() {
        return hasReportAccessInSessionReturn;
    }

    /**
     * Sets the value of the hasReportAccessInSessionReturn property.
     * 
     */
    public void setHasReportAccessInSessionReturn(boolean value) {
        this.hasReportAccessInSessionReturn = value;
    }

}
