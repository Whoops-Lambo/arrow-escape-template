package defpackage;

import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzdun;
import com.google.android.gms.internal.ads.zzgvq;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r04 implements zzgvq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r04(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgvq
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                zzbuz zzbuzVar = (zzbuz) obj;
                zzbuzVar.z((String) obj3, (zzbqs) obj2);
                return zzbuzVar;
            default:
                zzdun zzdunVar = (zzdun) obj3;
                JSONObject jSONObject = (JSONObject) obj2;
                List list = (List) obj;
                zzdunVar.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String strOptString = jSONObject.optString("text");
                Integer numC = zzdun.c("bg_color", jSONObject);
                Integer numC2 = zzdun.c("text_color", jSONObject);
                int iOptInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
                return new zzbmo(strOptString, list, numC, numC2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, zzdunVar.h.e);
        }
    }
}
