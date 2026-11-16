package com.google.android.gms.internal.measurement;

import defpackage.ql3;
import defpackage.zm;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzabe {
    public static final zm b = new zm(25);
    public static final zzabe c;
    public final ql3 a;

    static {
        List list = Collections.EMPTY_LIST;
        c = new zzabe(new ql3(0));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzabe) && ((zzabe) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public zzabe(ql3 ql3Var) {
        this.a = ql3Var;
    }
}
