package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import android.util.Pair;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class h extends e {
    private static final String q = "VastAdParser";
    private static final CharSequence r = "acao/yes";
    public static final LinkedHashSetWithItemLimit<i> p = new LinkedHashSetWithItemLimit<>(50);

    public static class a {
        private boolean a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private List<Pair<String, String>> i;
        private List<String> j;
        private List<String> k;
        private List<String> l;
        private List<String> m;
        private List<String> n;
        private List<String> o;
        private List<String> p;
        private List<String> q;
        private List<String> r;
        private List<String> s;
        private String t;

        a(String str, String str2, String str3, String str4, ArrayList<String> arrayList, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, List<String> list7, List<String> list8, boolean z, String str5, List<String> list9, String str6, List<Pair<String, String>> list10, String str7) {
            this.a = false;
            this.k = new ArrayList();
            this.l = new ArrayList();
            this.m = new ArrayList();
            this.n = new ArrayList();
            this.o = new ArrayList();
            this.d = str;
            this.e = str2;
            this.b = str3;
            this.c = str4;
            this.k = arrayList;
            this.l = list;
            this.m = list2;
            this.n = list3;
            this.o = list4;
            this.p = list5;
            this.q = list6;
            this.r = list7;
            this.s = list8;
            this.a = z;
            this.g = z ? str5 : null;
            this.j = list9;
            this.h = str6;
            this.i = list10;
            this.t = str7;
            Logger.v(h.q, "Vast ad created: vastAdId=", str, " adSystem=", str2);
            Logger.v(h.q, "clickUrl=", str3);
            Logger.v(h.q, "videoUrl=", str4);
            Object[] objArr = new Object[2];
            objArr[0] = "prefetchResourceUrls=";
            objArr[1] = arrayList != null ? arrayList.toString() : "null";
            Logger.v(h.q, objArr);
            Object[] objArr2 = new Object[2];
            objArr2[0] = "staticResourceUrls=";
            objArr2[1] = list != null ? list.toString() : "null";
            Logger.v(h.q, objArr2);
            Object[] objArr3 = new Object[2];
            objArr3[0] = "scriptResourceUrls=";
            objArr3[1] = list2 != null ? list2.toString() : "null";
            Logger.v(h.q, objArr3);
            Object[] objArr4 = new Object[2];
            objArr4[0] = "htmlResourceUrls=";
            objArr4[1] = list3 != null ? list3.toString() : "null";
            Logger.v(h.q, objArr4);
            Object[] objArr5 = new Object[2];
            objArr5[0] = "videoCompletedUrls=";
            objArr5[1] = list5 != null ? list5.toString() : "null";
            Logger.v(h.q, objArr5);
            Object[] objArr6 = new Object[2];
            objArr6[0] = "videoTrackingEventUrls=";
            objArr6[1] = list6 != null ? list6.toString() : "null";
            Logger.v(h.q, objArr6);
            Object[] objArr7 = new Object[2];
            objArr7[0] = "clickTrackingUrls=";
            objArr7[1] = list7 != null ? list7.toString() : "null";
            Logger.v(h.q, objArr7);
            Object[] objArr8 = new Object[2];
            objArr8[0] = "companionClickTrackingUrls=";
            objArr8[1] = list8 != null ? list8.toString() : "null";
            Logger.v(h.q, objArr8);
            Logger.v(h.q, "containsMediaFileWithJsAppAttribute=", Boolean.valueOf(z));
            Logger.v(h.q, "adParameters=", str5);
            Object[] objArr9 = new Object[2];
            objArr9[0] = "impressionUrls=";
            objArr9[1] = list9 != null ? list9.toString() : "null";
            Logger.v(h.q, objArr9);
            Object[] objArr10 = new Object[2];
            objArr10[0] = "mediaUrlList=";
            objArr10[1] = list10 != null ? list10.toString() : "null";
            Logger.v(h.q, objArr10);
            Logger.v(h.q, "vastDocVersion=", str7);
        }

        a(String str, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str4) {
            this.a = false;
            this.k = new ArrayList();
            this.l = new ArrayList();
            this.m = new ArrayList();
            this.n = new ArrayList();
            this.o = new ArrayList();
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.j = list;
            this.p = list2;
            this.q = list3;
            this.r = list4;
            this.s = list5;
            this.t = str4;
            Logger.v(h.q, "Vast ad created: vastAdId=", str, " adSystem=", str2);
            Logger.v(h.q, "vastAdUri=", str3);
            Object[] objArr = new Object[2];
            objArr[0] = "videoCompletedUrls=";
            objArr[1] = list2 != null ? list2.toString() : "null";
            Logger.v(h.q, objArr);
            Object[] objArr2 = new Object[2];
            objArr2[0] = "videoTrackingEventUrls=";
            objArr2[1] = list3 != null ? list3.toString() : "null";
            Logger.v(h.q, objArr2);
            Object[] objArr3 = new Object[2];
            objArr3[0] = "clickTrackingUrls=";
            objArr3[1] = list4 != null ? list4.toString() : "null";
            Logger.v(h.q, objArr3);
            Object[] objArr4 = new Object[2];
            objArr4[0] = "companionClickTrackingUrls=";
            objArr4[1] = list5 != null ? list5.toString() : "null";
            Logger.v(h.q, objArr4);
            Object[] objArr5 = new Object[2];
            objArr5[0] = "impressionUrls=";
            objArr5[1] = list != null ? list.toString() : "null";
            Logger.v(h.q, objArr5);
            Logger.v(h.q, "vastDocVersion=", str4);
        }

        public String a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.d;
        }

        public void a(String str) {
            this.d = str;
        }

        public String d() {
            return this.e;
        }

        public void b(String str) {
            this.e = str;
        }

        public String e() {
            return this.f;
        }

        public void c(String str) {
            this.f = str;
        }

        public String f() {
            return this.g;
        }

        public String g() {
            return this.h;
        }

        public List<String> h() {
            ArrayList arrayList = new ArrayList();
            if (this.i != null) {
                Iterator<Pair<String, String>> it = this.i.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().second);
                }
            }
            return arrayList;
        }

        public List<String> i() {
            return this.j;
        }

        public void a(List<String> list) {
            this.j = list;
        }

        public List<String> j() {
            return this.k;
        }

        public List<String> k() {
            return this.l;
        }

        public List<String> l() {
            return this.m;
        }

        public List<String> m() {
            return this.n;
        }

        public List<String> n() {
            return this.o;
        }

        public List<String> o() {
            return this.p;
        }

        public void b(List<String> list) {
            this.p = list;
        }

        public List<String> p() {
            return this.q;
        }

        public void c(List<String> list) {
            this.q = list;
        }

        public List<String> q() {
            return this.r;
        }

        public void d(List<String> list) {
            this.r = list;
        }

        public List<String> r() {
            return this.s;
        }

        public void e(List<String> list) {
            this.s = list;
        }

        public boolean s() {
            return this.a && !u();
        }

        public String t() {
            return this.t;
        }

        public void d(String str) {
            this.t = str;
        }

        private boolean u() {
            for (Pair<String, String> pair : this.i) {
                String str = (String) pair.first;
                String str2 = (String) pair.second;
                if (str.startsWith("video")) {
                    Logger.d(h.q, "video file exists: ", str2);
                    return true;
                }
            }
            Logger.printFullVerboseLog(h.q, "video file doesn't exist: ", this.i);
            return false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("vastAdId=");
            sb.append(this.d == null ? "null" : this.d);
            sb.append(", adSystem=");
            sb.append(this.e == null ? "null" : this.e);
            sb.append(", clickUrl=");
            sb.append(this.b == null ? "null" : this.b);
            sb.append(", videoUrl=");
            sb.append(this.c == null ? "null" : this.c);
            sb.append(", vastAdUri=");
            sb.append(this.f == null ? "null" : this.f);
            sb.append(", mediaUrlList=");
            sb.append(this.i == null ? "null" : this.i.toString());
            return sb.toString();
        }
    }

    public static ArrayList<a> a(String str, boolean z, String str2, boolean z2) {
        ArrayList<a> arrayList = new ArrayList<>();
        List<String> listA = n.a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Ad(?:(?: +|%20)id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)[\\s\\S]*?(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Ad(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34), str);
        if (listA.isEmpty()) {
            Logger.d(q, "No ad blocks detected, exiting");
            return arrayList;
        }
        String strC = c(str);
        Iterator<String> it = listA.iterator();
        while (it.hasNext()) {
            a aVarA = a(it.next(), z, str2);
            if (aVarA != null) {
                arrayList.add(aVarA);
                if (TextUtils.isEmpty(aVarA.t()) && z2) {
                    aVarA.d(strC);
                    Logger.d(q, "parse multiple - updating vast doc version to= ", strC);
                }
            }
        }
        return arrayList;
    }

    private static String c(String str) {
        return n.e(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)VAST[^>]*version(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([0-9.]+)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)"), str);
    }

    private static String a(String str, String str2) throws UnsupportedEncodingException {
        if (CreativeInfoManager.a(str2, AdNetworkConfiguration.SHOULD_DECODE_AD_TAG_TWICE, false) && str.contains("%25")) {
            String strDecode = URLDecoder.decode(str, "UTF-8");
            Logger.d(q, "Decoding URL - url was decoded once");
            if (strDecode.contains("%25")) {
                String strDecode2 = URLDecoder.decode(strDecode, "UTF-8");
                Logger.d(q, "Decoding URL - url was decoded twice");
                return strDecode2;
            }
            return strDecode;
        }
        return str;
    }

    public static a a(String str, boolean z, String str2) {
        String str3;
        String strA;
        String strA2;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strC = c(str);
            Logger.d(q, "Vast document version: ", strC);
            if (a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)((.*?)(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34), str, -1, z).isEmpty()) {
                Logger.d(q, "No ad blocks detected, exiting");
                return null;
            }
            List<String> listA = a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(Creative|Ad)(?:(?: +|%20)id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34), str, 2, z);
            if (listA.isEmpty()) {
                str3 = null;
            } else {
                String strA3 = a(listA.get(0), false);
                Logger.d(q, "Ad ID detected: ", strA3);
                str3 = strA3;
            }
            List<String> listA2 = a(com.safedk.android.utils.g.a(a("VASTAdTagURI"), 2), str, 1, z);
            if (!listA2.isEmpty()) {
                strA = a(CreativeInfoManager.e(str2), a(k.g(a(listA2.get(0), z)), str2));
                Logger.printFullVerboseLog(q, "Vast ad uri added to followed urls : ", strA);
                a(new f(strA));
            } else {
                strA = null;
            }
            List<String> listA3 = a(com.safedk.android.utils.g.a(a("AdSystem"), 2), str, 1, z);
            if (!listA3.isEmpty()) {
                strA2 = a(listA3.get(0), false);
                Logger.d(q, "Ad system detected : ", strA2);
            } else {
                strA2 = null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = a(com.safedk.android.utils.g.a(a("Impression"), 2), str, 1, z).iterator();
            while (it.hasNext()) {
                String strReplace = k.g(a(it.next(), z)).replace("\\/", "/");
                arrayList.add(strReplace);
                Logger.d(q, "impression url identified : ", strReplace);
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List<String> listA4 = a(com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Tracking(?:[\\s]|%20)event(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Tracking(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 2), str, 1, 2, z);
            for (int i = 0; i < listA4.size(); i += 2) {
                listA4.get(i);
                arrayList2.add(k.g(a(listA4.get(i + 1), z)));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<String> it2 = a(com.safedk.android.utils.g.a(a("ClickTracking"), 2), str, 1, z).iterator();
            while (it2.hasNext()) {
                arrayList4.add(k.g(a(it2.next(), z)));
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<String> it3 = a(com.safedk.android.utils.g.a(a("CompanionClickTracking"), 2), str, 1, z).iterator();
            while (it3.hasNext()) {
                arrayList5.add(k.g(a(it3.next(), z)));
            }
            if (strA != null) {
                return a(strA, str3, strA2, arrayList, arrayList3, arrayList2, arrayList4, arrayList5, strC);
            }
            return a(str, z, str, str3, strA2, arrayList, arrayList3, arrayList2, arrayList4, arrayList5, strC);
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.e(q, "failed to parse vast data", th);
            return null;
        }
    }

    private static a a(String str, String str2, String str3, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str4) {
        if (str != null) {
            Logger.d(q, "vast ad uri detected: ", str);
            return new a(str2, str3, str, list, list2, list3, list4, list5, str4);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x03ec  */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v43 */
    private static a a(String str, boolean z, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str5) {
        ?? r6;
        int i;
        int i2;
        int i3;
        String str6;
        boolean z2;
        ?? r7 = 0;
        Logger.d(q, "no vast ad tag uri");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        List<String> listA = a(k(), str2, 0, false);
        int i4 = 2;
        Logger.d(q, "Number of creatives XML elements: ", Integer.valueOf(listA.size()));
        if (listA.isEmpty()) {
            Logger.printFullVerboseLog(q, "Number of creatives XML elements is 0, the xml is:\n", str2);
        }
        Iterator<String> it = listA.iterator();
        String strA = null;
        String str7 = null;
        String str8 = null;
        boolean z3 = false;
        String str9 = null;
        String strA2 = null;
        while (it.hasNext()) {
            String next = it.next();
            List<String> listA2 = a(com.safedk.android.utils.g.a(a("CompanionClickThrough"), i4), next, 1, (boolean) r7);
            if (listA2.isEmpty()) {
                r6 = 0;
                i = 1;
                Logger.d(q, "companion click url list is empty");
            } else {
                Object[] objArr = new Object[2];
                objArr[r7] = "companion click url list: ";
                i = 1;
                objArr[1] = listA2.toString();
                Logger.d(q, objArr);
                r6 = 0;
                strA = a(listA2.get(0), true);
            }
            List<String> listA3 = a(com.safedk.android.utils.g.a(a("ClickThrough"), 2), next, i, (boolean) r6);
            if (listA3.isEmpty()) {
                Logger.d(q, "click url list is empty");
            } else {
                Object[] objArr2 = new Object[2];
                objArr2[r6] = "click url list: ";
                objArr2[1] = listA3;
                Logger.d(q, objArr2);
                strA2 = a(listA3.get(r6), z);
                if (strA == null) {
                    strA = a(listA3.get(r6), true);
                }
                Iterator<String> it2 = listA3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(a(it2.next(), z));
                }
            }
            if (!TextUtils.isEmpty(strA)) {
                str7 = strA;
            }
            Pattern patternA = com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)<TAG_NAME>[\\s\\S]*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)<TAG_NAME>(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)".replaceFirst("<TAG_NAME>", "MediaFile[^s]").replace("<TAG_NAME>", "MediaFile"), 2);
            Iterator<String> it3 = a(patternA, next, -1, z).iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                List<String> listA4 = a(com.safedk.android.utils.g.a("(apiFramework(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)VPAID(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)|type(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)application/javascript(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2), next2, -1, z);
                Iterator<String> it4 = it3;
                List<String> listA5 = a(patternA, next2, 1, z);
                String strA3 = a(listA5.get(0), z);
                Pattern pattern = patternA;
                String str10 = str7;
                Pattern patternA2 = com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)MediaFile[\\s\\S]*?type(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2);
                ArrayList arrayList6 = arrayList4;
                List<String> listA6 = a(patternA2, next2, 1, z);
                if (listA6.isEmpty()) {
                    listA6 = a(patternA2, next2.replace(" ", ""), 1, z);
                }
                String str11 = !listA6.isEmpty() ? listA6.get(0) : "";
                if (str11.isEmpty()) {
                    Logger.d(q, "empty media type: ", next2);
                }
                if (!listA4.isEmpty()) {
                    arrayList.add(strA3);
                    Logger.d(q, "contains media file with JS app attribute");
                    z3 = true;
                } else if (!listA5.isEmpty()) {
                    arrayList5.add(new Pair(str11, strA3));
                    Logger.d(q, "adding media file : ", strA3);
                } else {
                    Logger.d(q, "cannot detect media resource in. skipping");
                }
                it3 = it4;
                patternA = pattern;
                str7 = str10;
                arrayList4 = arrayList6;
                arrayList3 = arrayList3;
            }
            ArrayList arrayList7 = arrayList4;
            String str12 = str7;
            ArrayList arrayList8 = arrayList3;
            List<String> listA7 = a(com.safedk.android.utils.g.a(a("AdParameters"), 2), next, 1, z);
            if (listA7.isEmpty()) {
                i2 = 2;
                i3 = 1;
            } else {
                String strA4 = a(listA7.get(0), z);
                if (n.n(strA4)) {
                    Logger.printFullVerboseLog(q, "ad parameters is JSON : ", strA4);
                    ArrayList<String> arrayListG = n.g(strA4);
                    if (!arrayListG.isEmpty()) {
                        for (String str13 : arrayListG) {
                            Logger.d(q, "ad parameters media url : ", str13);
                            if (n.s(str13)) {
                                Logger.d(q, "ad parameters media url is video url : ", str13);
                                arrayList5.add(new Pair("video/*", a(str13, z)));
                            }
                        }
                    }
                    i2 = 2;
                    i3 = 1;
                } else {
                    i2 = 2;
                    i3 = 1;
                    Logger.printFullVerboseLog(q, "found ad parameters = ", strA4);
                }
                str9 = strA4;
            }
            List<String> listA8 = a(com.safedk.android.utils.g.a(a("YouTubeVideoId"), i2), str2, i3, z);
            if (!listA8.isEmpty()) {
                arrayList.add("element:ytId:" + listA8.get(0));
                Logger.d(q, "handle no vast ad Uri - added element to prefetch collection: ", listA8.get(0));
            }
            Iterator it5 = arrayList5.iterator();
            String str14 = null;
            String str15 = null;
            String str16 = null;
            while (true) {
                if (it5.hasNext()) {
                    Pair pair = (Pair) it5.next();
                    String strA5 = a((Pair<String, String>) pair);
                    str6 = (String) pair.second;
                    Logger.d(q, "found extension : ", strA5, " for media: ", pair);
                    if (((String) pair.first).contains("video") && str6.contains(r)) {
                        if (strA5 != null && strA5.equals(n.d)) {
                            Logger.d(q, "found google videoUrl mp4: ", pair);
                            break;
                        }
                        Logger.d(q, "found google videoUrl regular: ", pair);
                        str16 = str6;
                    }
                    if (strA5 != null && strA5.equals(n.d) && str14 == null) {
                        Logger.d(q, "setting first mp4 media file as: ", pair);
                        str14 = str6;
                    }
                    if (strA5 != null && !strA5.equals(n.d) && str15 == null) {
                        Logger.d(q, "setting first non-mp4 media file as: ", pair);
                        str15 = str6;
                    }
                } else {
                    str6 = null;
                    break;
                }
            }
            if (str6 != null) {
                str8 = str6;
            } else if (str16 == null) {
                if (str14 != null) {
                    Logger.d(q, "found first MP4 videoUrl : ", str14);
                    str8 = str14;
                } else if (str15 != null) {
                    Logger.d(q, "found first non-MP4 videoUrl : ", str15);
                    str8 = str15;
                } else {
                    str8 = str6;
                }
            } else {
                str8 = str16;
            }
            if (!TextUtils.isEmpty(str8)) {
                if (!arrayList.contains(str8)) {
                    arrayList.add(str8);
                }
                z2 = false;
            } else {
                z2 = false;
                Logger.d(q, "VAST ad did NOT found video url");
                str8 = str8;
            }
            if (!TextUtils.isEmpty(strA)) {
                Object[] objArr3 = new Object[2];
                objArr3[z2 ? 1 : 0] = "VAST ad found click Url = ";
                objArr3[1] = strA;
                Logger.d(q, objArr3);
            }
            it = it;
            str7 = str12;
            arrayList4 = arrayList7;
            arrayList3 = arrayList8;
            i4 = 2;
            r7 = z2;
        }
        ArrayList arrayList9 = arrayList4;
        String str17 = str8;
        ArrayList arrayList10 = arrayList3;
        a(str, z, arrayList2, com.safedk.android.utils.g.a(a("StaticResource"), 2));
        a(str, z, arrayList10, com.safedk.android.utils.g.a(a("IFrameResource"), 2));
        Pattern patternA3 = com.safedk.android.utils.g.a(a("HTMLResource"), 2);
        a(str, z, arrayList9, patternA3);
        List<String> listA9 = a(patternA3, str, 1, z);
        if (str7 != null) {
            arrayList.remove(str7);
        }
        return new a(str3, str4, str7, str17, arrayList, arrayList2, arrayList10, arrayList9, listA9, list2, list3, list4, list5, z3, str9, list, strA2, arrayList5, str5);
    }

    private static void a(String str, boolean z, List<String> list, Pattern pattern) {
        Iterator<String> it = a(pattern, str, 1, z).iterator();
        while (it.hasNext()) {
            String strZ = n.z(it.next());
            List<String> listA = a(a(), strZ, 1, z);
            if (!listA.isEmpty()) {
                strZ = listA.get(0);
            }
            try {
                new URL(strZ);
                list.add(strZ);
            } catch (MalformedURLException e) {
                Logger.d(q, "resources inner text is malformed. cannot add this url to the resources list");
            }
        }
    }

    public static boolean b(String str) {
        return com.safedk.android.utils.g.a("VAST.*/VAST", 34).matcher(str).find();
    }

    public static void a(String str, String[] strArr, String str2) {
        List<String> listA = a(com.safedk.android.utils.g.a(a("VASTAdTagURI"), 2), str, 1, true);
        if (!listA.isEmpty()) {
            String strG = k.g(a(listA.get(0), true));
            Logger.printFullVerboseLog(q, "Vast ad uri added to followed urls : ", strG);
            a(new f(a(strArr, strG)));
        }
    }

    private static String a(String[] strArr, String str) {
        if (strArr != null && strArr.length > 0) {
            String strA = k.a(str, strArr);
            Logger.d(q, "Vast ad uri, query params removed : ", strArr);
            return strA;
        }
        return str;
    }

    protected static void a(i iVar) {
        p.add(iVar);
    }

    protected static String a(Pair<String, String> pair) {
        String[] strArrSplit = ((String) pair.first).split("/");
        if (strArrSplit.length > 1 && "video".equals(strArrSplit[0])) {
            return strArrSplit[1];
        }
        return null;
    }

    public static Pattern j() {
        return com.safedk.android.utils.g.a(a("VAST"), 2);
    }

    public static Pattern k() {
        return com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Creative[^s]?(?:id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([0-9]+)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))?.*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)[\\s\\S]*?(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Creative(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 2);
    }
}
