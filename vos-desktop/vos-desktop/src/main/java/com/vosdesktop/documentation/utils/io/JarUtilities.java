/*
 * JarUtils.java
 *
 * Created on June 4, 2007, 11:10 AM
 */
package com.vosdesktop.documentation.utils.io;

import java.io.File;
import java.net.URL;
import java.util.zip.ZipEntry;

public abstract class JarUtilities {

    private JarUtilities() {}

    public static File getFile(ZipEntry entry) {
        URL urlJarEntry = Thread.currentThread().getContextClassLoader().
                getResource(entry.getName());
        return new File(urlJarEntry.toString());
    }

}
