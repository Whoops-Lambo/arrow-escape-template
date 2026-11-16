package com.google.android.recaptcha.internal;

import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zzr extends ul2 implements zr0 {
    int zza;
    final /* synthetic */ zzy zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzy zzyVar, String str, List list, dy dyVar) {
        super(2, dyVar);
        this.zzb = zzyVar;
        this.zzc = str;
        this.zzd = list;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new zzr(this.zzb, this.zzc, this.zzd, dyVar);
    }

    @Override // defpackage.zr0
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        wz2.a0(obj);
        if (i == 0) {
            zzy zzyVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzyVar.zzc(str, this);
            dz dzVar = dz.a;
            if (obj == dzVar) {
                return dzVar;
            }
        }
        this.zzd.add((zzaa) obj);
        return az2.a;
    }
}
