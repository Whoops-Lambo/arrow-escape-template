package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzgey;
import com.google.android.gms.internal.ads.zzgez;
import com.safedk.android.analytics.brandsafety.b;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class al4 {
    public static final String h = new UUID(0, 0).toString();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ca4 f;
    public final zzgez g;

    public final zzgey a(long j, String str, String str2, boolean z) throws IOException {
        String str3 = this.b;
        ca4 ca4Var = this.f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(h)) {
                    String string = ((SharedPreferences) ca4Var.c).getString(str3, null);
                    String string2 = ((SharedPreferences) ca4Var.c).getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null && !string.equals(e(str, str2, string2))) {
                        return b(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzgey();
        }
        boolean z2 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            e32.i(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        String str4 = this.c;
        String str5 = this.d;
        long j2 = ((SharedPreferences) ca4Var.c).getLong(z2 ? str5 : str4, -1L);
        if (j2 != -1) {
            if (jCurrentTimeMillis < j2) {
                ca4Var.i(Long.valueOf(jCurrentTimeMillis), z2 ? str5 : str4);
            } else if (jCurrentTimeMillis >= j2 + j) {
                return b(str, str2);
            }
        }
        if (!z2) {
            str3 = this.a;
        }
        String string3 = ((SharedPreferences) ca4Var.c).getString(str3, null);
        if (string3 == null && !z) {
            return b(str, str2);
        }
        if (z2) {
            str4 = str5;
        }
        return new zzgey(string3, ((SharedPreferences) ca4Var.c).getLong(str4, -1L));
    }

    public final zzgey b(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f.i(string, "paid_3p_hash_key");
        return d(e(str, str2, string), true);
    }

    public final void c(boolean z) throws IOException {
        String str = z ? this.d : this.c;
        ca4 ca4Var = this.f;
        ca4Var.l(str);
        ca4Var.l(z ? this.b : this.a);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null) {
            return UUID.nameUUIDFromBytes(jc1.o(str, str2, new StringBuilder(str2.length() + str.length() + str3.length()), str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = str2 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder("not null".length() + str4.length() + b.v);
        q63.y(sb, this.e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        sb.append("not null");
        throw new IllegalArgumentException(sb.toString());
    }

    public al4(Context context, String str, String str2, String str3) {
        if (ca4.d == null) {
            ca4.d = new ca4(context, 16);
        }
        this.f = ca4.d;
        this.g = zzgez.a(context);
        this.a = str;
        this.b = str.concat("_3p");
        this.c = str2;
        this.d = str2.concat("_3p");
        this.e = str3;
    }

    public final zzgey d(String str, boolean z) throws IOException {
        String str2;
        String str3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis >= 0) {
            if (z) {
                str2 = this.d;
            } else {
                str2 = this.c;
            }
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            ca4 ca4Var = this.f;
            ca4Var.i(lValueOf, str2);
            if (z) {
                str3 = this.b;
            } else {
                str3 = this.a;
            }
            ca4Var.i(str, str3);
            return new zzgey(str, jCurrentTimeMillis);
        }
        e32.i(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        return null;
    }
}
