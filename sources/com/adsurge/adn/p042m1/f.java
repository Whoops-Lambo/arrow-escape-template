package com.adsurge.adn.p042m1;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.adsurge.adn.p039l1.c;
import com.adsurge.adn.p039l1.d;
import com.adsurge.adn.p039l1.e;
import com.adsurge.adn.x1.l;
import defpackage.h50;
import defpackage.n30;
import defpackage.nj;
import defpackage.pv1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class f implements com.adsurge.adn.p039l1.f {
    public static final com.adsurge.adn.p039l1.b z = new a();
    public final String a;
    public final File b;
    public int c;
    public final com.adsurge.adn.p045n1.b d;
    public final l e;
    public final ExecutorService f;
    public com.adsurge.adn.p045n1.a g;
    public int i;
    public String j;
    public com.adsurge.adn.p039l1.f k;
    public g l;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public com.adsurge.adn.p039l1.b t;
    public volatile boolean u;
    public File w;
    public String x;
    public AtomicBoolean h = new AtomicBoolean(false);
    public long m = -1;
    public double r = 1.0d;
    public final List s = new ArrayList();
    public volatile boolean v = false;
    public Map y = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.adsurge.adn.p039l1.b {
        @Override // com.adsurge.adn.p039l1.b
        public void a() {
        }

        @Override // com.adsurge.adn.p039l1.b
        public void onCanceled() {
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(long j, long j2, int i) {
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(long j, boolean z) {
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(d dVar) {
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(File file, long j) {
        }

        @Override // com.adsurge.adn.p039l1.b
        public void a(boolean z) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b implements Callable {
        public final h a;
        public final c b;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair call() {
            this.a.a(this.b);
            return new Pair(Integer.valueOf(this.a.b()), this.a.a());
        }

        public b(h hVar, c cVar) {
            this.a = hVar;
            this.b = cVar;
        }
    }

    public final boolean a(File file, long j, boolean z2) {
        try {
            com.adsurge.adn.p045n1.a aVar = this.g;
            if (aVar != null) {
                aVar.a();
            }
            com.adsurge.adn.p045n1.a aVarA = this.d.a(this.a, file.length(), j, z2);
            this.g = aVarA;
            if (aVarA.b()) {
                this.y.put("ekaio", Long.valueOf(this.g.c()));
                return true;
            }
            this.i |= this.g.e();
            this.j = this.g.f();
            this.g.a();
            if (e.c(this.i) && file.exists()) {
                file.delete();
            }
            this.g.e();
            this.g.f();
            return false;
        } catch (IOException e) {
            e.toString();
            this.i |= 524288;
            this.j = "IOExceptionWhileCreateConnection " + e.getMessage();
            return false;
        }
    }

    public final File c(int i) {
        String strK;
        if (i == -1) {
            strK = "_complete";
        } else {
            if (i == 0) {
                return this.b;
            }
            strK = pv1.k(i, "_");
        }
        return new File(this.b.getParentFile(), n30.m(this.b.getName(), strK));
    }

    public final boolean b(List list, List list2) {
        l.a[] aVarArrA;
        File fileA = a(0);
        if (this.h.get()) {
            this.i |= 128;
            return false;
        }
        boolean z2 = this.r < 1.0d;
        if (!a(fileA, -1L, z2)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        if (this.g.k()) {
            long length = fileA.length() + this.g.d();
            this.n = length;
            if (z2) {
                long j = (long) (this.r * length);
                long length2 = j - fileA.length();
                if (length2 <= 0) {
                    this.v = true;
                    a(true);
                    e().a(j, this.n, (int) (this.r * 100.0d));
                    this.g.a();
                    return true;
                }
                if (!a(fileA, length2, false)) {
                    return false;
                }
                length = j;
            }
            a(true);
            aVarArrA = this.e.a(length, this.c);
        } else {
            if (fileA.exists() && !fileA.delete()) {
                this.i |= 8192;
                this.j = "FailToDeleteMainPartitionFile";
                return false;
            }
            this.n = this.g.d();
            if (z2 && !a(fileA, -1L, false)) {
                return false;
            }
            aVarArrA = new l.a[]{new l.a(0L, this.n)};
            a(false);
        }
        a(this.n, aVarArrA);
        list2.add(aVarArrA[0]);
        e eVar = new e(this.g, fileA, aVarArrA[0].a());
        arrayList.add(a(new b(eVar, this.l.a(0))));
        list.add(fileA);
        this.s.add(eVar);
        for (int i = 1; i < aVarArrA.length && !this.h.get(); i++) {
            list2.add(aVarArrA[i]);
            File fileA2 = a(i);
            list.add(fileA2);
            m mVar = new m(this.a, fileA2, aVarArrA[i].b(), aVarArrA[i].a(), this.d);
            this.s.add(mVar);
            arrayList.add(a(new b(mVar, this.l.a(i))));
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            try {
                Pair pair = (Pair) ((Future) arrayList.get(i2)).get();
                if (((Integer) pair.first).intValue() != 0) {
                    this.i |= ((Integer) pair.first).intValue();
                    this.j += ((String) pair.second) + ";\t";
                }
            } catch (Throwable th) {
                this.i |= 1;
                this.j += "ExceptionWhileExecutePartitionWorks:" + th.getMessage() + "\t";
            }
            i2 = i3;
        }
        this.g.a();
        return this.i == 0;
    }

    public final com.adsurge.adn.p039l1.b e() {
        com.adsurge.adn.p039l1.b bVar = this.t;
        return bVar == null ? z : bVar;
    }

    public int f() {
        return this.i;
    }

    public String g() {
        return this.j;
    }

    public final boolean h() {
        if (TextUtils.isEmpty(this.a)) {
            this.i |= 4;
            this.j = "UrlEmptyError";
            e().a(new d(this.i, this.j));
            return false;
        }
        File file = this.b;
        File parentFile = file == null ? null : file.getParentFile();
        if (parentFile == null || !(parentFile.exists() || parentFile.mkdirs())) {
            this.i |= 2048;
            this.j = "FailToCreateDirectory";
            e().a(new d(this.i, this.j));
            return false;
        }
        File file2 = this.w;
        if (file2 == null || file2.exists()) {
            return true;
        }
        l.b(this.w, String.valueOf(this.c));
        return true;
    }

    public f(String str, File file, int i, c cVar, boolean z2, String str2) {
        this.a = str;
        this.b = file;
        this.c = i;
        com.adsurge.adn.p045n1.b bVar = new com.adsurge.adn.p045n1.b(cVar.a(), cVar.c(), cVar.d());
        this.d = bVar;
        this.e = new com.adsurge.adn.p042m1.b();
        this.f = cVar.b();
        this.q = z2;
        bVar.a(str2);
    }

    public final boolean d() {
        boolean z2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.i = 0;
        this.j = "";
        if (!this.u) {
            e().a();
        }
        if (!h()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (b(arrayList, arrayList2) && a(arrayList, arrayList2) && b(arrayList) && this.i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.p = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (z2 && this.n <= 0) {
            this.n = this.b.length();
        }
        if (z2) {
            if (this.r < 1.0d && this.b.length() < this.n) {
                this.i = 128;
                this.j = "DownloaderIsPausedAuto";
                e().a(true);
                return z2;
            }
            a();
            b();
            e().a(this.b, this.p);
            return z2;
        }
        if (e.a(this.i)) {
            this.i = 64;
            this.j = "DownloaderIsCanceledManual";
            e().onCanceled();
            a(arrayList);
            return z2;
        }
        if (e.b(this.i)) {
            this.i = 128;
            this.j = "DownloaderIsPausedManual";
            e().a(false);
            return z2;
        }
        e().a(new d(this.i, this.j));
        return z2;
    }

    public final void c(List list) throws IOException {
        if (list.size() > 1) {
            a(list, 1, true);
        }
    }

    public boolean c() {
        try {
            return d();
        } catch (Exception e) {
            e().a(new d(1, e.getMessage(), e));
            return false;
        }
    }

    public final void a() {
        if (this.q) {
            try {
                a(-1).createNewFile();
            } catch (IOException unused) {
            }
        }
    }

    public final void a(List list) {
        if (this.b.exists()) {
            this.b.delete();
        }
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public final boolean a(List list, List list2) {
        boolean z2 = true;
        if (this.v) {
            return true;
        }
        boolean z3 = false;
        if (list2.size() != list.size()) {
            this.i |= 1;
            this.j = "RangeCount!=PartitionFileCount";
        } else {
            for (int i = 0; i < list2.size(); i++) {
                long jA = ((l.a) list2.get(i)).a();
                if (jA <= 0) {
                    break;
                }
                long length = ((File) list.get(i)).length();
                if (jA != length) {
                    this.i |= 16;
                    StringBuilder sbO = h50.o(length, "PartitionFileSize!=RangeSize,", ",");
                    sbO.append(jA);
                    this.j = sbO.toString();
                    z2 = false;
                }
            }
            z3 = z2;
        }
        if (!z3) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
        return z3;
    }

    public final void a(List list, int i, boolean z2) throws IOException {
        int size = list.size();
        if (i >= size) {
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.b, z2);
        byte[] bArr = new byte[8192];
        for (int i2 = i; i2 < size; i2++) {
            FileInputStream fileInputStream = new FileInputStream((File) list.get(i2));
            while (true) {
                int i3 = fileInputStream.read(bArr);
                if (i3 > 0) {
                    fileOutputStream.write(bArr, 0, i3);
                }
            }
            fileInputStream.close();
        }
        fileOutputStream.close();
        while (i < size) {
            ((File) list.get(i)).delete();
            i++;
        }
    }

    public final void a(boolean z2) {
        com.adsurge.adn.p039l1.b bVarE = e();
        bVarE.a(this.n, z2);
        String strH = this.g.h();
        this.x = strH;
        if (bVarE instanceof com.adsurge.adn.p039l1.a) {
            ((com.adsurge.adn.p039l1.a) bVarE).a(strH, this.n);
        }
    }

    public void a(double d) {
        this.r = d;
    }

    public final Future a(b bVar) {
        ExecutorService executorService = this.f;
        if (executorService == null) {
            return new n(bVar);
        }
        return executorService.submit(bVar);
    }

    public final void a(long j, l.a[] aVarArr) {
        this.o = 0L;
        int length = aVarArr.length;
        long[] jArr = new long[length];
        long[] jArr2 = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = aVarArr[i].a();
            File fileA = a(i);
            long length2 = fileA != null ? fileA.length() : 0L;
            jArr2[i] = length2;
            this.o += length2;
        }
        g gVar = new g(j, jArr, jArr2);
        this.l = gVar;
        gVar.a(this);
    }

    public final File a(int i) {
        if (this.q) {
            return c(i);
        }
        return b(i);
    }

    public void a(com.adsurge.adn.p039l1.b bVar) {
        this.t = bVar;
    }

    @Override // com.adsurge.adn.p039l1.f
    public void a(long j, long j2) {
        long j3;
        long j4;
        com.adsurge.adn.p039l1.b bVar = this.t;
        if (bVar != null) {
            j4 = j2;
            j3 = j;
            bVar.a(j3, j4, j2 <= 0 ? 0 : (int) ((100 * j) / j2));
        } else {
            j3 = j;
            j4 = j2;
        }
        com.adsurge.adn.p039l1.f fVar = this.k;
        if (fVar != null) {
            fVar.a(j3, j4);
        }
    }

    public final boolean d(List list) throws IOException {
        if (list.size() == 1) {
            if (!l.a((File) list.get(0), this.b)) {
                this.i |= 16384;
                this.j = "ExceptionWhileRenameTmpFileToTargetFile";
                return false;
            }
        } else {
            a(list, 0, false);
        }
        return true;
    }

    public void b(boolean z2) {
        this.u = z2;
    }

    public final boolean b(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (this.q) {
                c(list);
            } else if (!d(list)) {
                return false;
            }
            if (this.b.exists()) {
                return true;
            }
            this.i |= 32768;
            this.j = "DownloadFileNotExist";
            return false;
        } catch (IOException e) {
            this.i |= 512;
            this.j = "UnknownIOExceptionWhileMerge:" + e.getMessage();
            return false;
        } catch (Throwable th) {
            this.i |= 1;
            this.j = "UnknownExceptionWhileMerge:" + th.getMessage();
            return false;
        } finally {
            this.m = SystemClock.elapsedRealtime() - jElapsedRealtime;
        }
    }

    public final void b() {
        File file = this.w;
        if (file == null || !file.exists()) {
            return;
        }
        this.w.delete();
    }

    public final File b(int i) {
        return new File(this.b.getParentFile(), nj.k(i, this.b.getName(), "_"));
    }
}
