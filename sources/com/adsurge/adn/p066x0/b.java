package com.adsurge.adn.p066x0;

import android.text.TextUtils;
import android.util.LruCache;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b {
    public static int b = 10;
    public static boolean c;
    public static int d;
    public static volatile b e;
    public final LruCache a = new a(b);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends LruCache {
        public a(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z, String str, com.adsurge.adn.p066x0.a aVar, com.adsurge.adn.p066x0.a aVar2) {
            super.entryRemoved(z, str, aVar, aVar2);
            synchronized (b.this) {
                if (aVar != null) {
                    try {
                        aVar.a();
                        if (com.adsurge.adn.J0.a.a) {
                            com.adsurge.adn.J0.a.a(com.adsurge.adn.p066x0.a.f, "模板%s_%s的缓存被删除", aVar.c(), Integer.valueOf(aVar.d()));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.x0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0145b {
        void a(int i, int i2);
    }

    public synchronized void a(String str, int i, com.adsurge.adn.p064w0.b bVar, int i2) {
        try {
            if (!c && !TextUtils.isEmpty(str) && bVar != null) {
                com.adsurge.adn.p066x0.a aVar = (com.adsurge.adn.p066x0.a) this.a.get(str);
                if (aVar == null) {
                    this.a.put(str, new com.adsurge.adn.p066x0.a(str, i, bVar, i2));
                    if (com.adsurge.adn.J0.a.a) {
                        com.adsurge.adn.J0.a.a(com.adsurge.adn.p066x0.a.f, "模板%s_%s的缓存被创建，模板缓存池填充率：%s/%s，", str, Integer.valueOf(i), Integer.valueOf(this.a.size()), Integer.valueOf(b));
                    }
                } else {
                    aVar.a(bVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized com.adsurge.adn.p064w0.b a(String str, InterfaceC0145b interfaceC0145b) {
        if (!c && com.adsurge.adn.p011c0.b.e().a().a()) {
            com.adsurge.adn.p066x0.a aVar = (com.adsurge.adn.p066x0.a) this.a.get(str);
            if (aVar == null) {
                interfaceC0145b.a(1, 0);
                return null;
            }
            com.adsurge.adn.p064w0.b bVarE = aVar.e();
            if (bVarE == null) {
                interfaceC0145b.a(2, aVar.b());
                return null;
            }
            interfaceC0145b.a(3, aVar.b());
            return bVarE;
        }
        interfaceC0145b.a(0, 0);
        return null;
    }

    public static b a() {
        if (e == null) {
            synchronized (b.class) {
                try {
                    if (e == null) {
                        e = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public synchronized boolean a(String str, int i) {
        if (c) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        com.adsurge.adn.p066x0.a aVar = (com.adsurge.adn.p066x0.a) this.a.get(str);
        if (aVar == null) {
            return true;
        }
        if (aVar.d() != i) {
            this.a.remove(str);
            return true;
        }
        return aVar.f();
    }
}
