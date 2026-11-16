package com.google.android.gms.internal.measurement;

import com.ironsource.C4664b4;
import defpackage.e32;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzyy extends zzabm implements zzabi {
    public final Object[] d;
    public final StringBuilder e;
    public int f;

    public static void b(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(zzzh.a(obj));
        sb.append(C4664b4.j.e);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0128  */
    /* JADX WARN: Code duplicated, block: B:108:0x012e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:64:0x0090  */
    public final void a(Object obj, zzyz zzyzVar, zzza zzzaVar) {
        String simpleName;
        zzza zzzaVar2;
        boolean zIsValidCodePoint;
        zzzb zzzbVar = zzyzVar.b;
        String string = zzyzVar.d;
        int iOrdinal = zzzbVar.ordinal();
        StringBuilder sb = this.e;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                b(sb, obj, string);
                return;
            }
        }
        int iOrdinal2 = zzyzVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                if (zzzaVar.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 5) {
                        if (zzzaVar.a()) {
                            zzzaVar2 = zzzaVar;
                        } else {
                            int i = zzzaVar.a;
                            int i2 = i & 128;
                            if (i2 == 0) {
                                zzzaVar2 = zzza.e;
                            } else if (i2 == i && zzzaVar.b == -1 && zzzaVar.c == -1) {
                                zzzaVar2 = zzzaVar;
                            } else {
                                zzzaVar2 = new zzza(i2, -1, -1);
                            }
                        }
                        if (zzzaVar2.equals(zzzaVar)) {
                            Number number = (Number) obj;
                            Locale locale = zzzh.a;
                            boolean zC = zzzaVar.c();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                zzzh.b(sb, jLongValue, zC);
                                return;
                            }
                            if (number instanceof Integer) {
                                zzzh.b(sb, jLongValue & 4294967295L, zC);
                                return;
                            }
                            if (number instanceof Byte) {
                                zzzh.b(sb, jLongValue & 255, zC);
                                return;
                            }
                            if (number instanceof Short) {
                                zzzh.b(sb, jLongValue & 65535, zC);
                                return;
                            }
                            if (!(number instanceof BigInteger)) {
                                e32.i("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                return;
                            }
                            String string2 = ((BigInteger) number).toString(16);
                            if (zC) {
                                string2 = string2.toUpperCase(zzzh.a);
                            }
                            sb.append(string2);
                            return;
                        }
                    }
                } else if (zzzaVar.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (zzzaVar.a()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = zzzh.a;
                int i3 = zzzaVar.a;
                int i4 = i3 & 162;
                if (i4 != 0) {
                    i4 = ((i3 & 32) == 0 ? 0 : 1) | ((i3 & 128) != 0 ? 2 : 0) | ((i3 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, zzzh.a);
                try {
                    formattable.formatTo(formatter, i4, zzzaVar.b, zzzaVar.c);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        appendableOut.append(zzzh.c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (zzzaVar.a()) {
                sb.append(zzzh.a(obj));
                return;
            }
        }
        if (!zzzaVar.a()) {
            int i5 = zzyzVar.a;
            if (zzzaVar.c()) {
                i5 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            zzzaVar.d(sb2);
            sb2.append((char) i5);
            string = sb2.toString();
        }
        sb.append(String.format(zzzh.a, string, obj));
    }

    public zzyy(zzaaf zzaafVar, Object[] objArr, StringBuilder sb) {
        super(zzaafVar);
        this.f = 0;
        this.d = objArr;
        this.e = sb;
    }
}
