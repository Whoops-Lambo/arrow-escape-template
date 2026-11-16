package com.google.android.gms.internal.fido;

import com.ironsource.G5;
import defpackage.wx2;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbi {
    public final String a;
    public final wx2 b;
    public wx2 c;

    public final void a(Object obj, String str) {
        wx2 wx2Var = new wx2(15);
        this.c.d = wx2Var;
        this.c = wx2Var;
        wx2Var.c = obj;
        wx2Var.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        wx2 wx2Var = (wx2) this.b.d;
        String str = "";
        while (wx2Var != null) {
            Object obj = wx2Var.c;
            sb.append(str);
            String str2 = (String) wx2Var.b;
            if (str2 != null) {
                sb.append(str2);
                sb.append(G5.U);
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            wx2Var = (wx2) wx2Var.d;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public zzbi(String str) {
        wx2 wx2Var = new wx2(15);
        this.b = wx2Var;
        this.c = wx2Var;
        this.a = str;
    }
}
