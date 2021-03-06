/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.wacodis.dataaccess.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author <a href="mailto:arne.vogt@hs-bochum.de">Arne Vogt</a>
 */
@Configuration
@ConfigurationProperties("spring.resources-api.elasticsearch")
@EnableConfigurationProperties
public class ElasticsearchResourcesAPIConfiguration {
    
    private String uri;
    private String indexName;
    private long requestTimeout_Millis;
    
    /**
     * get uri of elasticsearch instance
     * @return 
     */
    public String getUri() {
        return uri;
    }

    /**
     * set uri of elasticsearch instance
     * @param uri 
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

   /**
    * get index that should be queried
    * @return 
    */ 
    public String getIndexName() {
        return indexName;
    }

    /**
     * set index that should be queried
     * @param indexName 
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * get request requestTimeout_Millis in millis
     * @return 
     */
    public long getRequestTimeout_Millis() {
        return requestTimeout_Millis;
    }

    /**
     * set request requestTimeout_Millis in millis
     * @param requestTimeout_Millis 
     */
    public void setRequestTimeout_Millis(long requestTimeout_Millis) {
        this.requestTimeout_Millis = requestTimeout_Millis;
    }
}
