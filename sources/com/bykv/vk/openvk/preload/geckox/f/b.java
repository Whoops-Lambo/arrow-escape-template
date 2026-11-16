package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final Map<String, Lock> a = new HashMap();
    private static ReentrantLock b = new ReentrantLock();
    private String c;
    private FileLock d;

    public static b a(String str) throws Exception {
        b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e) {
            b.unlock();
            throw e;
        }
    }

    private b(String str, FileLock fileLock) {
        this.c = str;
        this.d = fileLock;
    }

    public final void a() {
        try {
            this.d.a();
            this.d.b();
            Lock lock = a.get(this.c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            b.unlock();
        }
    }
}
