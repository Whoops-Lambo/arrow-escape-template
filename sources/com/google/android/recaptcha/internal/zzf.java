package com.google.android.recaptcha.internal;

import defpackage.fq2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzf {
    @NotNull
    public static final zzbd zza(@NotNull Exception exc, @NotNull zzbd zzbdVar) {
        if (exc instanceof fq2) {
            return new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage());
        }
        return exc instanceof zzbd ? (zzbd) exc : zzbdVar;
    }
}
