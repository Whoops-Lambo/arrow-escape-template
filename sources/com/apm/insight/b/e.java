package com.apm.insight.b;

import androidx.annotation.CallSuper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e {
    public static long a;
    public static long b;
    public volatile boolean c = false;

    @CallSuper
    public void a(String str) {
        this.c = true;
    }

    @CallSuper
    public void b(String str) {
        this.c = false;
    }

    public boolean a() {
        return false;
    }
}
