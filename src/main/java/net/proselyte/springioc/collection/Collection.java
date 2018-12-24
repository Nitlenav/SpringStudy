package net.proselyte.springioc.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collection {
    private List list;
    private Set set;
    private Map map;
    private Properties properties;

    public List getList() {
        System.out.println("List collection " + list);
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        System.out.println("Set collection " + set);
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        System.out.println("Map collection " + map);
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        System.out.println("Properties collection " + properties);
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
