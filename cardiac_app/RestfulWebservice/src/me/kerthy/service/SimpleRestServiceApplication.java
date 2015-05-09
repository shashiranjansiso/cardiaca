package me.kerthy.service;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class SimpleRestServiceApplication extends Application {

	@Override
	public synchronized Restlet createInboundRoot() {
		
		// Create a router Restlet that routes each call to a
		Router router = new Router(getContext());
		router.attach("/service", SimpleRestService.class);
		router.attach("/service/{request}", SimpleRestService.class);
		return router;
	}
}
