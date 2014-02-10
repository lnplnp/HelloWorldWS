/**
 * HelloWorldService1MessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package fr.manuelpayet.www.helloworldws;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;

/**
 * HelloWorldService1MessageReceiverInOut message receiver
 */

public class HelloWorldService1MessageReceiverInOut extends
    org.apache.axis2.receivers.AbstractInOutMessageReceiver {

  private static Logger logger = Logger
      .getLogger(HelloWorldService1MessageReceiverInOut.class);

  public static int code = 0;
  public static String details = "";

  private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
    org.apache.axis2.AxisFault f;
    Throwable cause = e.getCause();
    if (cause != null) {
      f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
    } else {
      f = new org.apache.axis2.AxisFault(e.getMessage());
    }

    return f;
  }

  private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
      java.lang.Class type, java.util.Map extraNamespaces)
      throws org.apache.axis2.AxisFault {

    try {

      if (fr.manuelpayet.www.helloworldws.DireBonjourRequest.class.equals(type)) {

        return fr.manuelpayet.www.helloworldws.DireBonjourRequest.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());

      }

      if (fr.manuelpayet.www.helloworldws.DireBonjourResponse.class
          .equals(type)) {

        return fr.manuelpayet.www.helloworldws.DireBonjourResponse.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());

      }

      if (fr.manuelpayet.www.helloworldws.DireBonjourFault.class.equals(type)) {

        return fr.manuelpayet.www.helloworldws.DireBonjourFault.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());

      }

      if (fr.manuelpayet.www.helloworldws.Context.class.equals(type)) {

        return fr.manuelpayet.www.helloworldws.Context.Factory.parse(param
            .getXMLStreamReaderWithoutCaching());

      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }

  /**
   * A utility method that copies the namepaces from the SOAPEnvelope
   */
  private java.util.Map getEnvelopeNamespaces(
      org.apache.axiom.soap.SOAPEnvelope env) {
    java.util.Map returnMap = new java.util.HashMap();
    java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
    while (namespaceIterator.hasNext()) {
      org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator
          .next();
      returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
    }
    return returnMap;
  }

  @Override
  public void invokeBusinessLogic(
      org.apache.axis2.context.MessageContext msgContext,
      org.apache.axis2.context.MessageContext newMsgContext)
      throws org.apache.axis2.AxisFault {
    logger.info("");
    try {

      // get the implementation class for the Web Service
      Object obj = getTheImplementationObject(msgContext);

      HelloWorldService1Skeleton skel = (HelloWorldService1Skeleton) obj;
      // Out Envelop
      org.apache.axiom.soap.SOAPEnvelope envelope = null;
      // Find the axisOperation that has been set by the Dispatch phase.
      org.apache.axis2.description.AxisOperation op = msgContext
          .getOperationContext().getAxisOperation();
      if (op == null) {
        throw new org.apache.axis2.AxisFault(
            "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
      }

      java.lang.String methodName;
      if (op.getName() != null
          && (methodName = org.apache.axis2.util.JavaUtils
              .xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null) {

        if ("direBonjour".equals(methodName)) {

          fr.manuelpayet.www.helloworldws.DireBonjourResponse direBonjourResponse2 = null;
          try {
            fr.manuelpayet.www.helloworldws.DireBonjourRequest wrappedParam = (fr.manuelpayet.www.helloworldws.DireBonjourRequest) fromOM(
                msgContext.getEnvelope().getBody().getFirstElement(),
                fr.manuelpayet.www.helloworldws.DireBonjourRequest.class,
                getEnvelopeNamespaces(msgContext.getEnvelope()));
            direBonjourResponse2 = skel.direBonjour(wrappedParam);
          } catch (AxisFault e) {
            logger.info(e.getCause() + ", " + e.getMessage());
            DireBonjourResponse direBonjourResponse = new DireBonjourResponse();
            direBonjourResponse.setAge(0);
            direBonjourResponse.setSalutations("[AxisFault] " + e.getMessage());
            direBonjourResponse2 = direBonjourResponse;
          } catch (RuntimeException e) {
            DireBonjourResponse direBonjourResponse = new DireBonjourResponse();
            direBonjourResponse.setAge(0);
            direBonjourResponse.setSalutations("[RuntimeException] " + e.getMessage());
            direBonjourResponse2 = direBonjourResponse;
          }

          envelope = toEnvelope(getSOAPFactory(msgContext),
              direBonjourResponse2, false, new javax.xml.namespace.QName(
                  "http://www.manuelpayet.fr/helloworldws/", "direBonjour"));

        } else {
          throw new java.lang.RuntimeException("method not found");
        }

        newMsgContext.setEnvelope(envelope);
      }
    } catch (DireBonjourFaultException e) {

      msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
          "direBonjourFault");
      org.apache.axis2.AxisFault f = createAxisFault(e);
      if (e.getFaultMessage() != null) {
        f.setDetail(toOM(e.getFaultMessage(), false));
      }
      throw f;
    }

    catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /**
   * get the default envelope
   */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      fr.manuelpayet.www.helloworldws.DireBonjourResponse param,
      boolean optimizeContent, javax.xml.namespace.QName methodQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
          .getDefaultEnvelope();

      emptyEnvelope.getBody().addChild(
          param.getOMElement(
              fr.manuelpayet.www.helloworldws.DireBonjourResponse.MY_QNAME,
              factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      fr.manuelpayet.www.helloworldws.Context param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          fr.manuelpayet.www.helloworldws.Context.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }

  }

  private org.apache.axiom.om.OMElement toOM(
      fr.manuelpayet.www.helloworldws.DireBonjourFault param,
      boolean optimizeContent) throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          fr.manuelpayet.www.helloworldws.DireBonjourFault.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }

  }

  //
  private org.apache.axiom.om.OMElement toOM(
      fr.manuelpayet.www.helloworldws.DireBonjourRequest param,
      boolean optimizeContent) throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          fr.manuelpayet.www.helloworldws.DireBonjourRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }

  }

  private org.apache.axiom.om.OMElement toOM(
      fr.manuelpayet.www.helloworldws.DireBonjourResponse param,
      boolean optimizeContent) throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          fr.manuelpayet.www.helloworldws.DireBonjourResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }

  }

  private fr.manuelpayet.www.helloworldws.DireBonjourResponse wrapdireBonjour() {
    fr.manuelpayet.www.helloworldws.DireBonjourResponse wrappedElement = new fr.manuelpayet.www.helloworldws.DireBonjourResponse();
    return wrappedElement;
  }

}// end of class
