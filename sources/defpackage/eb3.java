package defpackage;

import com.bytedance.sdk.component.ahm.kgy.at;
import com.bytedance.sdk.component.ahm.kgy.nu;
import com.bytedance.sdk.component.utils.yo;
import com.bytedance.sdk.openadsdk.fpz.rz;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class eb3 {
    public final zg3 a;
    public final File c;
    public final File d;
    public volatile boolean b = false;
    public final ArrayList e = new ArrayList();
    public volatile boolean f = false;

    public static void c(eb3 eb3Var, zg3 zg3Var, int i, String str) {
        synchronized (ie3.class) {
            try {
                ArrayList arrayList = eb3Var.e;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ie3 ie3Var = (ie3) obj;
                    if (ie3Var != null) {
                        ie3Var.kgy(zg3Var, i, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(eb3 eb3Var) {
        File file = eb3Var.d;
        File file2 = eb3Var.c;
        try {
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Error renaming file " + file2 + " to " + file + " for completion!");
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2xOubMuPS9M=", "aessmQ+lX86ET9htnhSsJ1rq", "XvYoliCzZNeMT8NYiA==", 331);
            th.getMessage();
        }
    }

    public final boolean a() {
        if (this.d.exists()) {
            return true;
        }
        zg3 zg3Var = this.a;
        if (!zg3Var.twf()) {
            File file = this.c;
            if (file.length() >= zg3Var.noq()) {
                return true;
            }
            if (zg3Var.uq() > 0 && file.length() >= zg3Var.uq()) {
                return true;
            }
        }
        return false;
    }

    public final void d(ie3 ie3Var) {
        File[] fileArrListFiles;
        if (this.f) {
            synchronized (ie3.class) {
                this.e.add(ie3Var);
            }
            return;
        }
        this.e.add(ie3Var);
        boolean z = true;
        if (u12.p && !a()) {
            try {
                File parentFile = new File(this.a.ct()).getParentFile();
                if (parentFile != null && (fileArrListFiles = parentFile.listFiles(new sa3())) != null) {
                    String strXh = this.a.xh();
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(this.a.ct())) {
                            File file2 = new File(file, strXh);
                            if (file2.exists() && file2.length() > 0) {
                                File fileFt = this.a.ft();
                                boolean zKgy = yo.kgy(file2, fileFt);
                                file2.getAbsolutePath();
                                fileFt.getAbsolutePath();
                                if (!zKgy) {
                                    break;
                                }
                                this.a.uq(true);
                                break;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                rz.kgy(e, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2xOubMuPS9M=", "aessmQ+lX86ET9htnhSsJ1rq", "XvYolhaobPeST/tSjRWJLnXhObAbtXrT", 107);
                e.getMessage();
            }
        }
        if (a()) {
            this.a.fi(1);
            e(this.a, 200);
            bh3.a(this.a);
            return;
        }
        this.f = true;
        this.a.fi(0);
        zg3 zg3Var = this.a;
        nu.kgy kgyVarRz = xg3.b() != null ? xg3.b().rz() : new nu.kgy("v_preload");
        long jFpp = zg3Var.fpp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kgyVarRz.kgy(jFpp, timeUnit).ahm(zg3Var.sx(), timeUnit).rz(zg3Var.gm(), timeUnit);
        nu nuVarKgy = kgyVarRz.kgy();
        at.kgy kgyVar = new at.kgy();
        long length = this.c.length();
        int iNoq = zg3Var.noq();
        boolean zTwf = zg3Var.twf();
        int iUq = zg3Var.uq();
        if (iUq <= 0) {
            z = zTwf;
        } else if (iUq < zg3Var.at()) {
            z = zTwf;
            iNoq = iUq;
        }
        kgyVar.kgy("videoPreload").kgy(6);
        if (z) {
            kgyVar.kgy("RANGE", pv1.m(length, "bytes=", "-")).ahm(zg3Var.dg()).kgy().ahm();
        } else {
            kgyVar.kgy("RANGE", "bytes=" + length + "-" + iNoq).ahm(zg3Var.dg()).kgy().ahm();
        }
        nuVarKgy.kgy(kgyVar.ahm()).kgy(new ta3(this, length));
    }

    public final void e(zg3 zg3Var, int i) {
        synchronized (ie3.class) {
            try {
                ArrayList arrayList = this.e;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ie3 ie3Var = (ie3) obj;
                    if (ie3Var != null) {
                        ie3Var.kgy(zg3Var, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public eb3(zg3 zg3Var) {
        this.c = null;
        this.d = null;
        this.a = zg3Var;
        this.c = s71.a(zg3Var.ct(), zg3Var.xh());
        this.d = s71.x(zg3Var.ct(), zg3Var.xh());
    }

    public static void b(eb3 eb3Var, Closeable closeable) {
        eb3Var.getClass();
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                rz.kgy(e, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOYBrhgxs5O1kmNAq89Se0o2xOubMuPS9M=", "aessmQ+lX86ET9htnhSsJ1rq", "WOIihgY=", 265);
            }
        }
    }
}
