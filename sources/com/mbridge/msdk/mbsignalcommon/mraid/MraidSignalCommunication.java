package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.ironsource.C4664b4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class MraidSignalCommunication extends BaseMraidSignalCommunication {
    public static final /* synthetic */ int h = 0;
    private b g;

    public void close(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
        }
        try {
            q0.b("MraidSignalCommunication", "MRAID close");
            b bVar = this.g;
            if (bVar != null) {
                bVar.close();
            }
        } catch (Throwable th) {
            q0.b("MraidSignalCommunication", "MRAID close", th);
        }
    }

    public void expand(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            windVaneWebView = aVar.b;
            a.a().b(aVar.b, "expand");
        } else {
            windVaneWebView = null;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
            String strOptString = jSONObjectJsonObjectInit.optString("url");
            String strOptString2 = jSONObjectJsonObjectInit.optString("shouldUseCustomClose");
            q0.b("MraidSignalCommunication", "MRAID expand " + strOptString + " " + strOptString2);
            if ((windVaneWebView != null && System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.utils.a.d && com.mbridge.msdk.click.utils.a.a(this.g.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.c)) || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.g == null) {
                return;
            }
            this.g.expand(strOptString, strOptString2.toLowerCase().equals("true"));
        } catch (Throwable th) {
            q0.b("MraidSignalCommunication", "MRAID expand", th);
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            windVaneWebView = aVar.b;
            a.a().b(aVar.b, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
        } else {
            windVaneWebView = null;
        }
        try {
            String strOptString = MintegralNetworkBridge.jsonObjectInit(str).optString("url");
            q0.b("MraidSignalCommunication", "MRAID Open " + strOptString);
            if (this.g == null || TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (windVaneWebView == null || System.currentTimeMillis() - windVaneWebView.lastTouchTime <= com.mbridge.msdk.click.utils.a.d || !com.mbridge.msdk.click.utils.a.a(this.g.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.utils.a.a)) {
                this.g.open(strOptString);
            }
        } catch (Throwable th) {
            q0.b("MraidSignalCommunication", "MRAID Open", th);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b, "setOrientationProperties");
        }
        try {
            JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(str);
            String strOptString = jSONObjectJsonObjectInit.optString("allowOrientationChange");
            String strOptString2 = jSONObjectJsonObjectInit.optString("forceOrientation");
            q0.b("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || this.g == null) {
                return;
            }
            strOptString.toLowerCase().equals("true");
            String lowerCase = strOptString2.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 729267099) {
                str2 = C4664b4.i.D;
            } else if (iHashCode != 1430647483) {
                return;
            } else {
                str2 = C4664b4.i.C;
            }
            lowerCase.equals(str2);
        } catch (Throwable th) {
            q0.b("MraidSignalCommunication", "MRAID setOrientationProperties", th);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b, "unload");
        }
        try {
            q0.b("MraidSignalCommunication", "MRAID unload");
            b bVar = this.g;
            if (bVar != null) {
                bVar.unload();
            }
        } catch (Throwable th) {
            q0.b("MraidSignalCommunication", "MRAID unload", th);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.a().b(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b, "useCustomClose");
        }
        try {
            String strOptString = MintegralNetworkBridge.jsonObjectInit(str).optString("shouldUseCustomClose");
            q0.b("MraidSignalCommunication", "MRAID useCustomClose " + strOptString);
            if (TextUtils.isEmpty(strOptString) || this.g == null) {
                return;
            }
            this.g.useCustomClose(strOptString.toLowerCase().equals("true"));
        } catch (Throwable th) {
            q0.b("MraidSignalCommunication", "MRAID useCustomClose", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.g
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof b) {
                this.g = (b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof b)) {
                this.g = (b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() != null && (windVaneWebView.getMraidObject() instanceof b)) {
                this.g = (b) windVaneWebView.getMraidObject();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
