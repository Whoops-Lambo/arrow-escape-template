package com.moloco.sdk.internal.publisher;

import defpackage.az2;
import defpackage.dy;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class q0 extends ul2 implements zr0 {
    public final /* synthetic */ int r;
    public /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i, dy dyVar, int i2) {
        super(i, dyVar);
        this.r = i2;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        switch (this.r) {
            case 0:
                q0 q0Var = new q0(2, dyVar, 0);
                q0Var.s = ((Boolean) obj).booleanValue();
                return q0Var;
            case 1:
                q0 q0Var2 = new q0(2, dyVar, 1);
                q0Var2.s = ((Boolean) obj).booleanValue();
                return q0Var2;
            case 2:
                q0 q0Var3 = new q0(2, dyVar, 2);
                q0Var3.s = ((Boolean) obj).booleanValue();
                return q0Var3;
            case 3:
                q0 q0Var4 = new q0(2, dyVar, 3);
                q0Var4.s = ((Boolean) obj).booleanValue();
                return q0Var4;
            case 4:
                q0 q0Var5 = new q0(2, dyVar, 4);
                q0Var5.s = ((Boolean) obj).booleanValue();
                return q0Var5;
            default:
                q0 q0Var6 = new q0(2, dyVar, 5);
                q0Var6.s = ((Boolean) obj).booleanValue();
                return q0Var6;
        }
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        az2 az2Var = az2.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        dy dyVar = (dy) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((q0) create(bool, dyVar)).invokeSuspend(az2Var);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                wz2.a0(obj);
                return Boolean.valueOf(!this.s);
            case 1:
                wz2.a0(obj);
                return Boolean.valueOf(!this.s);
            case 2:
                wz2.a0(obj);
                return Boolean.valueOf(this.s);
            case 3:
                wz2.a0(obj);
                return Boolean.valueOf(!this.s);
            case 4:
                wz2.a0(obj);
                return Boolean.valueOf(this.s);
            default:
                wz2.a0(obj);
                return Boolean.valueOf(this.s);
        }
    }
}
