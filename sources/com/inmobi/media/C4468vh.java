package com.inmobi.media;

import defpackage.fy;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.vh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4468vh extends fy {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Gh c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4468vh(Gh gh, fy fyVar) {
        super(fyVar);
        this.c = gh;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, 0L, this);
    }
}
