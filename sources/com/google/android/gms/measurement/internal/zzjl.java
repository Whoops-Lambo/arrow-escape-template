package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzjl {
    public static final zzjl c = new zzjl(100);
    public final EnumMap a;
    public final int b;

    public static String a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? NativeAdContent.ViewTag.OTHER : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static zzjl b(int i, Bundle bundle) {
        if (bundle == null) {
            return new zzjl(i);
        }
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            enumMap.put(zzjkVar, d(bundle.getString(zzjkVar.a)));
        }
        return new zzjl(enumMap, i);
    }

    public static zzjl c(int i, String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        zzjk[] zzjkVarArr = zzjj.STORAGE.a;
        for (int i2 = 0; i2 < zzjkVarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            zzjk zzjkVar = zzjkVarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(zzjkVar, e(str2.charAt(i3)));
            } else {
                enumMap.put(zzjkVar, zzji.UNINITIALIZED);
            }
        }
        return new zzjl(enumMap, i);
    }

    public static zzji d(String str) {
        zzji zzjiVar = zzji.UNINITIALIZED;
        if (str == null) {
            return zzjiVar;
        }
        if (str.equals("granted")) {
            return zzji.GRANTED;
        }
        return str.equals("denied") ? zzji.DENIED : zzjiVar;
    }

    public static zzji e(char c2) {
        if (c2 == '+') {
            return zzji.POLICY;
        }
        if (c2 != '0') {
            return c2 != '1' ? zzji.UNINITIALIZED : zzji.GRANTED;
        }
        return zzji.DENIED;
    }

    public static char h(zzji zzjiVar) {
        if (zzjiVar == null) {
            return '-';
        }
        int iOrdinal = zzjiVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            for (zzjk zzjkVar : zzjj.STORAGE.a) {
                if (this.a.get(zzjkVar) == zzjlVar.a.get(zzjkVar)) {
                }
            }
            if (this.b == zzjlVar.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            char c2 = '-';
            if (zzjiVar != null && (iOrdinal = zzjiVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal == 3) {
                    c2 = '1';
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            sb.append(h((zzji) this.a.get(zzjkVar)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int iHashCode = this.b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((zzji) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(zzjk zzjkVar) {
        return ((zzji) this.a.get(zzjkVar)) != zzji.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final zzjl j(zzjl zzjlVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            zzji zzjiVar2 = (zzji) zzjlVar.a.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzjiVar2;
            } else if (zzjiVar2 != null) {
                zzji zzjiVar3 = zzji.UNINITIALIZED;
                if (zzjiVar == zzjiVar3) {
                    zzjiVar = zzjiVar2;
                } else if (zzjiVar2 != zzjiVar3) {
                    zzji zzjiVar4 = zzji.POLICY;
                    if (zzjiVar == zzjiVar4) {
                        zzjiVar = zzjiVar2;
                    } else if (zzjiVar2 != zzjiVar4) {
                        zzji zzjiVar5 = zzji.DENIED;
                        zzjiVar = (zzjiVar == zzjiVar5 || zzjiVar2 == zzjiVar5) ? zzjiVar5 : zzji.GRANTED;
                    }
                }
            }
            if (zzjiVar != null) {
                enumMap.put(zzjkVar, zzjiVar);
            }
        }
        return new zzjl(enumMap, 100);
    }

    public final zzjl k(zzjl zzjlVar) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            if (zzjiVar == zzji.UNINITIALIZED) {
                zzjiVar = (zzji) zzjlVar.a.get(zzjkVar);
            }
            if (zzjiVar != null) {
                enumMap.put(zzjkVar, zzjiVar);
            }
        }
        return new zzjl(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (zzjk zzjkVar : zzjj.STORAGE.a) {
            sb.append(",");
            sb.append(zzjkVar.a);
            sb.append("=");
            zzji zzjiVar = (zzji) this.a.get(zzjkVar);
            if (zzjiVar == null) {
                zzjiVar = zzji.UNINITIALIZED;
            }
            sb.append(zzjiVar);
        }
        return sb.toString();
    }

    public zzjl(int i) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        this.a = enumMap;
        zzjk zzjkVar = zzjk.AD_STORAGE;
        zzji zzjiVar = zzji.UNINITIALIZED;
        enumMap.put(zzjkVar, zzjiVar);
        enumMap.put(zzjk.ANALYTICS_STORAGE, zzjiVar);
        this.b = i;
    }

    public zzjl(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
