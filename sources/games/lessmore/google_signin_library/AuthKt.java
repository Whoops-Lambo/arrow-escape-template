package games.lessmore.google_signin_library;

import android.os.Build;
import defpackage.kk2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"isSamsungDevice", "", "GoogleSignIn.androidlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AuthKt {
    public static final boolean isSamsungDevice() {
        return kk2.E(Build.MANUFACTURER, "samsung", true);
    }
}
