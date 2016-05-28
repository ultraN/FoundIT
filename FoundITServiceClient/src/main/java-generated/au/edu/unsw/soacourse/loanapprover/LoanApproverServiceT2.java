package au.edu.unsw.soacourse.loanapprover;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2016-05-28T10:22:28.627+10:00
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "LoanApproverServiceT2", 
                  wsdlLocation = "file:/Users/zenglinwang/Documents/Workspace/gitRepository/FoundITServiceClient/src/main/resources/wsdl/loanapprover.wsdl",
                  targetNamespace = "http://soacourse.unsw.edu.au/loanapprover") 
public class LoanApproverServiceT2 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soacourse.unsw.edu.au/loanapprover", "LoanApproverServiceT2");
    public final static QName LoanApproverSOAP = new QName("http://soacourse.unsw.edu.au/loanapprover", "LoanApproverSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/zenglinwang/Documents/Workspace/gitRepository/FoundITServiceClient/src/main/resources/wsdl/loanapprover.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LoanApproverServiceT2.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/zenglinwang/Documents/Workspace/gitRepository/FoundITServiceClient/src/main/resources/wsdl/loanapprover.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LoanApproverServiceT2(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LoanApproverServiceT2(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoanApproverServiceT2() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LoanApproverServiceT2(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LoanApproverServiceT2(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LoanApproverServiceT2(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns LoanApprovalPT
     */
    @WebEndpoint(name = "LoanApproverSOAP")
    public LoanApprovalPT getLoanApproverSOAP() {
        return super.getPort(LoanApproverSOAP, LoanApprovalPT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoanApprovalPT
     */
    @WebEndpoint(name = "LoanApproverSOAP")
    public LoanApprovalPT getLoanApproverSOAP(WebServiceFeature... features) {
        return super.getPort(LoanApproverSOAP, LoanApprovalPT.class, features);
    }

}