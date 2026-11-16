package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mt1 implements PAGSdk.PAGInitCallback {
    public static mt1 f;
    public boolean a = false;
    public boolean b = false;
    public final ArrayList c = new ArrayList();
    public final wt1 d = new wt1();
    public final kt1 e = new kt1();

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i, String str) {
        int i2 = 0;
        this.a = false;
        this.b = false;
        AdError adErrorJ = l7.j(i, str);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((lt1) obj).onInitializeError(adErrorJ);
        }
        arrayList.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        int i = 0;
        this.a = false;
        this.b = true;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((lt1) obj).onInitializeSuccess();
        }
        arrayList.clear();
    }

    public final void a(Context context, String str, lt1 lt1Var) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorH = l7.h(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            Log.w(PangleMediationAdapter.TAG, adErrorH.toString());
            lt1Var.onInitializeError(adErrorH);
            return;
        }
        boolean z = this.a;
        ArrayList arrayList = this.c;
        if (z) {
            arrayList.add(lt1Var);
            return;
        }
        if (this.b) {
            lt1Var.onInitializeSuccess();
            return;
        }
        this.a = true;
        arrayList.add(lt1Var);
        this.e.getClass();
        PAGConfig pAGConfigBuild = new PAGConfig.Builder().appId(str).setAdxId("207").setUserData("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"8.2.0.4.0\"}]").build();
        this.d.getClass();
        PAGSdk.init(context, pAGConfigBuild, this);
    }
}
