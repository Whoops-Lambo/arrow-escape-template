package com.inmobi.media;

import defpackage.fy;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.fi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4024fi extends fy {
    public JSONObject a;
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4080hi d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4024fi(C4080hi c4080hi, fy fyVar) {
        super(fyVar);
        this.d = c4080hi;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((JSONObject) null, this);
    }
}
