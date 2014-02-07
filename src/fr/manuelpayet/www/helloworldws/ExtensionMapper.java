/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package fr.manuelpayet.www.helloworldws;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class ExtensionMapper {

  public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
      java.lang.String typeName, javax.xml.stream.XMLStreamReader reader)
      throws java.lang.Exception {

    if ("http://www.manuelpayet.fr/helloworldws/".equals(namespaceURI)
        && "lastName_type1".equals(typeName)) {

      return fr.manuelpayet.www.helloworldws.LastName_type1.Factory
          .parse(reader);

    }

    if ("http://www.manuelpayet.fr/helloworldws/".equals(namespaceURI)
        && "birthYear_type1".equals(typeName)) {

      return fr.manuelpayet.www.helloworldws.BirthYear_type1.Factory
          .parse(reader);

    }

    if ("http://www.manuelpayet.fr/helloworldws/".equals(namespaceURI)
        && "birthYear_type1".equals(typeName)) {

      return fr.manuelpayet.www.helloworldws.BirthYear_type1.Factory
          .parse(reader);

    }

    if ("http://www.manuelpayet.fr/helloworldws/".equals(namespaceURI)
        && "firstName_type1".equals(typeName)) {

      return fr.manuelpayet.www.helloworldws.FirstName_type1.Factory
          .parse(reader);

    }

    throw new org.apache.axis2.databinding.ADBException("Unsupported type "
        + namespaceURI + " " + typeName);
  }

}
