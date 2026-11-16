package com.adsurge.adn.p068y0;

import android.text.TextUtils;
import com.adsurge.adn.p014d0.b;
import com.adsurge.adn.p035k0.h;
import com.adsurge.adn.p038l0.i;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends i {
    public int E;
    public int F;
    public int G;
    public String H;
    public b J;
    public int K;
    public Object L;
    public JSONArray N;
    public boolean I = true;
    public int M = 0;
    public boolean O = false;

    public abstract void a(Object obj);

    public abstract void a(float[] fArr);

    public abstract void m(int i);

    public int P() {
        return this.G;
    }

    public int Q() {
        return this.F;
    }

    public int R() {
        return this.K;
    }

    public int S() {
        return this.E;
    }

    @Override // com.adsurge.adn.p038l0.i
    public void O() {
        super.O();
        if (this.O && this.I) {
            this.O = false;
            a(this.L);
        }
    }

    @Override // com.adsurge.adn.p038l0.i
    public boolean a(String str, h hVar) {
        str.getClass();
        switch (str) {
            case "91":
                this.L = hVar.d(new JSONObject[0]);
                this.O = true;
                return true;
            case "93":
                int iE = hVar.e(new JSONObject[0]);
                this.K = iE;
                m(iE);
                return true;
            case "94":
                this.M = hVar.e(new JSONObject[0]);
                this.O = true;
                return true;
            case "95":
                this.N = (JSONArray) hVar.d(new JSONObject[0]);
                this.O = true;
                return true;
            case "96":
                if (hVar.d(new JSONObject[0]) instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) hVar.d(new JSONObject[0]);
                    if (jSONArray.length() != 0) {
                        float[] fArr = {(float) jSONArray.optDouble(0, 0.0d), (float) jSONArray.optDouble(1, 0.0d), (float) jSONArray.optDouble(2, 1.0d), (float) jSONArray.optDouble(3, 1.0d)};
                        float f = fArr[0];
                        if (f != 1.0f) {
                            float f2 = fArr[1];
                            if (f2 != 1.0f) {
                                float f3 = fArr[2];
                                if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    float f4 = fArr[3];
                                    if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 != 1.0f || f4 != 1.0f)) {
                                        a(fArr);
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            case "97":
                this.E = hVar.e(new JSONObject[0]);
                return true;
            case "98":
                this.G = hVar.e(new JSONObject[0]);
                return true;
            case "99":
                this.F = hVar.e(new JSONObject[0]);
                return true;
            case "100":
                String string = hVar.toString();
                this.H = string;
                if (TextUtils.isEmpty(string)) {
                    this.I = true;
                } else {
                    this.I = false;
                    com.adsurge.adn.p064w0.b bVarF = F();
                    if (bVarF != null) {
                        bVarF.a(this.H, this);
                    }
                }
                return true;
            default:
                return super.a(str, hVar);
        }
    }

    @Override // com.adsurge.adn.p038l0.i
    public void c() {
        super.c();
        this.K = 0;
        this.L = null;
        this.O = false;
        this.M = 0;
        this.I = true;
        this.J = null;
    }

    public void a(b bVar) {
        this.I = true;
        this.O = false;
        this.J = bVar;
        a(this.L);
    }
}
