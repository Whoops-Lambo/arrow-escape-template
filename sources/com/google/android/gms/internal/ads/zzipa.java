package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzipa {
    public final LinkedHashMap a;

    public final void a(Object obj, zzipo zzipoVar) {
        if (zzipoVar != null) {
            this.a.put(obj, zzipoVar);
        } else {
            defpackage.d.w(IronSourceConstants.EVENTS_PROVIDER);
        }
    }

    public zzipa(int i) {
        int i2;
        if (i < 3) {
            i2 = i + 1;
        } else if (i < 1073741824) {
            i2 = (int) ((i / 0.75f) + 1.0f);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        this.a = new LinkedHashMap(i2);
    }

    public void b(String str, zzipo zzipoVar) {
        a(str, zzipoVar);
    }
}
