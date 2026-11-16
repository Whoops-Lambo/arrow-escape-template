package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.view.View;
import com.ironsource.C5055x1;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.jc1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class v {
    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            try {
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("903"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(list, aVar));
                }
                if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("904"))) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(obj, list, aVar));
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
            } catch (Throwable th) {
                q0.b("OperatorView", "handleViewOperations error: " + th.getMessage(), th);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private View a(List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strValueOf = String.valueOf(list.get(0));
        if (strValueOf.length() >= 2 && ((strValueOf.startsWith("'") && strValueOf.endsWith("'")) || (strValueOf.startsWith("\"") && strValueOf.endsWith("\"")))) {
            strValueOf = jc1.j(1, 1, strValueOf);
        }
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        Object objB = aVar.b(C5055x1.o);
        if (objB instanceof View) {
            return ((View) objB).findViewWithTag(strValueOf);
        }
        return null;
    }

    private List<Object> a(Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        ArrayList arrayList = new ArrayList();
        View viewA = a(obj);
        if (viewA != null) {
            View viewA2 = a(viewA.getParent());
            if (list != null && !list.isEmpty()) {
                viewA2 = a(list.get(0));
            }
            if (viewA2 != null) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                viewA.getLocationOnScreen(iArr);
                viewA2.getLocationOnScreen(iArr2);
                arrayList.add(Integer.valueOf(iArr[0] - iArr2[0]));
                arrayList.add(Integer.valueOf(iArr[1] - iArr2[1]));
                return arrayList;
            }
        }
        return arrayList;
    }

    private View a(Object obj) {
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }
}
