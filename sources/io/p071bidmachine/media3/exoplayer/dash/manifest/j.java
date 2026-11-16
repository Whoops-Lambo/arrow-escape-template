package io.p071bidmachine.media3.exoplayer.dash.manifest;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.jc1;
import io.p071bidmachine.media3.common.util.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public final j a(j jVar, String str) {
        String strX = a.x(str, this.c);
        if (jVar == null) {
            return null;
        }
        long j = jVar.b;
        if (!strX.equals(a.x(str, jVar.c))) {
            return null;
        }
        long j2 = this.b;
        if (j2 != -1) {
            long j3 = this.a;
            if (j3 + j2 == jVar.a) {
                return new j(strX, j3, j != -1 ? j2 + j : -1L);
            }
        }
        if (j == -1) {
            return null;
        }
        long j4 = jVar.a;
        if (j4 + j == this.a) {
            return new j(strX, j4, j2 != -1 ? j + j2 : -1L);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && this.c.equals(jVar.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return jc1.m(this.b, ")", sb);
    }

    public j(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }
}
