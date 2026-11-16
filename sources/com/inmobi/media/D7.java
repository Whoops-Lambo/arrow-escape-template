package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.pp1;
import defpackage.wz2;
import java.util.Objects;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class D7 {
    public static InMobiUserDataModel b;
    public static final D7 a = new D7();
    public static final Mutex c = new pp1();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(InMobiUserDataModel inMobiUserDataModel, fy fyVar) {
        C7 c7;
        pp1 pp1Var;
        Mutex mutex;
        if (fyVar instanceof C7) {
            c7 = (C7) fyVar;
            int i = c7.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7.d = i - Integer.MIN_VALUE;
            } else {
                c7 = new C7(fyVar);
            }
        } else {
            c7 = new C7(fyVar);
        }
        Object obj = c7.c;
        int i2 = c7.d;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = c;
            c7.a = inMobiUserDataModel;
            c7.b = mutex2;
            c7.d = 1;
            pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(c7);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                mutex = pp1Var;
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Mutex mutex3 = c7.b;
            InMobiUserDataModel inMobiUserDataModel2 = c7.a;
            wz2.a0(obj);
            mutex = mutex3;
            inMobiUserDataModel = inMobiUserDataModel2;
        }
        try {
            mutex = pp1Var;
            Objects.toString(b);
            Objects.toString(inMobiUserDataModel);
            b = inMobiUserDataModel;
            return az2.a;
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    public final String toString() {
        return String.valueOf(b);
    }
}
