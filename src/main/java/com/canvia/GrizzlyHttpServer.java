package com.canvia;

import com.canvia.jpa.Repository.EntityManagerInitializer;
import com.canvia.service.AlumnoServiceImpl;
import com.canvia.service.IAlumnoService;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;
import java.util.logging.Logger;

public class GrizzlyHttpServer {

    private static final Logger logger = Logger.getLogger(GrizzlyHttpServer.class.getName());
    // Base URI the Grizzly HTTP server will listen on
    public static final String BASE_URI = "http://localhost:5002/";

    /**
     * Starts Grizzly HTTP server exposing JAX-RS resources defined in this
     * application.
     *
     * @return Grizzly HTTP server.
     */
    public static HttpServer startServer() {
        // create a resource config that scans for JAX-RS resources and providers
        // in com.canvia.testGrizzly package

        final ResourceConfig rc = new ResourceConfig().packages("com.canvia.controller");
        rc.register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(AlumnoServiceImpl.class).to(IAlumnoService.class);
            }
        });
        rc.register(new AbstractBinder() {
            @Override
            protected void configure() {
                bindAsContract(EntityManagerInitializer.class);
            }
        });
        // create and start a new instance of grizzly http server
        // exposing the Jersey application at BASE_URI
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    /**
     * Main method.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        final HttpServer server = startServer();
        logger.info(String.format("Jersey app started with endpoints available at " + "%s%nHit Ctrl-C to stop it...", BASE_URI));
        System.in.read();
        server.stop();
    }
}
