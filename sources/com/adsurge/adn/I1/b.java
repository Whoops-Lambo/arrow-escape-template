package com.adsurge.adn.I1;

import com.adsurge.adn.x1.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b implements a {
    public final File a;

    public b(File file) {
        this.a = file;
    }

    public final InputStream a(File file, String str) {
        try {
            file.setLastModified(com.adsurge.adn.N.d.b().a());
            file.getName();
            return new FileInputStream(file);
        } catch (IOException unused) {
            return null;
        }
    }

    public File b(String str) {
        File file = new File(this.a, l.a(str));
        if (file.exists() && file.length() > 0) {
            return file;
        }
        return null;
    }

    @Override // com.adsurge.adn.I1.a
    public InputStream a(String str) {
        File fileB = b(str);
        if (fileB == null) {
            return null;
        }
        return a(fileB, str);
    }

    public void a(String str, byte[] bArr) throws Throwable {
        File file = new File(this.a, l.a(str));
        l.a(file, bArr);
        file.getName();
    }
}
