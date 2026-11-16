package defpackage;

import io.p071bidmachine.ads.networks.adaptiverendering.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class li {
    public final a01 a;
    public final yg1 b;
    public final String c;

    public li(a01 a01Var, yg1 yg1Var, String str) {
        a01Var.getClass();
        yg1Var.getClass();
        this.a = a01Var;
        this.b = yg1Var;
        this.c = str;
    }

    public final void a(String str, wr0 wr0Var) {
        String str2;
        str.getClass();
        int i = xg1.$EnumSwitchMapping$0[this.b.a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str2 = "https://app.eu.usercentrics.eu/session/1px.png";
            } else {
                e.b();
                return;
            }
        } else {
            str2 = "https://app.usercentrics.eu/session/1px.png";
        }
        this.a.b(str2 + "?appId=" + this.c + "&settingsId=" + str, x4.m, wr0Var);
    }
}
