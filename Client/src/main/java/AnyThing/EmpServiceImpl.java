/**
 * EmpServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package AnyThing;

public interface EmpServiceImpl extends java.rmi.Remote {
    public boolean addEmp(AnyThing.EmpRepo arg0) throws java.rmi.RemoteException;
    public java.lang.String getEmployee(int arg0) throws java.rmi.RemoteException;
    public void getAllEmployees() throws java.rmi.RemoteException;
    public void updateEmployee(AnyThing.EmpRepo arg0) throws java.rmi.RemoteException;
    public void empCount() throws java.rmi.RemoteException;
}
