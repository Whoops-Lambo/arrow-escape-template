package com.inmobi.media;

import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Jg {
    public static final /* synthetic */ int e = 0;
    public boolean a = true;
    public String b = "none";
    public String c = "right";
    public String d;

    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        StringBuilder sb = new StringBuilder("OrientationProperties(allowOrientationChange=");
        sb.append(z);
        sb.append(", forceOrientation='");
        sb.append(str);
        sb.append("', direction='");
        return pv1.p(sb, str2, "', creativeSuppliedProperties=", str3, ")");
    }
}
