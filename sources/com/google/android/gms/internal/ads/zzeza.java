package com.google.android.gms.internal.ads;

import defpackage.uy3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeza implements zzipf {
    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        uy3 uy3Var = zzbjr.Ed;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).split(","));
        }
        zzipn.a(arrayList);
        return arrayList;
    }
}
