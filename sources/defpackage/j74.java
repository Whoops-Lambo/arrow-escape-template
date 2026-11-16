package defpackage;

import android.os.IBinder;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class j74 {
    public final String a;
    public final String b;
    public final Map c;
    public final IBinder d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j74) {
            j74 j74Var = (j74) obj;
            if (this.a.equals(j74Var.a) && this.b.equals(j74Var.b) && this.c.equals(j74Var.c)) {
                IBinder iBinder = j74Var.d;
                IBinder iBinder2 = this.d;
                if (iBinder2 != null ? iBinder2.equals(iBinder) : iBinder == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        IBinder iBinder = this.d;
        return (iBinder == null ? 0 : iBinder.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.c.toString();
        String strValueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder("HsdpPrewarmRequest{targetAppPackageName=");
        sb.append(this.a);
        sb.append(", referrer=");
        q63.y(sb, this.b, ", extraQueryParams=", string, ", windowToken=");
        return nj.q(sb, strValueOf, "}");
    }

    public j74(String str, String str2, Map map, IBinder iBinder) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = iBinder;
    }
}
