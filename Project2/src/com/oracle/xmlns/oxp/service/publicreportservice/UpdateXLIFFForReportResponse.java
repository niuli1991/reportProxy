
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
 *         &lt;element name="updateXLIFFForReportReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "updateXLIFFForReportReturn"
})
@XmlRootElement(name = "updateXLIFFForReportResponse")
public class UpdateXLIFFForReportResponse {

    protected boolean updateXLIFFForReportReturn;

    /**
     * Gets the value of the updateXLIFFForReportReturn property.
     * 
     */
    public boolean isUpdateXLIFFForReportReturn() {
        return updateXLIFFForReportReturn;
    }

    /**
     * Sets the value of the updateXLIFFForReportReturn property.
     * 
     */
    public void setUpdateXLIFFForReportReturn(boolean value) {
        this.updateXLIFFForReportReturn = value;
    }

}
