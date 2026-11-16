package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import defpackage.fy;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7 extends fy {
    public InMobiUserDataModel a;
    public Mutex b;
    public /* synthetic */ Object c;
    public int d;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return D7.a(null, this);
    }

    public C7(fy fyVar) {
        super(fyVar);
    }
}
