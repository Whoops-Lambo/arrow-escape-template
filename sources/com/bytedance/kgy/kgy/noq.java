package com.bytedance.kgy.kgy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class noq {
    public static int kgy() {
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (jMaxMemory == 0) {
            return -1;
        }
        return 100 - ((int) ((jFreeMemory * 100.0f) / jMaxMemory));
    }

    public static float kgy(boolean z) {
        int iKgy = kgy();
        if (iKgy < 0) {
            return 1.0f;
        }
        if (iKgy < 30) {
            return z ? 0.1f : 2.0f;
        }
        if (iKgy < 60) {
            return z ? 0.5f : 1.5f;
        }
        return 1.0f;
    }
}
