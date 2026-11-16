package com.adsurge.adn.oversea_ad;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class Grape {
    public static ArrayList a(File file) throws IOException {
        ArrayList arrayList = new ArrayList();
        JarFile jarFile = new JarFile(file);
        try {
            Certificate[] certificateArrA = a(jarFile, jarFile.getJarEntry("AndroidManifest.xml"), new byte[8192]);
            if (certificateArrA != null) {
                for (Certificate certificate : certificateArrA) {
                    arrayList.add(c.a(Casaba.a(certificate.getEncoded())));
                }
            }
            jarFile.close();
            return arrayList;
        } catch (Exception unused) {
            jarFile.close();
            return arrayList;
        } catch (Throwable th) {
            jarFile.close();
            throw th;
        }
    }

    public static Certificate[] a(JarFile jarFile, JarEntry jarEntry, byte[] bArr) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = jarFile.getInputStream(jarEntry);
            do {
                try {
                } catch (IOException unused) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } while (inputStream.read(bArr, 0, bArr.length) != -1);
            Certificate[] certificates = jarEntry != null ? jarEntry.getCertificates() : null;
            try {
                inputStream.close();
            } catch (IOException unused4) {
            }
            return certificates;
        } catch (IOException unused5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
