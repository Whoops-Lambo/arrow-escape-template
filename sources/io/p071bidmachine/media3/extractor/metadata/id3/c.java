package io.p071bidmachine.media3.extractor.metadata.id3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends i {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final i[] g;

    public c(String str, int i, int i2, long j, long j2, i[] iVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.b.equals(cVar.b) && Arrays.equals(this.g, cVar.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
