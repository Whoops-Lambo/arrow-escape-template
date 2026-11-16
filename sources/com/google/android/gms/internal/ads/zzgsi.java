package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgsi implements zzgrr {
    public final ArrayList a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void a(HashMap map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final void b(HashMap map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final synchronized void c(HashMap map, Context context, View view) {
        ArrayList arrayList = this.a;
        map.put("vst", new ArrayList(arrayList));
        arrayList.clear();
    }
}
