package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.q63;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakl extends zzakg {
    public final String b;
    public final zzgzb c;

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:96:0x01aa A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x023d, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x023d, blocks: (B:81:0x015a, B:94:0x01a1, B:96:0x01aa, B:97:0x01b4, B:18:0x004e, B:20:0x0057, B:21:0x0061, B:113:0x01f8), top: B:124:0x0010 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzao
    public final void a(zzam zzamVar) {
        Integer numValueOf;
        String str = this.a;
        int iHashCode = str.hashCode();
        zzgzb zzgzbVar = this.c;
        try {
            switch (iHashCode) {
                case 82815:
                    if (!str.equals("TAL")) {
                    }
                    zzamVar.c = (CharSequence) zzgzbVar.get(0);
                    break;
                case 82878:
                    if (!str.equals("TCM")) {
                    }
                    zzamVar.s = (CharSequence) zzgzbVar.get(0);
                    break;
                case 82897:
                    if (!str.equals("TDA")) {
                    }
                    String str2 = (String) zzgzbVar.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    zzamVar.m = Integer.valueOf(i);
                    zzamVar.n = Integer.valueOf(i2);
                    break;
                case 83253:
                    if (!str.equals("TP1")) {
                    }
                    zzamVar.b = (CharSequence) zzgzbVar.get(0);
                    break;
                case 83254:
                    if (!str.equals("TP2")) {
                    }
                    zzamVar.d = (CharSequence) zzgzbVar.get(0);
                    break;
                case 83255:
                    if (!str.equals("TP3")) {
                    }
                    zzamVar.t = (CharSequence) zzgzbVar.get(0);
                    break;
                case 83341:
                    if (!str.equals("TRK")) {
                    }
                    String str3 = (String) zzgzbVar.get(0);
                    String str4 = zzfq.a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    zzamVar.h = Integer.valueOf(i3);
                    zzamVar.i = numValueOf;
                    break;
                case 83378:
                    if (!str.equals("TT2")) {
                    }
                    zzamVar.a = (CharSequence) zzgzbVar.get(0);
                    break;
                case 83536:
                    if (!str.equals("TXT")) {
                    }
                    zzamVar.r = (CharSequence) zzgzbVar.get(0);
                    break;
                case 83552:
                    if (!str.equals("TYE")) {
                    }
                    zzamVar.l = Integer.valueOf(Integer.parseInt((String) zzgzbVar.get(0)));
                    break;
                case 2567331:
                    if (!str.equals("TALB")) {
                    }
                    zzamVar.c = (CharSequence) zzgzbVar.get(0);
                    break;
                case 2569357:
                    if (!str.equals("TCOM")) {
                    }
                    zzamVar.s = (CharSequence) zzgzbVar.get(0);
                    break;
                case 2569358:
                    if (str.equals("TCON")) {
                        Integer numF = zzhcr.f((String) zzgzbVar.get(0));
                        if (numF != null) {
                            String strA = zzakh.a(numF.intValue());
                            if (strA != null) {
                                zzamVar.x = strA;
                            }
                        } else {
                            zzamVar.x = (CharSequence) zzgzbVar.get(0);
                        }
                    }
                    break;
                case 2569891:
                    if (!str.equals("TDAT")) {
                    }
                    String str5 = (String) zzgzbVar.get(0);
                    int i4 = Integer.parseInt(str5.substring(2, 4));
                    int i5 = Integer.parseInt(str5.substring(0, 2));
                    zzamVar.m = Integer.valueOf(i4);
                    zzamVar.n = Integer.valueOf(i5);
                    break;
                case 2570401:
                    if (str.equals("TDRC")) {
                        ArrayList arrayListB = b((String) zzgzbVar.get(0));
                        int size = arrayListB.size();
                        if (size != 1) {
                            if (size != 2) {
                                if (size == 3) {
                                    zzamVar.n = (Integer) arrayListB.get(2);
                                }
                            }
                            zzamVar.m = (Integer) arrayListB.get(1);
                        }
                        zzamVar.l = (Integer) arrayListB.get(0);
                    }
                    break;
                case 2570410:
                    if (str.equals("TDRL")) {
                        ArrayList arrayListB2 = b((String) zzgzbVar.get(0));
                        int size2 = arrayListB2.size();
                        if (size2 != 1) {
                            if (size2 != 2) {
                                if (size2 == 3) {
                                    zzamVar.q = (Integer) arrayListB2.get(2);
                                }
                            }
                            zzamVar.p = (Integer) arrayListB2.get(1);
                        }
                        zzamVar.o = (Integer) arrayListB2.get(0);
                    }
                    break;
                case 2571565:
                    if (!str.equals("TEXT")) {
                    }
                    zzamVar.r = (CharSequence) zzgzbVar.get(0);
                    break;
                case 2575251:
                    if (!str.equals("TIT2")) {
                    }
                    zzamVar.a = (CharSequence) zzgzbVar.get(0);
                    break;
                case 2581512:
                    if (!str.equals("TPE1")) {
                    }
                    zzamVar.b = (CharSequence) zzgzbVar.get(0);
                    break;
                case 2581513:
                    if (!str.equals("TPE2")) {
                    }
                    zzamVar.d = (CharSequence) zzgzbVar.get(0);
                    break;
                case 2581514:
                    if (!str.equals("TPE3")) {
                    }
                    zzamVar.t = (CharSequence) zzgzbVar.get(0);
                    break;
                case 2581856:
                    if (str.equals("TPOS")) {
                        String str6 = (String) zzgzbVar.get(0);
                        String str7 = zzfq.a;
                        String[] strArrSplit2 = str6.split("/", -1);
                        int i6 = Integer.parseInt(strArrSplit2[0]);
                        numValueOf = strArrSplit2.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit2[1])) : null;
                        zzamVar.v = Integer.valueOf(i6);
                        zzamVar.w = numValueOf;
                    }
                    break;
                case 2583398:
                    if (!str.equals("TRCK")) {
                    }
                    String str8 = (String) zzgzbVar.get(0);
                    String str9 = zzfq.a;
                    String[] strArrSplit3 = str8.split("/", -1);
                    int i7 = Integer.parseInt(strArrSplit3[0]);
                    if (strArrSplit3.length > 1) {
                    }
                    zzamVar.h = Integer.valueOf(i7);
                    zzamVar.i = numValueOf;
                    break;
                case 2584864:
                    if (str.equals("TSST")) {
                        zzamVar.u = (CharSequence) zzgzbVar.get(0);
                    }
                    break;
                case 2590194:
                    if (!str.equals("TYER")) {
                    }
                    zzamVar.l = Integer.valueOf(Integer.parseInt((String) zzgzbVar.get(0)));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzakl.class != obj.getClass()) {
            return false;
        }
        zzakl zzaklVar = (zzakl) obj;
        return this.a.equals(zzaklVar.a) && Objects.equals(this.b, zzaklVar.b) && this.c.equals(zzaklVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.b;
        return this.c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String str = this.a;
        int length = str.length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        q63.y(sb, str, ": description=", str2, ": values=");
        sb.append(strValueOf);
        return sb.toString();
    }

    public zzakl(String str, String str2, w wVar) {
        super(str);
        zzgvz.a(!wVar.isEmpty());
        this.b = str2;
        zzgzb zzgzbVarB = zzgzb.B(wVar);
        this.c = zzgzbVarB;
    }
}
