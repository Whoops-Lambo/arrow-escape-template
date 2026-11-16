package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.mbridge.msdk.foundation.entity.b;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class fi {
    public static com.bytedance.adsdk.ahm.rz.ahm.rz kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        com.bytedance.adsdk.ahm.rz.ahm.rz rzVarKgy;
        String strNextString;
        jsonReader.beginObject();
        byte b = 2;
        int iNextInt = 2;
        while (true) {
            rzVarKgy = null;
            if (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                if (!strNextName.equals("d")) {
                    if (!strNextName.equals("ty")) {
                        jsonReader.skipValue();
                    } else {
                        strNextString = jsonReader.nextString();
                        break;
                    }
                } else {
                    iNextInt = jsonReader.nextInt();
                }
            } else {
                strNextString = null;
                break;
            }
        }
        if (strNextString == null) {
            return null;
        }
        switch (strNextString.hashCode()) {
            case 3239:
                b = !strNextString.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b = !strNextString.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strNextString.equals("gf")) {
                    b = -1;
                }
                break;
            case 3307:
                b = !strNextString.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b = !strNextString.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b = !strNextString.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b = !strNextString.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b = !strNextString.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b = !strNextString.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b = !strNextString.equals(b.JSON_KEY_SH) ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b = !strNextString.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b = !strNextString.equals(CmcdConfiguration.KEY_STREAM_TYPE) ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b = !strNextString.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b = !strNextString.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                rzVarKgy = noq.kgy(jsonReader, yoVar, iNextInt);
                break;
            case 1:
                rzVarKgy = vrj.kgy(jsonReader, yoVar);
                break;
            case 2:
                rzVarKgy = dg.kgy(jsonReader, yoVar);
                break;
            case 3:
                rzVarKgy = mw.kgy(jsonReader, yoVar);
                break;
            case 4:
                rzVarKgy = xh.kgy(jsonReader, yoVar);
                break;
            case 5:
                rzVarKgy = fpz.kgy(jsonReader);
                yoVar.kgy("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                rzVarKgy = vg.kgy(jsonReader, yoVar);
                break;
            case 7:
                rzVarKgy = ikw.kgy(jsonReader, yoVar);
                break;
            case 8:
                rzVarKgy = bmz.kgy(jsonReader, yoVar);
                break;
            case 9:
                rzVarKgy = mca.kgy(jsonReader, yoVar);
                break;
            case 10:
                rzVarKgy = uf.kgy(jsonReader, yoVar, iNextInt);
                break;
            case 11:
                rzVarKgy = ftg.kgy(jsonReader, yoVar);
                break;
            case 12:
                rzVarKgy = wl.kgy(jsonReader, yoVar);
                break;
            case 13:
                rzVarKgy = rz.kgy(jsonReader, yoVar);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return rzVarKgy;
    }
}
