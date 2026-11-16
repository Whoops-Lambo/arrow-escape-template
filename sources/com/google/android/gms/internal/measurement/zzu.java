package com.google.android.gms.internal.measurement;

import defpackage.jw4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzu extends zzai {
    public final jw4 c;

    public zzu(jw4 jw4Var) {
        super("internal.appMetadata");
        this.c = jw4Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao b(zzg zzgVar, List list) {
        try {
            return zzi.a(this.c.call());
        } catch (Exception unused) {
            return zzao.e9;
        }
    }
}
