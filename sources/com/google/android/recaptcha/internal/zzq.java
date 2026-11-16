package com.google.android.recaptcha.internal;

import defpackage.dy;
import defpackage.dz;
import defpackage.fy;
import defpackage.k52;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zzq extends fy {
    /* synthetic */ Object zza;
    final /* synthetic */ zzv zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(zzv zzvVar, dy dyVar) {
        super(dyVar);
        this.zzb = zzvVar;
    }

    @Override // defpackage.ph
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzf = this.zzb.zzf(null, this);
        return objZzf == dz.a ? objZzf : new k52(objZzf);
    }
}
