package com.google.android.gms.internal.p002firebaseauthapi;

import com.tiktok.appevents.edp.TTEDPEventConstants;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzf {
    public abstract boolean b(char c);

    public int a(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            while (i < length) {
                if (b(charSequence.charAt(i))) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        y.p(zzu.c(i, length, TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX));
        return 0;
    }
}
