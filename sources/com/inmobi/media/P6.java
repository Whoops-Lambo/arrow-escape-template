package com.inmobi.media;

import defpackage.cm2;
import defpackage.gd1;
import defpackage.gs1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class P6 {
    public static final gd1 a = new cm2(new gs1(6));
    public static final gd1 b = new cm2(new gs1(7));
    public static final gd1 c = new cm2(new gs1(8));
    public static final gd1 d = new cm2(new gs1(9));
    public static final gd1 e = new cm2(new gs1(10));
    public static final gd1 f = new cm2(new gs1(11));

    public static final ExecutorService a() {
        return Executors.newCachedThreadPool(new ThreadFactoryC4239na("ExecutorProvider.IO", false));
    }

    public static final ExecutorService b() {
        return Executors.newCachedThreadPool(new ThreadFactoryC4239na("ExecutorProvider.high", false));
    }

    public static final ExecutorService c() {
        return Executors.newCachedThreadPool(new ThreadFactoryC4239na("ExecutorProvider.highIO", false));
    }

    public static final Wc d() {
        return new Wc();
    }

    public static final ExecutorService e() {
        return Executors.newCachedThreadPool(new ThreadFactoryC4239na("ExecutorProvider.normal", false));
    }

    public static final ExecutorService f() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC4239na("ExecutorProvider.single", false));
    }
}
