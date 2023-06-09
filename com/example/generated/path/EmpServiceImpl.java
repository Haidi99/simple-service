
package com.example.generated.path;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmpServiceImpl", targetNamespace = "AnyThing")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmpServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEmp", targetNamespace = "AnyThing", className = "com.example.generated.path.AddEmp")
    @ResponseWrapper(localName = "addEmpResponse", targetNamespace = "AnyThing", className = "com.example.generated.path.AddEmpResponse")
    @Action(input = "AnyThing/EmpServiceImpl/addEmpRequest", output = "AnyThing/EmpServiceImpl/addEmpResponse")
    public boolean addEmp(
        @WebParam(name = "arg0", targetNamespace = "")
        EmpRepo arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.example.generated.path.EmpRepo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllPersons", targetNamespace = "AnyThing", className = "com.example.generated.path.GetAllPersons")
    @ResponseWrapper(localName = "getAllPersonsResponse", targetNamespace = "AnyThing", className = "com.example.generated.path.GetAllPersonsResponse")
    @Action(input = "AnyThing/EmpServiceImpl/getAllPersonsRequest", output = "AnyThing/EmpServiceImpl/getAllPersonsResponse")
    public List<EmpRepo> getAllPersons();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmployee", targetNamespace = "AnyThing", className = "com.example.generated.path.GetEmployee")
    @ResponseWrapper(localName = "getEmployeeResponse", targetNamespace = "AnyThing", className = "com.example.generated.path.GetEmployeeResponse")
    @Action(input = "AnyThing/EmpServiceImpl/getEmployeeRequest", output = "AnyThing/EmpServiceImpl/getEmployeeResponse")
    public String getEmployee(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
