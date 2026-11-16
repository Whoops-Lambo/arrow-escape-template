package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final int a;
    public final boolean b;

    public a(int i, boolean z) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (h50.C(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("OrientationSettings(orientation=");
        int i = this.a;
        if (i == 1) {
            str = "Portrait";
        } else if (i != 2) {
            str = i != 3 ? "null" : "None";
        } else {
            str = "Landscape";
        }
        sb.append(str);
        sb.append(", allowOrientationChange=");
        return h50.m(sb, this.b, ')');
    }

    public /* synthetic */ a() {
        this(3, true);
    }
}
