package defpackage;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzaaw;
import com.google.firebase.auth.GetTokenResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class gy3 {
    public static final Logger a = new Logger("GetTokenResultFactory", new String[0]);

    public static GetTokenResult a(String str) {
        Map map;
        try {
            map = ty3.c(str);
        } catch (zzaaw e) {
            a.e("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        return new GetTokenResult(str, map);
    }
}
