package com.vungle.ads.internal.model;

import com.vungle.ads.AdConfig;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.cy;
import defpackage.dk2;
import defpackage.dt1;
import defpackage.du;
import defpackage.eu;
import defpackage.hu;
import defpackage.hw0;
import defpackage.ia1;
import defpackage.iw;
import defpackage.j52;
import defpackage.j8;
import defpackage.jg1;
import defpackage.p32;
import defpackage.s71;
import defpackage.tb5;
import defpackage.uu;
import defpackage.vh1;
import defpackage.vr;
import defpackage.zj2;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class i0 {

    @NotNull
    public static final p Companion = new p();
    public final List a;
    public final w2 b;
    public Long c;
    public ConcurrentHashMap d;
    public Map e;
    public boolean f;
    public AdConfig g;
    public com.vungle.ads.internal.util.s h;
    public String i;

    public final void C() {
        this.f = true;
    }

    public final w2 f() {
        return this.b;
    }

    public final s i() {
        List list = this.a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (s) list.get(0);
    }

    public final AdConfig j() {
        return this.g;
    }

    public final String p() {
        return this.i;
    }

    public final com.vungle.ads.internal.util.s q() {
        return this.h;
    }

    public /* synthetic */ i0(int i, List list, w2 w2Var, Long l, ConcurrentHashMap concurrentHashMap, Map map, boolean z, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = w2Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = new ConcurrentHashMap();
        } else {
            this.d = concurrentHashMap;
        }
        if ((i & 16) == 0) {
            this.e = new HashMap();
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        this.g = null;
        this.h = null;
        if ((i & 64) == 0) {
            this.i = null;
        } else {
            this.i = str;
        }
    }

    public final String A() {
        s sVarI = i();
        if (sVarI != null) {
            return sVarI.a;
        }
        return null;
    }

    public final void B() {
        this.c = Long.valueOf(System.currentTimeMillis());
    }

    public final String D() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.t;
        }
        return null;
    }

    public final boolean E() {
        boolean zB;
        i iVarK = k();
        if (iVarK != null) {
            zB = s71.b(iVarK.l(), Boolean.TRUE);
        } else {
            zB = false;
        }
        if (!zB || y()) {
            return false;
        }
        return true;
    }

    public final ArrayList a(File file) {
        v vVarJ;
        Map mapA;
        boolean z;
        i iVarK;
        String strM;
        String str;
        Object j52Var;
        File parentFile;
        file.getClass();
        ArrayList arrayList = new ArrayList();
        dt1 dt1Var = null;
        if (!y() && (iVarK = k()) != null && (strM = iVarK.m()) != null) {
            if (com.vungle.ads.internal.util.n.a(strM)) {
                str = strM;
            } else {
                str = null;
            }
            if (str != null) {
                try {
                    String path = new URI(str).getPath();
                    path.getClass();
                    List listM0 = dk2.m0(dk2.z0(path, '/'), new char[]{'/'}, 6);
                    if (listM0.size() >= 2) {
                        j52Var = du.g0(du.u0(2, listM0), "_", null, null, null, 62);
                    } else {
                        j52Var = "index.html";
                    }
                } catch (Throwable th) {
                    j52Var = new j52(th);
                }
                if (j52Var instanceof j52) {
                    j52Var = null;
                }
                String str2 = (String) j52Var;
                if (str2 != null && (parentFile = file.getParentFile()) != null) {
                    dt1Var = new dt1(str, new File(parentFile, str2));
                }
            }
        }
        if (dt1Var != null) {
            String str3 = (String) dt1Var.a;
            File file2 = (File) dt1Var.b;
            this.i = file2.getAbsolutePath();
            if (!file2.exists()) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AdPayload", "No cacheable index file found, creating new one: " + file2);
                String absolutePath = file2.getAbsolutePath();
                absolutePath.getClass();
                arrayList.add(new b("vmURL", str3, absolutePath, true));
            }
        }
        i iVarK2 = k();
        if (iVarK2 != null && (vVarJ = iVarK2.j()) != null && (mapA = vVarJ.a()) != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                String str4 = (String) entry.getKey();
                o oVar = (o) entry.getValue();
                String strB = oVar.b();
                if (strB != null && com.vungle.ads.internal.util.n.a(strB)) {
                    String absolutePath2 = new File(file, com.vungle.ads.internal.util.n.a(strB, oVar.a())).getAbsolutePath();
                    absolutePath2.getClass();
                    if (!y() && b()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    arrayList.add(new b(str4, strB, absolutePath2, z));
                }
            }
        }
        if (arrayList.size() > 1) {
            hu.M(arrayList, new h0());
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List b(String str, String str2, String str3) {
        List list;
        Map mapK;
        Map mapK2;
        str.getClass();
        i iVarK = k();
        if (iVarK != null && (mapK2 = iVarK.k()) != null && !mapK2.containsKey(str)) {
            new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, com.iab.omid.library.vungle.d.a("Arbitrary tpat key: ", str)).setLogEntry$vungle_ads_release(this.h).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        i iVarK2 = k();
        if (iVarK2 != null && (mapK = iVarK2.k()) != null) {
            list = (List) mapK.get(str);
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            switch (str) {
                case "checkpoint.0":
                    ArrayList arrayList = new ArrayList(eu.f(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a(a(a((String) it.next(), "{{{remote_play}}}", String.valueOf(!this.f)), "{{{carrier}}}", str2), "{{{vol}}}", str3));
                    }
                    return arrayList;
                case "video.length":
                    ArrayList arrayList2 = new ArrayList(eu.f(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(a((String) it2.next(), "{{{vlen}}}", str2));
                    }
                    return arrayList2;
                case "ad.loadDuration":
                    ArrayList arrayList3 = new ArrayList(eu.f(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(a((String) it3.next(), "{{{time_dl}}}", str2));
                    }
                    return arrayList3;
                case "ad.close":
                    ArrayList arrayList4 = new ArrayList(eu.f(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(a(a((String) it4.next(), "{{{dur}}}", str2), "{{{vol}}}", str3));
                    }
                    return arrayList4;
                case "deeplink.click":
                    ArrayList arrayList5 = new ArrayList(eu.f(list, 10));
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(a((String) it5.next(), "{{{is_success}}}", str2));
                    }
                    return arrayList5;
                default:
                    if (str.equals("checkpoint.0")) {
                        ArrayList arrayList6 = new ArrayList(eu.f(list, 10));
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            arrayList6.add(a(a(a((String) it6.next(), "{{{remote_play}}}", String.valueOf(!this.f)), "{{{carrier}}}", str2), "{{{vol}}}", str3));
                        }
                        return arrayList6;
                    }
                    return list;
            }
        }
        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, com.iab.omid.library.vungle.d.a("Empty tpat key: ", str)).setLogEntry$vungle_ads_release(this.h).logErrorNoReturnValue$vungle_ads_release();
        return null;
    }

    public final i c() {
        return k();
    }

    public final int d() {
        f fVar;
        Integer num;
        i iVarK = k();
        if (iVarK != null && (fVar = iVarK.z) != null && (num = fVar.a) != null) {
            return num.intValue();
        }
        return 0;
    }

    public final String e() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.w;
        }
        return null;
    }

    public final kotlinx.serialization.json.c g() {
        LinkedHashMap linkedHashMapR = r();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapR.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            kotlinx.serialization.json.d dVarC = ia1.c(str2);
            dVarC.getClass();
        }
        return new kotlinx.serialization.json.c(linkedHashMap);
    }

    public final String h() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.a;
        }
        return null;
    }

    public final i k() {
        s sVarI = i();
        if (sVarI != null) {
            return sVarI.b;
        }
        return null;
    }

    public final String l() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.c;
        }
        return null;
    }

    public final l m() {
        s sVarI = i();
        if (sVarI != null) {
            return sVarI.c;
        }
        return null;
    }

    public final String n() {
        String str;
        i iVarK = k();
        if (iVarK != null && (str = iVarK.v) != null) {
            return str;
        }
        return "unknown";
    }

    public final String o() {
        v vVar;
        Map map;
        i iVarK = k();
        if (iVarK != null && (vVar = iVarK.u) != null && (map = vVar.a) != null) {
            return (String) map.get("OBSERVED_EXPERIMENTS");
        }
        return null;
    }

    public final LinkedHashMap r() {
        v vVar;
        v vVar2;
        Map map;
        v vVar3;
        Map map2;
        i iVarK = k();
        if (iVarK != null) {
            vVar = iVarK.u;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            i iVarK2 = k();
            if (iVarK2 != null && (vVar3 = iVarK2.u) != null && (map2 = vVar3.a) != null) {
                linkedHashMap.putAll(map2);
            }
            i iVarK3 = k();
            if (iVarK3 != null && (vVar2 = iVarK3.u) != null && (map = vVar2.b) != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = ((o) entry.getValue()).a;
                    if (str != null) {
                        linkedHashMap.put(entry.getKey(), str);
                    }
                }
            }
            if (!this.d.isEmpty()) {
                linkedHashMap.putAll(this.d);
            }
            if (!this.e.isEmpty()) {
                linkedHashMap.putAll(this.e);
            }
            return linkedHashMap;
        }
        defpackage.d.r("Advertisement does not have MRAID Arguments!");
        return null;
    }

    public final String s() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.i;
        }
        return null;
    }

    public final String t() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.o;
        }
        return null;
    }

    public final f0 u() {
        i iVarK = k();
        if (iVarK != null) {
            return iVarK.A;
        }
        return null;
    }

    public final boolean v() {
        i iVarK = k();
        if (iVarK == null) {
            return false;
        }
        Long l = this.c;
        Long lValueOf = null;
        if (iVarK.e != null && l != null) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - l.longValue()) / 1000;
            Integer num = iVarK.e;
            if (num != null) {
                lValueOf = Long.valueOf(num.intValue());
            }
            if (jCurrentTimeMillis > lValueOf.longValue()) {
                return true;
            }
        } else if (iVarK.d != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
            Integer num2 = iVarK.d;
            if (num2 != null) {
                lValueOf = Long.valueOf(num2.intValue());
            }
            if (jCurrentTimeMillis2 > lValueOf.longValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        v vVarJ;
        Map mapB;
        String str;
        i iVarK = k();
        if (iVarK != null && (vVarJ = iVarK.j()) != null && (mapB = vVarJ.b()) != null && (str = (String) mapB.get("AD_PODDING")) != null && str.equalsIgnoreCase("true")) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        Boolean bool;
        i iVarK = k();
        if (iVarK != null && (bool = iVarK.g) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean y() {
        return s71.b(D(), "native");
    }

    public final boolean z() {
        z zVar;
        c0 c0Var;
        Boolean bool;
        i iVarK = k();
        if (iVarK != null && (zVar = iVarK.s) != null && (c0Var = zVar.a) != null && (bool = c0Var.a) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int a() {
        f fVar;
        Integer num;
        i iVarK = k();
        if (iVarK == null || (fVar = iVarK.z) == null || (num = fVar.b) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void a(AdConfig adConfig) {
        this.g = adConfig;
    }

    public final void a(com.vungle.ads.internal.util.s sVar) {
        this.h = sVar;
    }

    public final boolean a(String str) {
        v vVarJ;
        Map mapA;
        str.getClass();
        if (!y()) {
            i iVarK = k();
            if (s71.b(iVarK != null ? iVarK.m() : null, str)) {
                return true;
            }
        }
        i iVarK2 = k();
        if (iVarK2 == null || (vVarJ = iVarK2.j()) == null || (mapA = vVarJ.a()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapA.entrySet()) {
            if (s71.b(((o) entry.getValue()).b(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public static final void a(i0 i0Var, iw iwVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        i0Var.getClass();
        iwVar.getClass();
        pluginGeneratedSerialDescriptor.getClass();
        if (iwVar.B(pluginGeneratedSerialDescriptor) || i0Var.a != null) {
            iwVar.h(pluginGeneratedSerialDescriptor, 0, new j8(q.a, 0), i0Var.a);
        }
        if (iwVar.B(pluginGeneratedSerialDescriptor) || i0Var.b != null) {
            iwVar.h(pluginGeneratedSerialDescriptor, 1, v1.a, i0Var.b);
        }
        if (iwVar.B(pluginGeneratedSerialDescriptor) || i0Var.c != null) {
            iwVar.h(pluginGeneratedSerialDescriptor, 2, jg1.a, i0Var.c);
        }
        if (iwVar.B(pluginGeneratedSerialDescriptor) || !s71.b(i0Var.d, new ConcurrentHashMap())) {
            vr vrVarA = p32.a(ConcurrentHashMap.class);
            zj2 zj2Var = zj2.a;
            iwVar.e(pluginGeneratedSerialDescriptor, 3, new cy(vrVarA, (KSerializer) null, new KSerializer[]{zj2Var, zj2Var}), i0Var.d);
        }
        if (iwVar.B(pluginGeneratedSerialDescriptor) || !s71.b(i0Var.e, new HashMap())) {
            zj2 zj2Var2 = zj2.a;
            iwVar.e(pluginGeneratedSerialDescriptor, 4, new hw0(zj2Var2, zj2Var2, 1), i0Var.e);
        }
        if (iwVar.B(pluginGeneratedSerialDescriptor) || i0Var.f) {
            iwVar.p(pluginGeneratedSerialDescriptor, 5, i0Var.f);
        }
        if (!iwVar.B(pluginGeneratedSerialDescriptor) && i0Var.i == null) {
            return;
        }
        iwVar.h(pluginGeneratedSerialDescriptor, 6, zj2.a, i0Var.i);
    }

    public static /* synthetic */ List a(i0 i0Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return i0Var.b(str, str2, null);
    }

    public final void a(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        if (str.length() > 0) {
            this.e.put("INCENTIVIZED_TITLE_TEXT", str);
        }
        if (str2.length() > 0) {
            this.e.put("INCENTIVIZED_BODY_TEXT", str2);
        }
        if (str3.length() > 0) {
            this.e.put("INCENTIVIZED_CONTINUE_TEXT", str3);
        }
        if (str4.length() > 0) {
            this.e.put("INCENTIVIZED_CLOSE_TEXT", str4);
        }
    }

    public final int a(Boolean bool) {
        Integer numG;
        int iIntValue;
        Integer numH;
        if (s71.b(bool, Boolean.TRUE)) {
            i iVarK = k();
            if (iVarK == null || (numH = iVarK.h()) == null) {
                return 0;
            }
            iIntValue = numH.intValue();
        } else {
            i iVarK2 = k();
            if (iVarK2 == null || (numG = iVarK2.g()) == null) {
                return 0;
            }
            iIntValue = numG.intValue();
        }
        return iIntValue * 1000;
    }

    public static String a(String str, String str2, String str3) {
        if (str3 == null) {
            str3 = "";
        }
        String strQuote = Pattern.quote(str2);
        strQuote.getClass();
        Pattern patternCompile = Pattern.compile(strQuote);
        patternCompile.getClass();
        g0 g0Var = new g0(str3);
        str.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        vh1 vh1VarA = uu.a(matcher, 0, str);
        if (vh1VarA == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            Matcher matcher2 = vh1VarA.a;
            sb.append((CharSequence) str, i, tb5.D(matcher2.start(), matcher2.end()).a);
            sb.append((CharSequence) g0Var.invoke(vh1VarA));
            i = tb5.D(matcher2.start(), matcher2.end()).b + 1;
            CharSequence charSequence = vh1VarA.b;
            int iEnd = matcher2.end() + (matcher2.end() != matcher2.start() ? 0 : 1);
            if (iEnd <= charSequence.length()) {
                Matcher matcher3 = matcher2.pattern().matcher(charSequence);
                matcher3.getClass();
                vh1VarA = uu.a(matcher3, iEnd, charSequence);
            } else {
                vh1VarA = null;
            }
            if (i >= length) {
                break;
            }
        } while (vh1VarA != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final boolean b() {
        Boolean bool;
        i iVarK = k();
        if (iVarK == null || (bool = iVarK.h) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final synchronized void a(File file, String str) {
        str.getClass();
        file.getClass();
        if (file.exists()) {
            ConcurrentHashMap concurrentHashMap = this.d;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("file://");
            sbA.append(file.getAbsolutePath());
            concurrentHashMap.put(str, sbA.toString());
        }
    }
}
