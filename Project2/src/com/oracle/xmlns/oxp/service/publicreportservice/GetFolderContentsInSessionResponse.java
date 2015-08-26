
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
 *         &lt;element name="getFolderContentsInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}CatalogContents"/>
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
    "getFolderContentsInSessionReturn"
})
@XmlRootElement(name = "getFolderContentsInSessionResponse")
public class GetFolderContentsInSessionResponse {

    @XmlElement(required = true)
    protected CatalogContents getFolderContentsInSessionReturn;

    /**
     * Gets the value of the getFolderContentsInSessionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogContents }
     *     
     */
    public CatalogContents getGetFolderContentsInSessionReturn() {
        return getFolderContentsInSessionReturn;
    }

    /**
     * Sets the value of the getFolderContentsInSessionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogContents }
     *     
     */
    public void setGetFolderContentsInSessionReturn(CatalogContents value) {
        this.getFolderContentsInSessionReturn = value;
    }

}
