package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.eg4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfdn implements zzfdv {
    public final boolean a;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return zzheh.a(new eg4(this.a));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 36;
    }

    public zzfdn(zzfjl zzfjlVar) {
        boolean z;
        if (zzfjlVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
    }
}
