package com.google.android.recaptcha.internal;

import defpackage.d;
import defpackage.nj;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class zzlc extends zzlb {
    protected final byte[] zza;

    public zzlc(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzle) || zzd() != ((zzle) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzlc)) {
            return obj.equals(this);
        }
        zzlc zzlcVar = (zzlc) obj;
        int iZzj = zzj();
        int iZzj2 = zzlcVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzlcVar.zzd()) {
            y.c(iZzd, zzd());
            return false;
        }
        if (iZzd > zzlcVar.zzd()) {
            d.r(nj.i(iZzd, zzlcVar.zzd(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlcVar.zza;
        zzlcVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < iZzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final int zzf(int i, int i2, int i3) {
        return zznl.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final zzle zzg(int i, int i2) {
        int iZzi = zzle.zzi(0, i2, zzd());
        if (iZzi == 0) {
            return zzle.zzb;
        }
        return new zzkz(this.zza, 0, iZzi);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final void zzh(zzkw zzkwVar) throws IOException {
        ((zzlk) zzkwVar).zzc(this.zza, 0, zzd());
    }
}
