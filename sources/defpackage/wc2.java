package defpackage;

import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
import com.usercentrics.sdk.v2.settings.data.CCPASettings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class wc2 {
    public final tc2 a;
    public final rt0 b;
    public vd1 c;

    public wc2(tc2 tc2Var, rt0 rt0Var) {
        tc2Var.getClass();
        rt0Var.getClass();
        this.a = tc2Var;
        this.b = rt0Var;
        this.c = new vd1((List) null, (List) null, (xs0) null, (CCPASettings) null, (String) null, (String) null, false, (ArrayList) null, (xw1) null, (ls) null, (String) null, (String) null, (Long) null, 16383);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(SettingsInitializationParameters settingsInitializationParameters, fy fyVar) {
        vc2 vc2Var;
        Object objA;
        if (fyVar instanceof vc2) {
            vc2Var = (vc2) fyVar;
            int i = vc2Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                vc2Var.u = i - Integer.MIN_VALUE;
            } else {
                vc2Var = new vc2(this, fyVar);
            }
        } else {
            vc2Var = new vc2(this, fyVar);
        }
        Object obj = vc2Var.s;
        int i2 = vc2Var.u;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                tc2 tc2Var = this.a;
                vc2Var.r = this;
                vc2Var.u = 1;
                objA = tc2Var.a(settingsInitializationParameters, vc2Var);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = vc2Var.r;
                wz2.a0(obj);
                objA = ((k52) obj).a;
            }
            Throwable thB = k52.b(objA);
            if (thB != null) {
                return new j52(new ir1(String.valueOf(thB.getMessage()), thB));
            }
            vd1 vd1VarA = vd1.a((vd1) objA, null, null, null, null, 16383);
            this.getClass();
            this.c = vd1VarA;
            return az2.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new j52(new ir1(String.valueOf(e2.getMessage()), e2));
        }
    }

    public final boolean b() {
        xw1 xw1Var = this.c.i;
        if (xw1Var != null) {
            return xw1Var.a;
        }
        return false;
    }
}
