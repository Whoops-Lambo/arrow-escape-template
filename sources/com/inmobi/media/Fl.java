package com.inmobi.media;

import defpackage.dy;
import defpackage.ks0;
import defpackage.zr0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Fl extends ks0 implements zr0 {
    public Fl() {
        super(2, Ql.a, Ql.class, "push", "push(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return ((Ql) this.receiver).a((JSONObject) obj, (dy) obj2);
    }
}
