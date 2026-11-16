package com.adsurge.adn.p035k0;

import com.adsurge.adn.p020f0.g;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c extends a {
    public final String a;

    public abstract Object a(g gVar);

    public abstract Object a(JSONObject jSONObject);

    @Override // com.adsurge.adn.p035k0.h
    public j b(JSONObject... jSONObjectArr) {
        Object objA;
        j jVarC;
        return (jSONObjectArr == null || jSONObjectArr.length <= 0 || (objA = a(jSONObjectArr[0])) == null || (jVarC = super.c(objA)) == null) ? new j(0) : jVarC;
    }

    @Override // com.adsurge.adn.p035k0.h
    public int e(JSONObject... jSONObjectArr) {
        Object objA;
        Integer numB;
        if (jSONObjectArr == null || jSONObjectArr.length <= 0 || (objA = a(jSONObjectArr[0])) == null || (numB = super.b(objA)) == null) {
            return 0;
        }
        return numB.intValue();
    }

    public String toString() {
        return null;
    }

    @Override // com.adsurge.adn.p035k0.h
    public float a(JSONObject... jSONObjectArr) {
        Object objA;
        Float fA;
        return (jSONObjectArr == null || jSONObjectArr.length <= 0 || (objA = a(jSONObjectArr[0])) == null || (fA = super.a(objA)) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : fA.floatValue();
    }

    @Override // com.adsurge.adn.p035k0.h
    public String c(JSONObject... jSONObjectArr) {
        if (jSONObjectArr == null || jSONObjectArr.length <= 0) {
            return null;
        }
        return super.d(a(jSONObjectArr[0]));
    }

    @Override // com.adsurge.adn.p035k0.h
    public Object d(JSONObject... jSONObjectArr) {
        if (jSONObjectArr == null || jSONObjectArr.length <= 0) {
            return null;
        }
        return a(jSONObjectArr[0]);
    }

    public c(String str) {
        this.a = str;
    }

    public String d() {
        return this.a;
    }

    @Override // com.adsurge.adn.p035k0.a
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }
}
