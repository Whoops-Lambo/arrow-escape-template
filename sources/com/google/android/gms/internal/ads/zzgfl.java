package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgfl implements zzipf {
    public final zzipg a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        File dir = ((Context) this.a.a).getDir("yqzdkcache", 0);
        zzipn.a(dir);
        return dir;
    }

    public zzgfl(zzipg zzipgVar) {
        this.a = zzipgVar;
    }
}
