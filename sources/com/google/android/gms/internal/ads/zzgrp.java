package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgrp {
    public final Set a;
    public final zzgsi b;

    public final HashMap a() {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zzgrr) it.next()).b(map);
        }
        return map;
    }

    public final HashMap b(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zzgrr) it.next()).c(map, context, view);
        }
        return map;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zzgrr) it.next()).a(map);
        }
        return map;
    }

    public zzgrp(zzgsi zzgsiVar, Set set) {
        this.a = set;
        this.b = zzgsiVar;
    }
}
