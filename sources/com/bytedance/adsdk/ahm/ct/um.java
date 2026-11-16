package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class um implements gbb<Integer> {
    public static final um kgy = new um();

    private um() {
    }

    @Override // com.bytedance.adsdk.ahm.ct.gbb
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public Integer ahm(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(fpp.ahm(jsonReader) * f));
    }
}
