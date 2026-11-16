package com.google.android.gms.internal.ads;

import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzgc implements zzao {
    public final int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzgc) && this.a == ((zzgc) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return pv1.l(i, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i).length() + 19));
    }

    public zzgc(int i) {
        this.a = i;
    }
}
