package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzl;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o45 extends zzl implements Serializable {
    public final Pattern a;

    public final o35 a(CharSequence charSequence) {
        return new o35(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }

    public o45(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }
}
