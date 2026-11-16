package io.p071bidmachine.media3.extractor.metadata.emsg;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.n30;
import io.p071bidmachine.media3.common.c0;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.m;
import io.p071bidmachine.media3.common.n;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements c0 {
    public static final n g;
    public static final n h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        m mVar = new m();
        mVar.m = f0.p("application/id3");
        g = new n(mVar);
        m mVar2 = new m();
        mVar2.m = f0.p("application/x-scte35");
        h = new n(mVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.c == aVar.c && this.d == aVar.d && Objects.equals(this.a, aVar.a) && this.b.equals(aVar.b) && Arrays.equals(this.e, aVar.e);
    }

    @Override // io.p071bidmachine.media3.common.c0
    public final n getWrappedMetadataFormat() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int iC = n30.c((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31, 31, this.b);
            long j = this.c;
            int i = (iC + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    public a(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // io.p071bidmachine.media3.common.c0
    public final byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.e;
        }
        return null;
    }
}
