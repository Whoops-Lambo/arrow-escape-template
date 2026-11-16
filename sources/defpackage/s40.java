package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.AccessToken;
import com.facebook.a0;
import com.facebook.internal.v0;
import com.google.android.gms.internal.ads.zzfyw;
import io.p071bidmachine.iab.vast.activity.k;
import io.p071bidmachine.iab.vast.b;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CompletableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class s40 extends BroadcastReceiver {
    public final /* synthetic */ int a;

    public s40(a50 a50Var) {
        this.a = 1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        CompletableFuture completableFuture;
        switch (this.a) {
            case 0:
                try {
                    JSONObject jSONObject = new JSONObject(intent.getStringExtra("returnPayload"));
                    String string = jSONObject.getString("requestID");
                    if (!t40.c.containsKey(string) || (completableFuture = (CompletableFuture) t40.c.remove(string)) == null) {
                        return;
                    }
                    completableFuture.complete(t40.e(string, jSONObject));
                    return;
                } catch (JSONException unused) {
                    return;
                }
            case 1:
                context.getClass();
                intent.getClass();
                if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                    a0 a0Var = a0.a;
                    AccessToken accessToken = (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
                    AccessToken accessToken2 = (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN");
                    if (accessToken == null) {
                        return;
                    }
                    if (accessToken2 == null || !v0.a(accessToken2.i, accessToken.i)) {
                        synchronized (y53.class) {
                            Iterator it = y53.d.iterator();
                            while (it.hasNext()) {
                                ((w53) it.next()).m = true;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                synchronized (b.class) {
                    b.e = "android.intent.action.SCREEN_ON".equals(intent.getAction());
                    break;
                }
                WeakHashMap weakHashMap = b.a;
                synchronized (weakHashMap) {
                    try {
                        for (k kVar : weakHashMap.values()) {
                            WeakHashMap weakHashMap2 = b.a;
                            kVar.a.M();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        zzfyw.a = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            zzfyw.a = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ s40(int i) {
        this.a = i;
    }
}
