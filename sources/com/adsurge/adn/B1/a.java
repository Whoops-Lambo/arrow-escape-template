package com.adsurge.adn.B1;

import android.text.TextUtils;
import android.util.Pair;
import com.adsurge.adn.x1.g;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements com.adsurge.adn.B1.c.b {
    public static volatile a h;
    public final com.adsurge.adn.p039l1.c b;
    public final com.adsurge.adn.p039l1.c c;
    public final ExecutorService g;
    public final Map d = new ConcurrentHashMap();
    public final List e = new CopyOnWriteArrayList();
    public final Map f = new ConcurrentHashMap();
    public final Map a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.adsurge.adn.B1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ThreadFactoryC0065a implements ThreadFactory {
        public ThreadFactoryC0065a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "GDT_DOWNLOAD_THREAD");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "GDT_DOWNLOAD_THREAD");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements com.adsurge.adn.B1.c.a {
        public final /* synthetic */ com.adsurge.adn.B1.b a;

        public c(com.adsurge.adn.B1.b bVar) {
            this.a = bVar;
        }

        @Override // com.adsurge.adn.B1.c.a
        public void a(File file) {
            a.this.a(this.a.g(), file);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class d implements com.adsurge.adn.p039l1.b, com.adsurge.adn.p039l1.a {
        public final com.adsurge.adn.p039l1.b a;
        public final List b;
        public final Map c;
        public final String d;

        @Override // com.adsurge.adn.p039l1.a
        public void a(String str, long j) {
            this.c.put(this.d, new Pair(str, Long.valueOf(j)));
        }

        @Override // com.adsurge.adn.p039l1.b
        public void onCanceled() {
            com.adsurge.adn.p039l1.b bVar = this.a;
            if (bVar != null) {
                bVar.onCanceled();
            }
        }

        public d(com.adsurge.adn.p039l1.b bVar, List list, Map map, com.adsurge.adn.B1.b bVar2) {
            this.a = bVar;
            this.b = list;
            this.c = map;
            this.d = bVar2.e();
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(long j, boolean z) {
            com.adsurge.adn.p039l1.b bVar = this.a;
            if (bVar != null) {
                bVar.a(j, z);
            }
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(long j, long j2, int i) {
            com.adsurge.adn.p039l1.b bVar = this.a;
            if (bVar != null) {
                bVar.a(j, j2, i);
            }
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(File file, long j) {
            com.adsurge.adn.p039l1.b bVar = this.a;
            if (bVar != null) {
                bVar.a(file, j);
            }
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(boolean z) {
            com.adsurge.adn.p039l1.b bVar = this.a;
            if (bVar != null) {
                bVar.a(z);
            }
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(com.adsurge.adn.p039l1.d dVar) {
            com.adsurge.adn.p039l1.b bVar = this.a;
            if (bVar != null) {
                bVar.a(dVar);
            }
            this.b.add(this.d);
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a() {
            com.adsurge.adn.p039l1.b bVar = this.a;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public final String b(String str) {
        if (str != null) {
            return String.valueOf(str.hashCode());
        }
        defpackage.d.w("Tag can't be null!");
        return null;
    }

    public a() {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(15, new ThreadFactoryC0065a());
        this.b = new com.adsurge.adn.l1.c.a().a(executorServiceNewFixedThreadPool).b(10000).a(10000).a();
        this.c = new com.adsurge.adn.l1.c.a().a(executorServiceNewFixedThreadPool).b(10000).a(10000).a(false).a();
        this.g = Executors.newSingleThreadExecutor(new b());
    }

    public void a(com.adsurge.adn.B1.b bVar, com.adsurge.adn.p039l1.b bVar2) {
        com.adsurge.adn.p039l1.c cVar;
        a(bVar);
        if (TextUtils.isEmpty(bVar.g())) {
            if (bVar2 != null) {
                bVar2.a(new com.adsurge.adn.p039l1.d(4, "UrlIsEmpty"));
                return;
            }
            return;
        }
        if (bVar.c() < 1.0d) {
            com.adsurge.adn.w1.b.b(1400011, bVar.a(), Integer.valueOf((int) (bVar.c() * 100.0d)));
        }
        d dVar = new d(bVar2, this.e, this.f, bVar);
        String strB = b(bVar.e());
        com.adsurge.adn.B1.c cVar2 = (com.adsurge.adn.B1.c) this.a.get(strB);
        if (cVar2 != null) {
            if (cVar2.b()) {
                if (bVar.c() > cVar2.a().c()) {
                    cVar2.a(bVar.c());
                }
                cVar2.a(dVar);
                return;
            }
            return;
        }
        if (bVar.h()) {
            cVar = this.b;
        } else {
            cVar = this.c;
        }
        com.adsurge.adn.B1.c cVar3 = new com.adsurge.adn.B1.c(strB, bVar, dVar, cVar);
        cVar3.a(this);
        cVar3.a(new c(bVar));
        this.a.put(strB, cVar3);
        if (this.e.contains(bVar.g())) {
            this.e.remove(bVar.g());
        }
        a(cVar3, bVar.j());
    }

    public static a a() {
        if (h == null) {
            synchronized (a.class) {
                try {
                    if (h == null) {
                        h = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final void a(com.adsurge.adn.B1.b bVar) {
    }

    public final void a(com.adsurge.adn.B1.c cVar, boolean z) {
        if (z) {
            this.g.submit(cVar);
        } else {
            g.b.submit(cVar);
        }
    }

    @Override // com.adsurge.adn.B1.c.b
    public void a(String str) {
        this.a.remove(str);
    }

    public void a(String str, File file) {
        this.d.put(str, file);
    }
}
