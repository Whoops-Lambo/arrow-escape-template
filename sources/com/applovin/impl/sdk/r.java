package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class r {
    private final Queue a = new LinkedList();
    private final Object b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            try {
                if (b() <= 25) {
                    this.a.offer(appLovinAdImpl);
                } else {
                    p.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z;
        synchronized (this.b) {
            z = b() == 0;
        }
        return z;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            appLovinAdImpl = (AppLovinAdImpl) this.a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.b) {
            this.a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.a.poll() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appLovinAdImpl;
    }
}
