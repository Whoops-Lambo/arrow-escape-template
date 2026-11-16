package com.mbridge.msdk.config.component.pipeline.util;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.singular.sdk.internal.UserDetailsUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static long a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0L;
            }
            return str.contains(UserDetailsUtils.UserDetailsLiterals.DOT) ? Math.round(Float.parseFloat(str) * 1000.0f) : ((long) Integer.parseInt(str)) * 1000;
        } catch (Throwable unused) {
            q0.b("PipelineUtil", "Pipeline convert delay time error, will use 0");
            return 0L;
        }
    }

    public static String a() {
        int iLastIndexOf;
        Package r0 = com.mbridge.msdk.config.component.pipeline.a.class.getPackage();
        if (r0 != null) {
            String name = r0.getName();
            if (!TextUtils.isEmpty(name) && (iLastIndexOf = name.lastIndexOf(UserDetailsUtils.UserDetailsLiterals.DOT)) != 0) {
                String strSubstring = name.substring(0, iLastIndexOf);
                return !TextUtils.isEmpty(strSubstring) ? strSubstring : "com.mbridge.msdk.config.component";
            }
            return "com.mbridge.msdk.config.component";
        }
        return "com.mbridge.msdk.config.component";
    }
}
