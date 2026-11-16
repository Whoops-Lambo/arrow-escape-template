package io.p071bidmachine.media3.extractor.metadata.id3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class o extends i {
    public final String b;
    public final String c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.a.equals(oVar.a) && Objects.equals(this.b, oVar.b) && this.c.equals(oVar.c);
    }

    public final int hashCode() {
        int iC = n30.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // io.p071bidmachine.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": url=" + this.c;
    }

    public o(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }
}
