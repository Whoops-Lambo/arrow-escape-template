package defpackage;

import com.google.android.gms.internal.ads.zzicx;
import com.google.android.gms.internal.ads.zzidf;
import io.p071bidmachine.media3.extractor.ts.y;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class nx4 {
    public final /* synthetic */ int a;
    public final zzidf b;

    public /* synthetic */ nx4(zzidf zzidfVar, int i) {
        this.a = i;
        this.b = zzidfVar;
    }

    public final Object a(String str) throws GeneralSecurityException {
        int i = this.a;
        int i2 = 0;
        zzidf zzidfVar = this.b;
        Object objA = null;
        switch (i) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                zzicx zzicxVar = zzicx.b;
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < 2; i3++) {
                    Provider provider = Security.getProvider(strArr[i3]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    try {
                        return zzidfVar.a(str, (Provider) obj);
                    } catch (Exception unused) {
                    }
                }
                return zzidfVar.a(str, null);
            case 1:
                return zzidfVar.a(str, null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                zzicx zzicxVar2 = zzicx.b;
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = 0; i4 < 3; i4++) {
                    Provider provider2 = Security.getProvider(strArr2[i4]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                int size2 = arrayList2.size();
                Exception exc = null;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    try {
                        objA = zzidfVar.a(str, (Provider) obj2);
                        return objA;
                    } catch (Exception e) {
                        if (exc == null) {
                            exc = e;
                        }
                    }
                }
                y.m("No good Provider found.", exc);
                return objA;
        }
    }
}
