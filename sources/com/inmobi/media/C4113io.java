package com.inmobi.media;

import defpackage.fy;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.io, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4113io extends fy {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4141jo b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4113io(C4141jo c4141jo, fy fyVar) {
        super(fyVar);
        this.b = c4141jo;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((String) null, (ArrayList) null, this);
    }
}
