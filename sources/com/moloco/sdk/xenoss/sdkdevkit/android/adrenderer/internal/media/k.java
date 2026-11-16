package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class k {
    public final int a;
    public final boolean b;
    public final double c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b && Double.compare(this.c, kVar.c) == 0;
    }

    public final int hashCode() {
        return Integer.hashCode(209715200) + ((Double.hashCode(this.c) + jc1.f(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "MediaConfig(chunkSize=" + this.a + ", isStreamingEnabled=" + this.b + ", minStreamingPlayableDurationOnTimeoutSecs=" + this.c + ", mediaCacheDiskCleanUpLimit=209715200)";
    }

    public k(double d, int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = d;
    }
}
