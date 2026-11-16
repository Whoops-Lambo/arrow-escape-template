package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzu;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e05 extends bx4 {
    public static final e05 b = new e05();
    public final String a = "CharMatcher.none()";

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final boolean b(char c) {
        return false;
    }

    public final String toString() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final int a(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            return -1;
        }
        y.p(zzu.c(i, length, TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX));
        return 0;
    }
}
