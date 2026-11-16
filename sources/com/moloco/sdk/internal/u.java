package com.moloco.sdk.internal;

import defpackage.fh;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class u extends fh {
    public final Integer c;

    public u(Integer num) {
        super(0, 0);
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && s71.b(this.c, ((u) obj).c);
    }

    public final int hashCode() {
        Integer num = this.c;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "AnchoredAdaptive(availableWidth=" + this.c + ')';
    }
}
