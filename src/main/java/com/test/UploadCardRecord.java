
package com.test;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardRecord" type="{http://tempuri.org/}CardRecord" minOccurs="0"/&gt;
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
    "cardRecord"
})
@XmlRootElement(name = "UploadCardRecord")
public class UploadCardRecord {

    protected CardRecord cardRecord;

    /**
     * Gets the value of the cardRecord property.
     * 
     * @return
     *     possible object is
     *     {@link CardRecord }
     *     
     */
    public CardRecord getCardRecord() {
        return cardRecord;
    }

    /**
     * Sets the value of the cardRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRecord }
     *     
     */
    public void setCardRecord(CardRecord value) {
        this.cardRecord = value;
    }

}
