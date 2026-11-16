package io.p071bidmachine.media3.datasource;

import android.net.Uri;
import android.util.Base64;
import io.p071bidmachine.media3.common.g0;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.x;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class f extends c {
    public k e;
    public byte[] f;
    public int g;
    public int h;

    @Override // io.p071bidmachine.media3.datasource.h
    public final void close() {
        if (this.f != null) {
            this.f = null;
            d();
        }
        this.e = null;
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final Uri getUri() {
        k kVar = this.e;
        if (kVar != null) {
            return kVar.a;
        }
        return null;
    }

    @Override // io.p071bidmachine.media3.common.g
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        int i4 = x.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        c(iMin);
        return iMin;
    }

    @Override // io.p071bidmachine.media3.datasource.h
    public final long a(k kVar) throws g0, i {
        e();
        this.e = kVar;
        Uri uri = kVar.a;
        long j = kVar.f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        a.b("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = x.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length == 2) {
            String str = strArrSplit[1];
            if (strArrSplit[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw g0.b("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j2 = kVar.e;
            byte[] bArr = this.f;
            if (j2 <= bArr.length) {
                int i2 = (int) j2;
                this.g = i2;
                int length = bArr.length - i2;
                this.h = length;
                if (j != -1) {
                    this.h = (int) Math.min(length, j);
                }
                f(kVar);
                if (j != -1) {
                    return j;
                }
                return this.h;
            }
            this.f = null;
            throw new i(2008);
        }
        throw g0.b("Unexpected URI format: " + uriNormalizeScheme, null);
    }
}
