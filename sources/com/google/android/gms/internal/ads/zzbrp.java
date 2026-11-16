package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbrp implements zzbqs {
    public final zzeec a;

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        zzeec zzeecVar = this.a;
        String str = (String) map.get(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        synchronized (zzeecVar) {
            zzeecVar.o = str;
            zzeecVar.q = j;
            zzeecVar.m();
        }
    }

    public zzbrp(zzeec zzeecVar) {
        Preconditions.checkNotNull(zzeecVar, "The Inspector Manager must not be null");
        this.a = zzeecVar;
    }
}
