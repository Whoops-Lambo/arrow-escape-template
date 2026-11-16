package defpackage;

import com.google.android.gms.internal.ads.zzcsw;
import com.google.android.gms.internal.ads.zzcsy;
import com.google.android.gms.internal.ads.zzcsz;
import com.google.android.gms.internal.ads.zzdac;
import com.google.android.gms.internal.ads.zzflz;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfpv;
import com.google.android.gms.internal.ads.zzhed;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g74 implements zzhed, zzfpv {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzdac b;

    public /* synthetic */ g74(zzdac zzdacVar, int i) {
        this.a = i;
        this.b = zzdacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpv
    public Object zza(Object obj) {
        zzfmb zzfmbVar = (zzfmb) obj;
        zzcsw zzcswVar = this.b.d;
        ArrayList arrayList = zzfmbVar.b.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            zzflz zzflzVar = (zzflz) obj2;
            Map map = zzcswVar.a;
            String str = zzflzVar.a;
            JSONObject jSONObject = zzflzVar.b;
            if (!map.containsKey(str) || jSONObject == null) {
                Map map2 = zzcswVar.b;
                if (map2.containsKey(str) && jSONObject != null) {
                    zzcsy zzcsyVar = (zzcsy) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    zzcsyVar.a(map3);
                }
            } else {
                ((zzcsz) map.get(str)).a(jSONObject);
            }
        }
        return zzfmbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public /* synthetic */ void zzb(Object obj) {
        switch (this.a) {
            case 0:
                this.b.f.x(true);
                break;
            default:
                this.b.f.H(true);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public void zza(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.f.x(false);
                break;
            default:
                this.b.f.H(false);
                break;
        }
    }
}
