package com.mbridge.msdk.mbsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class c implements a {
    @Override // com.mbridge.msdk.mbsignalcommon.base.a
    public boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String scheme = Uri.parse(str).getScheme();
            if (!TextUtils.isEmpty(scheme) && scheme.equals("intent")) {
                return com.mbridge.msdk.click.c.d(com.mbridge.msdk.foundation.controller.c.n().d(), str);
            }
            return false;
        }
        return false;
    }
}
