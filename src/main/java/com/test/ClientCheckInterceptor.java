package com.test;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.List;

public class ClientCheckInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

    public ClientCheckInterceptor() {
        super(Phase.PREPARE_SEND);
    }
    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        List<Header> headers = message.getHeaders();
        Document document = DOMUtils.createDocument();
        Element messageHeader = document.createElement("MessageHeader");
        Element username = document.createElement("USERNAME");
        username.setTextContent("password");
        messageHeader.appendChild(username);

        Element password = document.createElement("PASSWORD");
        username.setTextContent("password");
        messageHeader.appendChild(password);

        headers.add(new Header(new QName(""),messageHeader));
    }
}
