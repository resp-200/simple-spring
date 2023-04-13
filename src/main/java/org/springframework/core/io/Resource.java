package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源的抽象和访问接口
 * @author: Zhang hao yu
 * @date: 2023/4/12
 **/
public interface Resource {

    InputStream getInputStream() throws IOException;

}
