package defpackage;

import android.os.Build;
import com.explorestack.protobuf.z;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class u5 {
    public final String a;
    public final String b;
    public final String c;
    public final hz1 d;
    public final ArrayList e;

    public u5(String str, String str2, String str3, hz1 hz1Var, ArrayList arrayList) {
        z.r(str2, str3, Build.MANUFACTURER);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hz1Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        if (!this.a.equals(u5Var.a) || !s71.b(this.b, u5Var.b) || !s71.b(this.c, u5Var.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return s71.b(str, str) && this.d.equals(u5Var.d) && this.e.equals(u5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + n30.c(n30.c(n30.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
