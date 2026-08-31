/*
 * Decompiled with CFR 0.152.
 */
package dsj.smtc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SmtcLoader {
    public static native String getSmtcInfo();

    static {
        try {
            String string = "/natives/smtc.dll";
            InputStream inputStream = SmtcLoader.class.getResourceAsStream(string);
            if (inputStream == null) {
                throw new FileNotFoundException("DLL not found: " + string);
            }
            File file = File.createTempFile("smtc", ".dll");
            file.deleteOnExit();
            try (FileOutputStream fileOutputStream = new FileOutputStream(file);){
                int n;
                byte[] byArray = new byte[4096];
                while ((n = inputStream.read(byArray)) != -1) {
                    ((OutputStream)fileOutputStream).write(byArray, 0, n);
                }
            }
            System.load(file.getAbsolutePath());
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to load DLL", iOException);
        }
    }
}

