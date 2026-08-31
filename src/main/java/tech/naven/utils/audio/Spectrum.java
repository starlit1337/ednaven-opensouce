/*
 * Decompiled with CFR 0.152.
 */
package tech.naven.utils.audio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Spectrum {
    public static native void setupRustAudio();

    public static native void getSpectrum(float[] var0);

    public static native void setMirror(boolean var0);

    public static native void setGain(float var0);

    static {
        try {
            String string = "/natives/fft.dll";
            InputStream inputStream = Spectrum.class.getResourceAsStream(string);
            if (inputStream == null) {
                throw new FileNotFoundException("DLL not found: " + string);
            }
            File file = File.createTempFile("fft", ".dll");
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

