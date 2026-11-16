package com.ironsource.adqualitysdk.sdk.i;

import android.util.Pair;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.q63;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ー, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1154 {

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f3344;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f3345;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    public static final String f3346;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static final String f3347;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static final String f3348;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static final String f3349;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static final String f3350;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static final String f3351;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static final String f3352;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static final String f3353;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static final String f3354;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final String f3355;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static final String f3356;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static final HashMap f3357;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final HashMap f3358;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public int f3361 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public int f3360 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public byte f3359 = 0;

    static {
        StringFog.decrypt("zbF6A0k7\n", "ndAIcCxJuEk=\n");
        f3356 = StringFog.decrypt("ryA=\n", "xkaosQs8B/4=\n");
        f3355 = StringFog.decrypt("GxoD5w==\n", "fnZwgh9QVCk=\n");
        f3354 = StringFog.decrypt("tPd4\n", "0pgK4RL4mPM=\n");
        f3353 = StringFog.decrypt("sg6ZBJc=\n", "xWbwaPJr3M4=\n");
        f3352 = StringFog.decrypt("tQRn+Vwc\n", "x2ETjC5y9Uw=\n");
        f3351 = StringFog.decrypt("erz0ViY=\n", "GM6RN03EK4M=\n");
        f3350 = StringFog.decrypt("n4fjA2n5xXQ=\n", "/OiNdwCXsBE=\n");
        f3349 = StringFog.decrypt("Xg==\n", "JQ223lwVR/o=\n");
        f3348 = StringFog.decrypt("GYe9\n", "bfXEK2LwheA=\n");
        f3347 = StringFog.decrypt("1Y5LpjU=\n", "tu8/xV1jj+M=\n");
        f3346 = StringFog.decrypt("7LlTMQ==\n", "gsw/XU4ZdrM=\n");
        f3345 = StringFog.decrypt("5EiRwhw=\n", "lz3hp25mVEw=\n");
        f3344 = StringFog.decrypt("6N2L\n", "nrz5iBkDJm0=\n");
        f3358 = new HashMap();
        f3357 = new HashMap();
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final r m851(List list) {
        try {
            if (this.f3361 < list.size()) {
                return (r) list.get(this.f3361);
            }
            return null;
        } catch (Exception e) {
            throw new C0918(this.f3360, StringFog.decrypt("lv1Rc6Lbrne9pUV+u8OiOKPgV327waA4svESeLfXszin6llzvA==\n", "04UyFtKvxxg=\n"), e);
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final AbstractC1090 m852(List list) {
        AbstractC1090 abstractC1090M855 = m855(list);
        if (this.f3361 < list.size()) {
            String str = m860(list).f443;
            int iHashCode = str.hashCode();
            if (iHashCode != 43) {
                if (iHashCode != 45) {
                    if (iHashCode != 1376) {
                        if (iHashCode == 1440 && str.equals(StringFog.decrypt("T1U=\n", "YngIvDyH1Yc=\n"))) {
                            return m849(new C1355((C4613e0) abstractC1090M855));
                        }
                    } else if (str.equals(StringFog.decrypt("wvo=\n", "6dE0OXBlwac=\n"))) {
                        return m849(new C1239((C4613e0) abstractC1090M855));
                    }
                } else if (str.equals(StringFog.decrypt("pQ==\n", "iGqYm+KodMI=\n"))) {
                    return m849(new C1256(abstractC1090M855, m852(list)));
                }
            } else if (str.equals(StringFog.decrypt("Yw==\n", "SK8/ZXfXYFU=\n"))) {
                return m849(new C1072(abstractC1090M855, m852(list)));
            }
            this.f3361--;
        }
        return abstractC1090M855;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final AbstractC1090 m853(List list) {
        byte b;
        AbstractC1090 abstractC1090M859 = m859(list);
        if (this.f3361 < list.size()) {
            String str = m860(list).f443;
            int iHashCode = str.hashCode();
            if (iHashCode != 1216) {
                if (iHashCode == 3968 && str.equals(StringFog.decrypt("AJo=\n", "fObLQ1bCmdI=\n"))) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals(StringFog.decrypt("UO4=\n", "dsjuCKljuQs=\n"))) {
                b = 0;
            } else {
                b = -1;
            }
            if (b != 0) {
                if (b != 1) {
                    this.f3361--;
                    return abstractC1090M859;
                }
                return m849(new C1204(abstractC1090M859, m853(list)));
            }
            return m849(new C0926(abstractC1090M859, m853(list)));
        }
        return abstractC1090M859;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final AbstractC1090 m854(List list) {
        byte b;
        AbstractC1090 abstractC1090M857 = m857(list);
        while (this.f3361 < list.size()) {
            String str = m860(list).f443;
            int iHashCode = str.hashCode();
            if (iHashCode != 46) {
                if (iHashCode == 91 && str.equals(StringFog.decrypt("OA==\n", "Y1AKbCdhivM=\n"))) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals(StringFog.decrypt("zg==\n", "4Cs6fyKCgRg=\n"))) {
                b = 0;
            } else {
                b = -1;
            }
            if (b != 0) {
                if (b != 1) {
                    this.f3361--;
                    return abstractC1090M857;
                }
                AbstractC1090 abstractC1090M856 = m856(list);
                m864(m860(list), StringFog.decrypt("vA==\n", "4W/kpQnfyX8=\n"), abstractC1090M856, StringFog.decrypt("AXZq0V47rzMGI3vKUjyqJ1JhbYJeJakwF2co1VQ9rmNVXi8=\n", "cgMIoj1JxkM=\n"));
                if (m860(list).f443.equals(StringFog.decrypt("dA==\n", "SRrz69LI/24=\n"))) {
                    abstractC1090M857 = m849(new C0491(abstractC1090M857, abstractC1090M856, m856(list)));
                } else {
                    this.f3361--;
                    abstractC1090M857 = m849(new C0495(abstractC1090M857, abstractC1090M856));
                }
            } else {
                abstractC1090M857 = m862(abstractC1090M857, list);
            }
        }
        return abstractC1090M857;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final AbstractC1090 m855(List list) {
        byte b;
        AbstractC1090 abstractC1090M854 = m854(list);
        if (this.f3361 < list.size()) {
            String str = m860(list).f443;
            int iHashCode = str.hashCode();
            if (iHashCode != 37) {
                if (iHashCode != 42) {
                    if (iHashCode == 47 && str.equals(StringFog.decrypt("ag==\n", "RUlrW5mo5Wc=\n"))) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals(StringFog.decrypt("zw==\n", "5bnm57qostU=\n"))) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals(StringFog.decrypt("AQ==\n", "JH8jxi5xMho=\n"))) {
                b = 2;
            } else {
                b = -1;
            }
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        this.f3361--;
                        return abstractC1090M854;
                    }
                    return m849(new C1252(abstractC1090M854, m855(list)));
                }
                return m849(new C1330(abstractC1090M854, m855(list)));
            }
            return m849(new C1158(abstractC1090M854, m855(list)));
        }
        return abstractC1090M854;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final AbstractC1090 m856(List list) {
        AbstractC1090 abstractC1090M853 = m853(list);
        if (this.f3361 < list.size()) {
            if (m851(list).f443.equals(StringFog.decrypt("ew==\n", "RNabJvIiFaM=\n"))) {
                this.f3361++;
                AbstractC1090 abstractC1090M856 = m856(list);
                m864(m860(list), StringFog.decrypt("Qg==\n", "eMDAvauXPpk=\n"), abstractC1090M856, StringFog.decrypt("MeUsYPTPhfdiv3ku+MiPo2XiOy7z0pC7Kvc7arXfhfdiunk=\n", "RYBeDpW9/Nc=\n"));
                return m849(new C4625k(abstractC1090M853, abstractC1090M856, m856(list)));
            }
        }
        return abstractC1090M853;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC1090 m857(List list) {
        r rVarM860 = m860(list);
        EnumC4637q enumC4637q = rVarM860.f444;
        byte b = -1;
        int i = 0;
        if (enumC4637q == EnumC4637q.f439) {
            String str = rVarM860.f443;
            String str2 = m860(list).f443;
            int iHashCode = str2.hashCode();
            if (iHashCode != 40) {
                if (iHashCode == 61 && str2.equals(StringFog.decrypt("xw==\n", "+o4DUUJeel0=\n"))) {
                    b = 0;
                }
            } else if (str2.equals(StringFog.decrypt("Vw==\n", "f82wwdGNVKI=\n"))) {
                b = 1;
            }
            if (b != 0) {
                if (b != 1) {
                    this.f3361--;
                    return m849(new C4613e0(str));
                }
                return m849(new C1104(str, m863(list, StringFog.decrypt("cQ==\n", "WCDUwLW2ZeY=\n"), new C1157(this))));
            }
            return m849(new C0713((C4613e0) m849(new C4613e0(str)), m856(list)));
        }
        if (enumC4637q == EnumC4637q.f437 || enumC4637q == EnumC4637q.f436 || enumC4637q == EnumC4637q.f435 || enumC4637q == EnumC4637q.f434) {
            if (enumC4637q == EnumC4637q.f436) {
                try {
                    try {
                        return m849(new C0777(Integer.valueOf(Integer.parseInt(rVarM860.f443))));
                    } catch (Exception unused) {
                        return m849(new C1205(Long.valueOf(Long.parseLong(rVarM860.f443))));
                    }
                } catch (Exception unused2) {
                }
            } else {
                if (enumC4637q == EnumC4637q.f435) {
                    return m849(new C1322(Double.valueOf(Double.parseDouble(rVarM860.f443))));
                }
                if (enumC4637q == EnumC4637q.f434) {
                    return m849(new C0461(Boolean.valueOf(Boolean.parseBoolean(rVarM860.f443))));
                }
            }
            return m849(new C1359(rVarM860.f443));
        }
        if (enumC4637q == EnumC4637q.f433) {
            return m849(new C0975(rVarM860.f443));
        }
        if (enumC4637q == EnumC4637q.f440) {
            String str3 = rVarM860.f443;
            int iHashCode2 = str3.hashCode();
            if (iHashCode2 != 3392903) {
                if (iHashCode2 == 109801339 && str3.equals(f3345)) {
                    b = 1;
                }
            } else if (str3.equals(f3346)) {
                b = 0;
            }
            if (b != 0) {
                if (b != 1) {
                    return null;
                }
                m864(m860(list), StringFog.decrypt("Dg==\n", "ILnSEOlSYuU=\n"), rVarM860, StringFog.decrypt("9wiDBExtZWbrCJ8FHi9zLuISnw1ROnNqpB+KQV9te2vwFZwFHiR4eOsekhVXIng=\n", "hH3zYT5NFg4=\n"));
                return m862(m849(new C4613e0(f3345)), list);
            }
            synchronized (C0922.class) {
            }
            return C0922.f2480;
        }
        if (enumC4637q == EnumC4637q.f438) {
            String str4 = rVarM860.f443;
            int iHashCode3 = str4.hashCode();
            if (iHashCode3 != 33) {
                if (iHashCode3 != 40) {
                    if (iHashCode3 != 45) {
                        if (iHashCode3 != 91) {
                            if (iHashCode3 == 123 && str4.equals(f3349)) {
                                HashMap map = new HashMap();
                                ArrayList arrayListM863 = m863(list, StringFog.decrypt("Dw==\n", "chOEDvSDfb8=\n"), new C1184(this));
                                int size = arrayListM863.size();
                                while (i < size) {
                                    Object obj = arrayListM863.get(i);
                                    i++;
                                    Pair pair = (Pair) obj;
                                    map.put((String) pair.first, (AbstractC1090) pair.second);
                                }
                                return m849(new C1069(map));
                            }
                        } else if (str4.equals(StringFog.decrypt("kQ==\n", "yvO5BzVVENM=\n"))) {
                            return m849(new C0715(m863(list, StringFog.decrypt("VA==\n", "CUE8F6Nu1BM=\n"), new C1157(this))));
                        }
                    } else if (str4.equals(StringFog.decrypt("jQ==\n", "oKGBoUvfPJs=\n"))) {
                        return m849(new C1256(m849(new C0777(0)), m857(list)));
                    }
                } else if (str4.equals(StringFog.decrypt("jw==\n", "p6dfBrTdlts=\n"))) {
                    AbstractC1090 abstractC1090M849 = m849(new C1194(m856(list)));
                    m864(m860(list), StringFog.decrypt("YA==\n", "SV+Msm//S+w=\n"), abstractC1090M849, StringFog.decrypt("G97uln/XA+MV2/KWf9cD41Geug==\n", "dred5Ra5ZMM=\n"));
                    return abstractC1090M849;
                }
            } else if (str4.equals(StringFog.decrypt("BA==\n", "JSlNSLh4BOA=\n"))) {
                return m849(new C0965(m854(list)));
            }
            m865(StringFog.decrypt("sMeBDtQPhFCAzcQZ1A+VRZHGllY=\n", "5ankdqRq5yQ=\n") + rVarM860.f443);
            throw null;
        }
        m865(StringFog.decrypt("YiZ6rm+9NIBSLD+icLMymhc=\n", "N0gf1h/YV/Q=\n") + rVarM860);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0599 m858(ArrayList arrayList) {
        AbstractC0599 abstractC0599M848;
        AbstractC1090 abstractC1090M856;
        String str = m860((List) arrayList).f443;
        AbstractC0599 abstractC0599M858 = null;
        AbstractC1090 abstractC1090M857 = null;
        abstractC0599M858 = null;
        switch (str.hashCode()) {
            case -934396624:
                if (str.equals(f3352)) {
                    if (m851(arrayList).f443.equals(StringFog.decrypt("Kw==\n", "EGT1lnqdM+M=\n"))) {
                        abstractC0599M848 = m848(new C1024(null));
                    } else {
                        abstractC0599M848 = m848(new C1024(m856(arrayList)));
                    }
                    m864(m860((List) arrayList), StringFog.decrypt("Vg==\n", "bUj/llQtgVU=\n"), abstractC0599M848, StringFog.decrypt("/lvBLD9+EQr4X8E8IHVfDaxN3TY4fFVZ6VDReTp5RRGsGY5+\n", "jD61WU0QMXk=\n"));
                    return abstractC0599M848;
                }
                break;
            case -567202649:
                if (str.equals(f3350)) {
                    m866(arrayList, StringFog.decrypt("hQ==\n", "vl41LlyFUfE=\n"), StringFog.decrypt("JAP48hBmWLNnH+LnDW1AsykYtvURZ1i6I0zz6B0oWr8zBLahQi8=\n", "R2yWhnkILdY=\n"));
                    return m848(new C0514());
                }
                break;
            case 59:
                if (str.equals(StringFog.decrypt("Ag==\n", "OemfIOQu8w0=\n"))) {
                    return m848(new C0518(null));
                }
                break;
            case INVALID_RI_ENDPOINT_VALUE:
                if (str.equals(f3349)) {
                    return m861(arrayList);
                }
                break;
            case 3357:
                if (str.equals(f3356)) {
                    m866(arrayList, StringFog.decrypt("yw==\n", "42E2qk+aXss=\n"), StringFog.decrypt("REF3JCjGq+BAQjkjfNS36lhLM3c+wv/jQks7OCvCu6VPXnc2fID3og==\n", "LSdXV1yn34U=\n"));
                    AbstractC1090 abstractC1090M858 = m856(arrayList);
                    m864(m860((List) arrayList), StringFog.decrypt("qA==\n", "gT/Sm6ysoWM=\n"), abstractC1090M858, StringFog.decrypt("TN1mh8Bj3aVI3iiAlGHGrkHSMp3bbImzTdQzmNAiy6UF0iiH3WbM4AKTb9M=\n", "JbtG9LQCqcA=\n"));
                    AbstractC0599 abstractC0599M859 = m858(arrayList);
                    if (this.f3361 < arrayList.size()) {
                        if (m851(arrayList).f443.equals(f3355)) {
                            this.f3361++;
                            abstractC0599M858 = m858(arrayList);
                        }
                    }
                    return m848(new C0417(abstractC1090M858, abstractC0599M859, abstractC0599M858, this.f3359));
                }
                break;
            case 101577:
                if (str.equals(f3354)) {
                    m866(arrayList, StringFog.decrypt("WA==\n", "cCrDkBYYZcw=\n"), StringFog.decrypt("HnDKkWcUBZEdct3fYEAXjRdq1NU0AgHFHnDU3XsXAYFYfcGRdUBDzV8=\n", "eB+4sRRgZOU=\n"));
                    String strDecrypt = StringFog.decrypt("tQ==\n", "jrqtFA1/E7g=\n");
                    if (!m851(arrayList).f443.equals(strDecrypt)) {
                        abstractC1090M856 = m856(arrayList);
                        m864(m860((List) arrayList), strDecrypt, abstractC1090M856, q63.i("gjmiTSZTDsLNLK5UO1gc3YQmuAQ6VQDbgS32QSdZT9mEPb4E\n", "7UnWJEk9b64=\n", strDecrypt));
                    } else {
                        abstractC1090M856 = null;
                    }
                    AbstractC1090 abstractC1090M859 = m856(arrayList);
                    m864(m860((List) arrayList), StringFog.decrypt("LA==\n", "F4Du7aPJkCg=\n"), abstractC1090M859, StringFog.decrypt("BpCE7q4haI4Ji5+ho251gg+KmqrtK2iOQIifuqVuIdFH\n", "YP/2zs1OBuo=\n"));
                    String strDecrypt2 = StringFog.decrypt("FQ==\n", "PErOLpqdfRE=\n");
                    if (!m851(arrayList).f443.equals(strDecrypt2)) {
                        abstractC1090M857 = m856(arrayList);
                        m864(m860((List) arrayList), strDecrypt2, abstractC1090M857, q63.i("gjmiTSZTDsLNLK5UO1gc3YQmuAQ6VQDbgS32QSdZT9mEPb4E\n", "7UnWJEk9b64=\n", strDecrypt2));
                    }
                    return m848(new C0559(abstractC1090M856, abstractC1090M859, abstractC1090M857, m858(arrayList)));
                }
                break;
            case 115131:
                if (str.equals(f3348)) {
                    String str2 = f3349;
                    m866(arrayList, str2, StringFog.decrypt("cwJfE3CqNpZiHUNdd/46l3QEBlFm/jSNagBJRm26d8puHlVaZ7t3xXwNARo=\n", "B3AmMwPeV+I=\n"));
                    C0953 c0953M861 = m861(arrayList);
                    m866(arrayList, f3347, StringFog.decrypt("5u88Gbj6dTD38CBXv65nLP3oKV3r7HFk9PIpVaT5cSCy/zwZqq53Jeb+LRm4+nUw9/AgV78=\n", "kp1FOcuOFEQ=\n"));
                    m866(arrayList, StringFog.decrypt("5g==\n", "zkrLarS3+Mk=\n"), StringFog.decrypt("/2xARvLd0K3leltX/t3IoPN4WEG6n97o+mJYSfWK3qy8b00F+92c4Ls=\n", "nA00JZr9u8g=\n"));
                    r rVarM860 = m860((List) arrayList);
                    EnumC4637q enumC4637q = EnumC4637q.f439;
                    String strDecrypt3 = StringFog.decrypt("nV6TJG3EfY2TVpQ0bIpszIJegTVozzrDkVqF\n", "8DfgVwSqGq0=\n");
                    if (rVarM860.f444.equals(enumC4637q)) {
                        C4613e0 c4613e0 = (C4613e0) m849(new C4613e0(rVarM860.f443));
                        m866(arrayList, StringFog.decrypt("yw==\n", "4rxfGkg4g6A=\n"), StringFog.decrypt("aOy1tMJTESZ57Kz32RsOMmfp4bXPUwcoZ+GuoM8XQSVyraD3jVpG\n", "C43B16pzYUc=\n"));
                        m866(arrayList, str2, StringFog.decrypt("SL9DUmuXjMtKqlJcZtmLn0arREUj1ZqfSLFaQWzCkdsL9l5fcN6b2gv5TEwkng==\n", "K943MQO3/78=\n"));
                        return m848(new C4650x(c0953M861, m861(arrayList), c4613e0));
                    }
                    m865(m850(enumC4637q.toString(), rVarM860.f444.toString(), c0953M861, strDecrypt3));
                    throw null;
                }
                break;
            case 116519:
                if (str.equals(f3344)) {
                    return m848(new C4616f0(m863(arrayList, StringFog.decrypt("Zg==\n", "XX/cAIa7xmU=\n"), new C1190(this))));
                }
                break;
            case 94001407:
                if (str.equals(f3351)) {
                    m866(arrayList, StringFog.decrypt("MA==\n", "Cw4P+0gAFLg=\n"), StringFog.decrypt("8tBeeoJYk47x1l52jBaU2uPKVG6FHMCf/sYbbIAMiNq3mRw=\n", "kKI7G+l44Po=\n"));
                    return m848(new C0455());
                }
                break;
            case 113101617:
                if (str.equals(f3353)) {
                    m866(arrayList, StringFog.decrypt("9Q==\n", "3fLitw2T7zU=\n"), StringFog.decrypt("gRzSPxRfm0eXAN4+FBGcE4Uc1CYdG8hRk1TdPB0Th0STEJsxCF+JE9FcnA==\n", "9nS7U3F/6DM=\n"));
                    AbstractC1090 abstractC1090M8510 = m856(arrayList);
                    m866(arrayList, StringFog.decrypt("/Q==\n", "1MY/QitVV2Y=\n"), StringFog.decrypt("o2rFgIk0nvu1dsmBiXqZr7dtwoiFYITguiLfhINhgev0YMnMhXqe5rBnjMvEPco=\n", "1AKs7OwU7Y8=\n"));
                    return m848(new j1(abstractC1090M8510, m858(arrayList)));
                }
                break;
        }
        this.f3361--;
        AbstractC1090 abstractC1090M8511 = m856(arrayList);
        m864(m860((List) arrayList), StringFog.decrypt("Ig==\n", "GZyGMoN1Ya8=\n"), abstractC1090M8511, StringFog.decrypt("J93qHqVarsBtj75NrUDphSTQuQKqFLqUK8D8AKlavQ==\n", "SrSZbcw0yeA=\n"));
        return m848(new C0518(abstractC1090M8511));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC1090 m862(AbstractC1090 abstractC1090, List list) {
        r rVarM860 = m860(list);
        ArrayList arrayListM863 = null;
        if (rVarM860.f444 == EnumC4637q.f439) {
            String str = rVarM860.f443;
            r rVarM861 = m860(list);
            if (rVarM861.f443.equals(StringFog.decrypt("yA==\n", "9D0M0HIdGeI=\n"))) {
                arrayListM863 = m863(list, StringFog.decrypt("kw==\n", "rUS/00n/o3k=\n"), new C1180(this));
                m864(m860(list), StringFog.decrypt("vQ==\n", "lb//WddLtfU=\n"), arrayListM863, StringFog.decrypt("CGHh/DeoXYoVaqfzPqpakFpq5v03uAmQEmvy/DbrS4ZaYuj8PqRehh4k5elyokeVFWfm5DukR8Nd\nLKm+fOIO\n", "egSHkFLLKeM=\n"));
            } else {
                if (!rVarM861.f443.equals(StringFog.decrypt("pw==\n", "j69Ffk2Dt60=\n"))) {
                    this.f3361--;
                    return m849(new C0862(abstractC1090, str));
                }
            }
            return m849(new C0609(abstractC1090, str, arrayListM863, m863(list, StringFog.decrypt("cg==\n", "W2eJPyOzaLU=\n"), new C1157(this))));
        }
        throw new C0918(this.f3360, StringFog.decrypt("Y46HgAsGoEoGn5OABgasSE+ThcUKB7EOQZmDxQ==\n", "Jvb35WhyxS4=\n") + rVarM860, null);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static AbstractC1090 m849(AbstractC1090 abstractC1090) {
        HashMap map = f3358;
        AbstractC1090 abstractC1091 = (AbstractC1090) map.get(abstractC1090);
        if (abstractC1091 != null) {
            return abstractC1091;
        }
        map.put(abstractC1090, abstractC1090);
        return abstractC1090;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static AbstractC0599 m848(AbstractC0599 abstractC0599) {
        HashMap map = f3357;
        AbstractC0599 abstractC05910 = (AbstractC0599) map.get(abstractC0599);
        if (abstractC05910 != null) {
            return abstractC05910;
        }
        map.put(abstractC0599, abstractC0599);
        return abstractC0599;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C0953 m861(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        byte b = (byte) (this.f3359 + 1);
        this.f3359 = b;
        r rVarM851 = m851(arrayList);
        while (!rVarM851.f443.equals(StringFog.decrypt("jw==\n", "8vBdqttvn84=\n"))) {
            this.f3360++;
            arrayList2.add(m858(arrayList));
            rVarM851 = m851(arrayList);
        }
        this.f3361++;
        this.f3360++;
        this.f3359 = (byte) (this.f3359 - 1);
        return (C0953) m848(new C0953(arrayList2, b));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m864(r rVar, String str, Object obj, String str2) {
        if (rVar.f443.equals(str)) {
            return;
        }
        String strM868 = AbstractC1156.m868("Sg==\n", "bWguQ/Kgii8=\n", AbstractC0688.m577("pg==\n", "gadHtYV5mGw=\n", new StringBuilder(), str));
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("ng==\n", "udnG1PVx0Yo=\n"));
        sb.append(rVar.f443);
        m865(m850(strM868, AbstractC1156.m868("2A==\n", "/+a50bQvWDw=\n", sb), obj, str2));
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Pair m847(C1154 c1154, List list) {
        r rVarM860 = c1154.m860(list);
        if (rVarM860.f444 == EnumC4637q.f437) {
            String str = rVarM860.f443;
            c1154.m864(c1154.m860(list), StringFog.decrypt("iw==\n", "sYpkfaCfLRk=\n"), str, StringFog.decrypt("5WnHjRwqczOvacCMSS1yau1/iIVTLXol+H/Mw144NiuvbMmPSSQ2K+luzZEcZixt\n", "jxqo4zxBFko=\n"));
            return new Pair(str, c1154.m856(list));
        }
        throw new C0918(c1154.f3360, StringFog.decrypt("pk4B9H9Vgg3DZQXjdU+ASYFDBbF7TpNJ\n", "4zZxkRwh52k=\n") + rVarM860, null);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList m863(List list, String str, InterfaceC1155 interfaceC1155) {
        ArrayList arrayList = new ArrayList();
        if (!m860(list).f443.equals(str)) {
            this.f3361--;
            arrayList.add(interfaceC1155.mo867(list));
            r rVarM860 = m860(list);
            while (rVarM860.f443.equals(StringFog.decrypt("fA==\n", "UCdge1x0tXI=\n"))) {
                arrayList.add(interfaceC1155.mo867(list));
                rVarM860 = m860(list);
            }
            m864(rVarM860, str, arrayList, AbstractC1156.m868("Eg==\n", "NVSxOiygHZc=\n", AbstractC0688.m577("iUP+I4mANkWQRul3zJ06CpJD+T+J1A==\n", "5SqNV6nzXio=\n", new StringBuilder(), str)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final r m860(List list) {
        try {
            if (this.f3361 < list.size()) {
                int i = this.f3361;
                this.f3361 = i + 1;
                return (r) list.get(i);
            }
            throw new C0918(this.f3360, StringFog.decrypt("5s+U0U3xjj/WxdHMU/DNJNWBhcZW8YM4\n", "s6HxqT2U7Us=\n"), null);
        } catch (Exception e) {
            throw new C0918(this.f3360, StringFog.decrypt("bKPiNbVLTXBH+/Y4rFNBP06+9SSsUUM/R775JOVLS3RMtQ==\n", "KduBUMU/JB8=\n"), e);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m866(ArrayList arrayList, String str, String str2) {
        m864(m860((List) arrayList), str, (Object) null, str2);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m850(String str, String str2, Object obj, String str3) {
        String str4;
        if (obj != null) {
            str4 = StringFog.decrypt("5sxqyhm/EQ==\n", "xq0MvnzNMWA=\n") + obj;
        } else {
            str4 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("4IGQziwmqACF\n", "pfngq09SzWQ=\n"));
        sb.append(str);
        sb.append(str4);
        StringBuilder sbM577 = AbstractC0688.m577("5WR6adrKueugb3l4npg=\n", "xQYPHfq43Ig=\n", sb, str2);
        sbM577.append(str3 != null ? q63.i("EtGz\n", "MvyTVEVm7HA=\n", str3) : "");
        return sbM577.toString();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m865(String str) {
        throw new C0918(this.f3360, str, null);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC1090 m859(List list) {
        AbstractC1090 abstractC1090M852 = m852(list);
        if (this.f3361 < list.size()) {
            String str = m860(list).f443;
            int iHashCode = str.hashCode();
            if (iHashCode != 60) {
                if (iHashCode != 62) {
                    if (iHashCode != 1084) {
                        if (iHashCode != 1921) {
                            if (iHashCode != 1952) {
                                if (iHashCode == 1983 && str.equals(StringFog.decrypt("3EE=\n", "4nxMmUx/kd8=\n"))) {
                                    return m849(new C0879(abstractC1090M852, m859(list)));
                                }
                            } else if (str.equals(StringFog.decrypt("kcU=\n", "rPipa+8bzpE=\n"))) {
                                return m849(new C1291(abstractC1090M852, m859(list)));
                            }
                        } else if (str.equals(StringFog.decrypt("WbQ=\n", "ZYku2DRlKPc=\n"))) {
                            return m849(new C0866(abstractC1090M852, m859(list)));
                        }
                    } else if (str.equals(StringFog.decrypt("kbs=\n", "sIYDBUEIGGU=\n"))) {
                        return m849(new C0983(abstractC1090M852, m859(list)));
                    }
                } else if (str.equals(StringFog.decrypt("gA==\n", "vnT7Hb3nvv0=\n"))) {
                    return m849(new C0880(abstractC1090M852, m859(list)));
                }
            } else if (str.equals(StringFog.decrypt("4A==\n", "3DE7onScWAc=\n"))) {
                return m849(new C0941(abstractC1090M852, m859(list)));
            }
            this.f3361--;
        }
        return abstractC1090M852;
    }
}
