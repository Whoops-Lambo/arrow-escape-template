package com.bytedance.sdk.openadsdk.core.twf.kgy.kgy;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.twf.ra;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ct extends com.bytedance.sdk.openadsdk.core.twf.kgy.ahm {
    public static final String fi = null;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy ahm;
        String kgy;
        com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm rz;
        String uq;
        final List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> ct = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> noq = new ArrayList();
        float yo = Float.MIN_VALUE;

        public void ahm(String str) {
            this.noq.add(new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(str).kgy());
        }

        public void kgy(String str) {
            this.ct.add(new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(str).kgy());
        }

        public kgy(String str, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy enumC0266kgy, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm ahmVar) {
            kgy(str, enumC0266kgy, ahmVar);
        }

        public void kgy(String str, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.EnumC0266kgy enumC0266kgy, com.bytedance.sdk.openadsdk.core.twf.rz.kgy.ahm ahmVar) {
            this.kgy = str;
            this.ahm = enumC0266kgy;
            this.rz = ahmVar;
        }

        public kgy() {
        }
    }

    public ct(Context context, int i, int i2) {
        this(context, i, i2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [com.bytedance.sdk.openadsdk.core.twf.kgy] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.bytedance.sdk.openadsdk.core.twf.kgy.ahm, com.bytedance.sdk.openadsdk.core.twf.kgy.kgy.ct] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private com.bytedance.sdk.openadsdk.core.twf.kgy ahm(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) throws Throwable {
        ?? r16;
        ?? r4 = 0;
        if (this.kgy >= 5) {
            kgy(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.twf.uq uqVar = new com.bytedance.sdk.openadsdk.core.twf.uq();
        String str = null;
        com.bytedance.sdk.openadsdk.core.twf.rz rzVarKgy = null;
        Set<ra> setKgy = null;
        while (true) {
            if (xmlPullParser.getEventType() == 3 && "Wrapper".equals(xmlPullParser.getName())) {
                com.bytedance.sdk.openadsdk.core.twf.kgy kgyVarKgy = kgy(str, r4, list);
                if (kgyVarKgy != null) {
                    if (kgyVarKgy.rz() == null) {
                        kgyVarKgy.kgy(rzVarKgy);
                    }
                    kgyVarKgy.kgy().kgy(uqVar);
                    if (setKgy != null) {
                        kgyVarKgy.kgy(setKgy);
                    }
                }
                return kgyVarKgy;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                r16 = r4;
                switch (name) {
                    case "VASTAdTagURI":
                        String strKgy = kgy(ahm(xmlPullParser, "VASTAdTagURI"), list);
                        if (!TextUtils.isEmpty(strKgy)) {
                            str = strKgy;
                            continue;
                            break;
                        } else {
                            kgy(xmlPullParser, "Wrapper", 3);
                            this.ct = -2;
                            return r16;
                        }
                        break;
                    case "Error":
                        list.add(new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(ahm(xmlPullParser, "Error")).kgy());
                        continue;
                        break;
                    case "Extensions":
                        break;
                    case "TrackingEvents":
                        rz.kgy(xmlPullParser, uqVar);
                        continue;
                        break;
                    case "CompanionAds":
                        rzVarKgy = com.bytedance.sdk.openadsdk.core.twf.kgy.kgy.kgy.kgy(this.ahm, xmlPullParser);
                        continue;
                        break;
                    case "ClickTracking":
                        uqVar.yo(kgy(xmlPullParser, "ClickTracking"));
                        continue;
                        break;
                    case "Impression":
                        uqVar.kgy(kgy(xmlPullParser, name));
                        continue;
                        break;
                    default:
                        continue;
                        break;
                }
                while (true) {
                    if (xmlPullParser.getEventType() != 3 || !"Extensions".equals(xmlPullParser.getName())) {
                        xmlPullParser.next();
                        if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                            setKgy = uq.kgy(xmlPullParser);
                        }
                    }
                }
            } else {
                r16 = r4;
            }
            r4 = r16;
        }
    }

    private com.bytedance.sdk.openadsdk.core.twf.kgy kgy(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list3;
        xmlPullParser.require(2, fi, "VAST");
        boolean z = false;
        String strAhm = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strAhm = ahm(xmlPullParser, name);
                } else {
                    if (!"Ad".equals(name)) {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        kgy(xmlPullParser2);
                    } else if (kgy(xmlPullParser.getAttributeValue(fi, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                xmlPullParser2 = xmlPullParser;
                                list2 = list;
                                z = true;
                                break;
                            }
                            if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    xmlPullParser3 = xmlPullParser;
                                    list3 = list;
                                    com.bytedance.sdk.openadsdk.core.twf.kgy kgyVarKgy = ahm.kgy(this.ahm, xmlPullParser3, list3, this.rz, this.uq);
                                    if (kgyVarKgy != null) {
                                        if (!this.yo || !TextUtils.isEmpty(kgyVarKgy.yo())) {
                                            return kgyVarKgy;
                                        }
                                        this.ct = -6;
                                        return null;
                                    }
                                } else {
                                    xmlPullParser3 = xmlPullParser;
                                    list3 = list;
                                    if ("Wrapper".equals(name2)) {
                                        com.bytedance.sdk.openadsdk.core.twf.kgy kgyVarAhm = ahm(xmlPullParser3, list3);
                                        if (kgyVarAhm != null) {
                                            return kgyVarAhm;
                                        }
                                    } else {
                                        kgy(xmlPullParser3);
                                    }
                                }
                                xmlPullParser = xmlPullParser3;
                                list = list3;
                            }
                        }
                    } else {
                        kgy(xmlPullParser);
                        z = true;
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z) {
            this.ct = -4;
            rz(strAhm);
        }
        if (this.ct == 0) {
            this.ct = -5;
        }
        return null;
    }

    private void rz(String str) {
        com.bytedance.sdk.openadsdk.core.twf.kgy.kgy kgyVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List listSingletonList = Collections.singletonList(new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(str).kgy());
        if (this.kgy > 0) {
            kgyVar = com.bytedance.sdk.openadsdk.core.twf.kgy.kgy.NO_ADS_VAST_RESPONSE;
        } else {
            kgyVar = com.bytedance.sdk.openadsdk.core.twf.kgy.kgy.UNDEFINED_ERROR;
        }
        com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy((ioy) null, (List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz>) listSingletonList, kgyVar, -1L, (String) null, (String) null), (com.bytedance.sdk.openadsdk.core.twf.ahm.rz.ahm) null);
    }

    public ct(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
    }

    private void kgy(com.bytedance.sdk.openadsdk.core.twf.kgy kgyVar) {
        if (this.noq == null) {
            this.noq = new com.bytedance.sdk.openadsdk.core.twf.kgy.ahm.kgy();
        }
        com.bytedance.sdk.openadsdk.core.twf.kgy.ahm.kgy kgyVar2 = this.noq;
        kgyVar2.kgy = this.ct;
        kgyVar2.ahm = this.kgy;
        if (kgyVar != null) {
            kgyVar2.rz = kgyVar.kgy().ahm.size() <= 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.twf.kgy.ahm
    public com.bytedance.sdk.openadsdk.core.twf.kgy kgy(String str, File file, List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> list) throws Throwable {
        InputStream fileInputStream;
        this.ct = 0;
        InputStream inputStream = null;
        if (this.ahm == null) {
            this.ct = -1;
            return null;
        }
        if (TextUtils.isEmpty(str) && file == null) {
            this.ct = -2;
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                fileInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
            } else {
                fileInputStream = new FileInputStream(file);
            }
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(fileInputStream, "UTF-8");
                    xmlPullParserNewPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.twf.kgy kgyVarKgy = kgy(xmlPullParserNewPullParser, list);
                    kgy(kgyVarKgy);
                    try {
                        fileInputStream.close();
                        return kgyVarKgy;
                    } catch (IOException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGF/J5xpJZ0k/CAbUkVw==", "be8+gTuxZfeVRtttjQOzLUk=", "S+8/hgauX8aTXu9QgA==", 92);
                        return kgyVarKgy;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = fileInputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGF/J5xpJZ0k/CAbUkVw==", "be8+gTuxZfeVRtttjQOzLUk=", "S+8/hgauX8aTXu9QgA==", 92);
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGF/J5xpJZ0k/CAbUkVw==", "be8+gTuxZfeVRtttjQOzLUk=", "S+8/hgauX8aTXu9QgA==", 85);
                this.ct = -3;
                kgy((com.bytedance.sdk.openadsdk.core.twf.kgy) null);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e4) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e4, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGF/J5xpJZ0k/CAbUkVw==", "be8+gTuxZfeVRtttjQOzLUk=", "S+8/hgauX8aTXu9QgA==", 92);
                    }
                }
                return null;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> kgy(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return kgy(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> kgy(XmlPullParser xmlPullParser, String str, boolean z) throws XmlPullParserException, IOException {
        return kgy(ahm(xmlPullParser, str), z);
    }

    public static void kgy(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            y.b();
            return;
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void kgy(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.twf.ahm.rz> kgy(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new com.bytedance.sdk.openadsdk.core.twf.ahm.rz.kgy(str).kgy(z).kgy());
    }

    public static String ahm(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = fi;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    public static int ahm(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGF/J5xpJZ0k/CAbUkVw==", "be8+gTuxZfeVRtttjQOzLUk=", "T+EEmxc=", 238);
            return Integer.MIN_VALUE;
        }
    }
}
