
package com.oracle.xmlns.oxp.service.publicreportservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BIPDataSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BIPDataSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JDBCDataSource" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}JDBCDataSource"/>
 *         &lt;element name="fileDataSource" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}FileDataSource"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIPDataSource", propOrder = {
    "jdbcDataSource",
    "fileDataSource"
})
public class BIPDataSource {

    @XmlElement(name = "JDBCDataSource", required = true, nillable = true)
    protected JDBCDataSource jdbcDataSource;
    @XmlElement(required = true, nillable = true)
    protected FileDataSource fileDataSource;

    /**
     * Gets the value of the jdbcDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link JDBCDataSource }
     *     
     */
    public JDBCDataSource getJDBCDataSource() {
        return jdbcDataSource;
    }

    /**
     * Sets the value of the jdbcDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JDBCDataSource }
     *     
     */
    public void setJDBCDataSource(JDBCDataSource value) {
        this.jdbcDataSource = value;
    }

    /**
     * Gets the value of the fileDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link FileDataSource }
     *     
     */
    public FileDataSource getFileDataSource() {
        return fileDataSource;
    }

    /**
     * Sets the value of the fileDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDataSource }
     *     
     */
    public void setFileDataSource(FileDataSource value) {
        this.fileDataSource = value;
    }

}
