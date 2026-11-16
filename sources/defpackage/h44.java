package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.o;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzdsz;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h44 implements zzbqs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h44(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final /* synthetic */ void a(Object obj, Map map) {
        switch (this.a) {
            case 0:
                if (map != null) {
                    String str = (String) map.get("height");
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        int i = Integer.parseInt(str);
                        o oVar = (o) this.b;
                        synchronized (oVar) {
                            try {
                                if (oVar.H != i) {
                                    oVar.H = i;
                                    oVar.requestLayout();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        return;
                    } catch (Exception e) {
                        int i2 = zze.zza;
                        zzo.zzj("Exception occurred while getting webview content height", e);
                        return;
                    }
                }
                return;
            default:
                ((zzdsz) this.b).b.d(map);
                return;
        }
    }
}
