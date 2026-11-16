package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final Map<String, Lock> a = new HashMap();
    private FileLock b;
    private String c;

    public static a a(String str) throws Exception {
        Map<String, Lock> map = a;
        synchronized (map) {
            try {
                Lock reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                if (!reentrantLock.tryLock()) {
                    return null;
                }
                try {
                    FileLock fileLockC = FileLock.c(str);
                    if (fileLockC == null) {
                        reentrantLock.unlock();
                        return null;
                    }
                    return new a(str, fileLockC);
                } catch (Exception e) {
                    reentrantLock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e));
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private a(String str, FileLock fileLock) {
        this.c = str;
        this.b = fileLock;
    }

    public final void a() {
        Map<String, Lock> map = a;
        synchronized (map) {
            try {
                try {
                    this.b.a();
                    this.b.b();
                    map.get(this.c).unlock();
                } catch (Throwable th) {
                    a.get(this.c).unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
