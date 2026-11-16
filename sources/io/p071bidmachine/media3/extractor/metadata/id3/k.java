package io.p071bidmachine.media3.extractor.metadata.id3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class k extends i {
    public final String b;
    public final String c;
    public final String d;

    public k(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.c.equals(kVar.c) && this.b.equals(kVar.b) && this.d.equals(kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n30.c(n30.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b), 31, this.c);
    }

    @Override // io.p071bidmachine.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
