
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
 *         &lt;element name="updateXLIFFForReportInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateXLIFFForReportInSessionReturn"
})
@XmlRootElement(name = "updateXLIFFForReportInSessionResponse")
public class UpdateXLIFFForReportInSessionResponse {

    protected boolean updateXLIFFForReportInSessionReturn;

    /**
     * Gets the value of the updateXLIFFForReportInSessionReturn property.
     * 
     */
    public boolean isUpdateXLIFFForReportInSessionReturn() {
        return updateXLIFFForReportInSessionReturn;
    }

    /**
     * Sets the value of the updateXLIFFForReportInSessionReturn property.
     * 
     */
    public void setUpdateXLIFFForReportInSessionReturn(boolean value) {
        this.updateXLIFFForReportInSessionReturn = value;
    }

}
