
package Util.WebServiceClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BookServiceImpl", targetNamespace = "http://WebService.Util", wsdlLocation = "file:/E:/Java/ejb_store/src/Util/WebServiceClient/BookServiceImpl.wsdl")
public class BookServiceImpl_Service
    extends Service
{

    private final static URL BOOKSERVICEIMPL_WSDL_LOCATION;
    private final static WebServiceException BOOKSERVICEIMPL_EXCEPTION;
    private final static QName BOOKSERVICEIMPL_QNAME = new QName("http://WebService.Util", "BookServiceImpl");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/E:/Java/ejb_store/src/Util/WebServiceClient/BookServiceImpl.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKSERVICEIMPL_WSDL_LOCATION = url;
        BOOKSERVICEIMPL_EXCEPTION = e;
    }

    public BookServiceImpl_Service() {
        super(__getWsdlLocation(), BOOKSERVICEIMPL_QNAME);
    }

    public BookServiceImpl_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKSERVICEIMPL_QNAME, features);
    }

    public BookServiceImpl_Service(URL wsdlLocation) {
        super(wsdlLocation, BOOKSERVICEIMPL_QNAME);
    }

    public BookServiceImpl_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKSERVICEIMPL_QNAME, features);
    }

    public BookServiceImpl_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookServiceImpl_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BookServiceImpl
     */
    @WebEndpoint(name = "BookServiceImpl")
    public BookServiceImpl getBookServiceImpl() {
        return super.getPort(new QName("http://WebService.Util", "BookServiceImpl"), BookServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookServiceImpl
     */
    @WebEndpoint(name = "BookServiceImpl")
    public BookServiceImpl getBookServiceImpl(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebService.Util", "BookServiceImpl"), BookServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKSERVICEIMPL_EXCEPTION!= null) {
            throw BOOKSERVICEIMPL_EXCEPTION;
        }
        return BOOKSERVICEIMPL_WSDL_LOCATION;
    }

}