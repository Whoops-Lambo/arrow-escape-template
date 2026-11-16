package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcuc implements zzcsy {
    public final zzeec a;

    @Override // com.google.android.gms.internal.ads.zzcsy
    public final void a(HashMap map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.b(str.equals("true"));
    }

    public zzcuc(zzeec zzeecVar) {
        this.a = zzeecVar;
    }
}
