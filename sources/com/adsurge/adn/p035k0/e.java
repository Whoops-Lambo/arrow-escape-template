package com.adsurge.adn.p035k0;

import android.text.TextUtils;
import com.adsurge.adn.p020f0.g;
import com.ironsource.C4664b4;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class e extends c {
    public final List b;

    public final Object b(JSONObject jSONObject) {
        Object objA;
        int i = 0;
        Object obj = jSONObject;
        while (true) {
            int i2 = i + 1;
            objA = ((f) this.b.get(i)).a(obj);
            if (i2 >= this.b.size() || objA == null) {
                break;
            }
            i = i2;
            obj = objA;
        }
        return objA;
    }

    public final List a(String str) {
        String[] strArrSplit = str.split("\\.|\\[");
        if (strArrSplit == null || strArrSplit.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            if (str2.endsWith(C4664b4.j.e)) {
                try {
                    arrayList.add(new f(Integer.parseInt(str2.substring(0, str2.length() - 1))));
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                arrayList.add(new f(str2));
            }
        }
        return arrayList;
    }

    public e(String str) {
        super(str);
        this.b = a(str);
    }

    @Override // com.adsurge.adn.p035k0.c
    public Object a(JSONObject jSONObject) {
        List list;
        if (jSONObject == null || jSONObject.length() <= 0 || (list = this.b) == null || list.size() <= 0) {
            return null;
        }
        Object objB = b(jSONObject);
        return objB == null ? n.a(jSONObject, this.b) : objB;
    }

    @Override // com.adsurge.adn.p035k0.h
    public h a() {
        return this;
    }

    @Override // com.adsurge.adn.p035k0.c
    public Object a(g gVar) {
        return gVar.a(this);
    }
}
