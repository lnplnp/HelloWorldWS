/**
 * HelloWorldService1Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package fr.manuelpayet.www.helloworldws;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.log4j.Logger;

/**
 * HelloWorldService1Skeleton java skeleton for the axisService
 */
public class HelloWorldService1Skeleton {

  private static Logger logger = Logger
      .getLogger(HelloWorldService1Skeleton.class);

  private DireBonjourResponse response;
  private DireBonjourFaultException direBonjourFaultException;

  /**
   * Auto generated method signature
   * 
   * @param direBonjourRequest
   * @return direBonjourResponse
   * @throws DireBonjourFaultException
   */

  public fr.manuelpayet.www.helloworldws.DireBonjourResponse direBonjour(
      fr.manuelpayet.www.helloworldws.DireBonjourRequest direBonjourRequest)
      throws DireBonjourFaultException {
    logger.info("");
    response = new DireBonjourResponse();
    String birthYear = direBonjourRequest.getBirthYear().getBirthYear_type0();
    if (birthYear.matches("[0-9]{4}")) {
      logger.info("");
      Calendar gregorianCalendar = GregorianCalendar.getInstance();
      int year = gregorianCalendar.get(GregorianCalendar.YEAR);
      int birthYearInt = Integer.parseInt(birthYear);
      if (year < birthYearInt) {
        DireBonjourFault direBonjourFault = new DireBonjourFault();
        direBonjourFault.setCode(1);
        direBonjourFault
            .setMessage("L'année de naissance est supérieur à l'année courante.");
        direBonjourFault.setDetails("L'âge ne peut pas être négatif.");
        direBonjourFaultException = new DireBonjourFaultException(
            "Exception AgeNegatif");
        direBonjourFaultException.setFaultMessage(direBonjourFault);
        logger.info("");
        throw direBonjourFaultException;
      }
      response.setAge(year - birthYearInt);
    } else {
      logger.info("");
      /*
       * Tant que la restriction "[0-9]{4}" sur le champ birthYear est dérite
       * dans le WSDL, le code ci-dessous ne sera pas atteint
       */
      DireBonjourFault direBonjourFault = new DireBonjourFault();
      direBonjourFault.setCode(1);
      direBonjourFault.setMessage("L'année de naissance n'est pas conforme.");
      direBonjourFault
          .setDetails("Ce champ ne respecte pas le format demandé.");
      direBonjourFaultException = new DireBonjourFaultException(
          "Exception MauvaisFormat");
      direBonjourFaultException.setFaultMessage(direBonjourFault);
      logger.info("");
      throw direBonjourFaultException;
    }
    response.setSalutations("Salut " + direBonjourRequest.getFirstName() + " "
        + direBonjourRequest.getLastName() + " !");
    logger.info("");
    return response;
  }

}
