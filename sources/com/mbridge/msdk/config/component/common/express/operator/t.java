package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class t {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public t(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (!TextUtils.isEmpty(str) && str.contains(com.mbridge.msdk.config.component.common.util.c.c("875"))) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(String.valueOf(System.currentTimeMillis()));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }
}
