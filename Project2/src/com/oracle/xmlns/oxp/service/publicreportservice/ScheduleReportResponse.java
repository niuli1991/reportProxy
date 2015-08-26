
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
 *         &lt;element name="scheduleReportReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "scheduleReportReturn"
})
@XmlRootElement(name = "scheduleReportResponse")
public class ScheduleReportResponse {

    @XmlElement(required = true)
    protected String scheduleReportReturn;

    /**
     * Gets the value of the scheduleReportReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleReportReturn() {
        return scheduleReportReturn;
    }

    /**
     * Sets the value of the scheduleReportReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleReportReturn(String value) {
        this.scheduleReportReturn = value;
    }

}
