package com.adsurge.adn.p035k0;

import com.adsurge.adn.p020f0.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class l extends c implements g {
    public final h b;
    public final h c;
    public final h d;
    public boolean e;
    public final List f;

    @Override // com.adsurge.adn.p035k0.c, com.adsurge.adn.p035k0.a
    public void c() {
        this.e = false;
    }

    @Override // com.adsurge.adn.p035k0.c
    public Object a(g gVar) {
        Object objA = gVar.a((c) this.b);
        boolean zEquals = JSONObject.NULL.equals(objA);
        if (!zEquals && !e(objA)) {
            h hVar = this.c;
            if (hVar != null) {
                objA = hVar instanceof c ? gVar.a((c) hVar) : hVar.d(new JSONObject[0]);
            }
        } else if (zEquals && this.e) {
            objA = null;
        } else {
            h hVar2 = this.d;
            objA = hVar2 instanceof c ? gVar.a((c) hVar2) : hVar2.d(new JSONObject[0]);
        }
        this.e = true;
        return objA;
    }

    @Override // com.adsurge.adn.p035k0.g
    public List b() {
        return this.f;
    }

    public final boolean e(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return ((String) obj).length() == 0;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return (obj instanceof JSONArray) && ((JSONArray) obj).length() == 0;
    }

    public l(h hVar, h hVar2, h hVar3, String str) {
        super(str);
        this.b = hVar;
        this.c = hVar2;
        this.d = hVar3;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        if (hVar instanceof c) {
            arrayList.add((c) hVar);
        }
        if (hVar2 instanceof c) {
            arrayList.add((c) hVar2);
        }
        if (hVar3 instanceof c) {
            arrayList.add((c) hVar3);
        }
    }

    @Override // com.adsurge.adn.p035k0.c
    public Object a(JSONObject jSONObject) {
        Object objD = this.b.d(jSONObject);
        boolean zEquals = JSONObject.NULL.equals(objD);
        if (!zEquals && !e(objD)) {
            h hVar = this.c;
            if (hVar != null) {
                objD = hVar.d(jSONObject);
            }
        } else {
            objD = (zEquals && this.e) ? null : this.d.d(jSONObject);
        }
        this.e = true;
        return objD;
    }

    @Override // com.adsurge.adn.p035k0.h
    public h a() {
        h hVar = this.c;
        return new l(this.b.a(), hVar == null ? null : hVar.a(), this.d.a(), d());
    }
}
