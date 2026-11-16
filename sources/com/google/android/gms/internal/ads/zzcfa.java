package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcfa implements zzbfr {
    public final Context a;
    public final Object b;
    public final String c;
    public boolean d;

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void K(zzbfq zzbfqVar) {
        d(zzbfqVar.j);
    }

    public zzcfa(Context context, String str) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = str;
        this.d = false;
        this.b = new Object();
    }

    public final void d(boolean z) {
        zzcfd zzcfdVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.a;
        if (!zzcfdVarZzD.a(context)) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.d == z) {
                    return;
                }
                this.d = z;
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.d) {
                    zzcfd zzcfdVarZzD2 = com.google.android.gms.ads.internal.zzt.zzD();
                    if (zzcfdVarZzD2.a(context)) {
                        zzcfdVarZzD2.j(context, str, "beginAdUnitExposure");
                    }
                } else {
                    zzcfd zzcfdVarZzD3 = com.google.android.gms.ads.internal.zzt.zzD();
                    if (zzcfdVarZzD3.a(context)) {
                        zzcfdVarZzD3.j(context, str, "endAdUnitExposure");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
