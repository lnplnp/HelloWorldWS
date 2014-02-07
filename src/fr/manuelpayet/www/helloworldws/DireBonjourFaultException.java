
/**
 * DireBonjourFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package fr.manuelpayet.www.helloworldws;

public class DireBonjourFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1391769804474L;
    
    private fr.manuelpayet.www.helloworldws.DireBonjourFault faultMessage;

    
        public DireBonjourFaultException() {
            super("DireBonjourFaultException");
        }

        public DireBonjourFaultException(java.lang.String s) {
           super(s);
        }

        public DireBonjourFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DireBonjourFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(fr.manuelpayet.www.helloworldws.DireBonjourFault msg){
       faultMessage = msg;
    }
    
    public fr.manuelpayet.www.helloworldws.DireBonjourFault getFaultMessage(){
       return faultMessage;
    }
}
    