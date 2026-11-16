package com.mbridge.msdk.click.retry;

import defpackage.d;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class c {
    private final LinkedHashMap<String, b> a;
    private final int b;
    private int c;

    private void a(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.c < 0 || (this.a.isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c > i && !this.a.isEmpty()) {
                        Map.Entry<String, b> next = this.a.entrySet().iterator().next();
                        if (next == null) {
                            return;
                        }
                        String key = next.getKey();
                        try {
                            int iB = b(key, next.getValue());
                            this.a.remove(key);
                            this.c -= iB;
                        } catch (Throwable unused) {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.b));
    }

    public final void b(String str) {
        if (str == null) {
            d.w("key == null");
            return;
        }
        synchronized (this) {
            try {
                b bVarRemove = this.a.remove(str);
                if (bVarRemove != null) {
                    this.c -= b(str, bVarRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c(int i) {
        if (i > 0) {
            this.b = i;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
        } else {
            d.r("maxSize <= 0");
            throw null;
        }
    }

    private int b(String str, b bVar) {
        return 1;
    }

    public final boolean a(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                try {
                    this.c += b(str, bVar);
                    b bVarPut = this.a.put(str, bVar);
                    if (bVarPut != null) {
                        this.c -= b(str, bVarPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.b);
            return true;
        }
        d.w("key == null || value == null");
        return false;
    }

    public final b a(String str) {
        if (str != null) {
            synchronized (this) {
                try {
                    b bVar = this.a.get(str);
                    if (bVar != null) {
                        return bVar;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d.w("key == null");
        return null;
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.a.keySet());
        }
        return hashSet;
    }
}
