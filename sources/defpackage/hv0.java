package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.v;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 {
    public static final boolean b;
    public final v a;

    static {
        x12 x12Var = y12.a;
        b = y12.b.j().nextDouble() <= 1.0E-4d;
    }

    public final void a(Bundle bundle, String str) {
        if (b && dk2.O(str, "gps", false)) {
            this.a.a(bundle, str);
        }
    }

    public hv0(Context context) {
        this.a = new v(context);
    }
}
