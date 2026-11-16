package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.a24;
import defpackage.c14;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcd implements zzck {
    public static final zzcg h = new a24() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcg
        @Override // defpackage.a24
        public final void a(zzcd zzcdVar) {
            zzcg zzcgVar = zzcd.h;
        }
    };
    public final zzbt a;
    public final zzxh b;
    public final zzbv c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final a24 g;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzck
    public final zzbt zzb() {
        this.g.a(this);
        return this.a;
    }

    public zzcd(zzbt zzbtVar, zzxh zzxhVar, int i, boolean z, boolean z2, a24 a24Var) {
        zzbv zzbvVar;
        this.a = zzbtVar;
        this.b = zzxhVar;
        int i2 = c14.a[zzxhVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                zzbvVar = zzbv.c;
            } else {
                zzbvVar = zzbv.d;
            }
        } else {
            zzbvVar = zzbv.b;
        }
        this.c = zzbvVar;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = a24Var;
    }
}
