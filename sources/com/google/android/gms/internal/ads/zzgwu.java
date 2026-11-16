package com.google.android.gms.internal.ads;

import defpackage.aq4;
import defpackage.zp4;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgwu {
    public static zzgwr a(zzgwr zzgwrVar) {
        if ((zzgwrVar instanceof aq4) || (zzgwrVar instanceof zp4)) {
            return zzgwrVar;
        }
        return zzgwrVar instanceof Serializable ? new zp4(zzgwrVar) : new aq4(zzgwrVar);
    }
}
