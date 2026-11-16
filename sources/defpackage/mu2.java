package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mu2 extends lu2 {
    public final String a;
    public final String b;
    public final ew2 c;
    public final List d;
    public final List e;
    public final String f;

    public mu2(String str, String str2, ew2 ew2Var, ArrayList arrayList, List list, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        ew2Var = (i & 4) != 0 ? null : ew2Var;
        int i2 = i & 8;
        gg0 gg0Var = gg0.a;
        List list2 = i2 != 0 ? gg0Var : arrayList;
        list = (i & 16) != 0 ? gg0Var : list;
        String str3 = (i & 32) == 0 ? "uc_test_card_section_storage_information" : null;
        this.a = str;
        this.b = str2;
        this.c = ew2Var;
        this.d = list2;
        this.e = list;
        this.f = str3;
    }
}
