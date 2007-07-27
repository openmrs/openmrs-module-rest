package org.openmrs.module.restmodule.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Represents a RESTful resource (e.g., patient) that can be accessed through
 * RESTful calls
 * 
 * @author Burke Mamlin
 * @version 1.0
 */
public interface RestResource {

	// Rest Operations
        public enum Operation {GET, POST, PUT, DELETE};
    
	/**
	 * Used to pass request to the given resource
	 * 
	 * @param operation
	 *            REST operation (e.g., GET, POST, PUT, DELETE)
	 * @param restRequest
	 *            fragment of request URL beyond resource reference
	 * @param request
	 *            HTTP request
	 * @param response
	 *            HTTP response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void handleRequest(Operation operation, String restRequest,
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException;

}
