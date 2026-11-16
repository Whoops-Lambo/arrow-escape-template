package com.vungle.ads.internal;

import com.vungle.ads.InitializationListener;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class s2 extends rc1 implements sr0 {
    public final /* synthetic */ t2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2 t2Var) {
        super(0);
        this.a = t2Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((InitializationListener) it.next()).onSuccess();
        }
        this.a.c.clear();
        return az2.a;
    }
}
