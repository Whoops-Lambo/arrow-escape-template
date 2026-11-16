package defpackage;

import com.singular.sdk.internal.UserDetailsUtils;
import com.usercentrics.sdk.services.tcf.interfaces.TCFFeature;
import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialPurpose;
import com.usercentrics.sdk.services.tcf.interfaces.TCFStack;
import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class x4 extends rc1 implements wr0 {
    public static final x4 A;
    public static final x4 B;
    public static final x4 C;
    public static final x4 D;
    public static final x4 E;
    public static final x4 F;
    public static final x4 G;
    public static final x4 H;
    public static final x4 I;
    public static final x4 J;
    public static final x4 K;
    public static final x4 L;
    public static final x4 M;
    public static final x4 j;
    public static final x4 k;
    public static final x4 l;
    public static final x4 m;
    public static final x4 n;
    public static final x4 o;
    public static final x4 p;
    public static final x4 q;
    public static final x4 r;
    public static final x4 s;
    public static final x4 t;
    public static final x4 u;
    public static final x4 v;
    public static final x4 w;
    public static final x4 x;
    public static final x4 y;
    public static final x4 z;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new x4(i, 0);
        k = new x4(i, 1);
        l = new x4(i, 2);
        m = new x4(i, 3);
        n = new x4(i, 4);
        o = new x4(i, 5);
        p = new x4(i, 6);
        q = new x4(i, 7);
        r = new x4(i, 8);
        s = new x4(i, 9);
        t = new x4(i, 10);
        u = new x4(i, 11);
        v = new x4(i, 12);
        w = new x4(i, 13);
        x = new x4(i, 14);
        y = new x4(i, 15);
        z = new x4(i, 16);
        A = new x4(i, 17);
        B = new x4(i, 18);
        C = new x4(i, 19);
        D = new x4(i, 20);
        E = new x4(i, 21);
        F = new x4(i, 22);
        G = new x4(i, 23);
        H = new x4(i, 24);
        I = new x4(i, 25);
        J = new x4(i, 26);
        K = new x4(i, 27);
        L = new x4(i, 28);
        M = new x4(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.i;
        az2 az2Var = az2.a;
        switch (i) {
            case 0:
                ei eiVar = (ei) obj;
                eiVar.getClass();
                return h50.i(eiVar.a, UserDetailsUtils.UserDetailsLiterals.AT, eiVar.b);
            case 1:
                return az2Var;
            case 2:
                return (f9) obj;
            case 3:
                ((c01) obj).getClass();
                return az2Var;
            case 4:
                String str = (String) obj;
                str.getClass();
                return str;
            case 5:
                return String.valueOf(((Number) obj).intValue());
            case 6:
                x91 x91Var = (x91) obj;
                x91Var.getClass();
                x91Var.a = true;
                x91Var.c = true;
                x91Var.g = true;
                return az2Var;
            case 7:
                wd1 wd1Var = (wd1) obj;
                wd1Var.getClass();
                return wd1Var.h;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                return "• ".concat(str2);
            case 9:
                ((Boolean) obj).booleanValue();
                return az2Var;
            case 10:
                ((Boolean) obj).booleanValue();
                return az2Var;
            case 11:
                ((Boolean) obj).booleanValue();
                return az2Var;
            case 12:
                wd1 wd1Var2 = (wd1) obj;
                wd1Var2.getClass();
                return wd1Var2.h;
            case 13:
                TCFPurpose tCFPurpose = (TCFPurpose) obj;
                tCFPurpose.getClass();
                return Integer.valueOf(tCFPurpose.c);
            case 14:
                TCFPurpose tCFPurpose2 = (TCFPurpose) obj;
                tCFPurpose2.getClass();
                return Boolean.valueOf(tCFPurpose2.h);
            case 15:
                TCFPurpose tCFPurpose3 = (TCFPurpose) obj;
                tCFPurpose3.getClass();
                return Boolean.valueOf(tCFPurpose3.i);
            case 16:
                TCFPurpose tCFPurpose4 = (TCFPurpose) obj;
                tCFPurpose4.getClass();
                return tCFPurpose4.e;
            case 17:
                TCFPurpose tCFPurpose5 = (TCFPurpose) obj;
                tCFPurpose5.getClass();
                return tCFPurpose5.g;
            case 18:
                TCFVendor tCFVendor = (TCFVendor) obj;
                tCFVendor.getClass();
                return Integer.valueOf(tCFVendor.d);
            case 19:
                TCFVendor tCFVendor2 = (TCFVendor) obj;
                tCFVendor2.getClass();
                return Boolean.valueOf(tCFVendor2.m);
            case 20:
                TCFVendor tCFVendor3 = (TCFVendor) obj;
                tCFVendor3.getClass();
                return Boolean.valueOf(tCFVendor3.n);
            case 21:
                TCFVendor tCFVendor4 = (TCFVendor) obj;
                tCFVendor4.getClass();
                return tCFVendor4.a;
            case 22:
                TCFVendor tCFVendor5 = (TCFVendor) obj;
                tCFVendor5.getClass();
                return tCFVendor5.e;
            case 23:
                return Boolean.FALSE;
            case 24:
                TCFPurpose tCFPurpose6 = (TCFPurpose) obj;
                tCFPurpose6.getClass();
                return tCFPurpose6.d;
            case 25:
                TCFFeature tCFFeature = (TCFFeature) obj;
                tCFFeature.getClass();
                return tCFFeature.d;
            case 26:
                TCFSpecialFeature tCFSpecialFeature = (TCFSpecialFeature) obj;
                tCFSpecialFeature.getClass();
                return tCFSpecialFeature.d;
            case 27:
                TCFSpecialPurpose tCFSpecialPurpose = (TCFSpecialPurpose) obj;
                tCFSpecialPurpose.getClass();
                return tCFSpecialPurpose.d;
            case 28:
                TCFStack tCFStack = (TCFStack) obj;
                tCFStack.getClass();
                return tCFStack.c;
            default:
                TCFVendor tCFVendor6 = (TCFVendor) obj;
                tCFVendor6.getClass();
                return tCFVendor6.g;
        }
    }
}
