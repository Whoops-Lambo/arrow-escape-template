package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajr implements zzao {
    public final long a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzajr.class == obj.getClass() && this.a == ((zzajr) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public final String toString() {
        long j = this.a;
        return q63.g(j, "ThumbnailMetadata: presentationTimeUs=", new StringBuilder(String.valueOf(j).length() + 38));
    }

    public zzajr(long j) {
        this.a = j;
    }
}
