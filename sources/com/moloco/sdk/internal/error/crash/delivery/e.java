package com.moloco.sdk.internal.error.crash.delivery;

import defpackage.az2;
import defpackage.ks0;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e extends ks0 implements zr0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        az2 az2Var = az2.a;
        switch (i) {
            case 0:
                m mVar = (m) obj;
                String str = (String) obj2;
                mVar.getClass();
                str.getClass();
                ((com.moloco.sdk.internal.error.crash.c) this.receiver).a(mVar, str);
                break;
            default:
                m mVar2 = (m) obj;
                String str2 = (String) obj2;
                mVar2.getClass();
                str2.getClass();
                ((com.moloco.sdk.internal.error.crash.c) this.receiver).a(mVar2, str2);
                break;
        }
        return az2Var;
    }
}
