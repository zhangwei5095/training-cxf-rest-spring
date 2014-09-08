package net.person.ws;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.person.api.RESTSample;
import net.person.domain.User;
import net.person.domain.Users;

@WebService(targetNamespace = "http://ws.person.net/", portName = "RESTSampleSoapPort", serviceName = "RESTSampleSoapService")
public class RESTSampleSoap implements RESTSample {

	@WebMethod(operationName = "doGet", action = "urn:DoGet")
	@WebResult(name = "return")
	@Override
	public String doGet() {
		// TODO Auto-generated method stub
		return null;
	}

	@WebMethod(operationName = "doRequest", action = "urn:DoRequest", exclude = true)
	@WebResult(name = "return")
	@Override
	public String doRequest(@WebParam(name = "arg0") String param,
			@WebParam(name = "arg1") HttpServletRequest servletRequest,
			@WebParam(name = "arg2") HttpServletResponse servletResponse) {
		// TODO Auto-generated method stub
		return null;
	}

	@WebMethod(operationName = "getBean", action = "urn:GetBean")
	@WebResult(name = "return")
	@Override
	public User getBean(@WebParam(name = "arg0") int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@WebMethod(operationName = "getList", action = "urn:GetList", exclude = true)
	@WebResult(name = "return")
	@Override
	public Users getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@WebMethod(operationName = "postData", action = "urn:PostData")
	@WebResult(name = "return")
	@Override
	public User postData(@WebParam(name = "arg0") User user) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@WebMethod(operationName = "putData", action = "urn:PutData")
	@WebResult(name = "return")
	@Override
	public User putData(@WebParam(name = "arg0") int id,
			@WebParam(name = "arg1") User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@WebMethod(operationName = "deleteData", action = "urn:DeleteData")
	@WebResult(name = "return")
	@Override
	public void deleteData(@WebParam(name = "arg0") int id) {
		// TODO Auto-generated method stub

	}

}
