
package com.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MessageHeader_QNAME = new QName("http://tempuri.org/", "MessageHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetWorkerInfo }
     * 
     */
    public SetWorkerInfo createSetWorkerInfo() {
        return new SetWorkerInfo();
    }

    /**
     * Create an instance of {@link WorkerInfo }
     * 
     */
    public WorkerInfo createWorkerInfo() {
        return new WorkerInfo();
    }

    /**
     * Create an instance of {@link SetWorkerInfoResponse }
     * 
     */
    public SetWorkerInfoResponse createSetWorkerInfoResponse() {
        return new SetWorkerInfoResponse();
    }

    /**
     * Create an instance of {@link ProcessedResultsOfString }
     * 
     */
    public ProcessedResultsOfString createProcessedResultsOfString() {
        return new ProcessedResultsOfString();
    }

    /**
     * Create an instance of {@link MessageHeader }
     * 
     */
    public MessageHeader createMessageHeader() {
        return new MessageHeader();
    }

    /**
     * Create an instance of {@link UploadCardRecord }
     * 
     */
    public UploadCardRecord createUploadCardRecord() {
        return new UploadCardRecord();
    }

    /**
     * Create an instance of {@link CardRecord }
     * 
     */
    public CardRecord createCardRecord() {
        return new CardRecord();
    }

    /**
     * Create an instance of {@link UploadCardRecordResponse }
     * 
     */
    public UploadCardRecordResponse createUploadCardRecordResponse() {
        return new UploadCardRecordResponse();
    }

    /**
     * Create an instance of {@link UploadLocationInfo }
     * 
     */
    public UploadLocationInfo createUploadLocationInfo() {
        return new UploadLocationInfo();
    }

    /**
     * Create an instance of {@link LocationInfo }
     * 
     */
    public LocationInfo createLocationInfo() {
        return new LocationInfo();
    }

    /**
     * Create an instance of {@link UploadLocationInfoResponse }
     * 
     */
    public UploadLocationInfoResponse createUploadLocationInfoResponse() {
        return new UploadLocationInfoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageHeader }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageHeader }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MessageHeader")
    public JAXBElement<MessageHeader> createMessageHeader(MessageHeader value) {
        return new JAXBElement<MessageHeader>(_MessageHeader_QNAME, MessageHeader.class, null, value);
    }

}
