package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ps0;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfbd implements zzfdv {
    public final zzher a;
    public final ViewGroup b;
    public final Context c;
    public final Set d;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return this.a.submit(new ps0(this, 22));
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 22;
    }

    public zzfbd(zzher zzherVar, ViewGroup viewGroup, Context context, Set set) {
        this.a = zzherVar;
        this.d = set;
        this.b = viewGroup;
        this.c = context;
    }
}
