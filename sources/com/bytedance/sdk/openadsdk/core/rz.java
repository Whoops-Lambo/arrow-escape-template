package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz {
    private static volatile rz kgy;

    public static rz kgy() {
        if (kgy == null) {
            synchronized (rz.class) {
                try {
                    if (kgy == null) {
                        kgy = new rz();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    public Long ahm(String str, long j) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("ttopenadsdk", str, j));
    }

    private rz() {
    }

    public int ahm(String str, int i) {
        return com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("ttopenadsdk", str, i);
    }

    public String ahm(String str, String str2) {
        return com.bytedance.sdk.openadsdk.fpp.uq.kgy.ahm("ttopenadsdk", str, str2);
    }

    public void kgy(String str, String str2) {
        com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("ttopenadsdk", str, str2);
    }

    public void kgy(String str, int i) {
        com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("ttopenadsdk", str, Integer.valueOf(i));
    }

    public void kgy(String str, long j) {
        com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("ttopenadsdk", str, Long.valueOf(j));
    }

    public void kgy(String str) {
        com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("ttopenadsdk", str);
    }
}
