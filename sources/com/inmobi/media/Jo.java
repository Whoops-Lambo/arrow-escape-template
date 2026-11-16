package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Jo {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Bn bn, AdConfig.VastVideoConfig vastVideoConfig, fy fyVar) {
        Fo fo;
        if (fyVar instanceof Fo) {
            fo = (Fo) fyVar;
            int i = fo.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo.b = i - Integer.MIN_VALUE;
            } else {
                fo = new Fo(fyVar);
            }
        } else {
            fo = new Fo(fyVar);
        }
        Object objA = fo.a;
        int i2 = fo.b;
        Of of = null;
        try {
            if (i2 == 0) {
                wz2.a0(objA);
                Lf lf = new Lf(bn.c, new Bm(vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout()));
                C4044ga c4044ga = (C4044ga) If.c.getValue();
                fo.b = 1;
                objA = c4044ga.a.a(lf, fo);
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
            of = (Of) objA;
        } catch (Exception unused) {
        }
        return (of == null || of.c() != 200) ? new Double(Double.MAX_VALUE) : new Double(of.b().c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Bn bn, double d, AdConfig.VastVideoConfig vastVideoConfig, fy fyVar) {
        Eo eo;
        double dDoubleValue;
        if (fyVar instanceof Eo) {
            eo = (Eo) fyVar;
            int i = eo.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eo.c = i - Integer.MIN_VALUE;
            } else {
                eo = new Eo(fyVar);
            }
        } else {
            eo = new Eo(fyVar);
        }
        Object objA = eo.b;
        int i2 = eo.c;
        double d2 = Double.MAX_VALUE;
        if (i2 == 0) {
            wz2.a0(objA);
            dDoubleValue = ((double) bn.d) * d;
            if (dDoubleValue <= 0.0d && !vastVideoConfig.getBitRate().getFetchFromHead()) {
                return new Double(Double.MAX_VALUE);
            }
            if (dDoubleValue <= 0.0d) {
                eo.a = vastVideoConfig;
                eo.c = 1;
                objA = a(bn, vastVideoConfig, eo);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
            }
            if (dDoubleValue > 0.0d && dDoubleValue <= vastVideoConfig.getVastMaxAssetSize()) {
                d2 = dDoubleValue;
            }
            return new Double(d2);
        }
        if (i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vastVideoConfig = eo.a;
        wz2.a0(objA);
        dDoubleValue = ((Number) objA).doubleValue();
        if (dDoubleValue > 0.0d) {
            d2 = dDoubleValue;
        }
        return new Double(d2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Bn bn, double d, Qf qf, int i, AdConfig.VastVideoConfig vastVideoConfig, fy fyVar) {
        Do r0;
        double d2;
        if (fyVar instanceof Do) {
            r0 = (Do) fyVar;
            int i2 = r0.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0.e = i2 - Integer.MIN_VALUE;
            } else {
                r0 = new Do(fyVar);
            }
        } else {
            r0 = new Do(fyVar);
        }
        Object objA = r0.d;
        int i3 = r0.e;
        if (i3 == 0) {
            wz2.a0(objA);
            r0.a = bn;
            r0.b = qf;
            r0.c = i;
            r0.e = 1;
            objA = a(bn, d, vastVideoConfig, r0);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i3 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = r0.c;
            qf = r0.b;
            bn = r0.a;
            wz2.a0(objA);
        }
        double dDoubleValue = ((Number) objA).doubleValue();
        if (dDoubleValue == Double.MAX_VALUE) {
            return new Double(Double.MAX_VALUE);
        }
        double dAbs = Math.abs((bn.a * bn.b) - i);
        int iOrdinal = qf.ordinal();
        if (iOrdinal != 2) {
            d2 = iOrdinal != 3 ? 0.5d : 1.5d;
        } else {
            d2 = 1.0d;
        }
        return new Double((dAbs * d2) / Math.exp(dDoubleValue / 3.145728E7d));
    }
}
