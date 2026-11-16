package defpackage;

import com.facebook.g0;
import com.facebook.n0;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements g0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ y(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // com.facebook.g0
    public final void onCompleted(n0 n0Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                if (!lz.a.contains(z.class)) {
                    try {
                        n0Var.getClass();
                        try {
                            if (n0Var.d == null && (jSONObject = n0Var.e) != null && jSONObject.getBoolean("success")) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    z61.a(((y61) it.next()).a);
                                }
                                break;
                            }
                        } catch (JSONException unused) {
                            return;
                        }
                    } catch (Throwable th) {
                        lz.a(z.class, th);
                        return;
                    }
                }
                break;
            default:
                n0Var.getClass();
                try {
                    if (n0Var.d == null && (jSONObject2 = n0Var.e) != null && jSONObject2.getBoolean("success")) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            z61.a(((y61) it2.next()).a);
                        }
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
