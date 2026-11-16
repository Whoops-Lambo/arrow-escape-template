package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcte implements zzcsy {
    public final zzeec a;

    @Override // com.google.android.gms.internal.ads.zzcsy
    public final void a(HashMap map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        zzeec zzeecVar = this.a;
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                zzeecVar.h(zzedy.b, true);
                return;
            }
        } else if (str.equals("flick")) {
            zzeecVar.h(zzedy.c, true);
            return;
        }
        zzeecVar.h(zzedy.a, true);
    }

    public zzcte(zzeec zzeecVar) {
        this.a = zzeecVar;
    }
}
