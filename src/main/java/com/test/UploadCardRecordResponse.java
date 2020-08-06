
package com.test;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UploadCardRecordResult" type="{http://tempuri.org/}ProcessedResultsOfString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uploadCardRecordResult"
})
@XmlRootElement(name = "UploadCardRecordResponse")
public class UploadCardRecordResponse {

    @XmlElement(name = "UploadCardRecordResult")
    protected ProcessedResultsOfString uploadCardRecordResult;

    /**
     * Gets the value of the uploadCardRecordResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessedResultsOfString }
     *     
     */
    public ProcessedResultsOfString getUploadCardRecordResult() {
        return uploadCardRecordResult;
    }

    /**
     * Sets the value of the uploadCardRecordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessedResultsOfString }
     *     
     */
    public void setUploadCardRecordResult(ProcessedResultsOfString value) {
        this.uploadCardRecordResult = value;
    }

}
