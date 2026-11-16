package defpackage;

import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
import com.usercentrics.sdk.v2.translation.data.LegalBasisLocalization;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tc2 {
    public final nd2 a;
    public final dr2 b;
    public final m62 c;
    public final fn d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(SettingsInitializationParameters settingsInitializationParameters, fy fyVar) {
        sc2 sc2Var;
        tc2 tc2Var;
        SettingsInitializationParameters settingsInitializationParameters2;
        if (fyVar instanceof sc2) {
            sc2Var = (sc2) fyVar;
            int i = sc2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                sc2Var.v = i - Integer.MIN_VALUE;
            } else {
                sc2Var = new sc2(this, fyVar);
            }
        } else {
            sc2Var = new sc2(this, fyVar);
        }
        Object obj = sc2Var.t;
        int i2 = sc2Var.v;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                nd2 nd2Var = this.a;
                sc2Var.r = this;
                sc2Var.s = settingsInitializationParameters;
                sc2Var.v = 1;
                if (nd2Var.c(settingsInitializationParameters, sc2Var) == dzVar) {
                }
                return dzVar;
            }
            if (i2 == 1) {
                settingsInitializationParameters = sc2Var.s;
                this = sc2Var.r;
                wz2.a0(obj);
            } else {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                settingsInitializationParameters2 = sc2Var.s;
                tc2Var = sc2Var.r;
                wz2.a0(obj);
            }
            uq1 uq1Var = tc2Var.a.d;
            uq1Var.getClass();
            LegalBasisLocalization legalBasisLocalization = tc2Var.b.b;
            legalBasisLocalization.getClass();
            return tc2Var.c.o(uq1Var.a, uq1Var.b, legalBasisLocalization, settingsInitializationParameters2.d);
            dr2 dr2Var = this.b;
            String str = settingsInitializationParameters.c;
            boolean z = this.d.a;
            sc2Var.r = this;
            sc2Var.s = settingsInitializationParameters;
            sc2Var.v = 2;
            if (dr2Var.a(str, z, sc2Var) != dzVar) {
                SettingsInitializationParameters settingsInitializationParameters3 = settingsInitializationParameters;
                tc2Var = this;
                settingsInitializationParameters2 = settingsInitializationParameters3;
                uq1 uq1Var2 = tc2Var.a.d;
                uq1Var2.getClass();
                LegalBasisLocalization legalBasisLocalization2 = tc2Var.b.b;
                legalBasisLocalization2.getClass();
                return tc2Var.c.o(uq1Var2.a, uq1Var2.b, legalBasisLocalization2, settingsInitializationParameters2.d);
            }
            return dzVar;
        } catch (Exception e) {
            return new j52(new r23("Unable to initialise due to poor or no network connection while fetching the settings.", e));
        }
    }

    public tc2(nd2 nd2Var, dr2 dr2Var, m62 m62Var, fn fnVar) {
        nd2Var.getClass();
        dr2Var.getClass();
        fnVar.getClass();
        this.a = nd2Var;
        this.b = dr2Var;
        this.c = m62Var;
        this.d = fnVar;
    }
}
