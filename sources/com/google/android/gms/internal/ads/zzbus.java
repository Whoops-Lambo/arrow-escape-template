package com.google.android.gms.internal.ads;

import defpackage.l04;
import defpackage.xw0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbus extends zzchh {
    public final Object c = new Object();
    public final zzbux d;
    public boolean e;

    public final void d() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.c) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
                if (this.e) {
                    com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                    return;
                }
                this.e = true;
                a(new xw0(19), new zzchd());
                a(new l04(this, 0), new l04(this, 1));
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzbus(zzbux zzbuxVar) {
        this.d = zzbuxVar;
    }
}
