package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.nf4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeye implements zzfdv {
    public final zzfip a;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        zzfip zzfipVar = this.a;
        if (zzfipVar == null) {
            return zzheh.a(new nf4(null, 1));
        }
        String str = zzfipVar.a;
        return Strings.isEmptyOrWhitespace(str) ? zzheh.a(new nf4(null, 1)) : zzheh.a(new nf4(str, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 15;
    }

    public zzeye(zzfip zzfipVar) {
        this.a = zzfipVar;
    }
}
