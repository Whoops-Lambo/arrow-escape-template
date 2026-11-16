package io.p071bidmachine.analytics.internal.J;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.e80;
import io.p071bidmachine.analytics.internal.I.g;
import io.p071bidmachine.util.p;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {
    private final SharedPreferences a;

    public /* synthetic */ a(Context context, String str, int i, int i2, e80 e80Var) {
        this(context, (i2 & 2) != 0 ? "BidMachinePrefExt" : str, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // io.p071bidmachine.analytics.internal.J.b
    public void a(String str, String str2) {
        p.P(this.a, b(str), str2 != null ? b(str2) : null);
    }

    @Override // io.p071bidmachine.analytics.internal.J.b
    public String b(String str, String str2) {
        String strA;
        String strH = p.H(this.a, b(str));
        return (strH == null || (strA = a(strH)) == null) ? str2 : strA;
    }

    private a(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public a(Context context, String str, int i) {
        this(context.getSharedPreferences(str, i));
    }

    private final String a(String str) {
        try {
            return g.b(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final String b(String str) {
        return g.d(str);
    }
}
