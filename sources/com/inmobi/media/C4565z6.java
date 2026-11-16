package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4565z6 {
    public static B6 a(int i) {
        if (400 <= i && 500 > i) {
            return B6.f;
        }
        if (200 < i && 300 > i) {
            return B6.g;
        }
        B6 b6 = (B6) B6.c.get(i);
        return b6 == null ? B6.d : b6;
    }
}
