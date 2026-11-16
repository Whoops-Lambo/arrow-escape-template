package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y1 extends LinkedHashMap {
    public static final y1 b;
    public boolean a;

    static {
        y1 y1Var = new y1();
        b = y1Var;
        y1Var.a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.a) {
            super.clear();
        } else {
            defpackage.d.c();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (map.containsKey(entry.getKey())) {
                                Object value = entry.getValue();
                                Object obj2 = map.get(entry.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (!this.a) {
            defpackage.d.c();
            return null;
        }
        Charset charset = l1.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        if (!this.a) {
            defpackage.d.c();
            return;
        }
        for (Object obj : map.keySet()) {
            Charset charset = l1.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a) {
            return super.remove(obj);
        }
        defpackage.d.c();
        return null;
    }

    public y1() {
        this.a = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int iHashCode2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = l1.a;
                iHashCode = bArr.length;
                for (byte b2 : bArr) {
                    iHashCode = (iHashCode * 31) + b2;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else if (!(key instanceof d1)) {
                iHashCode = key.hashCode();
            } else {
                defpackage.d.c();
                return 0;
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = l1.a;
                int length = bArr2.length;
                for (byte b3 : bArr2) {
                    length = (length * 31) + b3;
                }
                if (length != 0) {
                    iHashCode2 = length;
                }
            } else if (!(value instanceof d1)) {
                iHashCode2 = value.hashCode();
            } else {
                defpackage.d.c();
                return 0;
            }
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public y1(Map map) {
        super(map);
        this.a = true;
    }
}
