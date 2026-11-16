package io.p071bidmachine.media3.extractor.metadata.id3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends i {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final i[] f;

    public d(String str, boolean z, boolean z2, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.c == dVar.c && this.d == dVar.d && this.b.equals(dVar.b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f, dVar.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
