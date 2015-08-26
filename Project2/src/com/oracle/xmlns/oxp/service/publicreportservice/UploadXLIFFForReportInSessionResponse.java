
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
 *         &lt;element name="uploadXLIFFForReportInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "uploadXLIFFForReportInSessionReturn"
})
@XmlRootElement(name = "uploadXLIFFForReportInSessionResponse")
public class UploadXLIFFForReportInSessionResponse {

    protected boolean uploadXLIFFForReportInSessionReturn;

    /**
     * Gets the value of the uploadXLIFFForReportInSessionReturn property.
     * 
     */
    public boolean isUploadXLIFFForReportInSessionReturn() {
        return uploadXLIFFForReportInSessionReturn;
    }

    /**
     * Sets the value of the uploadXLIFFForReportInSessionReturn property.
     * 
     */
    public void setUploadXLIFFForReportInSessionReturn(boolean value) {
        this.uploadXLIFFForReportInSessionReturn = value;
    }

}
