package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fl1 {
    public final Bitmap a;
    public final Map b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl1)) {
            return false;
        }
        fl1 fl1Var = (fl1) obj;
        return this.a.equals(fl1Var.a) && s71.b(this.b, fl1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Value(bitmap=");
        sb.append(this.a);
        sb.append(", extras=");
        return jc1.r(sb, this.b, ')');
    }

    public fl1(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }
}
