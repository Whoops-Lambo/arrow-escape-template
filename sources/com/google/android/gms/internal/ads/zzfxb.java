package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfxb {
    public static final HashMap c = new HashMap();
    public static volatile zzfxb d;
    public final Context a;
    public volatile ArrayList b;

    public static zzfxb a(Context context) {
        if (d == null) {
            synchronized (zzfxb.class) {
                try {
                    if (d == null) {
                        d = new zzfxb(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final List b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : c.entrySet()) {
                    if (((zzfxi) entry.getValue()).b()) {
                        zzfxh zzfxhVarA = zzfxc.a(this.a, (String) entry.getKey());
                        if (zzfxhVarA != null) {
                            arrayList.add(zzfxhVarA);
                        }
                    }
                }
                this.b = arrayList;
                return this.b;
            } catch (Exception e) {
                zzfyu.a("Error getting supported attestation mechanisms", e);
                this.b = new ArrayList();
                return this.b;
            }
        }
    }

    public zzfxb(Context context) {
        Context applicationContext;
        if (context != null) {
            applicationContext = context.getApplicationContext();
        } else {
            applicationContext = null;
        }
        this.a = applicationContext;
        c.put("FireTVFOSDAT", zzfxi.a(applicationContext));
    }
}
