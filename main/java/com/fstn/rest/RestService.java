package com.fstn.rest;

import com.fstn.facade.Facade;
import com.fstn.model.ResultDTO;
import com.fstn.model.SearchResultMetadata;
import com.fstn.utils.SortParameterParser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by SZA on 04/03/2016.
 */

@Path("/v1/rsql")
public class RestService {
    /**
     * The entity manager.
     */
    @PersistenceContext()
    protected EntityManager entityManager;


    private Facade facade;

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON})
    public ResultDTO getDataFromQueryRsql(@QueryParam("query") String query,
                                          @QueryParam("start") int start,
                                          @DefaultValue("10") @QueryParam("size") int size,
                                          @QueryParam("sort") String sort) throws Exception {
        try {
            checkMaxSize(size);
            checkRSQLQuery(query);

            Long count = facade.countByQueryRSQL(query);
            List<Object> data = null;
            if (count > 0) {
                data = facade.findByQueryRSQL(query, start, size, SortParameterParser.parse(sort)
                        .getDirection(), SortParameterParser.parse(sort).getField());
            }
            SearchResultMetadata metaData = new SearchResultMetadata(count, (size < count) ? new Long(size) : count);
            return new ResultDTO(metaData, data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void checkRSQLQuery(String query) {
    }

    private void checkMaxSize(int size) {
    }

}