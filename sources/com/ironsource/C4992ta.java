package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ta, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C4992ta {
    private static C4992ta c;
    private final HashSet<ImpressionDataListener> a = new HashSet<>();
    private ConcurrentHashMap<String, List<String>> b = new ConcurrentHashMap<>();

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public void d() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public static synchronized C4992ta b() {
        try {
            if (c == null) {
                c = new C4992ta();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.b;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.a;
    }

    public void a(String str, List<String> list) {
        this.b.put(str, list);
    }

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }
}
