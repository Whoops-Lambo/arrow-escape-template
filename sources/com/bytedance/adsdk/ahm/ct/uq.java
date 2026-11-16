package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class uq {
    public static com.bytedance.adsdk.ahm.rz.kgy.uq ahm(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        return new com.bytedance.adsdk.ahm.rz.kgy.uq(kgy(jsonReader, yoVar, um.kgy));
    }

    public static com.bytedance.adsdk.ahm.rz.kgy.fi ct(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        return new com.bytedance.adsdk.ahm.rz.kgy.fi(kgy(jsonReader, com.bytedance.adsdk.ahm.noq.noq.kgy(), yoVar, muf.kgy));
    }

    public static com.bytedance.adsdk.ahm.rz.kgy.ahm kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar, boolean z) throws IOException {
        return new com.bytedance.adsdk.ahm.rz.kgy.ahm(kgy(jsonReader, z ? com.bytedance.adsdk.ahm.noq.noq.kgy() : 1.0f, yoVar, at.kgy));
    }

    public static com.bytedance.adsdk.ahm.rz.kgy.ra noq(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        return new com.bytedance.adsdk.ahm.rz.kgy.ra(kgy(jsonReader, com.bytedance.adsdk.ahm.noq.noq.kgy(), yoVar, gf.kgy));
    }

    public static com.bytedance.adsdk.ahm.rz.kgy.noq rz(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        return new com.bytedance.adsdk.ahm.rz.kgy.noq(gm.kgy(jsonReader, yoVar, com.bytedance.adsdk.ahm.noq.noq.kgy(), wy.kgy, true));
    }

    public static com.bytedance.adsdk.ahm.rz.kgy.yo uq(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        return new com.bytedance.adsdk.ahm.rz.kgy.yo(kgy(jsonReader, yoVar, uxe.kgy));
    }

    public static com.bytedance.adsdk.ahm.rz.kgy.kgy yo(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        return new com.bytedance.adsdk.ahm.rz.kgy.kgy(kgy(jsonReader, yoVar, yo.kgy));
    }

    public static com.bytedance.adsdk.ahm.rz.kgy.ahm kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        return kgy(jsonReader, yoVar, true);
    }

    public static com.bytedance.adsdk.ahm.rz.kgy.rz kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar, int i) throws IOException {
        return new com.bytedance.adsdk.ahm.rz.kgy.rz(kgy(jsonReader, yoVar, new vs(i)));
    }

    private static <T> List<com.bytedance.adsdk.ahm.yo.kgy<T>> kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar, gbb<T> gbbVar) throws IOException {
        return gm.kgy(jsonReader, yoVar, 1.0f, gbbVar, false);
    }

    private static <T> List<com.bytedance.adsdk.ahm.yo.kgy<T>> kgy(JsonReader jsonReader, float f, com.bytedance.adsdk.ahm.yo yoVar, gbb<T> gbbVar) throws IOException {
        return gm.kgy(jsonReader, yoVar, f, gbbVar, false);
    }
}
