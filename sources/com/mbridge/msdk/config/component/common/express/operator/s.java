package com.mbridge.msdk.config.component.common.express.operator;

import android.os.Looper;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class s {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public s(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        int i;
        if (!TextUtils.isEmpty(str) && str.equals(com.mbridge.msdk.config.component.common.util.c.c("902"))) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                i = 1;
            } else {
                i = 0;
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(i));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }
}
