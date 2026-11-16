package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.fy;

/* JADX INFO: renamed from: com.inmobi.media.ng, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4245ng extends fy {
    public AdConfig.OmidConfig a;
    public Context b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4356rg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4245ng(C4356rg c4356rg, fy fyVar) {
        super(fyVar);
        this.d = c4356rg;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
