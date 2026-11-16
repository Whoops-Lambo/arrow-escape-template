package com.adsurge.adn.L1;

import android.text.TextUtils;
import com.adsurge.adn.R;
import com.adsurge.adn.managers.AdSurgeAdSdk;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class c {
    public InputStream a(String str, String str2) {
        if (TextUtils.equals(str2, "adsurge-adapter")) {
            return AdSurgeAdSdk.getInstance().getContext().getResources().openRawResource(R.raw.adapter_adsurge);
        }
        if (TextUtils.equals(str2, "adsurge-mraid")) {
            return AdSurgeAdSdk.getInstance().getContext().getResources().openRawResource(R.raw.adapter_mraid);
        }
        return null;
    }
}
