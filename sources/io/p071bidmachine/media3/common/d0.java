package io.p071bidmachine.media3.common;

import defpackage.h00;
import io.p071bidmachine.media3.common.util.x;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class d0 {
    public final c0[] a;
    public final long b;

    public d0(List list) {
        this((c0[]) list.toArray(new c0[0]));
    }

    public final d0 a(c0... c0VarArr) {
        if (c0VarArr.length == 0) {
            return this;
        }
        int i = x.a;
        c0[] c0VarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(c0VarArr2, c0VarArr2.length + c0VarArr.length);
        System.arraycopy(c0VarArr, 0, objArrCopyOf, c0VarArr2.length, c0VarArr.length);
        return new d0(this.b, (c0[]) objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (Arrays.equals(this.a, d0Var.a) && this.b == d0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final d0 b(d0 d0Var) {
        return d0Var == null ? this : a(d0Var.a);
    }

    public final int hashCode() {
        return h00.k(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public d0(long j, c0... c0VarArr) {
        this.b = j;
        this.a = c0VarArr;
    }

    public d0(c0... c0VarArr) {
        this(-9223372036854775807L, c0VarArr);
    }
}
