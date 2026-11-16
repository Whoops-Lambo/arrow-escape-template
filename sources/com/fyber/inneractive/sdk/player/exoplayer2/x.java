package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class x {
    public static final u a = new u();

    public abstract int a();

    public abstract int a(Object obj);

    public abstract v a(int i, v vVar, boolean z);

    public abstract w a(int i, w wVar, long j);

    public abstract int b();

    public final w a(int i, w wVar) {
        return a(i, wVar, 0L);
    }

    public final boolean c() {
        if (b() == 0) {
            return true;
        }
        return false;
    }
}
