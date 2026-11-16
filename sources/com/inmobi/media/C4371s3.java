package com.inmobi.media;

import java.util.Map;
import java.util.Random;

/* JADX INFO: renamed from: com.inmobi.media.s3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4371s3 {
    public final int a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final boolean e;
    public int f;
    public long g;
    public final long h;

    public /* synthetic */ C4371s3(String str, boolean z, boolean z2, int i, int i2) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, null, z, z2, i, System.currentTimeMillis(), System.currentTimeMillis());
    }

    public C4371s3(int i, String str, Map map, boolean z, boolean z2, int i2, long j, long j2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = map;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = j;
        this.h = j2;
    }
}
