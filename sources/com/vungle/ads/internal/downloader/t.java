package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.u;
import defpackage.dk2;
import defpackage.du;
import defpackage.eu;
import defpackage.gg0;
import defpackage.h50;
import defpackage.j52;
import defpackage.k52;
import defpackage.kk2;
import defpackage.sr0;
import defpackage.wr0;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class t {
    public final com.vungle.ads.internal.executor.a a;
    public final PathProvider b;
    public final ReentrantLock c;
    public final AtomicBoolean d;
    public volatile boolean e;
    public final LinkedHashSet f;
    public volatile i g;
    public volatile i h;
    public final HashMap i;

    public final void a(String str, String str2, k kVar, sr0 sr0Var, wr0 wr0Var) {
        boolean z;
        boolean z2;
        List list = gg0.a;
        boolean z3 = u.a;
        com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Requesting template: " + str);
        if (this.e) {
            wr0Var.invoke(new k52(new j52(new Exception("TemplateDownloadManager is stopped"))));
            return;
        }
        File file = new File(str2);
        String name = file.getName();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            boolean z4 = false;
            if (this.e) {
                z2 = false;
                z = false;
                z4 = true;
            } else {
                LinkedHashSet linkedHashSet = this.f;
                name.getClass();
                linkedHashSet.add(name);
                if (file.exists()) {
                    z2 = true;
                    z = false;
                } else {
                    List list2 = (List) this.i.get(str);
                    if (list2 != null) {
                        list2.add(wr0Var);
                        z2 = false;
                        z = false;
                    } else {
                        this.i.put(str, eu.C(wr0Var));
                        z = true;
                        z2 = false;
                    }
                }
            }
            reentrantLock.unlock();
            if (z4) {
                wr0Var.invoke(new k52(new j52(new Exception("TemplateDownloadManager is stopped"))));
                return;
            }
            if (z2) {
                AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.VM_TEMPLATE_CACHE_HIT, 1L, null, str, 4);
                com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Template cache hit: " + str);
                wr0Var.invoke(new k52(file));
                return;
            }
            if (z) {
                com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Starting template download: " + str);
                i iVar = (i) sr0Var.invoke();
                if (iVar == null) {
                    ReentrantLock reentrantLock2 = this.c;
                    reentrantLock2.lock();
                    try {
                        List list3 = (List) this.i.remove(str);
                        if (list3 != null) {
                            list = list3;
                        }
                        reentrantLock2.unlock();
                        j52 j52Var = new j52(new Exception("TemplateDownloadManager is stopped"));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((wr0) it.next()).invoke(new k52(j52Var));
                        }
                        return;
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                File file2 = new File(com.iab.omid.library.vungle.d.a(str2, ".tmp"));
                try {
                    String absolutePath = file2.getAbsolutePath();
                    absolutePath.getClass();
                    iVar.a(new l(kVar, new com.vungle.ads.internal.model.b("vmURL", str, absolutePath, true)), new s(this, file2, str2, str));
                } catch (Exception e) {
                    ReentrantLock reentrantLock3 = this.c;
                    reentrantLock3.lock();
                    try {
                        List list4 = (List) this.i.remove(str);
                        if (list4 != null) {
                            list = list4;
                        }
                        boolean z5 = this.e;
                        reentrantLock3.unlock();
                        List list5 = list;
                        boolean z6 = u.a;
                        StringBuilder sbR = h50.r("Failed to start template download: ", str, ", error: ");
                        sbR.append(e.getMessage());
                        com.vungle.ads.internal.util.t.b("TemplateDownloadManager", sbR.toString());
                        if (z5) {
                            return;
                        }
                        j52 j52Var2 = new j52(e);
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            ((wr0) it2.next()).invoke(new k52(j52Var2));
                        }
                    } catch (Throwable th2) {
                        reentrantLock3.unlock();
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public t(com.vungle.ads.internal.executor.a aVar, PathProvider pathProvider) {
        aVar.getClass();
        pathProvider.getClass();
        this.a = aVar;
        this.b = pathProvider;
        this.c = new ReentrantLock();
        this.d = new AtomicBoolean(false);
        this.f = new LinkedHashSet();
        this.i = new HashMap();
    }

    public final void b(Map map) throws IOException {
        String canonicalPath;
        File file;
        String canonicalPath2;
        map.getClass();
        if (!map.isEmpty() && !this.e) {
            File vmDir = this.b.getVmDir();
            try {
                canonicalPath = vmDir.getCanonicalPath();
            } catch (IOException unused) {
                canonicalPath = null;
            }
            Iterator it = du.t0(du.s0(map.entrySet(), new q()), 10).iterator();
            while (it.hasNext()) {
                String str = (String) ((Map.Entry) it.next()).getKey();
                if (!this.e) {
                    str.getClass();
                    vmDir.getClass();
                    String strA = a(str);
                    if (strA != null) {
                        file = new File(vmDir, strA);
                        if (canonicalPath == null) {
                            try {
                                canonicalPath2 = vmDir.getCanonicalPath();
                            } catch (IOException e) {
                                boolean z = u.a;
                                StringBuilder sbR = h50.r("Failed to resolve canonical path for template: ", strA, ", error: ");
                                sbR.append(e.getMessage());
                                com.vungle.ads.internal.util.t.b("TemplateDownloadManager", sbR.toString());
                            }
                        } else {
                            canonicalPath2 = canonicalPath;
                        }
                        String canonicalPath3 = file.getCanonicalPath();
                        canonicalPath3.getClass();
                        canonicalPath2.getClass();
                        if (!kk2.L(canonicalPath3, canonicalPath2, false)) {
                            boolean z2 = u.a;
                            com.vungle.ads.internal.util.t.b("TemplateDownloadManager", "Template file path escapes vmDir: " + strA);
                            file = null;
                        }
                    } else {
                        file = null;
                    }
                    if (file != null) {
                        boolean z3 = u.a;
                        com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Pre-downloading template: ".concat(str));
                        String absolutePath = file.getAbsolutePath();
                        absolutePath.getClass();
                        a(str, absolutePath, k.LOWEST, new o(this), new r(str));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static String a(String str) {
        Object j52Var;
        str.getClass();
        try {
            String path = new URI(str).getPath();
            path.getClass();
            List listM0 = dk2.m0(dk2.z0(path, '/'), new char[]{'/'}, 6);
            j52Var = listM0.size() >= 2 ? du.g0(du.u0(2, listM0), "_", null, null, null, 62) : null;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        return (String) (j52Var instanceof j52 ? null : j52Var);
    }

    public final void a(Set set) {
        set.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.f.addAll(set);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void a(t tVar, String str, String str2, com.vungle.ads.internal.load.d dVar) {
        k kVar = k.CRITICAL;
        tVar.getClass();
        str.getClass();
        str2.getClass();
        kVar.getClass();
        dVar.getClass();
        tVar.a(str, str2, kVar, new p(tVar), dVar);
    }

    public final void a(Map map) {
        if (map == null || map.isEmpty() || this.e) {
            return;
        }
        if (!this.d.compareAndSet(false, true)) {
            boolean z = u.a;
            com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Initial template cleanup already performed this session, skipping");
            return;
        }
        File[] fileArrListFiles = this.b.getVmDir().listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.e) {
                return;
            }
            String name = file.getName();
            name.getClass();
            if (kk2.C(name, ".html", false) && dk2.P(name, '_') && file.isFile()) {
                ReentrantLock reentrantLock = this.c;
                reentrantLock.lock();
                try {
                    if (!this.f.contains(file.getName())) {
                        try {
                            if (file.delete()) {
                                boolean z2 = u.a;
                                com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Removed expired template: " + file.getName());
                            } else {
                                boolean z3 = u.a;
                                com.vungle.ads.internal.util.t.b("TemplateDownloadManager", "Failed to delete expired template: " + file.getName());
                            }
                        } catch (Exception e) {
                            boolean z4 = u.a;
                            com.vungle.ads.internal.util.t.b("TemplateDownloadManager", "Error deleting expired template: " + file.getName() + ", error: " + e.getMessage());
                        }
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
    }

    public final void a() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            i iVar = this.g;
            if (iVar != null) {
                iVar.a();
            }
            i iVar2 = this.h;
            if (iVar2 != null) {
                iVar2.a();
            }
            this.g = null;
            this.h = null;
            Collection collectionValues = this.i.values();
            collectionValues.getClass();
            ArrayList arrayListN = eu.n(collectionValues);
            this.i.clear();
            this.f.clear();
            this.e = true;
            reentrantLock.unlock();
            j52 j52Var = new j52(new Exception("TemplateDownloadManager is stopped"));
            int size = arrayListN.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListN.get(i);
                i++;
                ((wr0) obj).invoke(new k52(j52Var));
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
