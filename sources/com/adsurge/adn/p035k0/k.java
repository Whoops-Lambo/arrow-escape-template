package com.adsurge.adn.p035k0;

import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class k extends a {
    public final Object a;
    public Integer b;
    public Float c;
    public String d;
    public j e;

    public boolean equals(Object obj) {
        Object objD;
        if (this == obj) {
            return true;
        }
        if (this.a == null) {
            return obj == null || ((obj instanceof k) && ((k) obj).d(new JSONObject[0]) == null);
        }
        if (!(obj instanceof k) || (objD = ((k) obj).d(new JSONObject[0])) == null) {
            return false;
        }
        Object obj2 = this.a;
        if (objD == obj2) {
            return true;
        }
        if (!(obj2 instanceof Number) || !(objD instanceof Number)) {
            return toString().equals(obj.toString());
        }
        if (((obj2 instanceof Integer) || (obj2 instanceof Long)) && ((objD instanceof Integer) || (objD instanceof Long))) {
            return ((Number) obj2).longValue() == ((Number) objD).longValue();
        }
        return ((Number) obj2).doubleValue() == ((Number) objD).doubleValue();
    }

    public int f(JSONObject... jSONObjectArr) {
        j jVarB = b(new JSONObject[0]);
        if (jVarB == null) {
            return 0;
        }
        return jVarB.e();
    }

    @Override // com.adsurge.adn.p035k0.h
    public float a(JSONObject... jSONObjectArr) {
        if (this.c == null) {
            Float fA = super.a(this.a);
            this.c = Float.valueOf(fA == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : fA.floatValue());
        }
        return this.c.floatValue();
    }

    @Override // com.adsurge.adn.p035k0.h
    public j b(JSONObject... jSONObjectArr) {
        j jVar = this.e;
        if (jVar != null) {
            return jVar;
        }
        j jVarC = super.c(this.a);
        this.e = jVarC;
        return jVarC;
    }

    @Override // com.adsurge.adn.p035k0.h
    public String c(JSONObject... jSONObjectArr) {
        if (this.d == null) {
            this.d = super.d(this.a);
        }
        return this.d;
    }

    @Override // com.adsurge.adn.p035k0.h
    public Object d(JSONObject... jSONObjectArr) {
        return this.a;
    }

    @Override // com.adsurge.adn.p035k0.h
    public int e(JSONObject... jSONObjectArr) {
        if (this.b == null) {
            Integer numB = super.b(this.a);
            this.b = Integer.valueOf(numB == null ? 0 : numB.intValue());
        }
        return this.b.intValue();
    }

    public String toString() {
        if (this.d == null) {
            this.d = super.d(this.a);
        }
        return this.d;
    }

    public k(Object obj) {
        this.a = obj;
    }

    @Override // com.adsurge.adn.p035k0.h
    public h a() {
        return this;
    }
}
