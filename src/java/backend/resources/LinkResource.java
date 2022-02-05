/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.resources;

import javax.xml.bind.annotation.XmlRootElement;
import java.net.URI;
import javax.ws.rs.core.Link;

/**
 *
 * @author Eze
 */
@XmlRootElement
public class LinkResource 
{
    private String rel;
    private String type;
    private URI uri;

    public LinkResource(){}

    public LinkResource(Link link) {
        this.rel = link.getRel();
        this.type = link.getType();
        this.uri = link.getUri();
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }
    
     @Override
    public String toString() {
        return "LinkResource{" +
                "rel='" + rel + '\'' +
                ", type='" + type + '\'' +
                ", uri=" + uri +
                '}';
    }

}
