package com.bytedance.adsdk.ahm.rz;

import com.bytedance.adsdk.ahm.rz.ahm.dg;
import defpackage.n30;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class uq {
    private final char ahm;
    private final String ct;
    private final List<dg> kgy;
    private final String noq;
    private final double rz;
    private final double uq;

    public static int kgy(char c, String str, String str2) {
        return str2.hashCode() + n30.c(c * 31, 31, str);
    }

    public double ahm() {
        return this.uq;
    }

    public int hashCode() {
        return kgy(this.ahm, this.noq, this.ct);
    }

    public uq(List<dg> list, char c, double d, double d2, String str, String str2) {
        this.kgy = list;
        this.ahm = c;
        this.rz = d;
        this.uq = d2;
        this.ct = str;
        this.noq = str2;
    }

    public List<dg> kgy() {
        return this.kgy;
    }
}
