package com.google.android.recaptcha.internal;

import defpackage.d;
import defpackage.nj;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zzkz extends zzlc {
    private final int zzc;

    @Override // com.google.android.recaptcha.internal.zzlc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzlc) this).zza[i];
        }
        if (i < 0) {
            d.l(pv1.k(i, "Index < 0: "));
            return (byte) 0;
        }
        d.l(nj.i(i, i2, "Index > length: ", ", "));
        return (byte) 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zzb(int i) {
        return ((zzlc) this).zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzlc) this).zza, 0, bArr, 0, i3);
    }

    public zzkz(byte[] bArr, int i, int i2) {
        super(bArr);
        zzle.zzi(0, i2, bArr.length);
        this.zzc = i2;
    }
}
