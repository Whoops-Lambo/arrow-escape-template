package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends g {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a.equals(((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(failure=" + this.a + ')';
    }

    public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g gVar) {
        this.a = gVar;
    }
}
