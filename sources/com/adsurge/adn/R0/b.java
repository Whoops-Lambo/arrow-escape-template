package com.adsurge.adn.R0;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b extends c {
    public final File b;
    public String c;

    public b(File file, String str) {
        super(new e(new FileInputStream(file)));
        this.b = file;
        this.c = str;
    }

    @Override // com.adsurge.adn.R0.c, com.adsurge.adn.R0.d
    public void reset() {
        this.a.close();
        this.a = new e(new FileInputStream(this.b));
    }
}
