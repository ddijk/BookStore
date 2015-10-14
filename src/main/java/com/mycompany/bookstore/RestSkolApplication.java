/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookstore;

import org.glassfish.jersey.jackson.JacksonFeature;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;

// See http://cloudskol.com/index.php/2015/09/25/marshalling-java-to-json-never-be-hard-anymore/?elq_mid=28652&sh=&cmid=WWMK15020783MPP039C002
public class RestSkolApplication extends ResourceConfig {

    public RestSkolApplication() {
        register(JacksonFeature.class);
    }
}
