package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzhu extends zzho {
    public zzia e;
    public byte[] f;
    public int g;
    public int h;

    public zzhu() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int i(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = zzfq.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        m(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Uri zzc() {
        zzia zziaVar = this.e;
        if (zziaVar != null) {
            return zziaVar.a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzd() {
        if (this.f != null) {
            this.f = null;
            n();
        }
        this.e = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final long e(zzia zziaVar) throws zzhx, zzat {
        k(zziaVar);
        this.e = zziaVar;
        Uri uriNormalizeScheme = zziaVar.a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzgvz.e("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zzfq.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length == 2) {
            String str2 = strArrSplit[1];
            if (strArrSplit[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    throw zzat.a("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e);
                }
            } else {
                this.f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j = zziaVar.c;
            int length = this.f.length;
            if (j <= length) {
                int i = (int) j;
                this.g = i;
                int i2 = length - i;
                this.h = i2;
                long j2 = zziaVar.d;
                if (j2 != -1) {
                    this.h = (int) Math.min(i2, j2);
                }
                l(zziaVar);
                if (j2 != -1) {
                    return j2;
                }
                return this.h;
            }
            this.f = null;
            throw new zzhx(2008);
        }
        throw zzat.a("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
    }
}
