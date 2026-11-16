package com.google.android.gms.common;

import defpackage.dr0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzx extends zzy {
    private final Callable zze;

    public /* synthetic */ zzx(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.zze = callable;
    }

    @Override // com.google.android.gms.common.zzy
    public final String zza() {
        try {
            return (String) this.zze.call();
        } catch (Exception e) {
            dr0.m(e);
            return null;
        }
    }
}
