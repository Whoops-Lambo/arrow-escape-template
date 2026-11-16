package defpackage;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tb2 {
    public final yp2 a;
    public final n43 b;

    public final nb2 a(nb2 nb2Var) {
        String str;
        this.b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String string = uuidRandomUUID.toString();
        string.getClass();
        String lowerCase = kk2.I(string, "-", "", false).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (nb2Var == null || (str = nb2Var.b) == null) ? lowerCase : str;
        int i = nb2Var != null ? nb2Var.c + 1 : 0;
        this.a.getClass();
        return new nb2(i, lowerCase, str2, yp2.a().b);
    }

    public tb2(yp2 yp2Var, n43 n43Var) {
        yp2Var.getClass();
        n43Var.getClass();
        this.a = yp2Var;
        this.b = n43Var;
    }
}
