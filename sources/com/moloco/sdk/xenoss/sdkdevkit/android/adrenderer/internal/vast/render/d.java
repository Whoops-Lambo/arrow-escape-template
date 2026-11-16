package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends f {
    public final int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "Countdown(seconds=" + ((Object) String.valueOf(((long) this.a) & 4294967295L)) + ')';
    }

    public d(int i) {
        this.a = i;
    }
}
