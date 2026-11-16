package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zzawt implements Supplier {
    public final /* synthetic */ int a;
    public static final /* synthetic */ zzawt c = new zzawt(1);
    public static final /* synthetic */ zzawt b = new zzawt(0);

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.a != 0 ? zzaxj.a(null) : new zzaww();
    }

    public /* synthetic */ zzawt(int i) {
        this.a = i;
    }
}
