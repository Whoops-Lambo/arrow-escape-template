package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public final long a;
    public final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Progress(bytesDownloaded=");
        sb.append(this.a);
        sb.append(", totalBytes=");
        return n30.o(sb, this.b, ')');
    }

    public f(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
