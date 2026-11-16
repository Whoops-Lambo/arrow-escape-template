package com.adsurge.adn.lib.dynamic;

import com.adsurge.adn.p048o1.g;
import defpackage.ak1;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class QuickJS implements Closeable {
    public long a;

    private native Object call(long j, long j2, Object obj, Object[] objArr);

    private native byte[] compile(long j, String str, String str2);

    private static native long createContext();

    private native void destroyContext(long j);

    private native Object evaluate(long j, String str, String str2);

    private native Object execute(long j, byte[] bArr);

    private native long get(long j, String str, Object[] objArr);

    private native void set(long j, String str, Object obj, Object[] objArr);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.a;
        if (j != 0) {
            this.a = 0L;
            synchronized (QuickJS.class) {
                destroyContext(j);
            }
        }
    }

    public void finalize() {
        if (this.a != 0) {
            g.b();
            Logger.getLogger(QuickJS.class.getName()).warning("QuickJS instance leaked!");
        }
    }

    public QuickJS(long j) {
        this.a = j;
    }

    public void a(String str, Class cls, Object obj) {
        if (cls.isInterface()) {
            if (cls.getInterfaces().length <= 0) {
                if (cls.isInstance(obj)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Method method : cls.getMethods()) {
                        if (linkedHashMap.put(method.getName(), method) != null) {
                            throw new UnsupportedOperationException(method.getName() + " is overloaded in " + cls);
                        }
                    }
                    synchronized (QuickJS.class) {
                        set(this.a, str, obj, linkedHashMap.values().toArray());
                    }
                    return;
                }
                ak1.e(obj.getClass(), " is not an instance of ", cls);
                return;
            }
            throw new UnsupportedOperationException(cls + " must not extend other interfaces");
        }
        throw new UnsupportedOperationException("Only interfaces can be bound. Received: " + cls);
    }

    public Object a(String str) {
        return evaluate(this.a, str, "?");
    }

    public static synchronized QuickJS a() {
        long jCreateContext;
        jCreateContext = createContext();
        if (jCreateContext != 0) {
        } else {
            throw new OutOfMemoryError("Cannot create QuickJS instance");
        }
        return new QuickJS(jCreateContext);
    }
}
