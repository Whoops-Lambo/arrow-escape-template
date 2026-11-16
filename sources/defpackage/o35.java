package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzm;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o35 extends zzm {
    public final Matcher a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzm
    public final int a() {
        return this.a.end();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzm
    public final boolean b(int i) {
        return this.a.find(i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzm
    public final int c() {
        return this.a.start();
    }

    public o35(Matcher matcher) {
        matcher.getClass();
        this.a = matcher;
    }
}
