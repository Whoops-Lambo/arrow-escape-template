package com.inmobi.media;

import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.vm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4473vm {
    public final C4167km a;
    public final C4082hk b;
    public final C4500wm c;

    public C4473vm(C4167km c4167km, List list) {
        c4167km.getClass();
        list.getClass();
        this.a = c4167km;
        double dRandom = Math.random();
        this.b = new C4082hk(c4167km, dRandom, list);
        this.c = new C4500wm(c4167km, dRandom);
    }
}
