/**
 * This CustomerCreateView implements a view by using Giniality�s WebApp-Framework.
 */

package views;

import org.webcrm.framework.view.AbstractHtmlView;

import org.webcrm.business.CustomerFactory;
import org.webcrm.business.ICustomer;

public class CustomerCreateView extends AbstractHtmlView {	
	/**
	 * For informations look at this framework in:
	 * 
	 * 
	 * @return text The text which is shown on the website
	 */
	public String createPageContents() {
		String text = (String)getDisplayObject();
		return text;
	}

	/**
	 * For informations look at this framework in:
	 * 
	 */
	public String getTitle() {
		return "crm-app";
	}

	/**
	 * For informations look at this framework in:
	 * 
	 */
	public String getAliasName() {
		return "CreateCustomerView";
	}
}
