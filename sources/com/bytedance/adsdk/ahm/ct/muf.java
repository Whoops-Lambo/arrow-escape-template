package com.bytedance.adsdk.ahm.ct;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import defpackage.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class muf implements gbb<com.bytedance.adsdk.ahm.rz.ahm.kus> {
    public static final muf kgy = new muf();

    private muf() {
    }

    @Override // com.bytedance.adsdk.ahm.ct.gbb
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ahm.rz.ahm.kus ahm(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listKgy = null;
        List<PointF> listKgy2 = null;
        List<PointF> listKgy3 = null;
        boolean zNextBoolean = false;
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "c":
                        zNextBoolean = jsonReader.nextBoolean();
                        break;
                    case "i":
                        listKgy2 = fpp.kgy(jsonReader, f);
                        break;
                    case "o":
                        listKgy3 = fpp.kgy(jsonReader, f);
                        break;
                    case "v":
                        listKgy = fpp.kgy(jsonReader, f);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else {
                jsonReader.endObject();
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                if (listKgy != null && listKgy2 != null && listKgy3 != null) {
                    if (listKgy.isEmpty()) {
                        return new com.bytedance.adsdk.ahm.rz.ahm.kus(new PointF(), false, Collections.EMPTY_LIST);
                    }
                    int size = listKgy.size();
                    PointF pointF = listKgy.get(0);
                    ArrayList arrayList = new ArrayList(size);
                    for (int i = 1; i < size; i++) {
                        PointF pointF2 = listKgy.get(i);
                        int i2 = i - 1;
                        arrayList.add(new com.bytedance.adsdk.ahm.rz.kgy(com.bytedance.adsdk.ahm.noq.ct.kgy(listKgy.get(i2), listKgy3.get(i2)), com.bytedance.adsdk.ahm.noq.ct.kgy(pointF2, listKgy2.get(i)), pointF2));
                    }
                    if (zNextBoolean) {
                        PointF pointF3 = listKgy.get(0);
                        int i3 = size - 1;
                        arrayList.add(new com.bytedance.adsdk.ahm.rz.kgy(com.bytedance.adsdk.ahm.noq.ct.kgy(listKgy.get(i3), listKgy3.get(i3)), com.bytedance.adsdk.ahm.noq.ct.kgy(pointF3, listKgy2.get(0)), pointF3));
                    }
                    return new com.bytedance.adsdk.ahm.rz.ahm.kus(pointF, zNextBoolean, arrayList);
                }
                d.r("Shape data was missing information.");
                return null;
            }
        }
    }
}
