package com.google.android.gms.internal.ads;

import android.os.Build;
import defpackage.q63;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgha implements zzipf {
    public final zzipg a;
    public final zzipg b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        ExecutorService executorService = (ExecutorService) this.a.a;
        zzgfx zzgfxVar = (zzgfx) this.b.a;
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        q63.y(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
        sb.append(")");
        return new zzghf(executorService, sb.toString(), zzgfxVar.i0());
    }

    public zzgha(zzipg zzipgVar, zzipg zzipgVar2) {
        this.a = zzipgVar;
        this.b = zzipgVar2;
    }
}
