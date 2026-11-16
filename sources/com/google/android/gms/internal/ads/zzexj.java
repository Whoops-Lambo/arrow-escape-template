package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzexj implements zzfdt {
    public final String a;
    public final int b;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i;
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        if (TextUtils.isEmpty(str) || (i = this.b) == -1) {
            return;
        }
        Bundle bundleA = zzfmy.a(bundle, "pii");
        bundle.putBundle("pii", bundleA);
        bundleA.putString("pvid", str);
        bundleA.putInt("pvid_s", i);
    }

    public zzexj(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
