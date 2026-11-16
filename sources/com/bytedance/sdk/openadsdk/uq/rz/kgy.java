package com.bytedance.sdk.openadsdk.uq.rz;

import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bytedance.sdk.openadsdk.utils.ftg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.rz.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0292kgy {
        public static final String ahm;
        public static final String ct;
        public static final String kgy;
        public static final String noq;
        public static final String rz;
        public static final String uq;

        static {
            CharSequence[] charSequenceArr = {ftg.vg(), "load_start"};
            StringBuilder sb = new StringBuilder();
            sb.append(charSequenceArr[0]);
            sb.append((CharSequence) "_");
            sb.append(charSequenceArr[1]);
            kgy = sb.toString();
            CharSequence[] charSequenceArr2 = {ftg.vg(), "load_finish"};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequenceArr2[0]);
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr2[1]);
            ahm = sb2.toString();
            CharSequence[] charSequenceArr3 = {ftg.vg(), AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL};
            StringBuilder sb3 = new StringBuilder();
            sb3.append(charSequenceArr3[0]);
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr3[1]);
            rz = sb3.toString();
            CharSequence[] charSequenceArr4 = {ftg.vg(), ftg.uf()};
            StringBuilder sb4 = new StringBuilder();
            sb4.append(charSequenceArr4[0]);
            sb4.append((CharSequence) "_");
            sb4.append(charSequenceArr4[1]);
            uq = sb4.toString();
            CharSequence[] charSequenceArr5 = {ftg.vg(), ftg.uf(), "show"};
            StringBuilder sb5 = new StringBuilder();
            sb5.append(charSequenceArr5[0]);
            for (int i = 1; i < 3; i++) {
                sb5.append((CharSequence) "_");
                sb5.append(charSequenceArr5[i]);
            }
            ct = sb5.toString();
            CharSequence[] charSequenceArr6 = {ftg.vg(), ftg.uf(), NotificationCompat.CATEGORY_PROGRESS};
            StringBuilder sb6 = new StringBuilder();
            sb6.append(charSequenceArr6[0]);
            for (int i2 = 1; i2 < 3; i2++) {
                sb6.append((CharSequence) "_");
                sb6.append(charSequenceArr6[i2]);
            }
            noq = sb6.toString();
        }
    }
}
