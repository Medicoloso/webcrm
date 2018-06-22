/**
 * This CustomerReadService implements a model (Service) by using Giniality�s WebApp-Framework.
 */

package services;

import org.webcrm.framework.service.Service;
import org.webcrm.framework.service.ServiceRequest;

import org.webcrm.business.CustomerFactory;
import org.webcrm.business.ICustomer;

public class CustomerReadService implements Service {
	
	// The customer factory
	private CustomerFactory theCustomerFactory = null;
	
	/**
	 * For informations look at this framework in:
	 * 
	 */
	public Object process(ServiceRequest inRequest) {
		
		ICustomer result = null;
		
		// Get the text from the inputfield and send it to the view
		String customerIdString = inRequest.getParameter("customerId");
		
		// Variable declaration
		int customerId = Integer.parseInt(customerIdString);

		// Get the Instance of the CustomerFactory
		theCustomerFactory = CustomerFactory.getInstance();
		
		// Select the customer by the customerID
		result = theCustomerFactory.findCustomer(customerId);
		
		return result;
	}

	/**
	 * For informations look at this framework in:
	 * 
	 */
	public String getAliasName() {
		return "ReadCustomerService";
	}
}
