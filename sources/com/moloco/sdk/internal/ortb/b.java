package com.moloco.sdk.internal.ortb;

import defpackage.pv1;
import defpackage.s71;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends c {
    public final List a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && s71.b(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return pv1.q(new StringBuilder("MissingRequiredFields(fields="), this.a, ')');
    }

    public b(List list) {
        list.getClass();
        this.a = list;
    }
}
