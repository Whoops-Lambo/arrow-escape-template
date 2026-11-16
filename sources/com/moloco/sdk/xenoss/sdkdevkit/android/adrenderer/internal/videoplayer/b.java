package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.h50;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
public final class b {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
    }

    public static b a(b bVar, boolean z) {
        boolean z2 = bVar.a;
        boolean z3 = bVar.c;
        bVar.getClass();
        return new b(z2, z, z3);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + jc1.f(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayingState(isPlaying=");
        sb.append(this.a);
        sb.append(", isVisible=");
        sb.append(this.b);
        sb.append(", hasMore=");
        return h50.m(sb, this.c, ')');
    }

    public b(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
