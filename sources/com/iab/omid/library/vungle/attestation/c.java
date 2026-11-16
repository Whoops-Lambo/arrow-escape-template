package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final Map<String, k> d = new HashMap();
    private static volatile c e;
    private final d a = new d();
    private final Context b;
    private volatile List<b> c;

    private void c() {
        d.put("FireTVFOSDAT", j.a(this.b));
    }

    public List<b> a() {
        List<b> list;
        b bVarA;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c != null) {
                    list = this.c;
                } else {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, k> entry : d.entrySet()) {
                            if (entry.getValue().a() && (bVarA = this.a.a(entry.getKey(), this.b)) != null) {
                                arrayList.add(bVarA);
                            }
                        }
                        this.c = arrayList;
                        list = this.c;
                    } catch (Exception e2) {
                        com.iab.omid.library.vungle.utils.d.a("Error getting supported attestation mechanisms", e2);
                        this.c = new ArrayList();
                        return this.c;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    private c(Context context) {
        Context applicationContext;
        if (context != null) {
            applicationContext = context.getApplicationContext();
        } else {
            applicationContext = null;
        }
        this.b = applicationContext;
        c();
    }

    public boolean b() {
        if (a().size() > 0) {
            return true;
        }
        return false;
    }

    public static c a(Context context) {
        if (e == null) {
            synchronized (c.class) {
                try {
                    if (e == null) {
                        e = new c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public boolean a(String str) {
        k kVar = d.get(str);
        if (kVar != null) {
            return kVar.a();
        }
        return false;
    }
}
