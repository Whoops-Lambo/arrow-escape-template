package com.vungle.ads.internal.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements a {
    public j a;
    public j b;
    public j c;
    public j d;
    public j e;
    public j f;
    public j g;
    public j h;
    public j i;

    public d() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        c cVar = new c("vng_jr");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = new j(iAvailableProcessors, iAvailableProcessors, 5L, timeUnit, linkedBlockingQueue, cVar);
        this.a = new j(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new c("vng_io"));
        this.i = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_api"));
        this.d = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_logger"));
        this.b = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_background"));
        this.e = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_ua"));
        this.f = new j(4, 4, 1L, timeUnit, new PriorityBlockingQueue(), new c("vng_down"));
        this.g = new j(2, 2, 1L, timeUnit, new PriorityBlockingQueue(), new c("vng_pre_down"));
        this.h = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_ol"));
    }

    public final j a() {
        return this.i;
    }

    public final j b() {
        return this.b;
    }

    public final j c() {
        return this.a;
    }

    public final j d() {
        return this.c;
    }

    public final j e() {
        return this.d;
    }

    public final j f() {
        return this.h;
    }
}
