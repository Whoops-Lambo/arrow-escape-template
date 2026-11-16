package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    private Map<String, Object> b(Object obj) {
        return obj instanceof Map ? new HashMap((Map) obj) : new HashMap();
    }

    private Map<String, Object> c(Object obj) {
        if (obj instanceof Map) {
            return b(obj);
        }
        HashMap map = new HashMap();
        map.put("count", obj);
        return map;
    }

    private String d(Object obj) {
        return obj == null ? "" : String.valueOf(obj);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if ("newAnimation".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new com.mbridge.msdk.config.component.animation.c(d(a(list))));
        }
        if ("animationStart".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new com.mbridge.msdk.config.component.animation.a("animationStart", d(a(list))));
        }
        if ("animationPause".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new com.mbridge.msdk.config.component.animation.a("animationPause", d(a(list))));
        }
        if ("animationResume".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new com.mbridge.msdk.config.component.animation.a("animationResume", d(a(list))));
        }
        if ("animationCancel".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new com.mbridge.msdk.config.component.animation.a("animationCancel", d(a(list))));
        }
        if ("animationDestroy".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new com.mbridge.msdk.config.component.animation.a("animationDestroy", d(a(list))));
        }
        if (!(obj instanceof com.mbridge.msdk.config.component.animation.c)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        com.mbridge.msdk.config.component.animation.c cVar = (com.mbridge.msdk.config.component.animation.c) obj;
        if ("translate".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.p(b(a(list))));
        }
        if ("scale".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.m(b(a(list))));
        }
        if ("rotate".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.l(b(a(list))));
        }
        if ("alpha".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.a(b(a(list))));
        }
        if ("color".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.b(b(a(list))));
        }
        if ("duration".equals(str)) {
            Object objA = a(list);
            if (objA instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.e(b(objA)));
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.c(objA));
        }
        if ("delay".equals(str)) {
            Object objA2 = a(list);
            if (objA2 instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.d(b(objA2)));
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.b(objA2));
        }
        if ("repeat".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.k(c(a(list))));
        }
        if ("interpolator".equals(str)) {
            Object objA3 = a(list);
            if (objA3 instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.f(b(objA3)));
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.d(objA3));
        }
        if ("sequence".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.n(a(a(list))));
        }
        if ("parallel".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.j(a(a(list))));
        }
        if ("stagger".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.o(a(a(list))));
        }
        if ("start".equals(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(cVar.b());
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Map<String, Object> a(Object obj) {
        if (obj instanceof Map) {
            return new HashMap((Map) obj);
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            arrayList.addAll((List) obj);
        } else if ((obj instanceof com.mbridge.msdk.config.component.animation.c) || (obj instanceof com.mbridge.msdk.config.component.animation.g)) {
            arrayList.add(obj);
        }
        map.put("operators", arrayList);
        return map;
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
