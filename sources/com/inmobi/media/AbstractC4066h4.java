package com.inmobi.media;

import android.net.Uri;
import defpackage.dk2;

/* JADX INFO: renamed from: com.inmobi.media.h4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4066h4 {
    public static final boolean a(String str) {
        if (str == null || dk2.Z(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        return !(scheme == null || scheme.length() == 0);
    }
}
