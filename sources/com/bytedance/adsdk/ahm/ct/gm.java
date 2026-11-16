package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class gm {
    public static <T> List<com.bytedance.adsdk.ahm.yo.kgy<T>> kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar, float f, gbb<T> gbbVar, boolean z) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.ahm.yo yoVar2;
        float f2;
        gbb<T> gbbVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            yoVar.kgy("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.ahm.yo yoVar3 = yoVar;
                    float f3 = f;
                    gbb<T> gbbVar3 = gbbVar;
                    boolean z3 = z;
                    com.bytedance.adsdk.ahm.yo.kgy kgyVarKgy = sx.kgy(jsonReader3, yoVar3, f3, gbbVar3, false, z3);
                    jsonReader2 = jsonReader3;
                    yoVar2 = yoVar3;
                    f2 = f3;
                    gbbVar2 = gbbVar3;
                    z2 = z3;
                    arrayList.add(kgyVarKgy);
                } else {
                    jsonReader2 = jsonReader;
                    yoVar2 = yoVar;
                    f2 = f;
                    gbbVar2 = gbbVar;
                    z2 = z;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(sx.kgy(jsonReader2, yoVar2, f2, gbbVar2, true, z2));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                yoVar = yoVar2;
                f = f2;
                gbbVar = gbbVar2;
                z = z2;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(sx.kgy(jsonReader4, yoVar, f, gbbVar, false, z));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        kgy(arrayList);
        return arrayList;
    }

    public static <T> void kgy(List<? extends com.bytedance.adsdk.ahm.yo.kgy<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.bytedance.adsdk.ahm.yo.kgy<T> kgyVar = list.get(i2);
            i2++;
            com.bytedance.adsdk.ahm.yo.kgy<T> kgyVar2 = list.get(i2);
            kgyVar.yo = Float.valueOf(kgyVar2.noq);
            if (kgyVar.ahm == null && (t = kgyVar2.kgy) != null) {
                kgyVar.ahm = t;
                if (kgyVar instanceof com.bytedance.adsdk.ahm.kgy.ahm.gf) {
                    ((com.bytedance.adsdk.ahm.kgy.ahm.gf) kgyVar).kgy();
                }
            }
        }
        com.bytedance.adsdk.ahm.yo.kgy<T> kgyVar3 = list.get(i);
        if ((kgyVar3.kgy == null || kgyVar3.ahm == null) && list.size() > 1) {
            list.remove(kgyVar3);
        }
    }
}
