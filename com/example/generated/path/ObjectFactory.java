
package com.example.generated.path;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.generated.path package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddEmp_QNAME = new QName("AnyThing", "addEmp");
    private final static QName _GetAllPersonsResponse_QNAME = new QName("AnyThing", "getAllPersonsResponse");
    private final static QName _AddEmpResponse_QNAME = new QName("AnyThing", "addEmpResponse");
    private final static QName _GetEmployeeResponse_QNAME = new QName("AnyThing", "getEmployeeResponse");
    private final static QName _GetAllPersons_QNAME = new QName("AnyThing", "getAllPersons");
    private final static QName _GetEmployee_QNAME = new QName("AnyThing", "getEmployee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.generated.path
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllPersonsResponse }
     * 
     */
    public GetAllPersonsResponse createGetAllPersonsResponse() {
        return new GetAllPersonsResponse();
    }

    /**
     * Create an instance of {@link AddEmp }
     * 
     */
    public AddEmp createAddEmp() {
        return new AddEmp();
    }

    /**
     * Create an instance of {@link GetAllPersons }
     * 
     */
    public GetAllPersons createGetAllPersons() {
        return new GetAllPersons();
    }

    /**
     * Create an instance of {@link GetEmployee }
     * 
     */
    public GetEmployee createGetEmployee() {
        return new GetEmployee();
    }

    /**
     * Create an instance of {@link AddEmpResponse }
     * 
     */
    public AddEmpResponse createAddEmpResponse() {
        return new AddEmpResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link EmpRepo }
     * 
     */
    public EmpRepo createEmpRepo() {
        return new EmpRepo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "AnyThing", name = "addEmp")
    public JAXBElement<AddEmp> createAddEmp(AddEmp value) {
        return new JAXBElement<AddEmp>(_AddEmp_QNAME, AddEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "AnyThing", name = "getAllPersonsResponse")
    public JAXBElement<GetAllPersonsResponse> createGetAllPersonsResponse(GetAllPersonsResponse value) {
        return new JAXBElement<GetAllPersonsResponse>(_GetAllPersonsResponse_QNAME, GetAllPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "AnyThing", name = "addEmpResponse")
    public JAXBElement<AddEmpResponse> createAddEmpResponse(AddEmpResponse value) {
        return new JAXBElement<AddEmpResponse>(_AddEmpResponse_QNAME, AddEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "AnyThing", name = "getEmployeeResponse")
    public JAXBElement<GetEmployeeResponse> createGetEmployeeResponse(GetEmployeeResponse value) {
        return new JAXBElement<GetEmployeeResponse>(_GetEmployeeResponse_QNAME, GetEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "AnyThing", name = "getAllPersons")
    public JAXBElement<GetAllPersons> createGetAllPersons(GetAllPersons value) {
        return new JAXBElement<GetAllPersons>(_GetAllPersons_QNAME, GetAllPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "AnyThing", name = "getEmployee")
    public JAXBElement<GetEmployee> createGetEmployee(GetEmployee value) {
        return new JAXBElement<GetEmployee>(_GetEmployee_QNAME, GetEmployee.class, null, value);
    }

}
