package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c12 {
    public static d12 a(String str) throws nn2 {
        str.getClass();
        List listN0 = dk2.n0(str, new String[]{"-"}, 0, 6);
        d12 d12Var = new d12();
        if (listN0.size() == 2) {
            d12Var.a = Integer.valueOf(Integer.parseInt((String) listN0.get(0)));
            f52 f52Var = g52.Companion;
            int i = Integer.parseInt((String) listN0.get(1));
            f52Var.getClass();
            d12Var.b = f52.a(i);
            return d12Var;
        }
        throw new nn2("hash", str, null, 4, null);
    }
}
