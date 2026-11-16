package io.p071bidmachine.media3.extractor.metadata.id3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends i {
    public final byte[] b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && Arrays.equals(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + n30.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a);
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }
}
