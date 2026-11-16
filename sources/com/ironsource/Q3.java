package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class Q3 {
    private a a = a.NOT_READY;
    private ArrayList b = new ArrayList();
    private String c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        NOT_READY,
        READY
    }

    public synchronized void a() {
        try {
            Object[] array = this.b.toArray();
            for (int i = 0; i < array.length; i++) {
                ((Runnable) array[i]).run();
                array[i] = null;
            }
            this.b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        this.a = a.NOT_READY;
    }

    public synchronized void c() {
        this.a = a.READY;
    }

    public Q3(String str) {
        this.c = str;
    }

    public synchronized void a(Runnable runnable) {
        if (this.a != a.READY) {
            this.b.add(runnable);
        } else {
            runnable.run();
        }
    }
}
