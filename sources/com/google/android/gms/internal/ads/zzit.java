package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzit implements zzhw {
    public final zzhw a;
    public Map b;

    @Override // com.google.android.gms.internal.ads.zzhw
    public final long e(zzia zziaVar) {
        zzhw zzhwVar = this.a;
        Uri uri = zziaVar.a;
        this.b = Collections.EMPTY_MAP;
        try {
            return zzhwVar.e(zziaVar);
        } finally {
            zzhwVar.zzc();
            this.b = zzhwVar.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int i(byte[] bArr, int i, int i2) {
        return this.a.i(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Map zzj() {
        return this.a.zzj();
    }

    public zzit(zzhw zzhwVar) {
        this.a = zzhwVar;
        Uri uri = Uri.EMPTY;
        this.b = Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void a(zziu zziuVar) {
        zziuVar.getClass();
        this.a.a(zziuVar);
    }
}
