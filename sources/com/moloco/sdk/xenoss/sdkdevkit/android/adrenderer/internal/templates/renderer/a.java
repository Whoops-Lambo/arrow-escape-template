package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final String a;
    public final String b;
    public final float c;
    public final long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b) && Float.compare(this.c, aVar.c) == 0 && this.d == aVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + n30.b(this.c, n30.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreativeRenderingCheckParams(eventUrl=");
        sb.append(this.a);
        sb.append(", creativeType=");
        sb.append(this.b);
        sb.append(", opacityRate=");
        sb.append(this.c);
        sb.append(", captureDelayMillis=");
        return n30.o(sb, this.d, ')');
    }

    public a(String str, String str2, float f, long j) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = j;
    }
}
