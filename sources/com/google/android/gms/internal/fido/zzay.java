package com.google.android.gms.internal.fido;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzay {
    public final Set a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzay() {
        this(d.j, false);
        int i = zzcf.c;
    }

    public final zzaq a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        int i = zzar.a;
        return new zzaq(boolValueOf);
    }

    public zzay(Set set, boolean z) {
        this.a = set;
    }
}
