package de.wacodis.data.access.datawrapper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import de.wacodis.dataaccess.model.AbstractResource;
import de.wacodis.dataaccess.model.DataAccessResourceSearchBody;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author <a href="mailto:arne.vogt@hs-bochum.de">Arne Vogt</a>
 */
public interface ResourceSearcher {
    
    Map<String, List<AbstractResource>> query(DataAccessResourceSearchBody searchBody) throws IOException;
    
}
