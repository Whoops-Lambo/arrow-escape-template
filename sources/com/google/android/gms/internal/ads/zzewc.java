package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzewc implements zzfdt {
    public final String a;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putString("ms", this.a);
    }

    public zzewc(String str) {
        this.a = str;
    }
}
