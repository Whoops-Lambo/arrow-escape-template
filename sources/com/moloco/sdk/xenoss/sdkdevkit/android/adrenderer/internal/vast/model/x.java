package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class x extends y {
    public final long a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.a == ((x) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return n30.o(new StringBuilder("Time(millis="), this.a, ')');
    }

    public x(long j) {
        this.a = j;
    }
}
