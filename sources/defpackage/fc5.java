package defpackage;

import com.google.android.gms.internal.measurement.zzyc;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fc5 extends zzyc {
    public int e = 0;
    public final String b = "com/google/android/libraries/phenotype/client/Phlogger";
    public final String c = "logInternal";
    public final String d = "Phlogger.java";

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String a() {
        return this.b.replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final int c() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String d() {
        char c = File.separatorChar;
        String str = this.d;
        return str.substring(str.lastIndexOf(c) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzyc
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fc5) {
            fc5 fc5Var = (fc5) obj;
            if (this.c.equals(fc5Var.c)) {
                String str = fc5Var.b;
                String str2 = this.b;
                if (str2 != str) {
                    if (str2.length() == str.length()) {
                        for (int i = 0; i < str2.length(); i++) {
                            char cCharAt = str2.charAt(i);
                            char cCharAt2 = str.charAt(i);
                            if (cCharAt == cCharAt2 || ((cCharAt & (-2)) == 46 && (cCharAt ^ cCharAt2) == 1)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.c.hashCode() + 4867) * 31) + 44;
        this.e = iHashCode;
        return iHashCode;
    }
}
