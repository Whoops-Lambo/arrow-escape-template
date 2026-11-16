package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.n30;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class g {
    private static final List<String> b = Arrays.asList("+=", "-=", "*=", "/=", "%=");
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String strA;
        Object objB;
        Object objA = a(list);
        if (obj instanceof com.mbridge.msdk.config.component.common.express.entities.a) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar = (com.mbridge.msdk.config.component.common.express.entities.a) obj;
            strA = aVar.a();
            objB = aVar.b();
        } else {
            strA = "";
            objB = null;
        }
        String str2 = strA;
        if (TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objB;
            return a(aVar2, str2, str, aVar2.b((Object) str2), objA);
        }
        if (objB instanceof Map) {
            Map map = (Map) objB;
            return a(map, str2, str, map.get(str2), objA);
        }
        if (objB instanceof List) {
            try {
                int i = Integer.parseInt(str2);
                if (i >= 0 && i < ((List) objB).size()) {
                    return a((List) objB, i, str, ((List) objB).get(i), objA);
                }
                q0.b("CompoundAssignOp", "List index out of bounds: " + str2 + ", list size: " + ((List) objB).size());
            } catch (NumberFormatException unused) {
                n30.w("Invalid list index: ", str2, "CompoundAssignOp");
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    public g(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    private Object a(Double d, Double d2, String str) {
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != 1208) {
                if (iHashCode != 1363) {
                    if (iHashCode != 1394) {
                        if (iHashCode != 1456) {
                            if (iHashCode == 1518 && str.equals("/=")) {
                                if (d2.doubleValue() != 0.0d) {
                                    return Double.valueOf(new BigDecimal(d.doubleValue()).divide(new BigDecimal(d2.doubleValue()), 10, RoundingMode.HALF_UP).doubleValue());
                                }
                                throw new ArithmeticException("Division by zero");
                            }
                            return null;
                        }
                        if (str.equals("-=")) {
                            return Double.valueOf(d.doubleValue() - d2.doubleValue());
                        }
                        return null;
                    }
                    if (str.equals("+=")) {
                        return Double.valueOf(d.doubleValue() + d2.doubleValue());
                    }
                    return null;
                }
                if (str.equals("*=")) {
                    return Double.valueOf(d.doubleValue() * d2.doubleValue());
                }
                return null;
            }
            if (str.equals("%=")) {
                if (d2.doubleValue() != 0.0d) {
                    return Double.valueOf(d.doubleValue() % d2.doubleValue());
                }
                throw new ArithmeticException("Modulo by zero");
            }
            return null;
        } catch (Exception e) {
            q0.b("CompoundAssignOp", e.getMessage());
            return null;
        }
    }

    private double b(double d) {
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private Object a(List<Object> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str, String str2, Object obj, Object obj2) {
        Object objValueOf;
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA != null && dA2 != null) {
            try {
                Object objA = a(dA, dA2, str2);
                if (objA instanceof Double) {
                    double dDoubleValue = ((Double) objA).doubleValue();
                    if (a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objA).intValue());
                    } else {
                        objValueOf = Double.valueOf(b(dDoubleValue));
                    }
                    if (aVar != null) {
                        aVar.a(str, objValueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
                }
            } catch (Exception e) {
                q0.b("CompoundAssignOp", e.getMessage(), e);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Map map, String str, String str2, Object obj, Object obj2) {
        Object objValueOf;
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA != null && dA2 != null) {
            try {
                Object objA = a(dA, dA2, str2);
                if (objA instanceof Double) {
                    double dDoubleValue = ((Double) objA).doubleValue();
                    if (a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objA).intValue());
                    } else {
                        objValueOf = Double.valueOf(b(dDoubleValue));
                    }
                    if (map != null) {
                        map.put(str, objValueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
                }
            } catch (Exception e) {
                q0.b("CompoundAssignOp", e.getMessage(), e);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(List list, int i, String str, Object obj, Object obj2) {
        Object objValueOf;
        Double dA = a(obj);
        Double dA2 = a(obj2);
        if (dA != null && dA2 != null) {
            try {
                Object objA = a(dA, dA2, str);
                if (objA instanceof Double) {
                    double dDoubleValue = ((Double) objA).doubleValue();
                    if (a(dDoubleValue)) {
                        objValueOf = Integer.valueOf(((Double) objA).intValue());
                    } else {
                        objValueOf = Double.valueOf(b(dDoubleValue));
                    }
                    if (list != null) {
                        list.set(i, objValueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
                }
            } catch (Exception e) {
                q0.b("CompoundAssignOp", e.getMessage(), e);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private Double a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        try {
            return Double.valueOf(Double.parseDouble(String.valueOf(obj)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        String strTrim = str.trim();
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            if (strTrim.equals(it.next())) {
                return b(strTrim, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private boolean a(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d) || d != Math.floor(d)) ? false : true;
    }
}
