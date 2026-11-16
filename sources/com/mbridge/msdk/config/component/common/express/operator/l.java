package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class l {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public l(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        boolean zA;
        if (!TextUtils.isEmpty(str) && (str.contains(com.mbridge.msdk.config.component.common.util.c.c("882")) || str.contains(com.mbridge.msdk.config.component.common.util.c.c("883")))) {
            boolean z = false;
            if (list != null && !list.isEmpty()) {
                zA = a(list.get(0));
            } else {
                zA = false;
            }
            boolean zA2 = a(obj);
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("882"))) {
                if (zA2 && zA) {
                    z = true;
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(z));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("883"))) {
                if (zA2 || zA) {
                    z = true;
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(z));
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (!(obj instanceof String)) {
            return (obj instanceof Number) && ((Number) obj).intValue() == 1;
        }
        String str = (String) obj;
        return "1".equals(str) || "true".equalsIgnoreCase(str);
    }
}
