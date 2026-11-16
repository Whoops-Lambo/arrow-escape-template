package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C4950r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.EnumC5009u9;
import com.ironsource.InterfaceC4767h;
import com.ironsource.Pb;
import com.ironsource.W9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.v;
import com.safedk.android.utils.Logger;
import defpackage.pv1;
import defpackage.tk0;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class InlineStoreActivity extends Activity {
    private static final String c = "InlineStoreActivity";
    private static final int d = 1001;
    private v a;
    private boolean b = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b {
        private final InterfaceC4767h a;
        private Intent b;

        public Intent a(Context context) {
            Intent intentA = this.a.a(context);
            intentA.putExtra("inline_store_intent", this.b);
            return intentA;
        }

        public b(InterfaceC4767h interfaceC4767h) {
            this.a = interfaceC4767h;
        }

        @NotNull
        public b a(Intent intent) {
            this.b = intent;
            return this;
        }
    }

    private void b() {
        requestWindowFeature(1);
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        static final String a = "inline_store_intent";
        static final String b = "destroy_inline_store";

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map, D5 d5) {
        try {
            HashMap map2 = map != null ? new HashMap(map) : new HashMap();
            String str = "strategy:" + EnumC5009u9.APP_ACTIVITY.c();
            Object obj = map2.get(IronSourceConstants.EVENTS_EXT1);
            if (!(obj instanceof String) || TextUtils.isEmpty((String) obj)) {
                map2.put(IronSourceConstants.EVENTS_EXT1, str);
            } else {
                map2.put(IronSourceConstants.EVENTS_EXT1, str + "," + obj);
            }
            Pb.k0().q().a(new C5(d5, new JSONObject(map2)));
        } catch (Exception e) {
            C4950r4.d().a(e);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            v vVar = this.a;
            if (vVar != null) {
                vVar.a(i2, this.b);
            }
            HashMap map = new HashMap();
            String strK = pv1.k(i2, "resultCode:");
            if (this.b) {
                strK = strK.concat(",destroyCalled:true");
            }
            map.put(IronSourceConstants.EVENTS_EXT1, strK);
            a(D5.INLINE_STORE_CLOSED, map);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.utils.Logger.i(c, "onCreate()");
        try {
            this.a = (v) W9.b((Context) this).a().k();
            b();
            a();
            a((Intent) getIntent().getExtras().getParcelable("inline_store_intent"));
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            v vVar = this.a;
            if (vVar != null) {
                vVar.j(e.toString());
            }
            a(D5.INLINE_STORE_ACTIVITY_FAILED, (Map<String, Object>) null);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v vVar = this.a;
        if (vVar != null) {
            vVar.a(true, "inlineStoreClose");
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra("destroy_inline_store")) {
            IronLog.INTERNAL.verbose("onNewIntent() - destroy inline store request detected");
            this.b = true;
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        v vVar = this.a;
        if (vVar != null) {
            vVar.a(false, "inlineStoreOpen");
        }
    }

    private void a(Intent intent) {
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, intent, 1001);
        v vVar = this.a;
        if (vVar != null) {
            vVar.z();
        }
        a(D5.INLINE_STORE_LAUNCHED, (Map<String, Object>) null);
    }

    private void a(D5 d5, Map<String, Object> map) {
        new Thread(new tk0(19, map, d5)).start();
    }

    private void a() {
        getWindow().setFlags(1024, 1024);
    }
}
