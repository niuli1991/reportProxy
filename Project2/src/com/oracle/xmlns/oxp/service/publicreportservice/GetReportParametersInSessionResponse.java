
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
 *         &lt;element name="getReportParametersInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ParamNameValues"/>
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
    "getReportParametersInSessionReturn"
})
@XmlRootElement(name = "getReportParametersInSessionResponse")
public class GetReportParametersInSessionResponse {

    @XmlElement(required = true)
    protected ParamNameValues getReportParametersInSessionReturn;

    /**
     * Gets the value of the getReportParametersInSessionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ParamNameValues }
     *     
     */
    public ParamNameValues getGetReportParametersInSessionReturn() {
        return getReportParametersInSessionReturn;
    }

    /**
     * Sets the value of the getReportParametersInSessionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamNameValues }
     *     
     */
    public void setGetReportParametersInSessionReturn(ParamNameValues value) {
        this.getReportParametersInSessionReturn = value;
    }

}
