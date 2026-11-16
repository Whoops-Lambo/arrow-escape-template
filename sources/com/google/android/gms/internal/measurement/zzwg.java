package com.google.android.gms.internal.measurement;

import defpackage.ia5;
import defpackage.na5;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzwg extends na5 {
    public static final zzwg g;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        g = new zzwg("<skip trace>", uuidRandomUUID, ia5.b(uuidRandomUUID), j.e, zzvy.c());
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws e(String str, zzwl zzwlVar, zzwq zzwqVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return j.e;
    }
}
