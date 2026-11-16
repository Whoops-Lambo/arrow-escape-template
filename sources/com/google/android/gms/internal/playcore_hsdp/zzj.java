package com.google.android.gms.internal.playcore_hsdp;

import defpackage.dx4;
import defpackage.rr4;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzj {
    public static zzg a(zzg zzgVar) {
        if ((zzgVar instanceof dx4) || (zzgVar instanceof rr4)) {
            return zzgVar;
        }
        return zzgVar instanceof Serializable ? new rr4(zzgVar) : new dx4(zzgVar);
    }
}
