package com.mbridge.msdk.dycreator.viewobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends com.mbridge.msdk.dycreator.observable.a {
    private List<Object> a = new ArrayList();
    protected ConcurrentHashMap<Integer, Object> b = new ConcurrentHashMap<>();

    public synchronized void a(Object obj, int i) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.b;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.b.put(Integer.valueOf(i), obj);
            }
        }
    }

    public synchronized void a() {
        this.b.clear();
    }
}
