package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import defpackage.dy;
import defpackage.fy;

/* JADX INFO: renamed from: com.inmobi.media.xa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4515xa extends fy {
    public /* synthetic */ Object a;
    public int b;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.access$resetInternal(this);
    }

    public C4515xa(dy dyVar) {
        super(dyVar);
    }
}
