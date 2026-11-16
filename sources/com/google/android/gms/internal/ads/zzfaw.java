package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfaw implements zzfdt {
    public final Integer a;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Integer num = this.a;
        if (num != null) {
            bundle.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }

    public zzfaw(Integer num) {
        this.a = num;
    }
}
