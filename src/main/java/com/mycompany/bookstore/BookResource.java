/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookstore;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("books")
public class BookResource {

    @Path("info")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response info() {
        return Response.ok().entity("Welcome to our RESTskol library").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllBooks() {
        final List<Book> books = BookDataStore.getInstance().getBooks();
        return Response.ok()
                .entity(books)
                .build();
    }

    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBook(@PathParam("id") String id) {
        final Book book = BookDataStore.getInstance().getBook(id);
        return Response.ok() // (Response code)
                .entity(book) // (response value)
                .build();
    }
}
