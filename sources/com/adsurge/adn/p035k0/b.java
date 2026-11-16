package com.adsurge.adn.p035k0;

import com.adsurge.adn.p020f0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class b extends c implements g {
    public List b;
    public final List c;

    @Override // com.adsurge.adn.p035k0.c
    public Object a(JSONObject jSONObject) {
        List list = this.b;
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (h hVar : this.b) {
            if (hVar instanceof k) {
                sb.append(hVar.c(jSONObject));
            } else if (hVar instanceof c) {
                Object objA = ((c) hVar).a(jSONObject);
                if (objA == null) {
                    return null;
                }
                sb.append(objA);
            } else {
                continue;
            }
        }
        return sb.toString();
    }

    @Override // com.adsurge.adn.p035k0.g
    public List b() {
        return this.c;
    }

    @Override // com.adsurge.adn.p035k0.c, com.adsurge.adn.p035k0.h
    public String c(JSONObject... jSONObjectArr) {
        List list = this.b;
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (h hVar : this.b) {
            if (hVar instanceof k) {
                sb.append(hVar.c(jSONObjectArr));
            } else if (hVar instanceof c) {
                String strC = hVar.c(jSONObjectArr);
                if (strC == null) {
                    return null;
                }
                sb.append(strC);
            } else {
                continue;
            }
        }
        return sb.toString();
    }

    @Override // com.adsurge.adn.p035k0.c, com.adsurge.adn.p035k0.h
    public Object d(JSONObject... jSONObjectArr) {
        List list = this.b;
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (h hVar : this.b) {
            if (hVar instanceof k) {
                sb.append(hVar.d(jSONObjectArr));
            } else if (!(hVar instanceof c)) {
                continue;
            } else {
                if (hVar.d(jSONObjectArr) == null) {
                    return null;
                }
                sb.append(hVar.d(jSONObjectArr));
            }
        }
        return sb.toString();
    }

    public b(List list, String str) {
        super(str);
        this.b = list;
        this.c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar instanceof c) {
                this.c.add((c) hVar);
            }
        }
    }

    @Override // com.adsurge.adn.p035k0.h
    public h a() {
        return this;
    }

    @Override // com.adsurge.adn.p035k0.c
    public Object a(g gVar) {
        List list = this.b;
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (h hVar : this.b) {
            if (hVar instanceof k) {
                sb.append(hVar.toString());
            } else if (hVar instanceof c) {
                Object objA = gVar.a((c) hVar);
                if (objA == null) {
                    return null;
                }
                sb.append(objA);
            } else {
                continue;
            }
        }
        return sb.toString();
    }
}
