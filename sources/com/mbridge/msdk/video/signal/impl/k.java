package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4664b4;
import com.ironsource.C4788i2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class k extends l {
    private Activity t;
    private String u;
    private String v;
    private CampaignEx x;
    private List<CampaignEx> y;
    private int z;
    private int w = 0;
    private String A = "";
    private String B = "";
    private boolean C = false;
    private boolean D = false;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ int e;

        public a(String str, String str2, String str3, String str4, int i) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(k.this.t.getApplication())).a(new com.mbridge.msdk.foundation.entity.n("2000039", this.a, this.b, this.c, this.d, k.this.x.getId(), this.e, m0.a(k.this.t.getApplication(), this.e)));
        }
    }

    private String A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.A);
            jSONObject2.put("rootViewInstanceId", this.B);
            jSONObject2.put("isRootTemplateWebView", this.C);
            jSONObject.put("sdk_info", "MAL_17.1.81,3.0.1");
            jSONObject2.put("playVideoMute", this.n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<CampaignEx> list = this.y;
            if (list == null || list.size() <= 0) {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.x));
            } else {
                for (CampaignEx campaignEx : this.y) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(campaignEx, campaignEx.isReady(), b(campaignEx)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", x());
            String strG = com.mbridge.msdk.setting.i.b().g(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strG)) {
                JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(strG);
                c(jSONObjectJsonObjectInit);
                String strE = com.mbridge.msdk.setting.i.b().e(this.j);
                if (!TextUtils.isEmpty(strE)) {
                    jSONObjectJsonObjectInit.put("ivreward", MintegralNetworkBridge.jsonObjectInit(strE));
                }
                jSONObject.put("appSetting", jSONObjectJsonObjectInit);
            }
            jSONObject.put("rewardSetting", w());
            if (!TextUtils.isEmpty(this.j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.j);
            }
            jSONObject.put("rw_plus", this.D ? "1" : "0");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    private JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(this.j)) {
                return jSONObject;
            }
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.j);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.mbridge.msdk.videocommon.setting.c cVar = this.k;
            if (cVar == null) {
                return jSONObject;
            }
            jSONObject.put("unitSetting", cVar.H());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    private CampaignEx a(String str, CampaignEx campaignEx) {
        String strValueOf;
        String strValueOf2;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (str.contains("notice")) {
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
                b(jSONObjectJsonObjectInit);
                try {
                    if (!jSONObjectJsonObjectInit.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                        jSONObjectCampaignToJsonObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                    }
                } catch (Exception unused) {
                }
                Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectCampaignToJsonObject.put(next, jSONObjectJsonObjectInit.getString(next));
                }
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                a(jSONObjectCampaignToJsonObject, campaignWithBackData);
                return campaignWithBackData;
            } catch (JSONException e) {
                e.printStackTrace();
                return campaignEx;
            }
        }
        try {
            JSONObject jSONObjectCampaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            CampaignEx campaignWithBackData2 = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject2);
            if (campaignWithBackData2 == null) {
                campaignWithBackData2 = campaignEx;
            }
            if (!TextUtils.isEmpty(str)) {
                a(jSONObjectCampaignToJsonObject2, campaignWithBackData2);
                JSONObject jSONObjectOptJSONObject = MintegralNetworkBridge.jsonObjectInit(str).optJSONObject(com.mbridge.msdk.foundation.same.a.j);
                if (jSONObjectOptJSONObject != null) {
                    strValueOf = String.valueOf(v0.a(this.t, Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.h)).intValue()));
                    strValueOf2 = String.valueOf(v0.a(this.t, Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.i)).intValue()));
                } else {
                    strValueOf = "-999";
                    strValueOf2 = "-999";
                }
                campaignWithBackData2.setClickURL(com.mbridge.msdk.click.c.a(campaignWithBackData2.getClickURL(), strValueOf, strValueOf2));
                String noticeUrl = campaignWithBackData2.getNoticeUrl();
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    StringBuilder sb = new StringBuilder();
                    while (itKeys2.hasNext()) {
                        sb.append(C4664b4.j.c);
                        String next2 = itKeys2.next();
                        String strOptString = jSONObjectOptJSONObject.optString(next2);
                        if (com.mbridge.msdk.foundation.same.a.h.equals(next2) || com.mbridge.msdk.foundation.same.a.i.equals(next2)) {
                            strOptString = String.valueOf(v0.a(this.t, Integer.valueOf(strOptString).intValue()));
                        }
                        sb.append(next2);
                        sb.append("=");
                        sb.append(strOptString);
                    }
                    campaignWithBackData2.setNoticeUrl(noticeUrl + ((Object) sb));
                }
            }
            return campaignWithBackData2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return campaignEx;
        } catch (Throwable th) {
            th.printStackTrace();
            return campaignEx;
        }
    }

    private void c(JSONObject jSONObject) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String string = y0.a(contextD, "MBridge_ConfirmTitle" + this.j, "").toString();
            String string2 = y0.a(contextD, "MBridge_ConfirmContent" + this.j, "").toString();
            String string3 = y0.a(contextD, "MBridge_CancelText" + this.j, "").toString();
            String string4 = y0.a(contextD, "MBridge_ConfirmText" + this.j, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("confirm_title", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put("confirm_description", string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put("confirm_t", string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put("confirm_c_play", string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put("confirm_c_rv", string4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strG = com.mbridge.msdk.setting.i.b().g(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put("appSetting", MintegralNetworkBridge.jsonObjectInit(strG));
                return jSONObject;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.x));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", x());
            String strG = com.mbridge.msdk.setting.i.b().g(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strG)) {
                JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(strG);
                c(jSONObjectJsonObjectInit);
                String strE = com.mbridge.msdk.setting.i.b().e(this.j);
                if (!TextUtils.isEmpty(strE)) {
                    jSONObjectJsonObjectInit.put("ivreward", strE);
                }
                jSONObject.put("appSetting", jSONObjectJsonObjectInit.toString());
            }
            jSONObject.put("rewardSetting", w());
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
        return aVarC != null ? aVarC.k() : jSONObject;
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.setting.c cVar = this.k;
        return cVar != null ? cVar.H() : jSONObject;
    }

    private JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_17.1.81,3.0.1");
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.n);
            jSONObject2.put("instanceId", this.A);
            jSONObject.put("sdkSetting", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public void d(String str) {
        this.B = str;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String e() {
        q0.a("DefaultJSCommon", "getNotchArea");
        return this.v;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playVideoMute", this.n);
            jSONObject.put("userVideoMute", this.o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public void r() {
        this.u = "";
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        this.t = activity;
    }

    public int v() {
        return this.z;
    }

    public k(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.t = activity;
        this.x = campaignEx;
        this.y = list;
    }

    private boolean b(CampaignEx campaignEx) {
        long jD0;
        com.mbridge.msdk.setting.g gVarF;
        try {
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            long jE = 0;
            if (!TextUtils.isEmpty(strB) && (gVarF = com.mbridge.msdk.setting.i.b().f(strB)) != null) {
                jD0 = gVarF.d0() * 1000;
            } else {
                jD0 = 0;
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                jE = aVarC.e();
            }
            if (campaignEx != null) {
                return campaignEx.isSpareOffer(jE, jD0);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.e
    public void click(int i, String str) {
        AppletsModel appletsModel;
        List<CampaignEx> list;
        int i2;
        super.click(i, str);
        CampaignEx campaignEx = this.x;
        if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
            b(str);
        }
        try {
            if (i != 1) {
                if (i != 3) {
                    if (i == 4) {
                        this.m.a(true);
                        return;
                    }
                    return;
                }
                CampaignEx campaignEx2 = this.x;
                if (campaignEx2 != null && campaignEx2.getCbd() > -2) {
                    i2 = this.x.getCbd();
                } else {
                    com.mbridge.msdk.videocommon.setting.c cVar = this.k;
                    if (cVar != null) {
                        i2 = cVar.i();
                    } else {
                        i2 = 1;
                    }
                }
                if (i2 == -1) {
                    a(new com.mbridge.msdk.video.signal.impl.a.b(this, this.m));
                }
                this.w = i;
                click(1, str);
                return;
            }
            if (this.x == null && (list = this.y) != null && list.size() > 0) {
                this.x = this.y.get(0);
            }
            CampaignEx campaignEx3 = this.x;
            if (campaignEx3 == null) {
                return;
            }
            CampaignEx campaignExA = a(str, campaignEx3);
            if (this.w != 3) {
                this.w = i;
            }
            a(campaignExA);
            if (campaignExA != null && (appletsModel = AppletModelManager.getInstance().get(campaignExA)) != null) {
                appletsModel.setUserClick(true);
                AppletModelManager.getInstance().replace(appletsModel, campaignExA);
            }
            a(campaignExA, this.t);
        } catch (Throwable th) {
            q0.b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String f(int i) {
        switch (i) {
            case 1:
                return y().toString();
            case 2:
                return B().toString();
            case 3:
                return s().toString();
            case 4:
                return C().toString();
            case 5:
                return u().toString();
            case 6:
                return z().toString();
            default:
                return t().toString();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void h() {
        super.h();
        com.mbridge.msdk.video.signal.a.InterfaceC1506a interfaceC1506a = this.m;
        if (interfaceC1506a != null) {
            interfaceC1506a.a();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        try {
            this.m.a(i, str);
        } catch (Throwable th) {
            q0.b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    public void d(boolean z) {
        this.D = z;
    }

    public void h(int i) {
        this.z = i;
    }

    public k(Activity activity, CampaignEx campaignEx) {
        this.t = activity;
        this.x = campaignEx;
    }

    private void b(String str) {
        List<CampaignEx> list;
        if (this.x == null || (list = this.y) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
            if (jSONObjectJsonObjectInit.has("camp_position")) {
                this.x = this.y.get(jSONObjectJsonObjectInit.getInt("camp_position"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void f() {
        super.f();
        try {
            Activity activity = this.t;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            q0.b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    public void c(boolean z) {
        this.C = z;
    }

    public void c(String str) {
        this.A = str;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String c() {
        this.m.onInitSuccess();
        this.a = true;
        if (TextUtils.isEmpty(this.u)) {
            this.u = A();
        } else {
            this.u = v0.b(this.u, "tun", m0.A() + "");
        }
        return this.u;
    }

    public void c(CampaignEx campaignEx) {
        this.x = campaignEx;
    }

    public void a(List<CampaignEx> list) {
        this.y = list;
    }

    public void a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String strOptString = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            campaignEx.setCampaignUnitId(strOptString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void a(int i, String str) {
        super.a(i, str);
        if (i != 2) {
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
            a aVar = new a(jSONObjectJsonObjectInit.optString("event", "event"), jSONObjectJsonObjectInit.optString("template", C4788i2.f), jSONObjectJsonObjectInit.optString("layout", C4788i2.f), jSONObjectJsonObjectInit.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.j), m0.s(this.t.getApplication()));
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        } catch (Throwable th) {
            q0.b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    private void a(CampaignEx campaignEx) {
        try {
            int i = this.w;
            if (i == 3) {
                campaignEx.setClickTempSource(2);
                if (campaignEx.getTriggerClickSource() == 0) {
                    campaignEx.setTriggerClickSource(2);
                    return;
                }
                return;
            }
            if (i != 1 || campaignEx.getClickTempSource() == 2) {
                return;
            }
            campaignEx.setClickTempSource(1);
        } catch (Exception e) {
            q0.b("DefaultJSCommon", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.v = str;
    }
}
