package com.google.android.gms.internal.measurement;

import defpackage.i45;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzaiw implements zzaiv {
    public static final i45 a = zzagr.c.a("measurement.client.sessions.enable_fix_background_engagement", true);

    @Override // com.google.android.gms.internal.measurement.zzaiv
    public final boolean zza() {
        return ((Boolean) a.get()).booleanValue();
    }
}
