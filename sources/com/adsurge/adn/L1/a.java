package com.adsurge.adn.L1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a {
    public final File a;

    public InputStream a(String str, String str2) {
        File file = new File(this.a, str2);
        if (!file.exists()) {
            return null;
        }
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public a(File file) {
        this.a = file;
    }

    public boolean a(String str) {
        return new File(this.a, str).exists();
    }
}
