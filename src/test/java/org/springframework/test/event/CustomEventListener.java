package org.springframework.test.event;

import org.springframework.context.ApplicationListener;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/14
 **/
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(this.getClass().getName());
    }
}
