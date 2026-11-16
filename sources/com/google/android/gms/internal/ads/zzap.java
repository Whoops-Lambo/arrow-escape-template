package com.google.android.gms.internal.ads;

import defpackage.jc1;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzap {
    public final zzao[] a;

    public zzap(List list) {
        this.a = (zzao[]) list.toArray(new zzao[0]);
    }

    public final zzap b(zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        String str = zzfq.a;
        zzao[] zzaoVarArr2 = this.a;
        int length2 = zzaoVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzaoVarArr2, length2 + length);
        System.arraycopy(zzaoVarArr, 0, objArrCopyOf, length2, length);
        return new zzap((zzao[]) objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzap.class == obj.getClass() && Arrays.equals(this.a, ((zzap) obj).a);
    }

    public final zzap a(zzap zzapVar) {
        return zzapVar == null ? this : b(zzapVar.a);
    }

    public final int hashCode() {
        return Long.hashCode(-9223372036854775807L) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        return jc1.o("entries=", string, new StringBuilder(String.valueOf(string).length() + 8), "");
    }

    public zzap(zzao... zzaoVarArr) {
        this.a = zzaoVarArr;
    }
}
