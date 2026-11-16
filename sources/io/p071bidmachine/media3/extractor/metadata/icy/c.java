package io.p071bidmachine.media3.extractor.metadata.icy;

import defpackage.nj;
import defpackage.pv1;
import io.p071bidmachine.media3.common.a0;
import io.p071bidmachine.media3.common.c0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements c0 {
    public final byte[] a;
    public final String b;
    public final String c;

    @Override // io.p071bidmachine.media3.common.c0
    public final void a(a0 a0Var) {
        String str = this.b;
        if (str != null) {
            a0Var.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return nj.l(this.a.length, "\"", pv1.r("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }

    public c(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }
}
