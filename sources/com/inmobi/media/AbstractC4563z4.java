package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.inmobi.media.z4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4563z4 {
    public static final J4 a = new J4(new L4(), new K4(AbstractC4211ma.d));

    public static void a(String str, T4 t4) {
        str.getClass();
        t4.getClass();
        J4 j4 = a;
        j4.getClass();
        LinkedHashMap linkedHashMap = j4.a.c;
        Object concurrentLinkedQueue = linkedHashMap.get(str);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            linkedHashMap.put(str, concurrentLinkedQueue);
        }
        ((ConcurrentLinkedQueue) concurrentLinkedQueue).add(new WeakReference(t4));
    }
}
