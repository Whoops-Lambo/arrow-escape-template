package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfeq implements zzfdt {
    public final String a;
    public final int b;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.hc)).booleanValue()) {
            String str = this.a;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("topics", str);
            }
            int i = this.b;
            if (i != -1) {
                bundle.putInt("atps", i);
            }
        }
    }

    public /* synthetic */ zzfeq(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
