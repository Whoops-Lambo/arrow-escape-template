package defpackage;

import com.singular.sdk.internal.UserDetailsUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class vn2 {
    /* JADX WARN: Code duplicated, block: B:101:0x0223  */
    /* JADX WARN: Code duplicated, block: B:103:0x0227  */
    /* JADX WARN: Code duplicated, block: B:104:0x022c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0236  */
    /* JADX WARN: Code duplicated, block: B:110:0x024f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0259  */
    /* JADX WARN: Code duplicated, block: B:113:0x0266  */
    /* JADX WARN: Code duplicated, block: B:115:0x0270  */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:118:0x0279  */
    /* JADX WARN: Code duplicated, block: B:120:0x0285  */
    /* JADX WARN: Code duplicated, block: B:122:0x028f  */
    /* JADX WARN: Code duplicated, block: B:123:0x029c  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:128:0x02af  */
    /* JADX WARN: Code duplicated, block: B:130:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:134:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:142:0x0303  */
    /* JADX WARN: Code duplicated, block: B:144:0x0307  */
    /* JADX WARN: Code duplicated, block: B:145:0x030c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0319  */
    /* JADX WARN: Code duplicated, block: B:149:0x0323  */
    /* JADX WARN: Code duplicated, block: B:151:0x0345  */
    /* JADX WARN: Code duplicated, block: B:153:0x038f  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:157:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:159:0x03cf A[ALLOW_MULTIPLE_INSNS_LOOP_COND, LOOP:4: B:159:0x03cf->B:161:0x03d4, LOOP_START, PHI: r4
  0x03cf: PHI (r4v18 int) = (r4v14 int), (r4v19 int) binds: [B:158:0x03cd, B:161:0x03d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:161:0x03d4 A[LOOP:4: B:159:0x03cf->B:161:0x03d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:169:0x041e  */
    /* JADX WARN: Code duplicated, block: B:171:0x042e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0432  */
    /* JADX WARN: Code duplicated, block: B:174:0x0437  */
    /* JADX WARN: Code duplicated, block: B:176:0x044a  */
    /* JADX WARN: Code duplicated, block: B:178:0x045a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0467  */
    /* JADX WARN: Code duplicated, block: B:181:0x0477  */
    /* JADX WARN: Code duplicated, block: B:183:0x047b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0480  */
    /* JADX WARN: Code duplicated, block: B:186:0x0493  */
    /* JADX WARN: Code duplicated, block: B:188:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:190:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:191:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:193:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:195:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:197:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:198:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:200:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:202:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:204:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:205:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:207:0x050b  */
    /* JADX WARN: Code duplicated, block: B:209:0x051b  */
    /* JADX WARN: Code duplicated, block: B:211:0x051f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0524  */
    /* JADX WARN: Code duplicated, block: B:214:0x0537  */
    /* JADX WARN: Code duplicated, block: B:216:0x0547  */
    /* JADX WARN: Code duplicated, block: B:218:0x054b  */
    /* JADX WARN: Code duplicated, block: B:219:0x0550  */
    /* JADX WARN: Code duplicated, block: B:222:0x0560  */
    /* JADX WARN: Code duplicated, block: B:225:0x056e  */
    /* JADX WARN: Code duplicated, block: B:227:0x057e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0582  */
    /* JADX WARN: Code duplicated, block: B:230:0x0587  */
    /* JADX WARN: Code duplicated, block: B:232:0x0599  */
    /* JADX WARN: Code duplicated, block: B:234:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:236:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:237:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:239:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:240:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:242:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:267:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0563 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x05d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x0105  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0159  */
    /* JADX WARN: Code duplicated, block: B:61:0x0161  */
    /* JADX WARN: Code duplicated, block: B:63:0x0165  */
    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x0181  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x0201  */
    /* JADX WARN: Code duplicated, block: B:96:0x0205  */
    /* JADX WARN: Code duplicated, block: B:97:0x020a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0219  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static mn2 a(String str, mn2 mn2Var) throws Throwable {
        h82 h82Var;
        List<String> list;
        wi wiVarA;
        Integer numValueOf;
        int iIntValue;
        String strSubstring;
        int i;
        String str2;
        int iIntValue2;
        int iIntValue3;
        yj2 yj2Var;
        int iA;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        int iIntValue7;
        int iIntValue8;
        int iIntValue9;
        e12 e12Var;
        int iA2;
        int i2;
        int i3;
        d12 d12Var;
        int i4;
        int i5;
        int iA3;
        int i6;
        boolean zEquals;
        int i7;
        int i8;
        int iA4;
        e12 e12Var2;
        int i9;
        int iA5;
        int iIntValue10;
        int iIntValue11;
        int iIntValue12;
        int iIntValue13;
        int iIntValue14;
        int iIntValue15;
        int iIntValue16;
        int iIntValue17;
        int iIntValue18;
        int iIntValue19;
        l7 l7VarA;
        int i10;
        str.getClass();
        mn2Var.getClass();
        int i11 = mn2Var.g;
        if (i11 != 2) {
            throw new a60(pv1.k(i11, "Unable TCF String with version "));
        }
        int i12 = 0;
        int i13 = 6;
        List listN0 = dk2.n0(str, new String[]{UserDetailsUtils.UserDetailsLiterals.DOT}, 0, 6);
        int size = listN0.size();
        int i14 = 0;
        mn2 mn2Var2 = null;
        while (i14 < size) {
            String str3 = (String) listN0.get(i14);
            nh nhVar = oh.Companion;
            String strValueOf = String.valueOf(str3.charAt(i12));
            nhVar.getClass();
            String strSubstring2 = nh.a(strValueOf).substring(i12, 3);
            m82.Companion.getClass();
            List list2 = m82.a;
            e71.Companion.getClass();
            String str4 = ((h82) list2.get((int) d71.a(3, strSubstring2))).a;
            k82.Companion.getClass();
            String strA = nh.a(str3);
            if (str4.equals("core")) {
                mn2Var.g = (int) d71.a(i13, strA.substring(i12, i13));
            }
            int iIntValue20 = str4.equals("core") ? i12 : 3;
            o92 o92Var = (o92) k82.a.b;
            o92Var.getClass();
            Map map = o92Var.a;
            h82.Companion.getClass();
            switch (str4.hashCode()) {
                case -614130325:
                    if (!str4.equals("publisherTC")) {
                        throw new Throwable("Invalid Value for Segment Type: ".concat(str4));
                    }
                    h82Var = h82.PUBLISHER_TC;
                    list = (List) map.get(h82Var);
                    if (list != null) {
                        e32.i("Unable to find fieldSequence");
                        return null;
                    }
                    for (String str5 : list) {
                        wi.Companion.getClass();
                        wiVarA = vi.a(str5);
                        if (wiVarA != null) {
                            numValueOf = Integer.valueOf(wiVarA.a);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf == null) {
                            k82.Companion.getClass();
                            if (j82.a(str5)) {
                                numValueOf = Integer.valueOf(mn2Var.b().a);
                            }
                        }
                        if (numValueOf == null && numValueOf.intValue() == 0) {
                            listN0 = listN0;
                            size = size;
                            i = i14;
                            str2 = strA;
                        } else {
                            if (numValueOf == null) {
                                iIntValue = strA.length();
                            } else {
                                iIntValue = numValueOf.intValue() + iIntValue20;
                            }
                            strSubstring = strA.substring(iIntValue20, iIntValue);
                            switch (str5.hashCode()) {
                                case -2115730175:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("vendorConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.y = f53.a(strSubstring);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -2076485454:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("cmpVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue2 = numValueOf.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    d71Var.getClass();
                                    mn2Var.d(new yj2((int) d71.a(iIntValue2, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -2014745908:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("numCustomPurposes")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var2 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue3 = numValueOf.intValue();
                                    } else {
                                        iIntValue3 = 0;
                                    }
                                    d71Var2.getClass();
                                    iA = (int) d71.a(iIntValue3, strSubstring);
                                    yj2Var = new yj2(iA);
                                    if (iA >= 0) {
                                        throw new nn2("numCustomPurposes", yj2Var, null, 4, null);
                                    }
                                    mn2Var.n = iA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -1710804154:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("policyVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var3 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue4 = numValueOf.intValue();
                                    } else {
                                        iIntValue4 = 0;
                                    }
                                    d71Var3.getClass();
                                    mn2Var.f(new yj2((int) d71.a(iIntValue4, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -879778089:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("purposeConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue5 = numValueOf.intValue();
                                    } else {
                                        iIntValue5 = 0;
                                    }
                                    Integer numValueOf2 = Integer.valueOf(iIntValue5);
                                    mo0Var.getClass();
                                    mn2Var.r = mo0.a(strSubstring, numValueOf2);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -740692217:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("publisherCountryCode")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    sc1 sc1Var = tc1.Companion;
                                    if (numValueOf != null) {
                                        iIntValue6 = numValueOf.intValue();
                                    } else {
                                        iIntValue6 = 0;
                                    }
                                    sc1Var.getClass();
                                    mn2Var.g(sc1.a(iIntValue6, strSubstring));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -442009786:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("publisherCustomConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var2 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue7 = numValueOf.intValue();
                                    } else {
                                        iIntValue7 = 0;
                                    }
                                    Integer numValueOf3 = Integer.valueOf(iIntValue7);
                                    mo0Var2.getClass();
                                    mn2Var.v = mo0.a(strSubstring, numValueOf3);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -145526490:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("consentScreen")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var4 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue8 = numValueOf.intValue();
                                    } else {
                                        iIntValue8 = 0;
                                    }
                                    d71Var4.getClass();
                                    mn2Var.e(new yj2((int) d71.a(iIntValue8, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -117505923:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("isServiceSpecific")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.c = strSubstring.equals("1");
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 94785793:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("cmpId")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var5 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue9 = numValueOf.intValue();
                                    } else {
                                        iIntValue9 = 0;
                                    }
                                    d71Var5.getClass();
                                    mn2Var.c(new yj2((int) d71.a(iIntValue9, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 204489283:
                                    size = size;
                                    if (str5.equals("publisherRestrictions")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g12.Companion.getClass();
                                    e12 e12Var3 = new e12();
                                    d71 d71Var6 = e71.Companion;
                                    listN0 = listN0;
                                    String strSubstring3 = strSubstring.substring(i12, 12);
                                    d71Var6.getClass();
                                    e12Var = e12Var3;
                                    iA2 = (int) d71.a(12, strSubstring3);
                                    i2 = 12;
                                    i3 = 0;
                                    while (i3 < iA2) {
                                        d71 d71Var7 = e71.Companion;
                                        int i15 = i2 + 6;
                                        String strSubstring4 = strSubstring.substring(i2, i15);
                                        d71Var7.getClass();
                                        int i16 = iA2;
                                        int i17 = i14;
                                        int iA6 = (int) d71.a(6, strSubstring4);
                                        int i18 = i2 + 8;
                                        int iA7 = (int) d71.a(2, strSubstring.substring(i15, i18));
                                        Integer numValueOf4 = Integer.valueOf(iA6);
                                        g52.Companion.getClass();
                                        d12Var = new d12(numValueOf4, f52.a(iA7));
                                        i4 = i2 + 20;
                                        String strSubstring5 = strSubstring.substring(i18, i4);
                                        i5 = i3;
                                        iA3 = (int) d71.a(12, strSubstring5);
                                        i6 = 0;
                                        while (i6 < iA3) {
                                            pj pjVar = qj.Companion;
                                            int i19 = i2 + 1;
                                            int i20 = iA3;
                                            String strSubstring6 = strSubstring.substring(i2, i19);
                                            pjVar.getClass();
                                            zEquals = strSubstring6.equals("1");
                                            d71 d71Var8 = e71.Companion;
                                            i7 = i2 + 17;
                                            String strSubstring7 = strSubstring.substring(i19, i7);
                                            d71Var8.getClass();
                                            int i21 = i6;
                                            i8 = i2;
                                            iA4 = (int) d71.a(16, strSubstring7);
                                            if (zEquals) {
                                                i9 = i8 + 33;
                                                iA5 = (int) d71.a(16, strSubstring.substring(i7, i9));
                                                if (iA5 >= iA4) {
                                                    i2 = i4;
                                                    throw new a60(nj.i(iA5, iA4, "Invalid RangeEntry: endVendorId ", " is less than "));
                                                }
                                                e12Var2 = e12Var;
                                                if (iA4 <= iA5) {
                                                    while (true) {
                                                        i2 = i4;
                                                        e12Var2.a(iA4, d12Var);
                                                        if (iA4 != iA5) {
                                                            iA4++;
                                                        }
                                                    }
                                                }
                                                i2 = i4;
                                                i2 = i9;
                                            } else {
                                                i2 = i4;
                                                e12Var2 = e12Var;
                                                e12Var2.a(iA4, d12Var);
                                                i2 = i7;
                                            }
                                            e12Var = e12Var2;
                                            strA = strA;
                                            i5 = i5;
                                            i6 = i21 + 1;
                                            iA3 = i20;
                                        }
                                        i2 = i4;
                                        int i22 = i5 + 1;
                                        i14 = i17;
                                        i3 = i22;
                                        iA2 = i16;
                                    }
                                    i = i14;
                                    str2 = strA;
                                    e12 e12Var4 = e12Var;
                                    e12Var4.a = i2;
                                    mn2Var.C = e12Var4;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 351608024:
                                    if (str5.equals("version")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var9 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue10 = numValueOf.intValue();
                                    } else {
                                        iIntValue10 = i12;
                                    }
                                    d71Var9.getClass();
                                    mn2Var.g = (int) d71.a(iIntValue10, strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 439958894:
                                    if (str5.equals("useNonStandardStacks")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.d = strSubstring.equals("1");
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 501667126:
                                    if (str5.equals("purposeLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var3 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue11 = numValueOf.intValue();
                                    } else {
                                        iIntValue11 = i12;
                                    }
                                    Integer numValueOf5 = Integer.valueOf(iIntValue11);
                                    mo0Var3.getClass();
                                    mn2Var.s = mo0.a(strSubstring, numValueOf5);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 544050613:
                                    if (str5.equals("publisherConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var4 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue12 = numValueOf.intValue();
                                    } else {
                                        iIntValue12 = i12;
                                    }
                                    Integer numValueOf6 = Integer.valueOf(iIntValue12);
                                    mo0Var4.getClass();
                                    mn2Var.t = mo0.a(strSubstring, numValueOf6);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 568283376:
                                    if (str5.equals("purposeOneTreatment")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.e = strSubstring.equals("1");
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 680983954:
                                    if (str5.equals("consentLanguage")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    sc1 sc1Var2 = tc1.Companion;
                                    if (numValueOf != null) {
                                        iIntValue13 = numValueOf.intValue();
                                    } else {
                                        iIntValue13 = i12;
                                    }
                                    sc1Var2.getClass();
                                    mn2Var.j = sc1.a(iIntValue13, strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1000364236:
                                    if (str5.equals("vendorLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.z = f53.a(strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1028554472:
                                    if (str5.equals("created")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    l50 l50Var = m50.Companion;
                                    if (numValueOf != null) {
                                        iIntValue14 = numValueOf.intValue();
                                    } else {
                                        iIntValue14 = i12;
                                    }
                                    l50Var.getClass();
                                    if (iIntValue14 == strSubstring.length()) {
                                        throw new a60("Invalid bit length");
                                    }
                                    e71.Companion.getClass();
                                    mn2Var.o = Long.valueOf(d71.a(iIntValue14, strSubstring) * 100);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1272166759:
                                    if (str5.equals("publisherCustomLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var5 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue15 = numValueOf.intValue();
                                    } else {
                                        iIntValue15 = i12;
                                    }
                                    Integer numValueOf7 = Integer.valueOf(iIntValue15);
                                    mo0Var5.getClass();
                                    mn2Var.w = mo0.a(strSubstring, numValueOf7);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1401591704:
                                    if (str5.equals("publisherLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var6 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue16 = numValueOf.intValue();
                                    } else {
                                        iIntValue16 = i12;
                                    }
                                    Integer numValueOf8 = Integer.valueOf(iIntValue16);
                                    mo0Var6.getClass();
                                    mn2Var.u = mo0.a(strSubstring, numValueOf8);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1649733957:
                                    if (str5.equals("lastUpdated")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    l50 l50Var2 = m50.Companion;
                                    if (numValueOf != null) {
                                        iIntValue17 = numValueOf.intValue();
                                    } else {
                                        iIntValue17 = i12;
                                    }
                                    l50Var2.getClass();
                                    if (iIntValue17 == strSubstring.length()) {
                                        throw new a60("Invalid bit length");
                                    }
                                    e71.Companion.getClass();
                                    mn2Var.p = Long.valueOf(d71.a(iIntValue17, strSubstring) * 100);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1722227698:
                                    if (str5.equals("vendorListVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var10 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue18 = numValueOf.intValue();
                                    } else {
                                        iIntValue18 = i12;
                                    }
                                    d71Var10.getClass();
                                    mn2Var.h(new yj2((int) d71.a(iIntValue18, strSubstring)));
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1886388920:
                                    if (str5.equals("specialFeatureOptins")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var7 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue19 = numValueOf.intValue();
                                    } else {
                                        iIntValue19 = i12;
                                    }
                                    Integer numValueOf9 = Integer.valueOf(iIntValue19);
                                    mo0Var7.getClass();
                                    mn2Var.q = mo0.a(strSubstring, numValueOf9);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1982848911:
                                    if (str5.equals("vendorsDisclosed")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.A = f53.a(strSubstring);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1995874045:
                                    if (str5.equals("vendorsAllowed")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.B = f53.a(strSubstring);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                default:
                                    throw new a60("Unable to set decoded version of the key: ".concat(str5));
                            }
                        }
                        i14 = i;
                        listN0 = listN0;
                        size = size;
                        strA = str2;
                        i12 = 0;
                    }
                    i14++;
                    mn2Var2 = mn2Var;
                    i12 = 0;
                    i13 = 6;
                    break;
                    break;
                case 3059615:
                    if (!str4.equals("core")) {
                        throw new Throwable("Invalid Value for Segment Type: ".concat(str4));
                    }
                    h82Var = h82.CORE;
                    list = (List) map.get(h82Var);
                    if (list != null) {
                        e32.i("Unable to find fieldSequence");
                        return null;
                    }
                    while (r9.hasNext()) {
                        wi.Companion.getClass();
                        wiVarA = vi.a(str5);
                        if (wiVarA != null) {
                            numValueOf = Integer.valueOf(wiVarA.a);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf == null) {
                            k82.Companion.getClass();
                            if (j82.a(str5)) {
                                numValueOf = Integer.valueOf(mn2Var.b().a);
                            }
                        }
                        if (numValueOf == null) {
                            if (numValueOf == null) {
                                iIntValue = strA.length();
                            } else {
                                iIntValue = numValueOf.intValue() + iIntValue20;
                            }
                            strSubstring = strA.substring(iIntValue20, iIntValue);
                            switch (str5.hashCode()) {
                                case -2115730175:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("vendorConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.y = f53.a(strSubstring);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -2076485454:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("cmpVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var11 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue2 = numValueOf.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    d71Var11.getClass();
                                    mn2Var.d(new yj2((int) d71.a(iIntValue2, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -2014745908:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("numCustomPurposes")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var12 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue3 = numValueOf.intValue();
                                    } else {
                                        iIntValue3 = 0;
                                    }
                                    d71Var12.getClass();
                                    iA = (int) d71.a(iIntValue3, strSubstring);
                                    yj2Var = new yj2(iA);
                                    if (iA >= 0) {
                                        throw new nn2("numCustomPurposes", yj2Var, null, 4, null);
                                    }
                                    mn2Var.n = iA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -1710804154:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("policyVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var13 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue4 = numValueOf.intValue();
                                    } else {
                                        iIntValue4 = 0;
                                    }
                                    d71Var13.getClass();
                                    mn2Var.f(new yj2((int) d71.a(iIntValue4, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -879778089:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("purposeConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var8 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue5 = numValueOf.intValue();
                                    } else {
                                        iIntValue5 = 0;
                                    }
                                    Integer numValueOf10 = Integer.valueOf(iIntValue5);
                                    mo0Var8.getClass();
                                    mn2Var.r = mo0.a(strSubstring, numValueOf10);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -740692217:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("publisherCountryCode")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    sc1 sc1Var3 = tc1.Companion;
                                    if (numValueOf != null) {
                                        iIntValue6 = numValueOf.intValue();
                                    } else {
                                        iIntValue6 = 0;
                                    }
                                    sc1Var3.getClass();
                                    mn2Var.g(sc1.a(iIntValue6, strSubstring));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -442009786:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("publisherCustomConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var9 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue7 = numValueOf.intValue();
                                    } else {
                                        iIntValue7 = 0;
                                    }
                                    Integer numValueOf11 = Integer.valueOf(iIntValue7);
                                    mo0Var9.getClass();
                                    mn2Var.v = mo0.a(strSubstring, numValueOf11);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -145526490:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("consentScreen")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var14 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue8 = numValueOf.intValue();
                                    } else {
                                        iIntValue8 = 0;
                                    }
                                    d71Var14.getClass();
                                    mn2Var.e(new yj2((int) d71.a(iIntValue8, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -117505923:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("isServiceSpecific")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.c = strSubstring.equals("1");
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 94785793:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("cmpId")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var15 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue9 = numValueOf.intValue();
                                    } else {
                                        iIntValue9 = 0;
                                    }
                                    d71Var15.getClass();
                                    mn2Var.c(new yj2((int) d71.a(iIntValue9, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 204489283:
                                    size = size;
                                    if (str5.equals("publisherRestrictions")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g12.Companion.getClass();
                                    e12 e12Var5 = new e12();
                                    d71 d71Var16 = e71.Companion;
                                    listN0 = listN0;
                                    String strSubstring8 = strSubstring.substring(i12, 12);
                                    d71Var16.getClass();
                                    e12Var = e12Var5;
                                    iA2 = (int) d71.a(12, strSubstring8);
                                    i2 = 12;
                                    i3 = 0;
                                    while (i3 < iA2) {
                                        d71 d71Var17 = e71.Companion;
                                        int i110 = i2 + 6;
                                        String strSubstring9 = strSubstring.substring(i2, i110);
                                        d71Var17.getClass();
                                        int i111 = iA2;
                                        int i112 = i14;
                                        int iA8 = (int) d71.a(6, strSubstring9);
                                        int i113 = i2 + 8;
                                        int iA9 = (int) d71.a(2, strSubstring.substring(i110, i113));
                                        Integer numValueOf12 = Integer.valueOf(iA8);
                                        g52.Companion.getClass();
                                        d12Var = new d12(numValueOf12, f52.a(iA9));
                                        i4 = i2 + 20;
                                        String strSubstring10 = strSubstring.substring(i113, i4);
                                        i5 = i3;
                                        iA3 = (int) d71.a(12, strSubstring10);
                                        i6 = 0;
                                        while (i6 < iA3) {
                                            pj pjVar2 = qj.Companion;
                                            int i114 = i2 + 1;
                                            int i23 = iA3;
                                            String strSubstring11 = strSubstring.substring(i2, i114);
                                            pjVar2.getClass();
                                            zEquals = strSubstring11.equals("1");
                                            d71 d71Var18 = e71.Companion;
                                            i7 = i2 + 17;
                                            String strSubstring12 = strSubstring.substring(i114, i7);
                                            d71Var18.getClass();
                                            int i24 = i6;
                                            i8 = i2;
                                            iA4 = (int) d71.a(16, strSubstring12);
                                            if (zEquals) {
                                                i9 = i8 + 33;
                                                iA5 = (int) d71.a(16, strSubstring.substring(i7, i9));
                                                if (iA5 >= iA4) {
                                                    i2 = i4;
                                                    throw new a60(nj.i(iA5, iA4, "Invalid RangeEntry: endVendorId ", " is less than "));
                                                }
                                                e12Var2 = e12Var;
                                                if (iA4 <= iA5) {
                                                    while (true) {
                                                        i2 = i4;
                                                        e12Var2.a(iA4, d12Var);
                                                        if (iA4 != iA5) {
                                                            iA4++;
                                                        }
                                                    }
                                                }
                                                i2 = i4;
                                                i2 = i9;
                                            } else {
                                                i2 = i4;
                                                e12Var2 = e12Var;
                                                e12Var2.a(iA4, d12Var);
                                                i2 = i7;
                                            }
                                            e12Var = e12Var2;
                                            strA = strA;
                                            i5 = i5;
                                            i6 = i24 + 1;
                                            iA3 = i23;
                                        }
                                        i2 = i4;
                                        int i25 = i5 + 1;
                                        i14 = i112;
                                        i3 = i25;
                                        iA2 = i111;
                                    }
                                    i = i14;
                                    str2 = strA;
                                    e12 e12Var6 = e12Var;
                                    e12Var6.a = i2;
                                    mn2Var.C = e12Var6;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 351608024:
                                    if (str5.equals("version")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var19 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue10 = numValueOf.intValue();
                                    } else {
                                        iIntValue10 = i12;
                                    }
                                    d71Var19.getClass();
                                    mn2Var.g = (int) d71.a(iIntValue10, strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 439958894:
                                    if (str5.equals("useNonStandardStacks")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.d = strSubstring.equals("1");
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 501667126:
                                    if (str5.equals("purposeLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var10 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue11 = numValueOf.intValue();
                                    } else {
                                        iIntValue11 = i12;
                                    }
                                    Integer numValueOf13 = Integer.valueOf(iIntValue11);
                                    mo0Var10.getClass();
                                    mn2Var.s = mo0.a(strSubstring, numValueOf13);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 544050613:
                                    if (str5.equals("publisherConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var11 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue12 = numValueOf.intValue();
                                    } else {
                                        iIntValue12 = i12;
                                    }
                                    Integer numValueOf14 = Integer.valueOf(iIntValue12);
                                    mo0Var11.getClass();
                                    mn2Var.t = mo0.a(strSubstring, numValueOf14);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 568283376:
                                    if (str5.equals("purposeOneTreatment")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.e = strSubstring.equals("1");
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 680983954:
                                    if (str5.equals("consentLanguage")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    sc1 sc1Var4 = tc1.Companion;
                                    if (numValueOf != null) {
                                        iIntValue13 = numValueOf.intValue();
                                    } else {
                                        iIntValue13 = i12;
                                    }
                                    sc1Var4.getClass();
                                    mn2Var.j = sc1.a(iIntValue13, strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1000364236:
                                    if (str5.equals("vendorLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.z = f53.a(strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1028554472:
                                    if (str5.equals("created")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    l50 l50Var3 = m50.Companion;
                                    if (numValueOf != null) {
                                        iIntValue14 = numValueOf.intValue();
                                    } else {
                                        iIntValue14 = i12;
                                    }
                                    l50Var3.getClass();
                                    if (iIntValue14 == strSubstring.length()) {
                                        throw new a60("Invalid bit length");
                                    }
                                    e71.Companion.getClass();
                                    mn2Var.o = Long.valueOf(d71.a(iIntValue14, strSubstring) * 100);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1272166759:
                                    if (str5.equals("publisherCustomLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var12 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue15 = numValueOf.intValue();
                                    } else {
                                        iIntValue15 = i12;
                                    }
                                    Integer numValueOf15 = Integer.valueOf(iIntValue15);
                                    mo0Var12.getClass();
                                    mn2Var.w = mo0.a(strSubstring, numValueOf15);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1401591704:
                                    if (str5.equals("publisherLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var13 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue16 = numValueOf.intValue();
                                    } else {
                                        iIntValue16 = i12;
                                    }
                                    Integer numValueOf16 = Integer.valueOf(iIntValue16);
                                    mo0Var13.getClass();
                                    mn2Var.u = mo0.a(strSubstring, numValueOf16);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1649733957:
                                    if (str5.equals("lastUpdated")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    l50 l50Var4 = m50.Companion;
                                    if (numValueOf != null) {
                                        iIntValue17 = numValueOf.intValue();
                                    } else {
                                        iIntValue17 = i12;
                                    }
                                    l50Var4.getClass();
                                    if (iIntValue17 == strSubstring.length()) {
                                        throw new a60("Invalid bit length");
                                    }
                                    e71.Companion.getClass();
                                    mn2Var.p = Long.valueOf(d71.a(iIntValue17, strSubstring) * 100);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1722227698:
                                    if (str5.equals("vendorListVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var110 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue18 = numValueOf.intValue();
                                    } else {
                                        iIntValue18 = i12;
                                    }
                                    d71Var110.getClass();
                                    mn2Var.h(new yj2((int) d71.a(iIntValue18, strSubstring)));
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1886388920:
                                    if (str5.equals("specialFeatureOptins")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var14 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue19 = numValueOf.intValue();
                                    } else {
                                        iIntValue19 = i12;
                                    }
                                    Integer numValueOf17 = Integer.valueOf(iIntValue19);
                                    mo0Var14.getClass();
                                    mn2Var.q = mo0.a(strSubstring, numValueOf17);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1982848911:
                                    if (str5.equals("vendorsDisclosed")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.A = f53.a(strSubstring);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1995874045:
                                    if (str5.equals("vendorsAllowed")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.B = f53.a(strSubstring);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                default:
                                    throw new a60("Unable to set decoded version of the key: ".concat(str5));
                            }
                        } else {
                            listN0 = listN0;
                            size = size;
                            i = i14;
                            str2 = strA;
                        }
                        i14 = i;
                        listN0 = listN0;
                        size = size;
                        strA = str2;
                        i12 = 0;
                    }
                    i14++;
                    mn2Var2 = mn2Var;
                    i12 = 0;
                    i13 = 6;
                    break;
                    break;
                case 1982848911:
                    if (!str4.equals("vendorsDisclosed")) {
                        throw new Throwable("Invalid Value for Segment Type: ".concat(str4));
                    }
                    h82Var = h82.VENDORS_DISCLOSED;
                    list = (List) map.get(h82Var);
                    if (list != null) {
                        e32.i("Unable to find fieldSequence");
                        return null;
                    }
                    while (r9.hasNext()) {
                        wi.Companion.getClass();
                        wiVarA = vi.a(str5);
                        if (wiVarA != null) {
                            numValueOf = Integer.valueOf(wiVarA.a);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf == null) {
                            k82.Companion.getClass();
                            if (j82.a(str5)) {
                                numValueOf = Integer.valueOf(mn2Var.b().a);
                            }
                        }
                        if (numValueOf == null) {
                            if (numValueOf == null) {
                                iIntValue = strA.length();
                            } else {
                                iIntValue = numValueOf.intValue() + iIntValue20;
                            }
                            strSubstring = strA.substring(iIntValue20, iIntValue);
                            switch (str5.hashCode()) {
                                case -2115730175:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("vendorConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.y = f53.a(strSubstring);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -2076485454:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("cmpVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var111 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue2 = numValueOf.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    d71Var111.getClass();
                                    mn2Var.d(new yj2((int) d71.a(iIntValue2, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -2014745908:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("numCustomPurposes")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var112 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue3 = numValueOf.intValue();
                                    } else {
                                        iIntValue3 = 0;
                                    }
                                    d71Var112.getClass();
                                    iA = (int) d71.a(iIntValue3, strSubstring);
                                    yj2Var = new yj2(iA);
                                    if (iA >= 0) {
                                        throw new nn2("numCustomPurposes", yj2Var, null, 4, null);
                                    }
                                    mn2Var.n = iA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -1710804154:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("policyVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var113 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue4 = numValueOf.intValue();
                                    } else {
                                        iIntValue4 = 0;
                                    }
                                    d71Var113.getClass();
                                    mn2Var.f(new yj2((int) d71.a(iIntValue4, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -879778089:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("purposeConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var15 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue5 = numValueOf.intValue();
                                    } else {
                                        iIntValue5 = 0;
                                    }
                                    Integer numValueOf18 = Integer.valueOf(iIntValue5);
                                    mo0Var15.getClass();
                                    mn2Var.r = mo0.a(strSubstring, numValueOf18);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -740692217:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("publisherCountryCode")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    sc1 sc1Var5 = tc1.Companion;
                                    if (numValueOf != null) {
                                        iIntValue6 = numValueOf.intValue();
                                    } else {
                                        iIntValue6 = 0;
                                    }
                                    sc1Var5.getClass();
                                    mn2Var.g(sc1.a(iIntValue6, strSubstring));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -442009786:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("publisherCustomConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var16 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue7 = numValueOf.intValue();
                                    } else {
                                        iIntValue7 = 0;
                                    }
                                    Integer numValueOf19 = Integer.valueOf(iIntValue7);
                                    mo0Var16.getClass();
                                    mn2Var.v = mo0.a(strSubstring, numValueOf19);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -145526490:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("consentScreen")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var114 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue8 = numValueOf.intValue();
                                    } else {
                                        iIntValue8 = 0;
                                    }
                                    d71Var114.getClass();
                                    mn2Var.e(new yj2((int) d71.a(iIntValue8, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -117505923:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("isServiceSpecific")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.c = strSubstring.equals("1");
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 94785793:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("cmpId")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var115 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue9 = numValueOf.intValue();
                                    } else {
                                        iIntValue9 = 0;
                                    }
                                    d71Var115.getClass();
                                    mn2Var.c(new yj2((int) d71.a(iIntValue9, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 204489283:
                                    size = size;
                                    if (str5.equals("publisherRestrictions")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g12.Companion.getClass();
                                    e12 e12Var7 = new e12();
                                    d71 d71Var116 = e71.Companion;
                                    listN0 = listN0;
                                    String strSubstring13 = strSubstring.substring(i12, 12);
                                    d71Var116.getClass();
                                    e12Var = e12Var7;
                                    iA2 = (int) d71.a(12, strSubstring13);
                                    i2 = 12;
                                    i3 = 0;
                                    while (i3 < iA2) {
                                        d71 d71Var117 = e71.Companion;
                                        int i115 = i2 + 6;
                                        String strSubstring14 = strSubstring.substring(i2, i115);
                                        d71Var117.getClass();
                                        int i116 = iA2;
                                        int i117 = i14;
                                        int iA10 = (int) d71.a(6, strSubstring14);
                                        int i118 = i2 + 8;
                                        int iA11 = (int) d71.a(2, strSubstring.substring(i115, i118));
                                        Integer numValueOf110 = Integer.valueOf(iA10);
                                        g52.Companion.getClass();
                                        d12Var = new d12(numValueOf110, f52.a(iA11));
                                        i4 = i2 + 20;
                                        String strSubstring15 = strSubstring.substring(i118, i4);
                                        i5 = i3;
                                        iA3 = (int) d71.a(12, strSubstring15);
                                        i6 = 0;
                                        while (i6 < iA3) {
                                            pj pjVar3 = qj.Companion;
                                            int i119 = i2 + 1;
                                            int i26 = iA3;
                                            String strSubstring16 = strSubstring.substring(i2, i119);
                                            pjVar3.getClass();
                                            zEquals = strSubstring16.equals("1");
                                            d71 d71Var118 = e71.Companion;
                                            i7 = i2 + 17;
                                            String strSubstring17 = strSubstring.substring(i119, i7);
                                            d71Var118.getClass();
                                            int i27 = i6;
                                            i8 = i2;
                                            iA4 = (int) d71.a(16, strSubstring17);
                                            if (zEquals) {
                                                i9 = i8 + 33;
                                                iA5 = (int) d71.a(16, strSubstring.substring(i7, i9));
                                                if (iA5 >= iA4) {
                                                    i2 = i4;
                                                    throw new a60(nj.i(iA5, iA4, "Invalid RangeEntry: endVendorId ", " is less than "));
                                                }
                                                e12Var2 = e12Var;
                                                if (iA4 <= iA5) {
                                                    while (true) {
                                                        i2 = i4;
                                                        e12Var2.a(iA4, d12Var);
                                                        if (iA4 != iA5) {
                                                            iA4++;
                                                        }
                                                    }
                                                }
                                                i2 = i4;
                                                i2 = i9;
                                            } else {
                                                i2 = i4;
                                                e12Var2 = e12Var;
                                                e12Var2.a(iA4, d12Var);
                                                i2 = i7;
                                            }
                                            e12Var = e12Var2;
                                            strA = strA;
                                            i5 = i5;
                                            i6 = i27 + 1;
                                            iA3 = i26;
                                        }
                                        i2 = i4;
                                        int i28 = i5 + 1;
                                        i14 = i117;
                                        i3 = i28;
                                        iA2 = i116;
                                    }
                                    i = i14;
                                    str2 = strA;
                                    e12 e12Var8 = e12Var;
                                    e12Var8.a = i2;
                                    mn2Var.C = e12Var8;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 351608024:
                                    if (str5.equals("version")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var119 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue10 = numValueOf.intValue();
                                    } else {
                                        iIntValue10 = i12;
                                    }
                                    d71Var119.getClass();
                                    mn2Var.g = (int) d71.a(iIntValue10, strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 439958894:
                                    if (str5.equals("useNonStandardStacks")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.d = strSubstring.equals("1");
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 501667126:
                                    if (str5.equals("purposeLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var17 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue11 = numValueOf.intValue();
                                    } else {
                                        iIntValue11 = i12;
                                    }
                                    Integer numValueOf111 = Integer.valueOf(iIntValue11);
                                    mo0Var17.getClass();
                                    mn2Var.s = mo0.a(strSubstring, numValueOf111);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 544050613:
                                    if (str5.equals("publisherConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var18 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue12 = numValueOf.intValue();
                                    } else {
                                        iIntValue12 = i12;
                                    }
                                    Integer numValueOf112 = Integer.valueOf(iIntValue12);
                                    mo0Var18.getClass();
                                    mn2Var.t = mo0.a(strSubstring, numValueOf112);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 568283376:
                                    if (str5.equals("purposeOneTreatment")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.e = strSubstring.equals("1");
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 680983954:
                                    if (str5.equals("consentLanguage")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    sc1 sc1Var6 = tc1.Companion;
                                    if (numValueOf != null) {
                                        iIntValue13 = numValueOf.intValue();
                                    } else {
                                        iIntValue13 = i12;
                                    }
                                    sc1Var6.getClass();
                                    mn2Var.j = sc1.a(iIntValue13, strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1000364236:
                                    if (str5.equals("vendorLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.z = f53.a(strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1028554472:
                                    if (str5.equals("created")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    l50 l50Var5 = m50.Companion;
                                    if (numValueOf != null) {
                                        iIntValue14 = numValueOf.intValue();
                                    } else {
                                        iIntValue14 = i12;
                                    }
                                    l50Var5.getClass();
                                    if (iIntValue14 == strSubstring.length()) {
                                        throw new a60("Invalid bit length");
                                    }
                                    e71.Companion.getClass();
                                    mn2Var.o = Long.valueOf(d71.a(iIntValue14, strSubstring) * 100);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1272166759:
                                    if (str5.equals("publisherCustomLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var19 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue15 = numValueOf.intValue();
                                    } else {
                                        iIntValue15 = i12;
                                    }
                                    Integer numValueOf113 = Integer.valueOf(iIntValue15);
                                    mo0Var19.getClass();
                                    mn2Var.w = mo0.a(strSubstring, numValueOf113);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1401591704:
                                    if (str5.equals("publisherLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var110 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue16 = numValueOf.intValue();
                                    } else {
                                        iIntValue16 = i12;
                                    }
                                    Integer numValueOf114 = Integer.valueOf(iIntValue16);
                                    mo0Var110.getClass();
                                    mn2Var.u = mo0.a(strSubstring, numValueOf114);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1649733957:
                                    if (str5.equals("lastUpdated")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    l50 l50Var6 = m50.Companion;
                                    if (numValueOf != null) {
                                        iIntValue17 = numValueOf.intValue();
                                    } else {
                                        iIntValue17 = i12;
                                    }
                                    l50Var6.getClass();
                                    if (iIntValue17 == strSubstring.length()) {
                                        throw new a60("Invalid bit length");
                                    }
                                    e71.Companion.getClass();
                                    mn2Var.p = Long.valueOf(d71.a(iIntValue17, strSubstring) * 100);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1722227698:
                                    if (str5.equals("vendorListVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var1110 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue18 = numValueOf.intValue();
                                    } else {
                                        iIntValue18 = i12;
                                    }
                                    d71Var1110.getClass();
                                    mn2Var.h(new yj2((int) d71.a(iIntValue18, strSubstring)));
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1886388920:
                                    if (str5.equals("specialFeatureOptins")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var111 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue19 = numValueOf.intValue();
                                    } else {
                                        iIntValue19 = i12;
                                    }
                                    Integer numValueOf115 = Integer.valueOf(iIntValue19);
                                    mo0Var111.getClass();
                                    mn2Var.q = mo0.a(strSubstring, numValueOf115);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1982848911:
                                    if (str5.equals("vendorsDisclosed")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.A = f53.a(strSubstring);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1995874045:
                                    if (str5.equals("vendorsAllowed")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.B = f53.a(strSubstring);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                default:
                                    throw new a60("Unable to set decoded version of the key: ".concat(str5));
                            }
                        } else {
                            listN0 = listN0;
                            size = size;
                            i = i14;
                            str2 = strA;
                        }
                        i14 = i;
                        listN0 = listN0;
                        size = size;
                        strA = str2;
                        i12 = 0;
                    }
                    i14++;
                    mn2Var2 = mn2Var;
                    i12 = 0;
                    i13 = 6;
                    break;
                    break;
                case 1995874045:
                    if (!str4.equals("vendorsAllowed")) {
                        throw new Throwable("Invalid Value for Segment Type: ".concat(str4));
                    }
                    h82Var = h82.VENDORS_ALLOWED;
                    list = (List) map.get(h82Var);
                    if (list != null) {
                        e32.i("Unable to find fieldSequence");
                        return null;
                    }
                    while (r9.hasNext()) {
                        wi.Companion.getClass();
                        wiVarA = vi.a(str5);
                        if (wiVarA != null) {
                            numValueOf = Integer.valueOf(wiVarA.a);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf == null) {
                            k82.Companion.getClass();
                            if (j82.a(str5)) {
                                numValueOf = Integer.valueOf(mn2Var.b().a);
                            }
                        }
                        if (numValueOf == null) {
                            if (numValueOf == null) {
                                iIntValue = strA.length();
                            } else {
                                iIntValue = numValueOf.intValue() + iIntValue20;
                            }
                            strSubstring = strA.substring(iIntValue20, iIntValue);
                            switch (str5.hashCode()) {
                                case -2115730175:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("vendorConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.y = f53.a(strSubstring);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -2076485454:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("cmpVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var1111 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue2 = numValueOf.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    d71Var1111.getClass();
                                    mn2Var.d(new yj2((int) d71.a(iIntValue2, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -2014745908:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("numCustomPurposes")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var1112 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue3 = numValueOf.intValue();
                                    } else {
                                        iIntValue3 = 0;
                                    }
                                    d71Var1112.getClass();
                                    iA = (int) d71.a(iIntValue3, strSubstring);
                                    yj2Var = new yj2(iA);
                                    if (iA >= 0) {
                                        throw new nn2("numCustomPurposes", yj2Var, null, 4, null);
                                    }
                                    mn2Var.n = iA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -1710804154:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("policyVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var1113 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue4 = numValueOf.intValue();
                                    } else {
                                        iIntValue4 = 0;
                                    }
                                    d71Var1113.getClass();
                                    mn2Var.f(new yj2((int) d71.a(iIntValue4, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -879778089:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("purposeConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var112 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue5 = numValueOf.intValue();
                                    } else {
                                        iIntValue5 = 0;
                                    }
                                    Integer numValueOf116 = Integer.valueOf(iIntValue5);
                                    mo0Var112.getClass();
                                    mn2Var.r = mo0.a(strSubstring, numValueOf116);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -740692217:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("publisherCountryCode")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    sc1 sc1Var7 = tc1.Companion;
                                    if (numValueOf != null) {
                                        iIntValue6 = numValueOf.intValue();
                                    } else {
                                        iIntValue6 = 0;
                                    }
                                    sc1Var7.getClass();
                                    mn2Var.g(sc1.a(iIntValue6, strSubstring));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -442009786:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("publisherCustomConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var113 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue7 = numValueOf.intValue();
                                    } else {
                                        iIntValue7 = 0;
                                    }
                                    Integer numValueOf117 = Integer.valueOf(iIntValue7);
                                    mo0Var113.getClass();
                                    mn2Var.v = mo0.a(strSubstring, numValueOf117);
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -145526490:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("consentScreen")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var1114 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue8 = numValueOf.intValue();
                                    } else {
                                        iIntValue8 = 0;
                                    }
                                    d71Var1114.getClass();
                                    mn2Var.e(new yj2((int) d71.a(iIntValue8, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case -117505923:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("isServiceSpecific")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.c = strSubstring.equals("1");
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 94785793:
                                    listN0 = listN0;
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (str5.equals("cmpId")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var1115 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue9 = numValueOf.intValue();
                                    } else {
                                        iIntValue9 = 0;
                                    }
                                    d71Var1115.getClass();
                                    mn2Var.c(new yj2((int) d71.a(iIntValue9, strSubstring)));
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 204489283:
                                    size = size;
                                    if (str5.equals("publisherRestrictions")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g12.Companion.getClass();
                                    e12 e12Var9 = new e12();
                                    d71 d71Var1116 = e71.Companion;
                                    listN0 = listN0;
                                    String strSubstring18 = strSubstring.substring(i12, 12);
                                    d71Var1116.getClass();
                                    e12Var = e12Var9;
                                    iA2 = (int) d71.a(12, strSubstring18);
                                    i2 = 12;
                                    i3 = 0;
                                    while (i3 < iA2) {
                                        d71 d71Var1117 = e71.Companion;
                                        int i1110 = i2 + 6;
                                        String strSubstring19 = strSubstring.substring(i2, i1110);
                                        d71Var1117.getClass();
                                        int i1111 = iA2;
                                        int i1112 = i14;
                                        int iA12 = (int) d71.a(6, strSubstring19);
                                        int i1113 = i2 + 8;
                                        int iA13 = (int) d71.a(2, strSubstring.substring(i1110, i1113));
                                        Integer numValueOf118 = Integer.valueOf(iA12);
                                        g52.Companion.getClass();
                                        d12Var = new d12(numValueOf118, f52.a(iA13));
                                        i4 = i2 + 20;
                                        String strSubstring110 = strSubstring.substring(i1113, i4);
                                        i5 = i3;
                                        iA3 = (int) d71.a(12, strSubstring110);
                                        i6 = 0;
                                        while (i6 < iA3) {
                                            pj pjVar4 = qj.Companion;
                                            int i1114 = i2 + 1;
                                            int i29 = iA3;
                                            String strSubstring111 = strSubstring.substring(i2, i1114);
                                            pjVar4.getClass();
                                            zEquals = strSubstring111.equals("1");
                                            d71 d71Var1118 = e71.Companion;
                                            i7 = i2 + 17;
                                            String strSubstring112 = strSubstring.substring(i1114, i7);
                                            d71Var1118.getClass();
                                            int i210 = i6;
                                            i8 = i2;
                                            iA4 = (int) d71.a(16, strSubstring112);
                                            if (zEquals) {
                                                i9 = i8 + 33;
                                                iA5 = (int) d71.a(16, strSubstring.substring(i7, i9));
                                                if (iA5 >= iA4) {
                                                    i2 = i4;
                                                    throw new a60(nj.i(iA5, iA4, "Invalid RangeEntry: endVendorId ", " is less than "));
                                                }
                                                e12Var2 = e12Var;
                                                if (iA4 <= iA5) {
                                                    while (true) {
                                                        i2 = i4;
                                                        e12Var2.a(iA4, d12Var);
                                                        if (iA4 != iA5) {
                                                            iA4++;
                                                        }
                                                    }
                                                }
                                                i2 = i4;
                                                i2 = i9;
                                            } else {
                                                i2 = i4;
                                                e12Var2 = e12Var;
                                                e12Var2.a(iA4, d12Var);
                                                i2 = i7;
                                            }
                                            e12Var = e12Var2;
                                            strA = strA;
                                            i5 = i5;
                                            i6 = i210 + 1;
                                            iA3 = i29;
                                        }
                                        i2 = i4;
                                        int i211 = i5 + 1;
                                        i14 = i1112;
                                        i3 = i211;
                                        iA2 = i1111;
                                    }
                                    i = i14;
                                    str2 = strA;
                                    e12 e12Var10 = e12Var;
                                    e12Var10.a = i2;
                                    mn2Var.C = e12Var10;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 351608024:
                                    if (str5.equals("version")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var1119 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue10 = numValueOf.intValue();
                                    } else {
                                        iIntValue10 = i12;
                                    }
                                    d71Var1119.getClass();
                                    mn2Var.g = (int) d71.a(iIntValue10, strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 439958894:
                                    if (str5.equals("useNonStandardStacks")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.d = strSubstring.equals("1");
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 501667126:
                                    if (str5.equals("purposeLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var114 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue11 = numValueOf.intValue();
                                    } else {
                                        iIntValue11 = i12;
                                    }
                                    Integer numValueOf119 = Integer.valueOf(iIntValue11);
                                    mo0Var114.getClass();
                                    mn2Var.s = mo0.a(strSubstring, numValueOf119);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 544050613:
                                    if (str5.equals("publisherConsents")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var115 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue12 = numValueOf.intValue();
                                    } else {
                                        iIntValue12 = i12;
                                    }
                                    Integer numValueOf1110 = Integer.valueOf(iIntValue12);
                                    mo0Var115.getClass();
                                    mn2Var.t = mo0.a(strSubstring, numValueOf1110);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 568283376:
                                    if (str5.equals("purposeOneTreatment")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    qj.Companion.getClass();
                                    mn2Var.e = strSubstring.equals("1");
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 680983954:
                                    if (str5.equals("consentLanguage")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    sc1 sc1Var8 = tc1.Companion;
                                    if (numValueOf != null) {
                                        iIntValue13 = numValueOf.intValue();
                                    } else {
                                        iIntValue13 = i12;
                                    }
                                    sc1Var8.getClass();
                                    mn2Var.j = sc1.a(iIntValue13, strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1000364236:
                                    if (str5.equals("vendorLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.z = f53.a(strSubstring);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1028554472:
                                    if (str5.equals("created")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    l50 l50Var7 = m50.Companion;
                                    if (numValueOf != null) {
                                        iIntValue14 = numValueOf.intValue();
                                    } else {
                                        iIntValue14 = i12;
                                    }
                                    l50Var7.getClass();
                                    if (iIntValue14 == strSubstring.length()) {
                                        throw new a60("Invalid bit length");
                                    }
                                    e71.Companion.getClass();
                                    mn2Var.o = Long.valueOf(d71.a(iIntValue14, strSubstring) * 100);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1272166759:
                                    if (str5.equals("publisherCustomLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var116 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue15 = numValueOf.intValue();
                                    } else {
                                        iIntValue15 = i12;
                                    }
                                    Integer numValueOf1111 = Integer.valueOf(iIntValue15);
                                    mo0Var116.getClass();
                                    mn2Var.w = mo0.a(strSubstring, numValueOf1111);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1401591704:
                                    if (str5.equals("publisherLegitimateInterests")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var117 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue16 = numValueOf.intValue();
                                    } else {
                                        iIntValue16 = i12;
                                    }
                                    Integer numValueOf1112 = Integer.valueOf(iIntValue16);
                                    mo0Var117.getClass();
                                    mn2Var.u = mo0.a(strSubstring, numValueOf1112);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1649733957:
                                    if (str5.equals("lastUpdated")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    l50 l50Var8 = m50.Companion;
                                    if (numValueOf != null) {
                                        iIntValue17 = numValueOf.intValue();
                                    } else {
                                        iIntValue17 = i12;
                                    }
                                    l50Var8.getClass();
                                    if (iIntValue17 == strSubstring.length()) {
                                        throw new a60("Invalid bit length");
                                    }
                                    e71.Companion.getClass();
                                    mn2Var.p = Long.valueOf(d71.a(iIntValue17, strSubstring) * 100);
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1722227698:
                                    if (str5.equals("vendorListVersion")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    d71 d71Var11110 = e71.Companion;
                                    if (numValueOf != null) {
                                        iIntValue18 = numValueOf.intValue();
                                    } else {
                                        iIntValue18 = i12;
                                    }
                                    d71Var11110.getClass();
                                    mn2Var.h(new yj2((int) d71.a(iIntValue18, strSubstring)));
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1886388920:
                                    if (str5.equals("specialFeatureOptins")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    mo0 mo0Var118 = no0.Companion;
                                    if (numValueOf != null) {
                                        iIntValue19 = numValueOf.intValue();
                                    } else {
                                        iIntValue19 = i12;
                                    }
                                    Integer numValueOf1113 = Integer.valueOf(iIntValue19);
                                    mo0Var118.getClass();
                                    mn2Var.q = mo0.a(strSubstring, numValueOf1113);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1982848911:
                                    if (str5.equals("vendorsDisclosed")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.A = f53.a(strSubstring);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                case 1995874045:
                                    if (str5.equals("vendorsAllowed")) {
                                        throw new a60("Unable to set decoded version of the key: ".concat(str5));
                                    }
                                    g53.Companion.getClass();
                                    mn2Var.B = f53.a(strSubstring);
                                    size = size;
                                    i = i14;
                                    str2 = strA;
                                    if (numValueOf != null) {
                                        iIntValue20 = numValueOf.intValue() + iIntValue20;
                                    } else {
                                        l7VarA = mn2Var.a(str5);
                                        if (l7VarA instanceof un2) {
                                            i10 = ((un2) l7VarA).g.a;
                                        } else {
                                            if (l7VarA instanceof rn2) {
                                                throw new a60("Unable to increase bitLength for key: ".concat(str5));
                                            }
                                            i10 = ((rn2) l7VarA).g.a;
                                        }
                                        iIntValue20 += i10;
                                    }
                                    break;
                                    break;
                                default:
                                    throw new a60("Unable to set decoded version of the key: ".concat(str5));
                            }
                        } else {
                            listN0 = listN0;
                            size = size;
                            i = i14;
                            str2 = strA;
                        }
                        i14 = i;
                        listN0 = listN0;
                        size = size;
                        strA = str2;
                        i12 = 0;
                    }
                    i14++;
                    mn2Var2 = mn2Var;
                    i12 = 0;
                    i13 = 6;
                    break;
                    break;
                default:
                    throw new Throwable("Invalid Value for Segment Type: ".concat(str4));
            }
        }
        if (mn2Var2 != null) {
            return mn2Var2;
        }
        throw new a60("Unable to decode given TCModel");
    }

    public static String b(mn2 mn2Var) {
        String str;
        String strB;
        int i;
        String str2;
        mn2Var.getClass();
        v82.Companion.getClass();
        mn2 mn2VarA = u82.a(mn2Var);
        int i2 = mn2VarA.g;
        int i3 = 2;
        if (i2 == 2) {
            h82 h82Var = h82.CORE;
            ArrayList arrayList = new ArrayList(eu.y(h82Var));
            arrayList.add(h82.VENDORS_DISCLOSED);
            if (mn2VarA.c) {
                arrayList.add(h82.PUBLISHER_TC);
            }
            List listZ0 = du.z0(arrayList);
            String str3 = "";
            int i4 = 0;
            for (Object obj : listZ0) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    h82 h82Var2 = (h82) obj;
                    if (i4 >= listZ0.size() - 1) {
                        str = "";
                    } else {
                        str = UserDetailsUtils.UserDetailsLiterals.DOT;
                    }
                    k82.Companion.getClass();
                    h82Var2.getClass();
                    int i6 = mn2VarA.g;
                    if (i6 == i3) {
                        try {
                            o92 o92Var = (o92) k82.a.b;
                            o92Var.getClass();
                            List list = (List) o92Var.a.get(h82Var2);
                            if (h82Var2 == h82Var) {
                                strB = "";
                            } else {
                                m82.Companion.getClass();
                                Integer num = (Integer) m82.b.get(h82Var2);
                                if (num != null) {
                                    d71 d71Var = e71.Companion;
                                    Integer numValueOf = null;
                                    yj2 yj2Var = new yj2(num.intValue());
                                    wi.Companion.getClass();
                                    wi wiVarA = vi.a("segmentType");
                                    if (wiVarA != null) {
                                        numValueOf = Integer.valueOf(wiVarA.a);
                                    }
                                    numValueOf.getClass();
                                    int iIntValue = numValueOf.intValue();
                                    d71Var.getClass();
                                    strB = d71.b(yj2Var, iIntValue);
                                } else {
                                    throw new sg0("Unable to find segment key for " + h82Var2);
                                }
                            }
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str4 = (String) it.next();
                                        h82 h82Var3 = h82Var;
                                        l7 l7VarA = mn2VarA.a(str4);
                                        wi.Companion.getClass();
                                        mn2 mn2Var2 = mn2VarA;
                                        wi wiVarA2 = vi.a(str4);
                                        if (wiVarA2 == null) {
                                            k82.Companion.getClass();
                                            if (j82.a(str4)) {
                                                i = mn2Var2.b().a;
                                            } else {
                                                i = 0;
                                            }
                                        } else {
                                            i = wiVarA2.a;
                                        }
                                        try {
                                            switch (str4.hashCode()) {
                                                case -2115730175:
                                                    if (!str4.equals("vendorConsents")) {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    f53 f53Var = g53.Companion;
                                                    a53 a53Var = ((un2) l7VarA).g;
                                                    f53Var.getClass();
                                                    str2 = ((Object) strB) + f53.b(a53Var);
                                                    strB = str2;
                                                    h82Var = h82Var3;
                                                    it = it;
                                                    mn2VarA = mn2Var2;
                                                    listZ0 = listZ0;
                                                    break;
                                                case -2076485454:
                                                    if (!str4.equals("cmpVersion")) {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    yj2 yj2Var2 = ((tn2) l7VarA).g;
                                                    d71 d71Var2 = e71.Companion;
                                                    yj2 yj2Var3 = new yj2(yj2Var2.a);
                                                    d71Var2.getClass();
                                                    str2 = ((Object) strB) + d71.b(yj2Var3, i);
                                                    strB = str2;
                                                    h82Var = h82Var3;
                                                    it = it;
                                                    mn2VarA = mn2Var2;
                                                    listZ0 = listZ0;
                                                    break;
                                                case -2014745908:
                                                    if (!str4.equals("numCustomPurposes")) {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    d71 d71Var3 = e71.Companion;
                                                    yj2 yj2Var4 = new yj2(((qn2) l7VarA).g);
                                                    d71Var3.getClass();
                                                    str2 = ((Object) strB) + d71.b(yj2Var4, i);
                                                    strB = str2;
                                                    h82Var = h82Var3;
                                                    it = it;
                                                    mn2VarA = mn2Var2;
                                                    listZ0 = listZ0;
                                                    break;
                                                case -1710804154:
                                                    if (str4.equals("policyVersion")) {
                                                        yj2 yj2Var5 = ((tn2) l7VarA).g;
                                                        d71 d71Var4 = e71.Companion;
                                                        yj2 yj2Var6 = new yj2(yj2Var5.a);
                                                        d71Var4.getClass();
                                                        str2 = ((Object) strB) + d71.b(yj2Var6, i);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case -952905459:
                                                    it = it;
                                                    listZ0 = listZ0;
                                                    if (str4.equals("segmentType")) {
                                                        d71 d71Var5 = e71.Companion;
                                                        yj2 yj2Var7 = ((tn2) l7VarA).g;
                                                        d71Var5.getClass();
                                                        str2 = ((Object) strB) + d71.b(yj2Var7, i);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case -879778089:
                                                    it = it;
                                                    if (!str4.equals("purposeConsents")) {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    mo0 mo0Var = no0.Companion;
                                                    a53 a53Var2 = ((un2) l7VarA).g;
                                                    Integer numValueOf2 = Integer.valueOf(i);
                                                    mo0Var.getClass();
                                                    str2 = ((Object) strB) + mo0.b(a53Var2, numValueOf2);
                                                    strB = str2;
                                                    h82Var = h82Var3;
                                                    it = it;
                                                    mn2VarA = mn2Var2;
                                                    listZ0 = listZ0;
                                                    break;
                                                case -740692217:
                                                    if (!str4.equals("publisherCountryCode")) {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    sc1 sc1Var = tc1.Companion;
                                                    String str5 = ((sn2) l7VarA).g;
                                                    sc1Var.getClass();
                                                    str2 = ((Object) strB) + sc1.b(i, str5);
                                                    strB = str2;
                                                    h82Var = h82Var3;
                                                    it = it;
                                                    mn2VarA = mn2Var2;
                                                    listZ0 = listZ0;
                                                    break;
                                                case -442009786:
                                                    it = it;
                                                    if (str4.equals("publisherCustomConsents")) {
                                                        mo0 mo0Var2 = no0.Companion;
                                                        a53 a53Var3 = ((un2) l7VarA).g;
                                                        Integer numValueOf3 = Integer.valueOf(i);
                                                        mo0Var2.getClass();
                                                        str2 = ((Object) strB) + mo0.b(a53Var3, numValueOf3);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case -145526490:
                                                    if (str4.equals("consentScreen")) {
                                                        yj2 yj2Var8 = ((tn2) l7VarA).g;
                                                        d71 d71Var6 = e71.Companion;
                                                        yj2 yj2Var9 = new yj2(yj2Var8.a);
                                                        d71Var6.getClass();
                                                        str2 = ((Object) strB) + d71.b(yj2Var9, i);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case -117505923:
                                                    if (!str4.equals("isServiceSpecific")) {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    pj pjVar = qj.Companion;
                                                    boolean z = ((on2) l7VarA).g;
                                                    pjVar.getClass();
                                                    str2 = ((Object) strB) + pj.a(z);
                                                    strB = str2;
                                                    h82Var = h82Var3;
                                                    it = it;
                                                    mn2VarA = mn2Var2;
                                                    listZ0 = listZ0;
                                                    break;
                                                case 94785793:
                                                    if (str4.equals("cmpId")) {
                                                        yj2 yj2Var10 = ((tn2) l7VarA).g;
                                                        d71 d71Var7 = e71.Companion;
                                                        yj2 yj2Var11 = new yj2(yj2Var10.a);
                                                        d71Var7.getClass();
                                                        str2 = ((Object) strB) + d71.b(yj2Var11, i);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 204489283:
                                                    it = it;
                                                    listZ0 = listZ0;
                                                    if (str4.equals("publisherRestrictions")) {
                                                        f12 f12Var = g12.Companion;
                                                        e12 e12Var = ((rn2) l7VarA).g;
                                                        f12Var.getClass();
                                                        str2 = ((Object) strB) + f12.a(e12Var);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 351608024:
                                                    if (str4.equals("version")) {
                                                        d71 d71Var8 = e71.Companion;
                                                        yj2 yj2Var12 = new yj2(((qn2) l7VarA).g);
                                                        d71Var8.getClass();
                                                        str2 = ((Object) strB) + d71.b(yj2Var12, i);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 439958894:
                                                    if (str4.equals("useNonStandardStacks")) {
                                                        pj pjVar2 = qj.Companion;
                                                        boolean z2 = ((on2) l7VarA).g;
                                                        pjVar2.getClass();
                                                        str2 = ((Object) strB) + pj.a(z2);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 501667126:
                                                    it = it;
                                                    if (str4.equals("purposeLegitimateInterests")) {
                                                        mo0 mo0Var3 = no0.Companion;
                                                        a53 a53Var4 = ((un2) l7VarA).g;
                                                        Integer numValueOf4 = Integer.valueOf(i);
                                                        mo0Var3.getClass();
                                                        str2 = ((Object) strB) + mo0.b(a53Var4, numValueOf4);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 544050613:
                                                    it = it;
                                                    if (str4.equals("publisherConsents")) {
                                                        mo0 mo0Var4 = no0.Companion;
                                                        a53 a53Var5 = ((un2) l7VarA).g;
                                                        Integer numValueOf5 = Integer.valueOf(i);
                                                        mo0Var4.getClass();
                                                        str2 = ((Object) strB) + mo0.b(a53Var5, numValueOf5);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 568283376:
                                                    if (str4.equals("purposeOneTreatment")) {
                                                        pj pjVar3 = qj.Companion;
                                                        boolean z3 = ((on2) l7VarA).g;
                                                        pjVar3.getClass();
                                                        str2 = ((Object) strB) + pj.a(z3);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 680983954:
                                                    if (str4.equals("consentLanguage")) {
                                                        sc1 sc1Var2 = tc1.Companion;
                                                        String str6 = ((sn2) l7VarA).g;
                                                        sc1Var2.getClass();
                                                        str2 = ((Object) strB) + sc1.b(i, str6);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 1000364236:
                                                    if (str4.equals("vendorLegitimateInterests")) {
                                                        f53 f53Var2 = g53.Companion;
                                                        a53 a53Var6 = ((un2) l7VarA).g;
                                                        f53Var2.getClass();
                                                        str2 = ((Object) strB) + f53.b(a53Var6);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 1028554472:
                                                    if (!str4.equals("created")) {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    l50 l50Var = m50.Companion;
                                                    Long l = ((pn2) l7VarA).g;
                                                    l.getClass();
                                                    long jLongValue = l.longValue();
                                                    l50Var.getClass();
                                                    listZ0 = listZ0;
                                                    e71.Companion.getClass();
                                                    str2 = ((Object) strB) + d71.c(i, jLongValue / 100);
                                                    strB = str2;
                                                    h82Var = h82Var3;
                                                    it = it;
                                                    mn2VarA = mn2Var2;
                                                    listZ0 = listZ0;
                                                    break;
                                                case 1272166759:
                                                    if (str4.equals("publisherCustomLegitimateInterests")) {
                                                        mo0 mo0Var5 = no0.Companion;
                                                        a53 a53Var7 = ((un2) l7VarA).g;
                                                        Integer numValueOf6 = Integer.valueOf(i);
                                                        mo0Var5.getClass();
                                                        str2 = ((Object) strB) + mo0.b(a53Var7, numValueOf6);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 1401591704:
                                                    if (str4.equals("publisherLegitimateInterests")) {
                                                        mo0 mo0Var6 = no0.Companion;
                                                        a53 a53Var8 = ((un2) l7VarA).g;
                                                        Integer numValueOf7 = Integer.valueOf(i);
                                                        mo0Var6.getClass();
                                                        str2 = ((Object) strB) + mo0.b(a53Var8, numValueOf7);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 1649733957:
                                                    if (str4.equals("lastUpdated")) {
                                                        l50 l50Var2 = m50.Companion;
                                                        Long l2 = ((pn2) l7VarA).g;
                                                        l2.getClass();
                                                        long jLongValue2 = l2.longValue();
                                                        l50Var2.getClass();
                                                        listZ0 = listZ0;
                                                        e71.Companion.getClass();
                                                        str2 = ((Object) strB) + d71.c(i, jLongValue2 / 100);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 1722227698:
                                                    if (str4.equals("vendorListVersion")) {
                                                        yj2 yj2Var13 = ((tn2) l7VarA).g;
                                                        d71 d71Var9 = e71.Companion;
                                                        yj2 yj2Var14 = new yj2(yj2Var13.a);
                                                        d71Var9.getClass();
                                                        str2 = ((Object) strB) + d71.b(yj2Var14, i);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 1886388920:
                                                    if (!str4.equals("specialFeatureOptins")) {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    mo0 mo0Var7 = no0.Companion;
                                                    a53 a53Var9 = ((un2) l7VarA).g;
                                                    Integer numValueOf8 = Integer.valueOf(i);
                                                    mo0Var7.getClass();
                                                    str2 = ((Object) strB) + mo0.b(a53Var9, numValueOf8);
                                                    strB = str2;
                                                    h82Var = h82Var3;
                                                    it = it;
                                                    mn2VarA = mn2Var2;
                                                    listZ0 = listZ0;
                                                    break;
                                                case 1982848911:
                                                    if (str4.equals("vendorsDisclosed")) {
                                                        f53 f53Var3 = g53.Companion;
                                                        a53 a53Var10 = ((un2) l7VarA).g;
                                                        f53Var3.getClass();
                                                        str2 = ((Object) strB) + f53.b(a53Var10);
                                                        strB = str2;
                                                        h82Var = h82Var3;
                                                        it = it;
                                                        mn2VarA = mn2Var2;
                                                        listZ0 = listZ0;
                                                    } else {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    break;
                                                case 1995874045:
                                                    if (!str4.equals("vendorsAllowed")) {
                                                        throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                                    }
                                                    f53 f53Var4 = g53.Companion;
                                                    a53 a53Var11 = ((un2) l7VarA).g;
                                                    f53Var4.getClass();
                                                    str2 = ((Object) strB) + f53.b(a53Var11);
                                                    strB = str2;
                                                    h82Var = h82Var3;
                                                    it = it;
                                                    mn2VarA = mn2Var2;
                                                    listZ0 = listZ0;
                                                    break;
                                                default:
                                                    throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ", value: " + l7VarA);
                                            }
                                        } catch (Throwable th) {
                                            throw new sg0("Error encoding " + h82Var2 + "->" + str4 + ": " + th.getMessage());
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            mn2 mn2Var3 = mn2VarA;
                            oh.Companion.getClass();
                            str3 = ((Object) str3) + nh.b(strB) + str;
                            i4 = i5;
                            h82Var = h82Var;
                            mn2VarA = mn2Var3;
                            listZ0 = listZ0;
                            i3 = 2;
                        } catch (Throwable unused) {
                            throw new sg0("Unable to encode version " + i6 + ", segment: " + h82Var2);
                        }
                    } else {
                        throw new sg0(pv1.k(i6, "Unsupported TCF version: "));
                    }
                } else {
                    eu.G();
                    throw null;
                }
            }
            return str3;
        }
        throw new sg0(pv1.k(i2, "Unsupported TCF version: "));
    }
}
