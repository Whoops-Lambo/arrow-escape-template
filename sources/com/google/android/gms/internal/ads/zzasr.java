package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzasr implements zzago {
    public final zzey a = new zzey(4);
    public final zzaht b = new zzaht(-1, -1, MimeTypes.IMAGE_WEBP);

    @Override // com.google.android.gms.internal.ads.zzago
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void a(long j, long j2) {
        this.b.a(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final boolean b(zzagp zzagpVar) throws EOFException, InterruptedIOException {
        zzey zzeyVar = this.a;
        zzeyVar.y(4);
        zzagf zzagfVar = (zzagf) zzagpVar;
        zzagfVar.d(zzeyVar.a, 0, 4, false);
        if (zzeyVar.P() == 1380533830) {
            zzagfVar.k(4, false);
            zzeyVar.y(4);
            zzagfVar.d(zzeyVar.a, 0, 4, false);
            if (zzeyVar.P() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final int c(zzagp zzagpVar, zzaho zzahoVar) {
        return this.b.c(zzagpVar, zzahoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzago
    public final void d(zzagr zzagrVar) {
        this.b.d(zzagrVar);
    }
}
