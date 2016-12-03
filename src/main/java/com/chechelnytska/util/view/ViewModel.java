package com.chechelnytska.util.view;

import java.util.HashMap;
import java.util.Map;

public class ViewModel {
    private final Map<String, Object> attributes = new HashMap<String, Object>();
    private final String view;

    public ViewModel(String view) {
        this.view = view;
    }

    public ViewModel withAttribute(String attr, Object value){
        attributes.put(attr, value);
        return this;
    }

    public String getView() {
        return view;
    }

    public Map<String, Object> getAttribute() {
        return attributes;
    }

    public Object getAttribute(String attr) {
        return attributes.get(attr);
    }
}
