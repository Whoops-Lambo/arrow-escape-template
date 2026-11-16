package com.inmobi.media;

import defpackage.az2;
import defpackage.dy;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.tg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4412tg extends ul2 implements zr0 {
    public final /* synthetic */ C4440ug a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4412tg(C4440ug c4440ug, String str, dy dyVar) {
        super(2, dyVar);
        this.a = c4440ug;
        this.b = str;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new C4412tg(this.a, this.b, dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return new C4412tg(this.a, this.b, (dy) obj2).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        Rh rh = this.a.a;
        String str = this.b;
        rh.getClass();
        str.getClass();
        Db db = rh.a;
        ConcurrentHashMap concurrentHashMap = Db.b;
        db.a("omid_js_string", str, false);
        rh.a.a("last_ts", System.currentTimeMillis() / 1000, false);
        return az2.a;
    }
}
