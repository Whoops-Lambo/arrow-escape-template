package com.bytedance.sdk.component.fi;

import com.bytedance.sdk.component.ahm.kgy.ra;
import java.io.File;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm {
    final String ahm;
    final long ct;
    private final boolean gf;
    final int kgy;
    final long noq;
    final Map<String, String> rz;
    final String uq;
    ra yo;
    private File fi = null;
    private byte[] ra = null;

    public String ahm() {
        return this.ahm;
    }

    public File ct() {
        return this.fi;
    }

    public int kgy() {
        return this.kgy;
    }

    public boolean noq() {
        return this.gf;
    }

    public Map<String, String> rz() {
        return this.rz;
    }

    public String uq() {
        return this.uq;
    }

    public ra yo() {
        return this.yo;
    }

    public ahm(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.gf = z;
        this.kgy = i;
        this.ahm = str;
        this.rz = map;
        this.uq = str2;
        this.ct = j;
        this.noq = j2;
    }

    public void kgy(File file) {
        this.fi = file;
    }

    public void kgy(byte[] bArr) {
        this.ra = bArr;
    }

    public void kgy(ra raVar) {
        this.yo = raVar;
    }
}
