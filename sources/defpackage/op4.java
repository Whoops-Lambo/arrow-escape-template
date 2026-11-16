package defpackage;

import com.google.android.gms.internal.ads.zzgvp;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class op4 extends zzgvp implements Serializable {
    public final Pattern a;

    public final np4 a(CharSequence charSequence) {
        return new np4(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }

    public op4(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }
}
