package com.bytedance.adsdk.ahm.ct;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class gf implements gbb<com.bytedance.adsdk.ahm.rz.ahm> {
    public static final gf kgy = new gf();

    @Override // com.bytedance.adsdk.ahm.ct.gbb
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ahm.rz.ahm ahm(JsonReader jsonReader, float f) throws IOException {
        com.bytedance.adsdk.ahm.rz.ahm.kgy kgyVar = com.bytedance.adsdk.ahm.rz.ahm.kgy.CENTER;
        jsonReader.beginObject();
        com.bytedance.adsdk.ahm.rz.ahm.kgy kgyVar2 = kgyVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iKgy = 0;
        int iKgy2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "f":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "j":
                    int iNextInt2 = jsonReader.nextInt();
                    kgyVar2 = com.bytedance.adsdk.ahm.rz.ahm.kgy.CENTER;
                    if (iNextInt2 <= kgyVar2.ordinal() && iNextInt2 >= 0) {
                        kgyVar2 = com.bytedance.adsdk.ahm.rz.ahm.kgy.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case "s":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    strNextString = jsonReader.nextString();
                    break;
                case "fc":
                    iKgy = fpp.kgy(jsonReader);
                    break;
                case "lh":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    iKgy2 = fpp.kgy(jsonReader);
                    break;
                case "sw":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.ahm.rz.ahm(strNextString, strNextString2, fNextDouble, kgyVar2, iNextInt, fNextDouble2, fNextDouble3, iKgy, iKgy2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }

    private gf() {
    }
}
