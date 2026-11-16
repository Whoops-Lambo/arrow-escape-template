package io.p071bidmachine.media3.extractor.metadata.id3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e extends i {
    public final String b;
    public final String c;
    public final String d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.c.equals(eVar.c) && this.b.equals(eVar.b) && Objects.equals(this.d, eVar.d);
    }

    public final int hashCode() {
        int iC = n30.c(n30.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b), 31, this.c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // io.p071bidmachine.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
