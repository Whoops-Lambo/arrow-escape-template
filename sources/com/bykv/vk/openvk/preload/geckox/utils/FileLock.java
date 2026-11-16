package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import com.facebook.appevents.p;
import defpackage.ak1;
import defpackage.h50;
import defpackage.m93;
import defpackage.nj;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class FileLock {
    private static final Map<String, Integer> a = new HashMap();
    private final int b;
    private final String c;

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i) throws Exception;

    private static native void nLockFileSegment(int i, int i2) throws Exception;

    private static native void nRelease(int i) throws Exception;

    private static native boolean nTryLock(int i) throws Exception;

    private static native void nUnlockFile(int i) throws Exception;

    static {
        System.loadLibrary("file_lock_pgl");
    }

    private static int d(String str) throws Exception {
        Integer numValueOf;
        Map<String, Integer> map = a;
        synchronized (map) {
            try {
                numValueOf = map.get(str);
                if (numValueOf == null) {
                    new File(str).getParentFile().mkdirs();
                    numValueOf = Integer.valueOf(nGetFD(str));
                    map.put(str, numValueOf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return numValueOf.intValue();
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = a;
        synchronized (map) {
            numRemove = map.remove(this.c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e) {
            m93.k("release lock failed, file:", this.c, " caused by:", e.getMessage());
        }
    }

    private FileLock(String str, int i) {
        this.c = str;
        this.b = i;
    }

    public static FileLock a(String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new FileLock(str, iD);
        } catch (Exception e) {
            StringBuilder sbR = h50.r("lock failed, file:", str, ", pid:");
            sbR.append(Process.myPid());
            sbR.append(" caused by:");
            ak1.m(sbR, e.getMessage());
            return null;
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int iD = d(str);
            if (!nTryLock(iD)) {
                new FileLock(str, iD).b();
                return null;
            }
            return new FileLock(str, iD);
        } catch (Exception e) {
            y.j(nj.o(e, h50.r("try lock failed, file:", str, " caused by:")));
            return null;
        }
    }

    public static FileLock b(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            return null;
        } catch (Exception e) {
            y.j(nj.o(e, h50.r("try lock failed, file:", str, " caused by:")));
            return null;
        }
    }

    public static FileLock a(String str, int i) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i);
            return new FileLock(str, iD);
        } catch (Exception e) {
            y.j(nj.o(e, h50.r("lock segment failed, file:", str, " caused by:")));
            return null;
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.b);
        } catch (Exception unused) {
            p.b(this.c, "release lock failed，path:");
        }
    }
}
