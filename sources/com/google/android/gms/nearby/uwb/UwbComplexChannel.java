package com.google.android.gms.nearby.uwb;

import com.google.android.gms.common.internal.Objects;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class UwbComplexChannel {
    public final int a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UwbComplexChannel)) {
            return false;
        }
        UwbComplexChannel uwbComplexChannel = (UwbComplexChannel) obj;
        return this.a == uwbComplexChannel.a && this.b == uwbComplexChannel.b;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return jc1.n("UwbComplexChannel{channel=", this.a, ", preambleIndex=", this.b, "}");
    }

    public /* synthetic */ UwbComplexChannel(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
