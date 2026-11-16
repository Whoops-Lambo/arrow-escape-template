package com.google.android.recaptcha;

import defpackage.dy;
import defpackage.dz;
import defpackage.fy;
import defpackage.k52;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Recaptcha$getClient$1 extends fy {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, dy dyVar) {
        super(dyVar);
        this.zzb = recaptcha;
    }

    @Override // defpackage.ph
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM304getClientBWLJW6A = this.zzb.m304getClientBWLJW6A(null, null, 0L, this);
        return objM304getClientBWLJW6A == dz.a ? objM304getClientBWLJW6A : new k52(objM304getClientBWLJW6A);
    }
}
