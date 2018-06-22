/**
 * This CRMServlet implements a controller (Servlet) by using Giniality�s WebApp-Framework.
 */

package servlet;

import services.CustomerCreateService;
import services.CustomerReadService;
import views.CustomerCreateView;
import views.CustomerReadView;

import org.webcrm.framework.registry.ServiceRegistry;
import org.webcrm.framework.registry.ViewRegistry;
import org.webcrm.framework.servlet.AbstractServiceBrokerServlet;

public class CRMServlet extends AbstractServiceBrokerServlet {

	/**
	 * Constant defining the serial version UID.
	 */
	private static final long serialVersionUID = 2L;

	/**
	 * For informations look at this framework in:
	 * 
	 */
	protected void initRegistry() {
		// The Register Views of the customer manager website
		ViewRegistry.getInstance().registerView(new CustomerCreateView());
		ViewRegistry.getInstance().registerView(new CustomerReadView());

		// The Register Services of the customer manager website
		ServiceRegistry.getInstance().registerService(new CustomerCreateService());
		ServiceRegistry.getInstance().registerService(new CustomerReadService());
	}
}