package com.adsurge.adn.X;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C {
    public static boolean a(Uri uri) {
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        return uri.getScheme().equalsIgnoreCase(com.safedk.android.analytics.brandsafety.creatives.g.e) || uri.getScheme().equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME);
    }
}
