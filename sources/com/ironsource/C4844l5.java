package com.ironsource;

import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4844l5 {
    private long a = new Date().getTime();

    public static long a(C4844l5 c4844l5) {
        if (c4844l5 == null) {
            return 0L;
        }
        return new Date().getTime() - c4844l5.a;
    }
}
