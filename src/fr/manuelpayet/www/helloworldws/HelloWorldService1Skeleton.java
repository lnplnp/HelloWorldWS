/**
 * HelloWorldService1Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package fr.manuelpayet.www.helloworldws;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * HelloWorldService1Skeleton java skeleton for the axisService
 */
public class HelloWorldService1Skeleton implements
    HelloWorldService1SkeletonInterface {

  private DireBonjourResponse response;
  private DireBonjourFaultException direBonjourFaultException;

  /**
   * Auto generated method signature
   * 
   * @param direBonjourRequest0
   * @return direBonjourResponse2
   * @throws DireBonjourFaultException
   */

  @Override
  public fr.manuelpayet.www.helloworldws.DireBonjourResponse direBonjour(
      fr.manuelpayet.www.helloworldws.DireBonjourRequest direBonjourRequest0)
      throws DireBonjourFaultException {
    response = new DireBonjourResponse();
    String birthYear = direBonjourRequest0.getBirthYear().getBirthYear_type0();
    if (birthYear.matches("[0-9]{4}")) {
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
        throw direBonjourFaultException;
      }
      response.setAge(year - birthYearInt);
    } else {
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
      throw direBonjourFaultException;
    }
    response.setSalutations("Salut " + direBonjourRequest0.getFirstName() + " "
        + direBonjourRequest0.getLastName() + " !");
    return response;
  }
}
