package org.example.content;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Content {

    static Logger log = LogManager.getLogger(Content.class.getName());

    public void print() {
        log.error("This is an Info");
    }

}
