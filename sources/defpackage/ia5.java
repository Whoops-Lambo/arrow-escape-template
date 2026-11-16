package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzwo;
import com.google.android.gms.internal.measurement.zzwq;
import com.google.android.gms.internal.measurement.zzws;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ia5 implements zzws {
    public final ia5 a;
    public final UUID b;
    public final String c;
    public final String d;
    public Thread e;

    /* JADX WARN: Code duplicated, block: B:134:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ed  */
    public final String toString() {
        int i;
        int i2;
        zzwo zzwoVar;
        Iterator it;
        fb5 fb5Var;
        int i3;
        gb5 gb5Var;
        AtomicReference atomicReference = zzvy.a;
        int i4 = 0;
        int length = 0;
        zzws zzwsVarZzb = this;
        while (zzwsVarZzb != null) {
            i4++;
            length += zzwsVarZzb.zze().length();
            zzwsVarZzb = zzwsVarZzb.zzb();
            if (zzwsVarZzb != null) {
                length += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            zzws zzwsVarZzb2 = this;
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                strArr[i5] = zzwsVarZzb2.zze();
                zzwsVarZzb2 = zzwsVarZzb2.zzb();
            }
            g31 g31VarD = i31.d();
            d03 it2 = q31.z(strArr).iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                g31VarD.b(it2.next(), Integer.valueOf(i6));
                i6++;
            }
            int i7 = 1;
            d42 d42VarA = g31VarD.a(true);
            int i8 = d42VarA.f;
            int i9 = i4 >> 2;
            if (i8 > i9) {
                zzwoVar = null;
            } else {
                int i10 = i4 + 1;
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i4; i11++) {
                    iArr[i11] = ((Integer) d42VarA.get(strArr[i11])).intValue();
                }
                iArr[i4] = i8;
                ib5 ib5Var = new ib5(iArr);
                int i12 = 0;
                while (true) {
                    int i13 = -1;
                    if (i12 >= i10) {
                        break;
                    }
                    ib5Var.f += i7;
                    int i14 = iArr[i12];
                    while (true) {
                        gb5 gb5Var2 = null;
                        while (true) {
                            if (ib5Var.f <= 0) {
                                i3 = i7;
                                break;
                            }
                            int i15 = ib5Var.e;
                            gb5Var = ib5Var.c;
                            i3 = i7;
                            if (i15 == 0) {
                                break;
                            }
                            int i16 = ((gb5) gb5Var.d.get(Integer.valueOf(iArr[ib5Var.d]))).a;
                            int i17 = ib5Var.e;
                            if (iArr[i16 + i17] == i14) {
                                if (gb5Var2 != null) {
                                    gb5Var2.c = ib5Var.c;
                                }
                                ib5Var.e = i17 + 1;
                                ib5Var.a();
                                break;
                            }
                            gb5 gb5Var3 = (gb5) ib5Var.c.d.get(Integer.valueOf(iArr[ib5Var.d]));
                            int i18 = gb5Var3.a;
                            int i19 = i13;
                            gb5 gb5Var4 = new gb5(i18, (ib5Var.e + i18) - 1);
                            ib5Var.c.d.put(Integer.valueOf(iArr[ib5Var.d]), gb5Var4);
                            int i20 = gb5Var4.b + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i20]);
                            HashMap map = gb5Var4.d;
                            map.put(numValueOf, gb5Var3);
                            gb5Var3.a = i20;
                            if (gb5Var2 != null) {
                                gb5Var2.c = gb5Var4;
                            }
                            map.put(Integer.valueOf(i14), new gb5(i12, 1073741824));
                            ib5Var.f--;
                            ib5Var.b();
                            gb5Var2 = gb5Var4;
                            i7 = i3;
                            i13 = i19;
                        }
                        HashMap map2 = gb5Var.d;
                        Integer numValueOf2 = Integer.valueOf(i14);
                        if (map2.containsKey(numValueOf2)) {
                            if (gb5Var2 != null) {
                                gb5Var2.c = ib5Var.c;
                            }
                            ib5Var.d = i12;
                            ib5Var.e++;
                            ib5Var.a();
                            break;
                        }
                        ib5Var.c.d.put(numValueOf2, new gb5(i12, 1073741824));
                        if (gb5Var2 != null) {
                            gb5Var2.c = ib5Var.c;
                        }
                        ib5Var.f += i13;
                        ib5Var.b();
                        i7 = i3;
                    }
                    i12++;
                    i7 = i3;
                }
                int i21 = i7;
                ArrayDeque arrayDeque = new ArrayDeque();
                gb5 gb5Var5 = ib5Var.b;
                fb5 fb5Var2 = new fb5(gb5Var5, 0, -1, -1);
                arrayDeque.push(fb5Var2);
                while (!arrayDeque.isEmpty()) {
                    fb5 fb5Var3 = (fb5) arrayDeque.pop();
                    Iterator it3 = fb5Var3.d.d.values().iterator();
                    while (it3.hasNext()) {
                        gb5 gb5Var6 = (gb5) it3.next();
                        int i22 = fb5Var3.b;
                        int i23 = fb5Var3.c;
                        int i24 = gb5Var6.a;
                        gb5 gb5Var7 = gb5Var5;
                        int i25 = gb5Var6.b;
                        if (ib5Var.d(i22, i23, i24, i25)) {
                            it = it3;
                        } else {
                            if (gb5Var6.d.isEmpty()) {
                                int i26 = gb5Var6.a;
                                it = it3;
                                if (ib5Var.d(i22, i23, i26, (i26 + i23) - i22)) {
                                }
                                if (fb5Var2.a < fb5Var.a) {
                                    fb5Var2 = fb5Var;
                                }
                                arrayDeque.push(fb5Var);
                                gb5Var5 = gb5Var7;
                                it3 = it;
                                i21 = 1;
                            } else {
                                it = it3;
                            }
                            fb5Var = new fb5(gb5Var6, i21, gb5Var6.a, i25);
                            if (fb5Var2.a < fb5Var.a) {
                                fb5Var2 = fb5Var;
                            }
                            arrayDeque.push(fb5Var);
                            gb5Var5 = gb5Var7;
                            it3 = it;
                            i21 = 1;
                        }
                        fb5Var = new fb5(gb5Var6, fb5Var3.a + i21, i22, i23);
                        if (fb5Var2.a < fb5Var.a) {
                            fb5Var2 = fb5Var;
                        }
                        arrayDeque.push(fb5Var);
                        gb5Var5 = gb5Var7;
                        it3 = it;
                        i21 = 1;
                    }
                    i21 = 1;
                }
                int iMin = Math.min(iArr.length, fb5Var2.c + 1);
                int i27 = 0;
                loop9: while (true) {
                    i = fb5Var2.b;
                    i2 = iMin - i;
                    gb5Var5 = (gb5) gb5Var5.d.get(Integer.valueOf(iArr[(i27 % i2) + i]));
                    if (gb5Var5 == null) {
                        break;
                    }
                    for (int i28 = gb5Var5.a; i28 < gb5Var5.b + 1 && i28 < iArr.length; i28++) {
                        if (iArr[(i27 % i2) + i] != iArr[i28]) {
                            break loop9;
                        }
                        i27++;
                    }
                }
                int i29 = i27 / i2;
                zzwo zzwoVar2 = new zzwo(i, iMin, i29);
                if (i2 * i29 < i9) {
                    zzwoVar = null;
                } else {
                    zzwoVar = zzwoVar2;
                }
            }
            String strConcat = "";
            if (zzwoVar != null) {
                int i30 = zzwoVar.a;
                String strConcat2 = i30 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i30))).concat(" -> ") : "";
                int i31 = zzwoVar.b;
                int i32 = zzwoVar.c;
                int i33 = ((i31 - i30) * i32) + i30;
                strConcat = i33 < i4 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i33, i4)))) : "";
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i30, i31));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i32 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        zzws zzwsVarZzb3 = this;
        while (zzwsVarZzb3 != null) {
            String strZze = zzwsVarZzb3.zze();
            length -= strZze.length();
            strZze.getChars(0, strZze.length(), cArr, length);
            zzwsVarZzb3 = zzwsVarZzb3.zzb();
            if (zzwsVarZzb3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final Thread zza() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzb() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final UUID zzc() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final String zzd() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final String zze() {
        return this.d;
    }

    public ia5(String str, ia5 ia5Var, zzwq zzwqVar) {
        this.d = str;
        this.a = ia5Var;
        this.b = ia5Var.b;
        this.c = ia5Var.c;
        this.e = Thread.currentThread();
    }

    public static String b(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzwq zzwqVarC = zzvy.c();
        zzws zzwsVar = zzwqVarC.b;
        String str = this.d;
        if (zzwsVar != null) {
            if (this == zzwsVar) {
                zzvy.b(zzwqVarC, zzwsVar.zzb());
                this.e = null;
                return;
            }
            String strZze = zzwsVar.zze();
            StringBuilder sb = new StringBuilder(str.length() + 79 + String.valueOf(strZze).length() + 1);
            q63.y(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", strZze);
            sb.append(UserDetailsUtils.UserDetailsLiterals.DOT);
            throw new qa5(sb.toString());
        }
        throw new oa5(jc1.o("Tried to end [", str, new StringBuilder(str.length() + 101), "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
    }

    public ia5(String str, UUID uuid, String str2, zzwq zzwqVar) {
        this.d = str;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        zzwqVar.getClass();
        this.e = Thread.currentThread();
    }
}
