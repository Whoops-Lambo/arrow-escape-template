package com.inmobi.media;

import defpackage.az2;
import defpackage.dy;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class J1 extends ul2 implements zr0 {
    public final /* synthetic */ P1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(P1 p1, dy dyVar) {
        super(2, dyVar);
        this.a = p1;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new J1(this.a, dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return new J1(this.a, (dy) obj2).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        P1 p1 = this.a;
        if (p1.b.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Set setEntrySet = p1.b.entrySet();
        setEntrySet.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setEntrySet) {
            if (((Number) ((Map.Entry) obj2).getValue()).intValue() > 0) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            String str = ((C1) ((Map.Entry) obj3).getKey()).a;
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List<Map.Entry> list = (List) entry.getValue();
            JSONArray jSONArray2 = new JSONArray();
            for (Map.Entry entry2 : list) {
                entry2.getClass();
                Object key = entry2.getKey();
                key.getClass();
                Object value = entry2.getValue();
                value.getClass();
                jSONArray2.put(new JSONObject().put("format", ((C1) key).b).put("count", ((Integer) value).intValue()));
            }
            if (jSONArray2.length() > 0) {
                jSONArray.put(new JSONObject().put("nn", str2).put("formats", jSONArray2));
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }
}
