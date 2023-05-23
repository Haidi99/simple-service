package AnyThing;

public class EmpServiceImplProxy implements AnyThing.EmpServiceImpl {
  private String _endpoint = null;
  private AnyThing.EmpServiceImpl empServiceImpl = null;
  
  public EmpServiceImplProxy() {
    _initEmpServiceImplProxy();
  }
  
  public EmpServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmpServiceImplProxy();
  }
  
  private void _initEmpServiceImplProxy() {
    try {
      empServiceImpl = (new AnyThing.EmpServiceImplServiceLocator()).getEmpServiceImplPort();
      if (empServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)empServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)empServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (empServiceImpl != null)
      ((javax.xml.rpc.Stub)empServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public AnyThing.EmpServiceImpl getEmpServiceImpl() {
    if (empServiceImpl == null)
      _initEmpServiceImplProxy();
    return empServiceImpl;
  }
  
  public java.lang.String getEmployee(int arg0) throws java.rmi.RemoteException{
    if (empServiceImpl == null)
      _initEmpServiceImplProxy();
    return empServiceImpl.getEmployee(arg0);
  }
  
  public boolean addEmp(AnyThing.EmpRepo arg0) throws java.rmi.RemoteException{
    if (empServiceImpl == null)
      _initEmpServiceImplProxy();
    return empServiceImpl.addEmp(arg0);
  }
  
  public void getAllEmployees() throws java.rmi.RemoteException{
    if (empServiceImpl == null)
      _initEmpServiceImplProxy();
    empServiceImpl.getAllEmployees();
  }
  
  public void empCount() throws java.rmi.RemoteException{
    if (empServiceImpl == null)
      _initEmpServiceImplProxy();
    empServiceImpl.empCount();
  }
  
  public void updateEmployee(AnyThing.EmpRepo arg0) throws java.rmi.RemoteException{
    if (empServiceImpl == null)
      _initEmpServiceImplProxy();
    empServiceImpl.updateEmployee(arg0);
  }
  
  
}