package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ch {
    private final String a;
    private Context b;
    private C4718e4 c;
    private Y4 d;
    private int e;
    private C4808j5 f;
    private int g;
    private int h;
    private final String i = "ch";
    private a j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    private void j() {
        if (this.g != this.h) {
            this.j = a.NOT_RECOVERED;
            return;
        }
        Logger.i(this.i, "handleRecoveringEndedFailed | Reached max trials");
        this.j = a.NOT_ALLOWED;
        a();
    }

    public boolean a(C4990t8.c cVar, C4990t8.b bVar) {
        Logger.i(this.i, "shouldRecoverWebController: ");
        a aVar = this.j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.i(this.i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != C4990t8.c.Native) {
            Logger.i(this.i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == C4990t8.b.Loading || bVar == C4990t8.b.None) {
            Logger.i(this.i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.i(this.i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.i(this.i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.b == null || this.c == null || this.d == null) {
            Logger.i(this.i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.i(this.i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }

    public Context b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public C4718e4 d() {
        return this.c;
    }

    public int e() {
        return this.e;
    }

    public Y4 f() {
        return this.d;
    }

    public C4808j5 g() {
        return this.f;
    }

    public boolean l() {
        return this.j == a.IN_RECOVERING;
    }

    public boolean m() {
        return this.j == a.RECOVERED;
    }

    public void n() {
        a aVar = this.j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.g++;
            Logger.i(this.i, "recoveringStarted - trial number " + this.g);
            this.j = aVar2;
        }
    }

    public ch(Context context, C4718e4 c4718e4, Y4 y4, int i, C4808j5 c4808j5, String str) {
        a aVarH = h();
        this.j = aVarH;
        if (aVarH != a.NOT_ALLOWED) {
            this.b = context;
            this.c = c4718e4;
            this.d = y4;
            this.e = i;
            this.f = c4808j5;
            this.g = 0;
        }
        this.a = str;
    }

    private a h() {
        this.h = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.i(this.i, "getInitialState mMaxAllowedTrials: " + this.h);
        if (this.h <= 0) {
            Logger.i(this.i, "recovery is not allowed by config");
            return a.NOT_ALLOWED;
        }
        return a.NOT_RECOVERED;
    }

    private void k() {
        a();
        this.j = a.RECOVERED;
    }

    public JSONObject i() {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(C4664b4.i.A0, m());
            jSONObjectJsonObjectInit.put(C4664b4.i.B0, this.g);
            jSONObjectJsonObjectInit.put(C4664b4.i.C0, this.h);
            return jSONObjectJsonObjectInit;
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return jSONObjectJsonObjectInit;
        }
    }

    public void a() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
    }

    public void a(boolean z) {
        if (this.j != a.IN_RECOVERING) {
            return;
        }
        if (z) {
            k();
        } else {
            j();
        }
    }
}
