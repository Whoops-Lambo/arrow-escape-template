package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.util.u;
import defpackage.gg0;
import defpackage.j52;
import defpackage.k52;
import defpackage.wr0;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class s implements e {
    public final /* synthetic */ t a;
    public final /* synthetic */ File b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public s(t tVar, File file, String str, String str2) {
        this.a = tVar;
        this.b = file;
        this.c = str;
        this.d = str2;
    }

    @Override // com.vungle.ads.internal.downloader.e
    public final void a(File file, l lVar) {
        file.getClass();
        lVar.getClass();
        ReentrantLock reentrantLock = this.a.c;
        t tVar = this.a;
        String str = this.d;
        reentrantLock.lock();
        try {
            List list = (List) tVar.i.remove(str);
            if (list == null) {
                list = gg0.a;
            }
            boolean z = tVar.e;
            reentrantLock.unlock();
            List list2 = list;
            if (z) {
                this.b.delete();
                return;
            }
            File file2 = new File(this.c);
            if (this.b.renameTo(file2)) {
                boolean z2 = u.a;
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Template download succeeded: ");
                sbA.append(this.d);
                com.vungle.ads.internal.util.t.a("TemplateDownloadManager", sbA.toString());
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((wr0) it.next()).invoke(new k52(file2));
                }
                return;
            }
            this.b.delete();
            if (file2.exists()) {
                boolean z3 = u.a;
                StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("Template download succeeded: ");
                sbA2.append(this.d);
                com.vungle.ads.internal.util.t.a("TemplateDownloadManager", sbA2.toString());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((wr0) it2.next()).invoke(new k52(file2));
                }
                return;
            }
            boolean z4 = u.a;
            StringBuilder sbA3 = com.iab.omid.library.vungle.internal.l.a("Template download failed to promote: ");
            sbA3.append(this.d);
            com.vungle.ads.internal.util.t.b("TemplateDownloadManager", sbA3.toString());
            String str2 = this.d;
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((wr0) it3.next()).invoke(new k52(new j52(new Exception(com.iab.omid.library.vungle.d.a("Failed to promote template: ", str2)))));
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.vungle.ads.internal.downloader.e
    public final void a(c cVar, l lVar) {
        lVar.getClass();
        ReentrantLock reentrantLock = this.a.c;
        t tVar = this.a;
        String str = this.d;
        reentrantLock.lock();
        try {
            List list = (List) tVar.i.remove(str);
            if (list == null) {
                list = gg0.a;
            }
            boolean z = tVar.e;
            reentrantLock.unlock();
            List list2 = list;
            this.b.delete();
            if (z) {
                return;
            }
            Throwable thA = cVar.a();
            if (thA == null) {
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Template download failed: ");
                sbA.append(this.d);
                thA = new Exception(sbA.toString());
            }
            boolean z2 = u.a;
            StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("Template download failed: ");
            sbA2.append(this.d);
            sbA2.append(", error: ");
            sbA2.append(thA.getMessage());
            com.vungle.ads.internal.util.t.b("TemplateDownloadManager", sbA2.toString());
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((wr0) it.next()).invoke(new k52(new j52(thA)));
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
