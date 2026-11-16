package com.adsurge.adn.oversea_ad;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class Cepheus {
    public static final ExecutorService a = Executors.newFixedThreadPool(5);
    public static final ExecutorService b = Executors.newCachedThreadPool();
    public static final ExecutorService c = Executors.newSingleThreadExecutor();
}
