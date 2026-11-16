package io.p071bidmachine.media3.extractor.metadata.id3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class m extends i {
    public final String b;
    public final byte[] c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.b.equals(mVar.b) && Arrays.equals(this.c, mVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + n30.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.b);
    }

    @Override // io.p071bidmachine.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
