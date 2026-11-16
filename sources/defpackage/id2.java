package defpackage;

import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class id2 extends pq1 {
    public final c4 d;
    public String e;
    public String f;
    public String g;
    public boolean h;

    @Override // defpackage.wh0
    public final String a() {
        String str = this.g;
        String str2 = this.e;
        String str3 = this.f;
        StringBuilder sbR = pv1.r("settings-", str, "-", str2, "-");
        sbR.append(str3);
        return sbR.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(SettingsInitializationParameters settingsInitializationParameters, fy fyVar) {
        hd2 hd2Var;
        boolean z;
        Object obj;
        id2 id2Var;
        if (fyVar instanceof hd2) {
            hd2Var = (hd2) fyVar;
            int i = hd2Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                hd2Var.v = i - Integer.MIN_VALUE;
            } else {
                hd2Var = new hd2(this, fyVar);
            }
        } else {
            hd2Var = new hd2(this, fyVar);
        }
        Object obj2 = hd2Var.t;
        int i2 = hd2Var.v;
        boolean z2 = true;
        if (i2 == 0) {
            wz2.a0(obj2);
            this.e = settingsInitializationParameters.c;
            String str = settingsInitializationParameters.b;
            this.f = str;
            z = settingsInitializationParameters.e;
            String str2 = settingsInitializationParameters.a;
            this.g = str2;
            b5 b5Var = new b5(this, str2, str, null, 2);
            hd2Var.r = this;
            hd2Var.s = z;
            hd2Var.v = 1;
            Object objH = h(z, b5Var, hd2Var);
            dz dzVar = dz.a;
            if (objH == dzVar) {
                return dzVar;
            }
            obj = objH;
            id2Var = this;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = hd2Var.s;
            id2 id2Var2 = hd2Var.r;
            wz2.a0(obj2);
            z = z3;
            id2Var = id2Var2;
            obj = obj2;
        }
        c01 c01Var = (c01) obj;
        if (!z) {
            int i3 = c01Var.c;
            id2Var.getClass();
            if (i3 != 200) {
                z2 = false;
            }
        }
        id2Var.h = z2;
        String str3 = c01Var.b;
        sa1 sa1Var = db1.a;
        return (UsercentricsSettings) sa1Var.a(str3, ep0.A(sa1Var.b, p32.d(UsercentricsSettings.class)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id2(c4 c4Var, cb1 cb1Var, a33 a33Var, th0 th0Var, qq1 qq1Var) {
        super(a33Var, th0Var, qq1Var);
        cb1Var.getClass();
        a33Var.getClass();
        th0Var.getClass();
        qq1Var.getClass();
        this.d = c4Var;
        this.e = "en";
        this.f = "latest";
        this.g = "";
    }
}
