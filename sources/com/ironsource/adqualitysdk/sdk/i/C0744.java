package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ย, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class C0744 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public ArrayList f1937;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public C0761 f1938;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public C0751 f1939;

    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m593(Class cls, C0751 c0751, ArrayList arrayList) {
        Field[] fields;
        boolean z;
        boolean z2;
        C0761 c0761 = c0751.f1992;
        if (c0761 == null || !(z2 = c0761.f4016)) {
            try {
                fields = cls.getDeclaredFields();
            } catch (Error unused) {
                fields = cls.getFields();
            }
        } else {
            fields = m594(cls, z2, c0761.f4015, null);
        }
        for (Field field : fields) {
            if (c0751.f1992 != null) {
                int modifiers = field.getModifiers();
                int i = c0751.f1992.f4014;
                if ((modifiers & i) == i) {
                    int modifiers2 = field.getModifiers();
                    C0761 c0762 = c0751.f1992;
                    if ((modifiers2 & c0762.f4013) == 0 && !c0762.f2008.contains(field.getType())) {
                        C0761 c0763 = c0751.f1992;
                        if (c0763.f2009 ? field.getType().equals(c0751.f1992.f2011) : c0763.f2011.isAssignableFrom(field.getType())) {
                            int i2 = c0751.f1991;
                            if (i2 == 0) {
                                z = true;
                            } else {
                                c0751.f1991 = i2 - 1;
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                field.setAccessible(true);
                arrayList.add(field);
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Field m595(Class cls, C0761 c0761) {
        synchronized (AbstractC0388.class) {
            try {
                if (this.f1937 == null) {
                    this.f1937 = new ArrayList();
                }
                this.f1937.clear();
                m597(cls, c0761, this.f1937);
                if (this.f1937.isEmpty()) {
                    return null;
                }
                return (Field) this.f1937.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m597(Class cls, C0761 c0761, ArrayList arrayList) {
        synchronized (C0744.class) {
            try {
                if (this.f1939 == null) {
                    this.f1939 = new C0751();
                }
                C0751 c0751 = this.f1939;
                c0751.f1992 = c0761;
                c0751.f1991 = c0761.f2010;
                m593(cls, c0751, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Field[] m594(Class cls, boolean z, int i, List list) {
        while (cls != null && !AbstractC0951.m735(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArr = new Field[0];
        if (cls == null) {
            return fieldArr;
        }
        Field[] declaredFields = new Field[0];
        Field[] fields = new Field[0];
        try {
            declaredFields = cls.getDeclaredFields();
        } catch (Error unused) {
        }
        try {
            fields = cls.getFields();
        } catch (Error unused2) {
        }
        String str = AbstractC0951.f2572;
        int length = declaredFields.length;
        int length2 = fields.length;
        Field[] fieldArr2 = new Field[length + length2];
        System.arraycopy(declaredFields, 0, fieldArr2, 0, length);
        System.arraycopy(fields, 0, fieldArr2, length, length2);
        if (!z) {
            return fieldArr2;
        }
        Class superclass = cls.getSuperclass();
        for (int i2 = 0; superclass != null && i2 != i; i2++) {
            try {
                Field[] declaredFields2 = superclass.getDeclaredFields();
                int length3 = fieldArr2.length;
                int length4 = declaredFields2.length;
                Field[] fieldArr3 = new Field[length3 + length4];
                System.arraycopy(fieldArr2, 0, fieldArr3, 0, length3);
                System.arraycopy(declaredFields2, 0, fieldArr3, length3, length4);
                fieldArr2 = fieldArr3;
            } catch (Error unused3) {
            }
            try {
                Field[] fields2 = superclass.getFields();
                int length5 = fieldArr2.length;
                int length6 = fields2.length;
                Field[] fieldArr4 = new Field[length5 + length6];
                System.arraycopy(fieldArr2, 0, fieldArr4, 0, length5);
                System.arraycopy(fields2, 0, fieldArr4, length5, length6);
                fieldArr2 = fieldArr4;
            } catch (Error unused4) {
            }
            superclass = superclass.getSuperclass();
        }
        return fieldArr2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Field m596(Class cls, Class cls2) {
        Field fieldM595;
        synchronized (AbstractC0388.class) {
            try {
                if (this.f1938 == null) {
                    this.f1938 = new C0761();
                }
                C0761 c0761 = this.f1938;
                c0761.f2011 = cls2;
                fieldM595 = m595(cls, c0761);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fieldM595;
    }
}
