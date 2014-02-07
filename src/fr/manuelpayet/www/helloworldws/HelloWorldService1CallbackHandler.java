/**
 * HelloWorldService1CallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package fr.manuelpayet.www.helloworldws;

/**
 * HelloWorldService1CallbackHandler Callback class, Users can extend this class
 * and implement their own receiveResult and receiveError methods.
 */
public abstract class HelloWorldService1CallbackHandler {

  protected Object clientData;

  /**
   * Please use this constructor if you don't want to set any clientData
   */
  public HelloWorldService1CallbackHandler() {
    this.clientData = null;
  }

  /**
   * User can pass in any object that needs to be accessed once the NonBlocking
   * Web service call is finished and appropriate method of this CallBack is
   * called.
   * 
   * @param clientData
   *          Object mechanism by which the user can pass in user data that will
   *          be avilable at the time this callback is called.
   */
  public HelloWorldService1CallbackHandler(Object clientData) {
    this.clientData = clientData;
  }

  /**
   * Get the client data
   */

  public Object getClientData() {
    return clientData;
  }

  /**
   * auto generated Axis2 Error handler override this method for handling error
   * response from direBonjour operation
   */
  public void receiveErrordireBonjour(java.lang.Exception e) {
  }

  /**
   * auto generated Axis2 call back method for direBonjour method override this
   * method for handling normal response from direBonjour operation
   */
  public void receiveResultdireBonjour(
      fr.manuelpayet.www.helloworldws.DireBonjourResponse result) {
  }

}
