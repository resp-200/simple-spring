package org.springframework.core.io;

/**
 * 资源加载器接口
 *
 * @author: Zhang hao yu
 * @date: 2023/4/12
 **/
public interface ResourceLoader {
    Resource getResource(String location);
}
