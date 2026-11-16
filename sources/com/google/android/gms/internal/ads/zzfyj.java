package com.google.android.gms.internal.ads;

import android.view.View;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfyj implements zzfyg {
    public final int[] a = new int[2];

    public final JSONObject a(View view) {
        if (view == null) {
            return zzfyt.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = this.a;
        view.getLocationOnScreen(iArr);
        return zzfyt.a(iArr[0], iArr[1], width, height);
    }
}
