package defpackage;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vw3 {
    public int a = 1;
    public lx0 b;
    public final String c;

    public final boolean a(int i) {
        int i2 = this.a;
        String str = this.c;
        if (i2 == i) {
            Log.w("HsdpOverlay", "targetPackage: " + str + " status was already set to " + i);
            return false;
        }
        if (i2 == 4) {
            Log.w("HsdpOverlay", "targetPackage: " + str + " status was destroyed so cannot be updated");
            return false;
        }
        if (Log.isLoggable("HsdpOverlay", 4)) {
            StringBuilder sbS = nj.s("targetPackage: ", this.a, str, " status: ", "->");
            sbS.append(i);
            Log.i("HsdpOverlay", sbS.toString());
        }
        if (i == 2) {
            this.b.onShown(rl3.g("targetPackage", str));
        } else if (i == 3) {
            this.b.onDismissed(rl3.g("targetPackage", str));
        } else if (i != 4) {
            Bundle bundle = new Bundle();
            bundle.putString("targetPackage", str);
            bundle.putBoolean("dldpRedirect", true);
            this.b.onDismissed(bundle);
        } else if (this.a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("targetPackage", str);
            bundle2.putString("errorMessage", "HSDP overlay destroyed");
            this.b.onDismissed(bundle2);
        }
        this.a = i;
        return true;
    }

    public final String toString() {
        int i = this.a;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder("HsdpOverlay{'");
        sb.append(this.c);
        sb.append("': ");
        sb.append(i);
        sb.append(", ");
        return nj.q(sb, strValueOf, "}");
    }

    public vw3(String str, lx0 lx0Var) {
        this.c = str;
        this.b = lx0Var;
    }
}
