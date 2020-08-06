
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
 *         &lt;element name="workerInfo" type="{http://tempuri.org/}WorkerInfo" minOccurs="0"/&gt;
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
    "workerInfo"
})
@XmlRootElement(name = "SetWorkerInfo")
public class SetWorkerInfo {

    protected WorkerInfo workerInfo;

    /**
     * Gets the value of the workerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WorkerInfo }
     *     
     */
    public WorkerInfo getWorkerInfo() {
        return workerInfo;
    }

    /**
     * Sets the value of the workerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkerInfo }
     *     
     */
    public void setWorkerInfo(WorkerInfo value) {
        this.workerInfo = value;
    }

}
