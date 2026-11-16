package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjr;
import com.singular.sdk.internal.UserDetailsUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ve4 {
    public final String a;
    public final String b;
    public int c;
    public long d;
    public final Integer e;

    public final String toString() {
        Integer num;
        int i = this.c;
        long j = this.d;
        String str = this.a;
        StringBuilder sb = new StringBuilder(rl3.v(String.valueOf(str).length(), 1, String.valueOf(i).length(), 1, String.valueOf(j).length()));
        sb.append(str);
        sb.append(UserDetailsUtils.UserDetailsLiterals.DOT);
        sb.append(i);
        sb.append(UserDetailsUtils.UserDetailsLiterals.DOT);
        sb.append(j);
        String string = sb.toString();
        String str2 = this.b;
        if (!TextUtils.isEmpty(str2)) {
            string = jc1.o(string, UserDetailsUtils.UserDetailsLiterals.DOT, new StringBuilder(string.length() + 1 + String.valueOf(str2).length()), str2);
        }
        if (!((Boolean) zzba.zzc().a(zzbjr.v2)).booleanValue() || (num = this.e) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb2.append(string);
        sb2.append(UserDetailsUtils.UserDetailsLiterals.DOT);
        sb2.append(num);
        return sb2.toString();
    }

    public ve4(String str, String str2, int i, long j, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = num;
    }
}
