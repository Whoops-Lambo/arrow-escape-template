package com.explorestack.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d4 extends c {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static void b(Class cls) {
        ConcurrentHashMap concurrentHashMap = a;
        if (concurrentHashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            if (concurrentHashMap.get(cls) != null) {
                throw new ClassCastException();
            }
            c9.b(cls).getClass();
            throw new ClassCastException();
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Class initialization cannot fail.", e);
        }
    }
}
