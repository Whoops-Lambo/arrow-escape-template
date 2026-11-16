package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.ironsource.G5;
import defpackage.jp4;
import defpackage.xp4;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcua implements zzcsy {
    public final CookieManager a;

    @Override // com.google.android.gms.internal.ads.zzcsy
    public final void a(HashMap map) {
        CookieManager cookieManager = this.a;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.H1), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.H1);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listC = zzgwo.a(new jp4(';')).c(cookie);
            for (int i = 0; i < listC.size(); i++) {
                String str3 = (String) listC.get(i);
                zzgwo zzgwoVarA = zzgwo.a(new jp4(G5.U));
                str3.getClass();
                xp4 xp4Var = (xp4) zzgwoVarA.c.g(zzgwoVarA, str3);
                if (!xp4Var.hasNext()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (0)");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                cookieManager.setCookie(str2, String.valueOf((String) xp4Var.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.r1))));
            }
        }
    }

    public zzcua(Context context) {
        this.a = com.google.android.gms.ads.internal.zzt.zzf().zza(context);
    }
}
