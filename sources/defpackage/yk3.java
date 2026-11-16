package defpackage;

import com.facebook.appevents.p;
import com.google.android.gms.internal.ads.zzicx;
import com.google.android.gms.internal.ads.zzidm;
import com.google.android.gms.internal.p002firebaseauthapi.zzaal;
import com.google.android.gms.internal.p002firebaseauthapi.zzzr;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yk3 extends ThreadLocal {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yk3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zzaal zzaalVar = (zzaal) obj;
                try {
                    zzzr zzzrVar = zzzr.c;
                    Mac mac = (Mac) zzzrVar.a.a(zzaalVar.b);
                    mac.init(zzaalVar.c);
                    return mac;
                } catch (GeneralSecurityException e) {
                    p.g(e);
                    return null;
                }
            default:
                try {
                    zzicx zzicxVar = zzicx.c;
                    zzidm zzidmVar = (zzidm) obj;
                    Mac mac2 = (Mac) zzicxVar.a.a(zzidmVar.b);
                    mac2.init(zzidmVar.c);
                    return mac2;
                } catch (GeneralSecurityException e2) {
                    p.g(e2);
                    return null;
                }
        }
    }
}
