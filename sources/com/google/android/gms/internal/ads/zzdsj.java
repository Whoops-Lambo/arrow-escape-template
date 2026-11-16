package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.common.util.Clock;
import defpackage.oz3;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdsj implements View.OnClickListener {
    public final zzdwi a;
    public final Clock b;
    public zzbou c;
    public oz3 d;
    public String e;
    public Long f;
    public WeakReference g;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.e != null && this.f != null) {
            HashMap map = new HashMap();
            map.put("id", this.e);
            map.put("time_interval", String.valueOf(this.b.currentTimeMillis() - this.f.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.a.d(map);
        }
        this.e = null;
        this.f = null;
        WeakReference weakReference2 = this.g;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.g = null;
    }

    public zzdsj(zzdwi zzdwiVar, Clock clock) {
        this.a = zzdwiVar;
        this.b = clock;
    }
}
