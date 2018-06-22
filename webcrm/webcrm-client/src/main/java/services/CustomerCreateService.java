/**
 * This CustomerCreateService implements a model (Service) by using Giniality�s WebApp-Framework.
 */

package services;

import org.webcrm.framework.service.Service;
import org.webcrm.framework.service.ServiceRequest;

import org.webcrm.business.CustomerFactory;
import org.webcrm.business.ICustomer;

public class CustomerCreateService implements Service {

	// The customer factory
    private CustomerFactory theCustomerFactory = null;
	
	/**
	 * For informations look at this framework in:
	 * @see com.giniality.education.webappframework.service.Service#process(com.giniality.education.webappframework.service.ServiceRequest)
	 */
	public Object process(ServiceRequest inRequest) {
		// Get the text from the inputfields in a array and send it to the view
		
		String result = "";

		String firstname = inRequest.getParameter("firstnameText");
		String name = inRequest.getParameter("nameText");

		if (firstname.equals("") && name.equals(""))
		{
			result = "Bitte einen Vor- und Nachnamen eingeben.";
		} else if (firstname.equals("")) {
			result = "Bitte einen Vornamen eingeben.";
		} else if (name.equals("")) {
			result = "Bitte einen Nachnamen eingeben.";
		} else {
			// Get the Instance of the CustomerFactory
			theCustomerFactory = CustomerFactory.getInstance();
			
			// Create a new customer
			ICustomer customer = theCustomerFactory.createCustomer(name, firstname);
			
			// Save the new customer in the "Mock-DB"
			theCustomerFactory.saveCustomer(customer);
			
			result = "Der Kunde mit dem Namen: <i>" + firstname + " " + name + "</i> wurde erfolgreich erstellt.";
		}
				
		return result;
	}

	/**
	 * For informations look at this framework in:
	 * @see com.giniality.education.webappframework.service.Service#getAliasName()
	 */
	public String getAliasName() {
		return "CreateCustomerService";
	}
}
