package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzfdt;
import com.google.android.gms.internal.ads.zzfmy;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class nf4 implements zzfdt {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nf4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* synthetic */ void zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Bundle) obj).putStringArrayList("ad_types", (ArrayList) obj2);
                break;
            case 1:
                zzfmy.e("key_schema", (Bundle) obj, (String) obj2);
                break;
            case 2:
                Bundle bundle = (Bundle) obj2;
                Bundle bundle2 = (Bundle) obj;
                if (!bundle.isEmpty()) {
                    bundle2.putBundle("shared_pref", bundle);
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((og4) obj2).a);
                } catch (JSONException unused) {
                    zze.zza("Failed putting version constants.");
                }
                break;
        }
    }
}
