package com.google.android.gms.internal.measurement;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.AdError;
import defpackage.jc1;
import defpackage.vu3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzas implements Iterable, zzao {
    public final String a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02d3 A[PHI: r8
  0x02d3: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02bf, B:101:0x02c1, B:103:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao a(String str, zzg zzgVar, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        zzg zzgVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || AppLovinEventTypes.USER_EXECUTED_SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                defpackage.d.r(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strZzc = AdError.UNDEFINED_DOMAIN;
        String str3 = this.a;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    zzh.a(1, "hasOwnProperty", arrayList);
                    zzao zzaoVarB = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
                    boolean zEquals = "length".equals(zzaoVarB.zzc());
                    zzaf zzafVar = zzao.j9;
                    if (zEquals) {
                        return zzafVar;
                    }
                    double dDoubleValue = zzaoVarB.zzd().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? zzao.k9 : zzafVar;
                }
                defpackage.d.r("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    zzh.a(0, "toString", arrayList);
                    return this;
                }
                defpackage.d.r("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    zzh.a(0, "toLocaleLowerCase", arrayList);
                    return new zzas(str3.toLowerCase());
                }
                defpackage.d.r("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    zzh.c("charAt", 1, arrayList);
                    int iH = arrayList.isEmpty() ? 0 : (int) zzh.h(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue());
                    return (iH < 0 || iH >= str3.length()) ? zzao.l9 : new zzas(String.valueOf(str3.charAt(iH)));
                }
                defpackage.d.r("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(zzgVar.b.b(zzgVar, (zzao) arrayList.get(i4)).zzc());
                        }
                        return new zzas(sb.toString());
                    }
                    return this;
                }
                defpackage.d.r("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    zzh.a(0, "toLowerCase", arrayList);
                    return new zzas(str3.toLowerCase(Locale.ENGLISH));
                }
                defpackage.d.r("Command not supported");
                return null;
            case -906336856:
                if (str.equals(AppLovinEventTypes.USER_EXECUTED_SEARCH)) {
                    zzh.c(AppLovinEventTypes.USER_EXECUTED_SEARCH, 1, arrayList);
                    if (!arrayList.isEmpty()) {
                        strZzc = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    }
                    Matcher matcher = Pattern.compile(strZzc).matcher(str3);
                    return matcher.find() ? new zzah(Double.valueOf(matcher.start())) : new zzah(Double.valueOf(-1.0d));
                }
                defpackage.d.r("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    zzh.a(0, "toLocaleUpperCase", arrayList);
                    return new zzas(str3.toUpperCase());
                }
                defpackage.d.r("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    zzh.c("lastIndexOf", 2, arrayList);
                    if (arrayList.size() > 0) {
                        strZzc = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    }
                    String str4 = strZzc;
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue();
                    return new zzah(Double.valueOf(str3.lastIndexOf(str4, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : zzh.h(dDoubleValue2)))));
                }
                defpackage.d.r("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    zzh.a(0, "toUpperCase", arrayList);
                    return new zzas(str3.toUpperCase(Locale.ENGLISH));
                }
                defpackage.d.r("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    zzh.a(0, "toUpperCase", arrayList);
                    return new zzas(str3.trim());
                }
                defpackage.d.r("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    zzh.c("match", 1, arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc()).matcher(str3);
                    return matcher2.find() ? new zzae(Arrays.asList(new zzas(matcher2.group()))) : zzao.f9;
                }
                defpackage.d.r("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    zzh.c("slice", 2, arrayList);
                    double dH = zzh.h(!arrayList.isEmpty() ? zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue() : 0.0d);
                    double dMax = dH < 0.0d ? Math.max(((double) str3.length()) + dH, 0.0d) : Math.min(dH, str3.length());
                    double dH2 = zzh.h(arrayList.size() > 1 ? zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new zzas(str3.substring(i5, Math.max(0, ((int) (dH2 < 0.0d ? Math.max(((double) str3.length()) + dH2, 0.0d) : Math.min(dH2, str3.length()))) - i5) + i5));
                }
                defpackage.d.r("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    zzh.c("split", 2, arrayList);
                    if (str3.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strZzc2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                        long jG = arrayList.size() > 1 ? ((long) zzh.g(zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue())) & 4294967295L : 2147483647L;
                        if (jG == 0) {
                            return new zzae();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strZzc2), ((int) jG) + 1);
                        int length = strArrSplit.length;
                        if (!strZzc2.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jG) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new zzas(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new zzae(arrayList2);
                }
                defpackage.d.r("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    zzh.c("substring", 2, arrayList);
                    int iH2 = !arrayList.isEmpty() ? (int) zzh.h(zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzd().doubleValue()) : 0;
                    int iH3 = arrayList.size() > 1 ? (int) zzh.h(zzgVar.b.b(zzgVar, (zzao) arrayList.get(1)).zzd().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iH2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iH3, 0), str3.length());
                    return new zzas(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                defpackage.d.r("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    zzh.c("replace", 2, arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    zzao zzaoVarB2 = zzao.e9;
                    if (!zIsEmpty2) {
                        strZzc = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            zzaoVarB2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
                        }
                    }
                    String str5 = strZzc;
                    int iIndexOf = str3.indexOf(str5);
                    if (iIndexOf >= 0) {
                        if (zzaoVarB2 instanceof zzai) {
                            zzaoVarB2 = ((zzai) zzaoVarB2).b(zzgVar, Arrays.asList(new zzas(str5), new zzah(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strZzc3 = zzaoVarB2.zzc();
                        String strSubstring2 = str3.substring(str5.length() + iIndexOf);
                        return new zzas(jc1.o(strSubstring, strZzc3, new StringBuilder(strSubstring.length() + String.valueOf(strZzc3).length() + strSubstring2.length()), strSubstring2));
                    }
                    return this;
                }
                defpackage.d.r("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    zzh.c("indexOf", 2, arrayList);
                    if (arrayList.size() <= 0) {
                        zzgVar2 = zzgVar;
                    } else {
                        zzgVar2 = zzgVar;
                        strZzc = zzgVar2.b.b(zzgVar2, (zzao) arrayList.get(0)).zzc();
                    }
                    return new zzah(Double.valueOf(str3.indexOf(strZzc, (int) zzh.h(arrayList.size() < 2 ? 0.0d : zzgVar2.b.b(zzgVar2, (zzao) arrayList.get(1)).zzd().doubleValue()))));
                }
                defpackage.d.r("Command not supported");
                return null;
            default:
                defpackage.d.r("Command not supported");
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.a.equals(((zzas) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new vu3(this, 1);
    }

    public final String toString() {
        String str = this.a;
        return jc1.o("\"", str, new StringBuilder(str.length() + 2), "\"");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new vu3(this, 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.a);
    }

    public zzas(String str) {
        if (str != null) {
            this.a = str;
        } else {
            defpackage.d.r("StringValue cannot be null.");
            throw null;
        }
    }
}
