package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import defpackage.dr0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzctu implements zzcsy {
    public final zzflp a;

    @Override // com.google.android.gms.internal.ads.zzcsy
    public final void a(HashMap map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.a.a(Boolean.parseBoolean(str));
        } catch (Exception e) {
            dr0.l("Invalid render_in_browser state", e);
        }
    }

    public zzctu(zzflp zzflpVar) {
        this.a = zzflpVar;
    }
}
