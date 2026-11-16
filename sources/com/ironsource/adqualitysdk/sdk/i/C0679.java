package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ۃ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0679 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f1740 = StringFog.decrypt("tlkkzHL87y+XXyvb\n", "+TtOqRGIqUY=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap f1739 = new HashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0867 m575(Object obj, C0758 c0758) {
        InterfaceC0867 interfaceC0867M573;
        boolean zMo366;
        Object obj2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Class<?> cls = obj.getClass();
        C0783 c0783 = c0758.f2006;
        c0783.f2070 = cls;
        C0739 c0739 = (C0739) this.f1739.get(c0783);
        if (c0739 != null) {
            try {
                Object obj3 = obj;
                C0860 c0860 = null;
                for (Field field : (List) c0739.f1932.get(0)) {
                    if (WeakReference.class.isAssignableFrom(field.getType())) {
                        obj2 = ((WeakReference) field.get(obj3)).get();
                    } else {
                        obj2 = field.get(obj3);
                    }
                    C0860 c0861 = new C0860(field, obj3, c0860);
                    obj3 = obj2;
                    c0860 = c0861;
                }
                interfaceC0867M573 = m573(c0860, c0739, 1);
            } catch (Exception e) {
                String str = this.f1740;
                AbstractC0509.m497(str, str, StringFog.decrypt("SitSnLm72oN7LUmdrLvyhGU8Q4eN8tiKa3lGgaT2nZZuLUg=\n", "D1kg88ubveY=\n"), e, null, false);
                interfaceC0867M573 = null;
            }
            if (interfaceC0867M573 != null) {
                try {
                    zMo366 = c0758.f2005.mo366(interfaceC0867M573);
                } catch (Exception unused) {
                    zMo366 = false;
                }
                if (zMo366) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(StringFog.decrypt("/Uhc4rYmWAL0Sgn8s3JWUPJJCQ==\n", "mycpjNIGPnA=\n"));
                    sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    m576(interfaceC0867M573, obj, AbstractC1156.m868("olw=\n", "zy+G3vT5pf8=\n", sb));
                    return interfaceC0867M573;
                }
            }
            AbstractC0509.m488(this.f1740, obj + StringFog.decrypt("zR2ufteve6aeTq0=\n", "9z3eH6PHW8s=\n"));
            this.f1739.remove(c0783);
        }
        C0750 c0750 = new C0750(c0758);
        InterfaceC0867 interfaceC0867M574 = m574(obj, c0750, 0, (C0860) null);
        if (interfaceC0867M574 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(StringFog.decrypt("zN8B3IVSIUmK\n", "qrB0suFySCc=\n"));
            sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb2.append(StringFog.decrypt("8zr5YQ==\n", "nknVQfxqSEs=\n"));
            sb2.append(c0750.f1988.size());
            m576(interfaceC0867M574, obj, AbstractC1156.m868("4s/kuXBzj97iyejzZnWP\n", "wqCG0xUQ+60=\n", sb2));
            this.f1739.put(c0783, c0750.f1989);
            return interfaceC0867M574;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(StringFog.decrypt("rvK4knL0TjCkvaXcNA==\n", "wJ3MshSbO14=\n"));
        sb3.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb3.append(StringFog.decrypt("6nYdrg==\n", "hwUxjhe2Eoo=\n"));
        sb3.append(c0750.f1988.size());
        m576((InterfaceC0867) null, obj, AbstractC1156.m868("JfLkkYo3X5Ul9OjbnDFf\n", "BZ2G++9UK+Y=\n", sb3));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #1 {Exception -> 0x0063, blocks: (B:12:0x0056, B:14:0x005a, B:23:0x0092, B:24:0x0096, B:26:0x009c, B:16:0x0067, B:18:0x006b, B:19:0x0074, B:21:0x007e), top: B:43:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[Catch: Exception -> 0x00d4, TryCatch #0 {Exception -> 0x00d4, blocks: (B:28:0x00a6, B:30:0x00b0, B:32:0x00bf, B:31:0x00bb, B:35:0x00cd), top: B:41:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb A[Catch: Exception -> 0x00d4, TryCatch #0 {Exception -> 0x00d4, blocks: (B:28:0x00a6, B:30:0x00b0, B:32:0x00bf, B:31:0x00bb, B:35:0x00cd), top: B:41:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd A[Catch: Exception -> 0x00d4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d4, blocks: (B:28:0x00a6, B:30:0x00b0, B:32:0x00bf, B:31:0x00bb, B:35:0x00cd), top: B:41:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0867 m573(InterfaceC0867 interfaceC0867, C0739 c0739, int i) {
        boolean z;
        C0860 c0860;
        Object obj;
        C0679 c0679 = this;
        if (i >= c0739.f1932.size()) {
            return interfaceC0867;
        }
        List<Field> list = (List) c0739.f1932.get(i);
        C0860 c0861 = (C0860) interfaceC0867;
        Object objM633 = c0861.m633();
        boolean z2 = true;
        ArrayList arrayListM571 = m571(objM633, true, true, true);
        if (arrayListM571 == null) {
            AbstractC0509.m488(c0679.f1740, StringFog.decrypt("37BWqNPg4/66i0mh3PHl7vOnSO3f5qbX+7gK7cLx5f/zvkOpkA==\n", "msgmzbCUhpo=\n") + objM633.getClass());
            return null;
        }
        int size = arrayListM571.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayListM571.get(i2);
            i2++;
            if (objM633 != null) {
                try {
                    if (objM633 instanceof Collection) {
                        c0860 = new C0860((Collection) objM633, obj2, c0861);
                    } else if (objM633 instanceof Map) {
                        c0860 = new C0860((Map) objM633, obj2, c0861);
                    } else if (objM633.getClass().isArray()) {
                        c0860 = new C0860(new ArrayList(Arrays.asList(objM633)), obj2, c0861);
                    } else {
                        c0860 = null;
                    }
                    for (Field field : list) {
                        z = z2;
                        try {
                            if (WeakReference.class.isAssignableFrom(field.getType())) {
                                obj = ((WeakReference) field.get(obj2)).get();
                            } else {
                                obj = field.get(obj2);
                            }
                            C0860 c0862 = new C0860(field, obj2, c0860);
                            obj2 = obj;
                            c0860 = c0862;
                            z2 = z;
                        } catch (Exception unused) {
                        }
                    }
                    z = z2;
                    if (c0860 != null) {
                        return c0679.m573(c0860, c0739, i + 1);
                    }
                    continue;
                } catch (Exception unused2) {
                    z = z2;
                }
            } else {
                c0860 = null;
                while (r13.hasNext()) {
                    z = z2;
                    if (WeakReference.class.isAssignableFrom(field.getType())) {
                        obj = ((WeakReference) field.get(obj2)).get();
                    } else {
                        obj = field.get(obj2);
                    }
                    C0860 c0863 = new C0860(field, obj2, c0860);
                    obj2 = obj;
                    c0860 = c0863;
                    z2 = z;
                }
                z = z2;
                if (c0860 != null) {
                    return c0679.m573(c0860, c0739, i + 1);
                }
                continue;
            }
            z2 = z;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0867 m574(Object obj, C0750 c0750, int i, C0860 c0860) {
        Field[] fieldArrM594;
        if (i != c0750.f1990.f2006.f2066 && obj != null && !c0750.f1988.contains(obj) && (i <= 0 || !(obj instanceof Activity))) {
            c0750.f1988.add(obj);
            try {
                C4614e1 c4614e1 = c0750.f1990.f2004;
                if (c4614e1 != null) {
                    C0744 c0744 = C0891.m648().f2391;
                    fieldArrM594 = C0744.m594(obj.getClass(), true, -1, c4614e1.f322);
                } else {
                    Class<?> superclass = obj.getClass();
                    C0758 c0758 = c0750.f1990;
                    int i2 = C0758.m598(i, c0758.f2006.f2064) ? c0758.f2006.f2063 : 0;
                    Field[] declaredFields = superclass.getDeclaredFields();
                    for (int i3 = 0; superclass != null && i3 != i2; i3++) {
                        superclass = superclass.getSuperclass();
                        if (superclass != null) {
                            Field[] declaredFields2 = superclass.getDeclaredFields();
                            String str = AbstractC0951.f2572;
                            int length = declaredFields.length;
                            int length2 = declaredFields2.length;
                            Field[] fieldArr = new Field[length + length2];
                            System.arraycopy(declaredFields, 0, fieldArr, 0, length);
                            System.arraycopy(declaredFields2, 0, fieldArr, length, length2);
                            declaredFields = fieldArr;
                        }
                    }
                    fieldArrM594 = declaredFields;
                }
                C0739 c0739 = c0750.f1989;
                for (Field field : fieldArrM594) {
                    field.setAccessible(true);
                    ((List) c0739.f1932.get(c0739.f1931)).add(field);
                    InterfaceC0867 interfaceC0867M572 = m572(new C0860(field, obj, c0860), c0750, i);
                    if (interfaceC0867M572 != null && !c0750.f1987) {
                        return interfaceC0867M572;
                    }
                    ((List) c0739.f1932.get(c0739.f1931)).remove(field);
                }
            } catch (Throwable th) {
                String str2 = this.f1740;
                AbstractC0509.m497(str2, str2, StringFog.decrypt("7dAYNhtZY87c1gM3DllLycLHCS0vEGHHzA==\n", "qKJqWWl5BKs=\n"), th, null, false);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0867 m572(C0860 c0860, C0750 c0750, int i) {
        C0860 c0861;
        boolean zMo366;
        Object objM633 = c0860.m633();
        if (c0750.f1988.contains(objM633) || c0750.f1986.contains(objM633)) {
            return null;
        }
        int i2 = 0;
        if (C0758.m598(i, c0750.f1990.f2006.f2065)) {
            try {
                zMo366 = c0750.f1990.f2005.mo366(c0860);
            } catch (Exception unused) {
                zMo366 = false;
            }
            if (zMo366) {
                if (c0750.f1987) {
                    c0750.f1985.add(c0860);
                    c0750.f1986.add(objM633);
                }
                return c0860;
            }
        }
        if (objM633 instanceof WeakReference) {
            WeakReference weakReference = (WeakReference) objM633;
            if (weakReference.get() != null && C0758.m598(i, c0750.f1990.f2006.f2062)) {
                Object obj = weakReference.get();
                if (obj != null ? AbstractC0951.m735(obj.getClass(), c0750.f1990.f2006.f2067) : false) {
                    return m574(weakReference.get(), c0750, i + 1, c0860);
                }
            }
        }
        if (objM633 != null ? AbstractC0951.m735(objM633.getClass(), c0750.f1990.f2006.f2067) : false) {
            return m574(objM633, c0750, i + 1, c0860);
        }
        if (c0750.f1990.f2006.f2058 && objM633 != null) {
            c0750.f1988.add(objM633);
        }
        C0758 c0758 = c0750.f1990;
        ArrayList arrayListM571 = m571(objM633, C0758.m598(i, c0758.f2006.f2061), C0758.m598(i, c0758.f2006.f2060), C0758.m598(i, c0758.f2006.f2059));
        C0739 c0739 = c0750.f1989;
        if (arrayListM571 == null) {
            return null;
        }
        int size = arrayListM571.size();
        InterfaceC0867 interfaceC0867M572 = null;
        while (i2 < size) {
            Object obj2 = arrayListM571.get(i2);
            i2++;
            if (objM633 == null) {
                c0861 = null;
            } else if (objM633 instanceof Collection) {
                c0861 = new C0860((Collection) objM633, obj2, c0860);
            } else if (objM633 instanceof Map) {
                c0861 = new C0860((Map) objM633, obj2, c0860);
            } else if (objM633.getClass().isArray()) {
                c0861 = new C0860(new ArrayList(Arrays.asList(objM633)), obj2, c0860);
            } else {
                c0861 = null;
            }
            int i3 = c0739.f1931 + 1;
            c0739.f1931 = i3;
            c0739.f1932.add(i3, new ArrayList());
            interfaceC0867M572 = m572(c0861, c0750, i);
            if (interfaceC0867M572 != null && !c0750.f1987) {
                return interfaceC0867M572;
            }
            c0739.f1932.remove(c0739.f1931);
            c0739.f1931--;
        }
        return interfaceC0867M572;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m571(Object obj, boolean z, boolean z2, boolean z3) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Collection) && z) {
            return new ArrayList((Collection) obj);
        }
        if (obj.getClass().isArray() && z3) {
            return new ArrayList(Arrays.asList(obj));
        }
        if (!(obj instanceof Map) || !z2) {
            return null;
        }
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        arrayList.addAll(map.keySet());
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m570(Object obj, Class cls, String str) {
        if (cls == null || cls.equals(Object.class)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Field field : cls.getDeclaredFields()) {
            if (field.getType().equals(String.class)) {
                arrayList.add(field);
            }
        }
        for (Field field2 : (Field[]) arrayList.toArray(new Field[0])) {
            field2.setAccessible(true);
            try {
                String str2 = (String) field2.get(obj);
                if (str2 != null && Pattern.compile(str).matcher(str2).matches()) {
                    return str2;
                }
            } catch (Exception unused) {
            }
        }
        return m570(obj, cls.getSuperclass(), str);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m576(InterfaceC0867 interfaceC0867, Object obj, String str) {
        String str2 = this.f1740;
        if (interfaceC0867 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            StringBuilder sbM577 = AbstractC0688.m577("kuY=\n", "qMbiOPcz5cU=\n", sb, str);
            sbM577.append(StringFog.decrypt("tqcQmWETR8M=\n", "modm+A1mIuM=\n"));
            sbM577.append(((C0860) interfaceC0867).m633());
            AbstractC0509.m489(str2, sbM577.toString());
            return;
        }
        AbstractC0509.m489(str2, obj + StringFog.decrypt("eJQ=\n", "QrRD0l6N7pU=\n") + str);
    }
}
