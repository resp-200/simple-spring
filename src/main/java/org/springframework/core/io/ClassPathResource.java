package org.springframework.core.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: Zhang hao yu
 * @date: 2023/4/12
 **/
public class ClassPathResource implements Resource {
    private final String path;

    public ClassPathResource(String path) {
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        System.out.println("classpath资源加载");
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(this.path);
        if (is == null) {
            throw new FileNotFoundException(this.path + " cannot be opened because it does not exist");
        }
        return is;
    }
}
