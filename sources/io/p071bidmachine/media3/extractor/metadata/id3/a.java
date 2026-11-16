package io.p071bidmachine.media3.extractor.metadata.id3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import io.p071bidmachine.media3.common.a0;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends i {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // io.p071bidmachine.media3.common.c0
    public final void a(a0 a0Var) {
        a0Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.d == aVar.d && this.b.equals(aVar.b) && Objects.equals(this.c, aVar.c) && Arrays.equals(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = n30.c((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // io.p071bidmachine.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
