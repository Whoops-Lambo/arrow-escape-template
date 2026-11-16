package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class v41 implements SdkInitializationListener {
    public static v41 d;
    public final ArrayList b = new ArrayList();
    public int a = 0;
    public final k51 c = new k51();

    @Override // com.inmobi.sdk.SdkInitializationListener
    public final void onInitializationComplete(Error error) {
        int i = 0;
        ArrayList arrayList = this.b;
        if (error == null) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi SDK initialized.");
            this.a = 2;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((u41) obj).onInitializeSuccess();
            }
        } else {
            this.a = 0;
            AdError adErrorJ = at.j(101, error.getLocalizedMessage());
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                ((u41) obj2).onInitializeError(adErrorJ);
            }
        }
        arrayList.clear();
    }

    public final void a(Context context, String str, u41 u41Var) {
        if (this.a == 2) {
            u41Var.onInitializeSuccess();
            return;
        }
        this.b.add(u41Var);
        if (this.a == 1) {
            return;
        }
        this.a = 1;
        JSONObject jSONObject = t41.a;
        this.c.getClass();
        InMobiSdk.init(context, str, jSONObject, this);
    }
}
