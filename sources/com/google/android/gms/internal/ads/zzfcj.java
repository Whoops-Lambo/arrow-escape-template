package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.singular.sdk.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfcj implements zzfdt {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfmy.e(Constants.REVENUE_PRODUCT_NAME_KEY, bundle, this.a);
        Integer num = this.b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        zzfmy.e("vnm", bundle, this.c);
        zzfmy.e(CmcdConfiguration.KEY_DEADLINE, bundle, this.d);
        zzfmy.e("ins_pn", bundle, this.e);
        zzfmy.e("ini_pn", bundle, this.f);
    }

    public zzfcj(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }
}
