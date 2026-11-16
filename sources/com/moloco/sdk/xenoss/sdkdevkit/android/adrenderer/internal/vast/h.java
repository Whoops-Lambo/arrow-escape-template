package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.jc1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    public final int a;
    public final Set b;
    public final boolean c;
    public final f d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b.equals(hVar.b) && this.c == hVar.c && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + jc1.f((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "WrapperChainParams(wrapperDepth=" + this.a + ", usedVastAdTagUrls=" + this.b + ", followAdditionalWrappers=" + this.c + ", aggregatedWrapperChainData=" + this.d + ')';
    }

    public h(int i, Set set, boolean z, f fVar) {
        this.a = i;
        this.b = set;
        this.c = z;
        this.d = fVar;
    }
}
