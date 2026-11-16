package com.inmobi.media;

import defpackage.dy;
import defpackage.fy;

/* JADX INFO: renamed from: com.inmobi.media.ve, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4465ve extends fy {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C4492we c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4465ve(C4492we c4492we, dy dyVar) {
        super(dyVar);
        this.c = c4492we;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
