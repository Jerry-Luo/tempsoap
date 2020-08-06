
package com.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="projectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="teamId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="workerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isTeamLeader" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="workRole" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="workType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="corpType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faceImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="verifyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leaderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="leaderPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="healthImg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="healthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="livingAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emergencyContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emergencyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankIDCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerInfo", propOrder = {
    "idCardNumber",
    "projectCode",
    "corpCode",
    "corpId",
    "teamId",
    "workerName",
    "isTeamLeader",
    "workRole",
    "workType",
    "corpType",
    "gender",
    "birthday",
    "nation",
    "address",
    "faceImage",
    "cellPhone",
    "verifyName",
    "leaderName",
    "leaderPhoneNum",
    "healthImg",
    "healthCode",
    "livingAdress",
    "emergencyContact",
    "emergencyPhone",
    "bank",
    "bankIDCard"
})
public class WorkerInfo {

    protected String idCardNumber;
    protected String projectCode;
    protected String corpCode;
    protected int corpId;
    protected int teamId;
    protected String workerName;
    protected int isTeamLeader;
    protected int workRole;
    protected String workType;
    protected int corpType;
    protected int gender;
    protected String birthday;
    protected String nation;
    protected String address;
    protected String faceImage;
    protected String cellPhone;
    protected String verifyName;
    protected String leaderName;
    protected String leaderPhoneNum;
    protected String healthImg;
    protected String healthCode;
    protected String livingAdress;
    protected String emergencyContact;
    protected String emergencyPhone;
    @XmlElement(name = "Bank")
    protected String bank;
    @XmlElement(name = "BankIDCard")
    protected String bankIDCard;

    /**
     * Gets the value of the idCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNumber() {
        return idCardNumber;
    }

    /**
     * Sets the value of the idCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNumber(String value) {
        this.idCardNumber = value;
    }

    /**
     * Gets the value of the projectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * Sets the value of the projectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * Gets the value of the corpCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpCode() {
        return corpCode;
    }

    /**
     * Sets the value of the corpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpCode(String value) {
        this.corpCode = value;
    }

    /**
     * Gets the value of the corpId property.
     * 
     */
    public int getCorpId() {
        return corpId;
    }

    /**
     * Sets the value of the corpId property.
     * 
     */
    public void setCorpId(int value) {
        this.corpId = value;
    }

    /**
     * Gets the value of the teamId property.
     * 
     */
    public int getTeamId() {
        return teamId;
    }

    /**
     * Sets the value of the teamId property.
     * 
     */
    public void setTeamId(int value) {
        this.teamId = value;
    }

    /**
     * Gets the value of the workerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkerName() {
        return workerName;
    }

    /**
     * Sets the value of the workerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkerName(String value) {
        this.workerName = value;
    }

    /**
     * Gets the value of the isTeamLeader property.
     * 
     */
    public int getIsTeamLeader() {
        return isTeamLeader;
    }

    /**
     * Sets the value of the isTeamLeader property.
     * 
     */
    public void setIsTeamLeader(int value) {
        this.isTeamLeader = value;
    }

    /**
     * Gets the value of the workRole property.
     * 
     */
    public int getWorkRole() {
        return workRole;
    }

    /**
     * Sets the value of the workRole property.
     * 
     */
    public void setWorkRole(int value) {
        this.workRole = value;
    }

    /**
     * Gets the value of the workType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkType() {
        return workType;
    }

    /**
     * Sets the value of the workType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkType(String value) {
        this.workType = value;
    }

    /**
     * Gets the value of the corpType property.
     * 
     */
    public int getCorpType() {
        return corpType;
    }

    /**
     * Sets the value of the corpType property.
     * 
     */
    public void setCorpType(int value) {
        this.corpType = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     */
    public int getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     */
    public void setGender(int value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the nation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNation() {
        return nation;
    }

    /**
     * Sets the value of the nation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNation(String value) {
        this.nation = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the faceImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceImage() {
        return faceImage;
    }

    /**
     * Sets the value of the faceImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceImage(String value) {
        this.faceImage = value;
    }

    /**
     * Gets the value of the cellPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * Sets the value of the cellPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhone(String value) {
        this.cellPhone = value;
    }

    /**
     * Gets the value of the verifyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyName() {
        return verifyName;
    }

    /**
     * Sets the value of the verifyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyName(String value) {
        this.verifyName = value;
    }

    /**
     * Gets the value of the leaderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderName() {
        return leaderName;
    }

    /**
     * Sets the value of the leaderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderName(String value) {
        this.leaderName = value;
    }

    /**
     * Gets the value of the leaderPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderPhoneNum() {
        return leaderPhoneNum;
    }

    /**
     * Sets the value of the leaderPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderPhoneNum(String value) {
        this.leaderPhoneNum = value;
    }

    /**
     * Gets the value of the healthImg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthImg() {
        return healthImg;
    }

    /**
     * Sets the value of the healthImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthImg(String value) {
        this.healthImg = value;
    }

    /**
     * Gets the value of the healthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCode() {
        return healthCode;
    }

    /**
     * Sets the value of the healthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCode(String value) {
        this.healthCode = value;
    }

    /**
     * Gets the value of the livingAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivingAdress() {
        return livingAdress;
    }

    /**
     * Sets the value of the livingAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivingAdress(String value) {
        this.livingAdress = value;
    }

    /**
     * Gets the value of the emergencyContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * Sets the value of the emergencyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContact(String value) {
        this.emergencyContact = value;
    }

    /**
     * Gets the value of the emergencyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    /**
     * Sets the value of the emergencyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyPhone(String value) {
        this.emergencyPhone = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBank(String value) {
        this.bank = value;
    }

    /**
     * Gets the value of the bankIDCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankIDCard() {
        return bankIDCard;
    }

    /**
     * Sets the value of the bankIDCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankIDCard(String value) {
        this.bankIDCard = value;
    }

}
