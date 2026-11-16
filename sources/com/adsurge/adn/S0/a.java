package com.adsurge.adn.S0;

import com.adsurge.adn.R0.d;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a implements b {
    public final File a;
    public String b;

    @Override // com.adsurge.adn.S0.b
    public synchronized d a() {
        return new com.adsurge.adn.R0.b(this.a, this.b);
    }

    public a(File file, String str) {
        this.a = file;
        this.b = str;
    }
}
