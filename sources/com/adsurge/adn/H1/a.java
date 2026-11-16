package com.adsurge.adn.H1;

import android.text.TextUtils;
import android.util.Pair;
import com.adsurge.adn.E1.f;
import com.adsurge.adn.I1.b;
import com.adsurge.adn.I1.c;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.x1.l;
import com.adsurge.adn.x1.r;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.File;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static volatile a i;
    public final Set a;
    public final ConcurrentHashMap b;
    public final b c;
    public final c d;
    public final List e;
    public final com.adsurge.adn.p067y.a f;
    public Boolean g;
    public Boolean h;

    /* JADX INFO: renamed from: com.adsurge.adn.H1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum EnumC0077a {
        HTML(1, CreativeInfo.al),
        JS(2, "js"),
        CSS(4, "css"),
        PNG(8, "png"),
        FONT(16, "font");

        public final long a;
        public final String b;

        public static List a(int i) {
            LinkedList linkedList = new LinkedList();
            for (EnumC0077a enumC0077a : values()) {
                if ((((long) i) & enumC0077a.a) != 0) {
                    linkedList.add(enumC0077a.b);
                }
            }
            return linkedList;
        }

        EnumC0077a(long j, String str) {
            this.a = j;
            this.b = str;
        }
    }

    public boolean b(String str) {
        if (this.a.isEmpty() || TextUtils.isEmpty(str)) {
            return true;
        }
        return !this.a.contains(str);
    }

    public boolean c() {
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = com.adsurge.adn.N.b.a("skpce", 0, (AdSurgeAdFormat) null, (String) null) == 1;
        this.g = Boolean.valueOf(z);
        return z;
    }

    public boolean d() {
        Boolean bool = this.h;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = com.adsurge.adn.N.b.a("skppe", 0, (AdSurgeAdFormat) null, (String) null) == 1;
        this.h = Boolean.valueOf(z);
        return z;
    }

    public a() {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.b = concurrentHashMap;
        LinkedList linkedList = new LinkedList();
        this.e = linkedList;
        File fileH = l.h();
        b bVar = new b(fileH);
        this.c = bVar;
        c cVar = new c(bVar, concurrentHashMap);
        this.d = cVar;
        linkedList.add(bVar);
        linkedList.add(cVar);
        this.f = new com.adsurge.adn.G1.a(fileH, concurrentHashMap);
        hashSet.addAll(b());
    }

    public Pair a(String str) {
        if (TextUtils.isEmpty(str) || !c()) {
            return null;
        }
        String strB = r.b(str);
        if (b(strB)) {
            return null;
        }
        f fVar = (f) this.b.get(str);
        if (fVar != null) {
            return new Pair(fVar.a(str), r.a(strB));
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            InputStream inputStreamA = ((com.adsurge.adn.I1.a) it.next()).a(str);
            if (inputStreamA != null) {
                return new Pair(inputStreamA, r.a(strB));
            }
        }
        return null;
    }

    public final List b() {
        return EnumC0077a.a(com.adsurge.adn.N.b.a("skpct", 3, (AdSurgeAdFormat) null, (String) null));
    }

    public void a(com.adsurge.adn.u1.c cVar) {
        if (cVar.W0()) {
            String strX = cVar.X();
            if (TextUtils.isEmpty(strX) || !d() || !c() || b(r.b(strX)) || this.b.containsKey(strX)) {
                return;
            }
            if (this.c.b(strX) != null) {
                cVar.d(2);
            } else {
                this.f.a();
                this.d.a(strX, cVar);
            }
        }
    }

    public static a a() {
        if (i == null) {
            synchronized (a.class) {
                try {
                    if (i == null) {
                        i = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }
}
