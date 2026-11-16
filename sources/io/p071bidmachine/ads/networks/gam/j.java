package io.p071bidmachine.ads.networks.gam;

import android.content.Context;
import com.facebook.login.a0;
import defpackage.l83;
import io.p071bidmachine.AdsFormat;
import io.p071bidmachine.NetworkAdUnit;
import io.p071bidmachine.ads.networks.gam.versions.v21_0_0.b;
import io.p071bidmachine.core.a;
import io.p071bidmachine.utils.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class j {
    public final Context b;
    public final b c;
    public final String f;
    public final long g;
    public final i a = new i("GAMLoader");
    public final String d = "GAM";
    public final HashMap e = new HashMap();
    public final h h = new h();
    public final ArrayList i = new ArrayList();
    public final WeakHashMap j = new WeakHashMap();
    public final Object k = new Object();
    public final Object l = new Object();

    public final m a(String str) {
        boolean zContainsValue;
        synchronized (this.k) {
            try {
                ArrayList arrayList = this.i;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    m mVar = (m) obj;
                    if (mVar.d.a.equals(str)) {
                        synchronized (this.l) {
                            zContainsValue = this.j.containsValue(mVar);
                        }
                        if (!zContainsValue) {
                            return mVar;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final m b(NetworkAdUnit networkAdUnit) {
        m mVar;
        synchronized (this.l) {
            mVar = (m) this.j.get(networkAdUnit);
        }
        return mVar;
    }

    public final boolean c(AdsFormat adsFormat) {
        int i;
        k kVar = (k) this.e.get(adsFormat);
        if (kVar != null) {
            synchronized (this.k) {
                try {
                    ArrayList arrayList = this.i;
                    int size = arrayList.size();
                    i = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (((m) obj).c == kVar.a) {
                            i++;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (i < kVar.c) {
                h hVar = this.h;
                i iVar = new i(this, kVar);
                int i3 = h.d;
                hVar.getClass();
                try {
                    synchronized (hVar.c) {
                        try {
                            Map map = (Map) hVar.b.get(adsFormat);
                            if (map != null && !map.isEmpty()) {
                                return true;
                            }
                            Future<?> futureSubmit = hVar.a.submit(new a0(24, hVar, iVar, adsFormat));
                            if (map == null) {
                                map = new HashMap();
                                hVar.b.put(adsFormat, map);
                            }
                            map.put((String) iVar.b, futureSubmit);
                            return true;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d(m mVar) {
        synchronized (this.k) {
            try {
                if (this.i.remove(mVar)) {
                    a.b(this.a, new g(mVar, 0));
                }
                f(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(NetworkAdUnit networkAdUnit) {
        synchronized (this.l) {
            a.b(this.a, new f(networkAdUnit, 0));
            this.j.remove(networkAdUnit);
        }
    }

    public final void f(m mVar) {
        synchronized (this.l) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : this.j.entrySet()) {
                    if (((m) entry.getValue()).equals(mVar)) {
                        arrayList.add((NetworkAdUnit) entry.getKey());
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    e((NetworkAdUnit) obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public j(Context context, b bVar, HashMap map, String str, long j) {
        this.b = context;
        this.c = bVar;
        this.f = str;
        this.g = j;
        for (AdsFormat adsFormat : AdsFormat.values()) {
            k kVar = (k) map.get(adsFormat);
            if (kVar != null) {
                ArrayList arrayList = kVar.b;
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList, new l83(6));
                    this.e.put(kVar.a, kVar);
                }
            }
        }
    }
}
