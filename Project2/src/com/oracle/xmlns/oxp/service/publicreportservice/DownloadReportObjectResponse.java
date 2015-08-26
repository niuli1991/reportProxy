
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
 *         &lt;element name="downloadReportObjectReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
    "downloadReportObjectReturn"
})
@XmlRootElement(name = "downloadReportObjectResponse")
public class DownloadReportObjectResponse {

    @XmlElement(required = true)
    protected byte[] downloadReportObjectReturn;

    /**
     * Gets the value of the downloadReportObjectReturn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDownloadReportObjectReturn() {
        return downloadReportObjectReturn;
    }

    /**
     * Sets the value of the downloadReportObjectReturn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDownloadReportObjectReturn(byte[] value) {
        this.downloadReportObjectReturn = ((byte[]) value);
    }

}
