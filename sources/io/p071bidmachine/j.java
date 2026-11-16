package io.p071bidmachine;

import com.ironsource.G5;
import defpackage.az2;
import defpackage.dk2;
import defpackage.dt1;
import defpackage.rc1;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j extends rc1 implements wr0 {
    public static final j j;
    public static final j k;
    public static final j l;
    public static final j m;
    public static final j n;
    public static final j o;
    public static final j p;
    public static final j q;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new j(i, 0);
        k = new j(i, 1);
        l = new j(i, 2);
        m = new j(i, 3);
        n = new j(i, 4);
        o = new j(i, 5);
        p = new j(i, 6);
        q = new j(i, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.i;
        az2 az2Var = az2.a;
        switch (i) {
            case 0:
                AdProcessCallback adProcessCallback = (AdProcessCallback) obj;
                adProcessCallback.getClass();
                adProcessCallback.processClosed();
                return az2Var;
            case 1:
                AdProcessCallback adProcessCallback2 = (AdProcessCallback) obj;
                adProcessCallback2.getClass();
                adProcessCallback2.processDestroy();
                return az2Var;
            case 2:
                AdProcessCallback adProcessCallback3 = (AdProcessCallback) obj;
                adProcessCallback3.getClass();
                adProcessCallback3.processExpired();
                return az2Var;
            case 3:
                AdProcessCallback adProcessCallback4 = (AdProcessCallback) obj;
                adProcessCallback4.getClass();
                adProcessCallback4.processFillAd();
                return az2Var;
            case 4:
                AdProcessCallback adProcessCallback5 = (AdProcessCallback) obj;
                adProcessCallback5.getClass();
                adProcessCallback5.processFinished();
                return az2Var;
            case 5:
                AdProcessCallback adProcessCallback6 = (AdProcessCallback) obj;
                adProcessCallback6.getClass();
                adProcessCallback6.processLoadSuccess();
                return az2Var;
            case 6:
                AdProcessCallback adProcessCallback7 = (AdProcessCallback) obj;
                adProcessCallback7.getClass();
                adProcessCallback7.processShown();
                return az2Var;
            default:
                String str = (String) obj;
                str.getClass();
                int iW = dk2.W(str, G5.U, 0, 6);
                if (iW < 0) {
                    return null;
                }
                return new dt1(str.substring(0, iW), str.substring(iW + 1));
        }
    }
}
