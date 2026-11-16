package com.mbridge.msdk.config.component.common.express.node;

import android.text.TextUtils;
import defpackage.q63;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class f extends d {
    d a;
    d b;

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        try {
            Object objA = this.a.a(dVar, eVar, aVar);
            String str = (String) this.b.a(dVar, eVar, aVar);
            if (objA != null && !TextUtils.isEmpty(str)) {
                int i = Integer.parseInt(str);
                if (objA instanceof Object[]) {
                    if (i < ((Object[]) objA).length) {
                        return ((Object[]) objA)[i];
                    }
                } else if (objA instanceof int[]) {
                    if (i < ((int[]) objA).length) {
                        return Integer.valueOf(((int[]) objA)[i]);
                    }
                } else if (objA instanceof long[]) {
                    if (i < ((long[]) objA).length) {
                        return Long.valueOf(((long[]) objA)[i]);
                    }
                } else if (objA instanceof double[]) {
                    if (i < ((double[]) objA).length) {
                        return Double.valueOf(((double[]) objA)[i]);
                    }
                } else if (objA instanceof float[]) {
                    if (i < ((float[]) objA).length) {
                        return Float.valueOf(((float[]) objA)[i]);
                    }
                } else if (objA instanceof boolean[]) {
                    if (i < ((boolean[]) objA).length) {
                        return Boolean.valueOf(((boolean[]) objA)[i]);
                    }
                } else if (objA instanceof char[]) {
                    if (i < ((char[]) objA).length) {
                        return Character.valueOf(((char[]) objA)[i]);
                    }
                } else if (objA instanceof byte[]) {
                    if (i < ((byte[]) objA).length) {
                        return Byte.valueOf(((byte[]) objA)[i]);
                    }
                } else if (objA instanceof short[]) {
                    if (i < ((short[]) objA).length) {
                        return Short.valueOf(((short[]) objA)[i]);
                    }
                } else if ((objA instanceof List) && i < ((List) objA).size()) {
                    return ((List) objA).get(i);
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            q63.r(e, new StringBuilder("IndexAccessNode error: "), "IndexAccessNode");
        }
    }

    public f(d dVar, d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }
}
