package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.tb5;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class J4 {
    public final L4 a;
    public final K4 b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) {
        E4 e4;
        if (fyVar instanceof E4) {
            e4 = (E4) fyVar;
            int i = e4.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4.c = i - Integer.MIN_VALUE;
            } else {
                e4 = new E4(this, fyVar);
            }
        } else {
            e4 = new E4(this, fyVar);
        }
        Object objA = e4.a;
        int i2 = e4.c;
        if (i2 == 0) {
            wz2.a0(objA);
            B4 b4 = (B4) this.b.b.getValue();
            e4.c = 1;
            objA = b4.a(e4);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        for (Config config : (Iterable) objA) {
            config.getType();
            this.a.b.put(config.getType(), config);
        }
        return az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fy fyVar) {
        H4 h4;
        if (fyVar instanceof H4) {
            h4 = (H4) fyVar;
            int i = h4.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h4.c = i - Integer.MIN_VALUE;
            } else {
                h4 = new H4(this, fyVar);
            }
        } else {
            h4 = new H4(this, fyVar);
        }
        Object obj = h4.a;
        int i2 = h4.c;
        az2 az2Var = az2.a;
        if (i2 == 0) {
            wz2.a0(obj);
            if (this.a.a.getAndSet(true)) {
                return az2Var;
            }
            h4.c = 1;
            Object objA = a(h4);
            Object obj2 = dz.a;
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
        }
        String[] strArr = S4.a;
        for (int i3 = 0; i3 < 5; i3++) {
            String str = strArr[i3];
            if (this.a.b.get(str) == null) {
                this.a.b.put(str, N5.a(str));
            }
        }
        tb5.t(this.b.a, null, null, new I4(this, null), 3);
        return az2Var;
    }

    public J4(L4 l4, K4 k4) {
        l4.getClass();
        k4.getClass();
        this.a = l4;
        this.b = k4;
    }

    public final Config a(Class cls) {
        cls.getClass();
        String strA = U4.a(cls);
        Config config = (Config) this.a.b.get(strA);
        if (config == null) {
            String[] strArr = S4.a;
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                if (this.a.b.get(str) == null) {
                    this.a.b.put(str, N5.a(str));
                }
            }
            config = (Config) this.a.b.get(strA);
            tb5.t(this.b.a, null, null, new G4(this, null), 3);
        }
        config.getClass();
        return config;
    }
}
