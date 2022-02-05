
package backend.resources;

import java.util.*;

public class Hypermedia 
{
    private List<LinkResource> links = new ArrayList<>();

    public void addLink(LinkResource linkResource){
        this.links.add(linkResource);
    }

    public List<LinkResource> getLinks() {
        return links;
    }

    public void setLinks(List<LinkResource> links) {
        this.links = links;
    }
}
