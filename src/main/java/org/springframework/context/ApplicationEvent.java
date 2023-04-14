package org.springframework.context;

import java.util.EventObject;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/14
 **/
public class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
