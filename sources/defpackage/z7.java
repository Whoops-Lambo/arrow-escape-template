package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class z7 {
    public final String a;
    public final u5 b;

    public z7(String str, u5 u5Var) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = u5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        if (!this.a.equals(z7Var.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!s71.b(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return s71.b(str2, str2) && this.b.equals(z7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((qf1.LOG_ENVIRONMENT_PROD.hashCode() + n30.c((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517567) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.8, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + qf1.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
