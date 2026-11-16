package com.adsurge.adn.E1;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class x {
    public static volatile x l;
    public File a = c();
    public File b = com.adsurge.adn.x1.l.h();
    public volatile Set c;
    public volatile Set d;
    public volatile Set e;
    public volatile Set f;
    public volatile Boolean g;
    public volatile Boolean h;
    public volatile Boolean i;
    public volatile Boolean j;
    public volatile Set k;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements d {
        public final /* synthetic */ e a;
        public final /* synthetic */ CountDownLatch b;

        public a(e eVar, CountDownLatch countDownLatch) {
            this.a = eVar;
            this.b = countDownLatch;
        }

        @Override // com.adsurge.adn.E1.x.d
        public void a(File file) {
            this.a.a = file;
            this.b.countDown();
        }

        @Override // com.adsurge.adn.E1.x.d
        public void a(Exception exc, int i) {
            this.b.countDown();
            exc.getMessage();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements com.adsurge.adn.q1.c {
        public final /* synthetic */ d a;
        public final /* synthetic */ long b;

        public b(d dVar, long j) {
            this.a = dVar;
            this.b = j;
        }

        @Override // com.adsurge.adn.q1.c
        public void a(String str, ImageView imageView, com.adsurge.adn.q1.f fVar) {
            if (!fVar.a()) {
                com.adsurge.adn.w1.b.b(9130005, null, 1);
            }
            x.this.a(2060001, fVar.d(), SystemClock.elapsedRealtime() - this.b, this.a);
        }

        @Override // com.adsurge.adn.q1.c
        public void a(String str, int i, Exception exc) {
            x.this.a(str, this.a, exc, i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c extends com.adsurge.adn.p039l1.g {
        public final /* synthetic */ String a;
        public final /* synthetic */ d b;

        public c(String str, d dVar) {
            this.a = str;
            this.b = dVar;
        }

        @Override // com.adsurge.adn.p039l1.g, com.adsurge.adn.p039l1.b
        public void onCanceled() {
            d dVar = this.b;
            if (dVar != null) {
                dVar.a(new Exception("下载被取消"), 64);
            }
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(com.adsurge.adn.p039l1.d dVar) {
            dVar.a();
            dVar.b();
            x.this.a(this.a, this.b, dVar, dVar.a());
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(File file, long j) {
            x.this.a(2060003, file, j, this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface d {
        void a(File file);

        void a(Exception exc, int i);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class e {
        public File a;
    }

    public static x d() {
        if (l == null) {
            synchronized (x.class) {
                try {
                    if (l == null) {
                        l = new x();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return l;
    }

    public final Set b() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        String strB = com.adsurge.adn.s1.a.b().c().b("waohw", "");
                        if (TextUtils.isEmpty(strB)) {
                            this.k = new HashSet();
                        } else {
                            this.k = new HashSet(Arrays.asList(TextUtils.split(strB, ",")));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.k;
    }

    public final Set e() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        String strB = com.adsurge.adn.s1.a.b().c().b("wimgup", "");
                        if (TextUtils.isEmpty(strB)) {
                            this.e = new HashSet();
                        } else {
                            this.e = new HashSet(Arrays.asList(TextUtils.split(strB, ",")));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }

    public Set f() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        String strB = com.adsurge.adn.s1.a.b().c().b("web_proxy_img_suffix");
                        if (TextUtils.isEmpty(strB)) {
                            strB = "jpg,jpeg,png";
                        }
                        this.d = new HashSet(Arrays.asList(TextUtils.split(strB, ",")));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    public Set g() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        String strB = com.adsurge.adn.s1.a.b().c().b("web_proxy_res_suffix");
                        if (TextUtils.isEmpty(strB)) {
                            strB = "html,js,css";
                        }
                        this.c = new HashSet(Arrays.asList(TextUtils.split(strB, ",")));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final Set h() {
        if (this.f == null) {
            synchronized (this) {
                try {
                    if (this.f == null) {
                        this.f = new HashSet(Arrays.asList(TextUtils.split(com.adsurge.adn.s1.a.b().c().b("wupbl", ""), ",")));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f;
    }

    public final boolean i() {
        if (this.i == null) {
            synchronized (this) {
                try {
                    if (this.i == null) {
                        this.i = Boolean.valueOf(com.adsurge.adn.s1.a.b().c().a("web_proxy_img_cache", 0) == 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.i.booleanValue();
    }

    public final boolean j() {
        if (this.j == null) {
            synchronized (this) {
                try {
                    if (this.j == null) {
                        this.j = Boolean.valueOf(com.adsurge.adn.s1.a.b().c().a("web_proxy_res_cache", 0) == 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.j.booleanValue();
    }

    public final boolean k() {
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        this.h = Boolean.valueOf(com.adsurge.adn.s1.a.b().c().a("web_proxy_not_hit_event", 0) == 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.h.booleanValue();
    }

    public Pair a(Uri uri) {
        FileInputStream fileInputStreamA;
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String strA = com.adsurge.adn.x1.r.a(uri);
        com.adsurge.adn.x1.r.a aVarA = com.adsurge.adn.x1.r.a(strA);
        if (!f().contains(strA) && !c(uri)) {
            if (g().contains(strA)) {
                fileInputStreamA = a(string, aVarA);
            } else if (TextUtils.isEmpty(strA)) {
                fileInputStreamA = d(string);
            } else {
                if (k()) {
                    com.adsurge.adn.Y0.e eVar = new com.adsurge.adn.Y0.e(1110105);
                    eVar.a(new com.adsurge.adn.Y0.d().a("url", string));
                    com.adsurge.adn.w1.b.a(eVar);
                }
                return null;
            }
        } else {
            aVarA = com.adsurge.adn.x1.r.a.IMAGE;
            fileInputStreamA = a(string, aVarA);
        }
        return new Pair(fileInputStreamA, aVarA);
    }

    public final boolean c(Uri uri) {
        Set setE = e();
        if (setE.size() <= 0) {
            return false;
        }
        String str = uri.getHost() + uri.getPath();
        Iterator it = setE.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final FileInputStream d(String str) {
        return a(str, com.adsurge.adn.x1.r.a.IMAGE, false);
    }

    public final File c() {
        if (this.a == null) {
            this.a = com.adsurge.adn.x1.l.b();
        }
        if (!this.a.exists()) {
            this.a.mkdirs();
        }
        return this.a;
    }

    public boolean b(Uri uri) {
        Set setH = h();
        if (setH.size() <= 0) {
            return false;
        }
        String str = uri.getHost() + uri.getPath();
        Iterator it = setH.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Set setB = b();
        if (setB.size() <= 0) {
            return false;
        }
        try {
            if (setB.contains("*")) {
                return true;
            }
            return setB.contains(Uri.parse(str).getHost());
        } catch (Throwable unused) {
            return false;
        }
    }

    public File b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str, this.b);
    }

    public final FileInputStream b(String str, com.adsurge.adn.x1.r.a aVar) {
        int i = 1;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        e eVar = new e();
        a aVar2 = new a(eVar, countDownLatch);
        if (aVar == com.adsurge.adn.x1.r.a.IMAGE) {
            a(str, aVar2);
        } else {
            b(str, aVar2);
            i = 2;
        }
        try {
            SystemClock.elapsedRealtime();
            countDownLatch.await(3L, TimeUnit.SECONDS);
            if (eVar.a != null) {
                SystemClock.elapsedRealtime();
                return new FileInputStream(eVar.a);
            }
            com.adsurge.adn.w1.b.a(1110107, (com.adsurge.adn.Y0.c) null, Integer.valueOf(i), (com.adsurge.adn.Y0.d) null);
            return null;
        } catch (FileNotFoundException | InterruptedException unused) {
        }
    }

    public void b(String str, d dVar) {
        com.adsurge.adn.B1.a.a().a(new com.adsurge.adn.B1.b.a().a(this.b).a(com.adsurge.adn.x1.l.a(str)).c(false).a(false).d(str).a(), new c(str, dVar));
    }

    public boolean a() {
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (this.g == null) {
                        this.g = Boolean.valueOf(com.adsurge.adn.s1.a.b().c().a("web_proxy", 0) == 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.g.booleanValue();
    }

    public final FileInputStream a(String str, com.adsurge.adn.x1.r.a aVar) {
        return a(str, aVar, true);
    }

    public final FileInputStream a(String str, com.adsurge.adn.x1.r.a aVar, boolean z) {
        File fileB;
        com.adsurge.adn.x1.r.a aVar2 = com.adsurge.adn.x1.r.a.IMAGE;
        if (aVar == aVar2) {
            fileB = a(str);
        } else {
            fileB = b(str);
        }
        if (fileB != null) {
            a(aVar, 1);
            try {
                return new FileInputStream(fileB);
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        a(aVar, -1);
        if (z) {
            if (aVar == aVar2 && i()) {
                return b(str, aVar);
            }
            if (j()) {
                return b(str, aVar);
            }
        }
        return null;
    }

    public final void a(com.adsurge.adn.x1.r.a aVar, int i) {
        if (aVar == com.adsurge.adn.x1.r.a.IMAGE) {
            com.adsurge.adn.w1.b.a(1110108, (com.adsurge.adn.Y0.c) null, Integer.valueOf(i), (com.adsurge.adn.Y0.d) null);
        } else {
            com.adsurge.adn.w1.b.a(1110104, (com.adsurge.adn.Y0.c) null, Integer.valueOf(i), (com.adsurge.adn.Y0.d) null);
        }
    }

    public final File a(String str) {
        return a(str, this.a);
    }

    public final File a(String str, File file) {
        File file2 = new File(file, com.adsurge.adn.x1.l.a(str));
        if (file2.exists()) {
            if (file2.length() > 0) {
                return file2;
            }
            try {
                file2.delete();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void a(String str, d dVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (new File(c(), com.adsurge.adn.x1.l.a(str)).exists()) {
            return;
        }
        com.adsurge.adn.q1.b.a().a(str, (com.adsurge.adn.q1.c) new b(dVar, SystemClock.elapsedRealtime()), true);
    }

    public final void a(int i, File file, long j, d dVar) {
        com.adsurge.adn.Y0.i iVar = new com.adsurge.adn.Y0.i(i);
        iVar.b(j);
        if (file.exists()) {
            iVar.b((int) (file.length() >> 10));
            if (dVar != null) {
                dVar.a(file);
            }
        } else {
            iVar.b(-1);
            if (dVar != null) {
                dVar.a(new Exception("文件不存在"), 32768);
            }
        }
        com.adsurge.adn.w1.b.a(iVar);
    }

    public final void a(String str, d dVar, Exception exc, int i) {
        com.adsurge.adn.Y0.d dVar2 = new com.adsurge.adn.Y0.d();
        dVar2.a("url", str);
        dVar2.a(NotificationCompat.CATEGORY_MESSAGE, exc.getMessage());
        com.adsurge.adn.w1.b.b(1110106, (com.adsurge.adn.Y0.c) null, Integer.valueOf(i), dVar2);
        if (dVar != null) {
            dVar.a(exc, i);
        }
    }
}
