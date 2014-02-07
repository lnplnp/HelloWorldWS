/**
 * DireBonjourRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package fr.manuelpayet.www.helloworldws;

/**
 * DireBonjourRequest bean class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class DireBonjourRequest implements org.apache.axis2.databinding.ADBBean {

  /**
   * Factory class that keeps the parse method
   */
  public static class Factory {

    /**
     * static method to create the object Precondition: If this object is an
     * element, the current or next start element starts this object and any
     * intervening reader events are ignorable If this object is not an element,
     * it is a complex type and the reader is at the event just after the outer
     * start element Postcondition: If this object is an element, the reader is
     * positioned at its end element If this object is a complex type, the
     * reader is positioned at the end element of its outer element
     */
    public static DireBonjourRequest parse(
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
      DireBonjourRequest object = new DireBonjourRequest();

      int event;
      java.lang.String nillableValue = null;
      java.lang.String prefix = "";
      java.lang.String namespaceuri = "";
      try {

        while (!reader.isStartElement() && !reader.isEndElement()) {
          reader.next();
        }

        if (reader.getAttributeValue(
            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
          java.lang.String fullTypeName = reader.getAttributeValue(
              "http://www.w3.org/2001/XMLSchema-instance", "type");
          if (fullTypeName != null) {
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1) {
              nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix == null ? "" : nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName
                .indexOf(":") + 1);

            if (!"direBonjourRequest".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext()
                  .getNamespaceURI(nsPrefix);
              return (DireBonjourRequest) fr.manuelpayet.www.helloworldws.ExtensionMapper
                  .getTypeObject(nsUri, type, reader);
            }

          }

        }

        // Note all attributes that were handled. Used to differ normal
        // attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();

        reader.next();

        while (!reader.isEndElement()) {
          if (reader.isStartElement()) {

            if (reader.isStartElement()
                && new javax.xml.namespace.QName("", "lastName").equals(reader
                    .getName())) {

              object
                  .setLastName(fr.manuelpayet.www.helloworldws.LastName_type1.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element

            else

            if (reader.isStartElement()
                && new javax.xml.namespace.QName("", "firstName").equals(reader
                    .getName())) {

              object
                  .setFirstName(fr.manuelpayet.www.helloworldws.FirstName_type1.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element

            else

            if (reader.isStartElement()
                && new javax.xml.namespace.QName("", "birthYear").equals(reader
                    .getName())) {

              object
                  .setBirthYear(fr.manuelpayet.www.helloworldws.BirthYear_type1.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element

            else {
              // A start element we are not expecting indicates an invalid
              // parameter was passed
              throw new org.apache.axis2.databinding.ADBException(
                  "Unexpected subelement " + reader.getName());
            }

          } else {
            reader.next();
          }
        } // end of while loop

      } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
      }

      return object;
    }

  }// end of factory class

  /**
               * 
               */
  private static final long serialVersionUID = 1L;

  public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
      "http://www.manuelpayet.fr/helloworldws/", "direBonjourRequest", "ns1");

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("http://www.manuelpayet.fr/helloworldws/")) {
      return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
  }

  /**
   * field for LastName
   */

  protected fr.manuelpayet.www.helloworldws.LastName_type1 localLastName;

  /**
   * field for FirstName
   */

  protected fr.manuelpayet.www.helloworldws.FirstName_type1 localFirstName;

  /**
   * field for BirthYear
   */

  protected fr.manuelpayet.www.helloworldws.BirthYear_type1 localBirthYear;

  /**
   * Auto generated getter method
   * 
   * @return fr.manuelpayet.www.helloworldws.BirthYear_type1
   */
  public fr.manuelpayet.www.helloworldws.BirthYear_type1 getBirthYear() {
    return localBirthYear;
  }

  /**
   * Auto generated getter method
   * 
   * @return fr.manuelpayet.www.helloworldws.FirstName_type1
   */
  public fr.manuelpayet.www.helloworldws.FirstName_type1 getFirstName() {
    return localFirstName;
  }

  /**
   * Auto generated getter method
   * 
   * @return fr.manuelpayet.www.helloworldws.LastName_type1
   */
  public fr.manuelpayet.www.helloworldws.LastName_type1 getLastName() {
    return localLastName;
  }

  /**
   * 
   * @param parentQName
   * @param factory
   * @return org.apache.axiom.om.OMElement
   */
  @Override
  public org.apache.axiom.om.OMElement getOMElement(
      final javax.xml.namespace.QName parentQName,
      final org.apache.axiom.om.OMFactory factory)
      throws org.apache.axis2.databinding.ADBException {

    org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
        this, MY_QNAME);
    return factory.createOMElement(dataSource, MY_QNAME);

  }

  /**
   * databinding method to get an XML representation of this object
   * 
   */
  @Override
  public javax.xml.stream.XMLStreamReader getPullParser(
      javax.xml.namespace.QName qName)
      throws org.apache.axis2.databinding.ADBException {

    java.util.ArrayList elementList = new java.util.ArrayList();
    java.util.ArrayList attribList = new java.util.ArrayList();

    elementList.add(new javax.xml.namespace.QName("", "lastName"));

    if (localLastName == null) {
      throw new org.apache.axis2.databinding.ADBException(
          "lastName cannot be null!!");
    }
    elementList.add(localLastName);

    elementList.add(new javax.xml.namespace.QName("", "firstName"));

    if (localFirstName == null) {
      throw new org.apache.axis2.databinding.ADBException(
          "firstName cannot be null!!");
    }
    elementList.add(localFirstName);

    elementList.add(new javax.xml.namespace.QName("", "birthYear"));

    if (localBirthYear == null) {
      throw new org.apache.axis2.databinding.ADBException(
          "birthYear cannot be null!!");
    }
    elementList.add(localBirthYear);

    return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
        qName, elementList.toArray(), attribList.toArray());

  }

  /**
   * Register a namespace prefix
   */
  private java.lang.String registerPrefix(
      javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
      prefix = generatePrefix(namespace);
      javax.xml.namespace.NamespaceContext nsContext = xmlWriter
          .getNamespaceContext();
      while (true) {
        java.lang.String uri = nsContext.getNamespaceURI(prefix);
        if (uri == null || uri.length() == 0) {
          break;
        }
        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
  }

  @Override
  public void serialize(final javax.xml.namespace.QName parentQName,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException,
      org.apache.axis2.databinding.ADBException {
    serialize(parentQName, xmlWriter, false);
  }

  @Override
  public void serialize(final javax.xml.namespace.QName parentQName,
      javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
      throws javax.xml.stream.XMLStreamException,
      org.apache.axis2.databinding.ADBException {

    java.lang.String prefix = null;
    java.lang.String namespace = null;

    prefix = parentQName.getPrefix();
    namespace = parentQName.getNamespaceURI();
    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

    if (serializeType) {

      java.lang.String namespacePrefix = registerPrefix(xmlWriter,
          "http://www.manuelpayet.fr/helloworldws/");
      if (namespacePrefix != null && namespacePrefix.trim().length() > 0) {
        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
            "type", namespacePrefix + ":direBonjourRequest", xmlWriter);
      } else {
        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
            "type", "direBonjourRequest", xmlWriter);
      }

    }

    if (localLastName == null) {
      throw new org.apache.axis2.databinding.ADBException(
          "lastName cannot be null!!");
    }
    localLastName.serialize(new javax.xml.namespace.QName("", "lastName"),
        xmlWriter);

    if (localFirstName == null) {
      throw new org.apache.axis2.databinding.ADBException(
          "firstName cannot be null!!");
    }
    localFirstName.serialize(new javax.xml.namespace.QName("", "firstName"),
        xmlWriter);

    if (localBirthYear == null) {
      throw new org.apache.axis2.databinding.ADBException(
          "birthYear cannot be null!!");
    }
    localBirthYear.serialize(new javax.xml.namespace.QName("", "birthYear"),
        xmlWriter);

    xmlWriter.writeEndElement();

  }

  /**
   * Auto generated setter method
   * 
   * @param param
   *          BirthYear
   */
  public void setBirthYear(fr.manuelpayet.www.helloworldws.BirthYear_type1 param) {

    this.localBirthYear = param;

  }

  /**
   * Auto generated setter method
   * 
   * @param param
   *          FirstName
   */
  public void setFirstName(fr.manuelpayet.www.helloworldws.FirstName_type1 param) {

    this.localFirstName = param;

  }

  /**
   * Auto generated setter method
   * 
   * @param param
   *          LastName
   */
  public void setLastName(fr.manuelpayet.www.helloworldws.LastName_type1 param) {

    this.localLastName = param;

  }

  /**
   * Util method to write an attribute with the ns prefix
   */
  private void writeAttribute(java.lang.String prefix,
      java.lang.String namespace, java.lang.String attName,
      java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    if (xmlWriter.getPrefix(namespace) == null) {
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
    }
    xmlWriter.writeAttribute(namespace, attName, attValue);
  }

  /**
   * Util method to write an attribute without the ns prefix
   */
  private void writeAttribute(java.lang.String namespace,
      java.lang.String attName, java.lang.String attValue,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    if (namespace.equals("")) {
      xmlWriter.writeAttribute(attName, attValue);
    } else {
      registerPrefix(xmlWriter, namespace);
      xmlWriter.writeAttribute(namespace, attName, attValue);
    }
  }

  /**
   * method to handle Qnames
   */

  private void writeQName(javax.xml.namespace.QName qname,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String namespaceURI = qname.getNamespaceURI();
    if (namespaceURI != null) {
      java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
      if (prefix == null) {
        prefix = generatePrefix(namespaceURI);
        xmlWriter.writeNamespace(prefix, namespaceURI);
        xmlWriter.setPrefix(prefix, namespaceURI);
      }

      if (prefix.trim().length() > 0) {
        xmlWriter.writeCharacters(prefix
            + ":"
            + org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString(qname));
      } else {
        // i.e this is the default namespace
        xmlWriter
            .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
                .convertToString(qname));
      }

    } else {
      xmlWriter
          .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
              .convertToString(qname));
    }
  }

  /**
   * Util method to write an attribute without the ns prefix
   */
  private void writeQNameAttribute(java.lang.String namespace,
      java.lang.String attName, javax.xml.namespace.QName qname,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {

    java.lang.String attributeNamespace = qname.getNamespaceURI();
    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
    if (attributePrefix == null) {
      attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
    }
    java.lang.String attributeValue;
    if (attributePrefix.trim().length() > 0) {
      attributeValue = attributePrefix + ":" + qname.getLocalPart();
    } else {
      attributeValue = qname.getLocalPart();
    }

    if (namespace.equals("")) {
      xmlWriter.writeAttribute(attName, attributeValue);
    } else {
      registerPrefix(xmlWriter, namespace);
      xmlWriter.writeAttribute(namespace, attName, attributeValue);
    }
  }

  private void writeQNames(javax.xml.namespace.QName[] qnames,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {

    if (qnames != null) {
      // we have to store this data until last moment since it is not possible
      // to write any
      // namespace data after writing the charactor data
      java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
      java.lang.String namespaceURI = null;
      java.lang.String prefix = null;

      for (int i = 0; i < qnames.length; i++) {
        if (i > 0) {
          stringToWrite.append(" ");
        }
        namespaceURI = qnames[i].getNamespaceURI();
        if (namespaceURI != null) {
          prefix = xmlWriter.getPrefix(namespaceURI);
          if (prefix == null || prefix.length() == 0) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix, namespaceURI);
          }

          if (prefix.trim().length() > 0) {
            stringToWrite
                .append(prefix)
                .append(":")
                .append(
                    org.apache.axis2.databinding.utils.ConverterUtil
                        .convertToString(qnames[i]));
          } else {
            stringToWrite
                .append(org.apache.axis2.databinding.utils.ConverterUtil
                    .convertToString(qnames[i]));
          }
        } else {
          stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil
              .convertToString(qnames[i]));
        }
      }
      xmlWriter.writeCharacters(stringToWrite.toString());
    }

  }

  /**
   * Utility method to write an element start tag.
   */
  private void writeStartElement(java.lang.String prefix,
      java.lang.String namespace, java.lang.String localPart,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
    if (writerPrefix != null) {
      xmlWriter.writeStartElement(namespace, localPart);
    } else {
      if (namespace.length() == 0) {
        prefix = "";
      } else if (prefix == null) {
        prefix = generatePrefix(namespace);
      }

      xmlWriter.writeStartElement(prefix, localPart, namespace);
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
    }
  }

}
