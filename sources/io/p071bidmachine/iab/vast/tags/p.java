package io.p071bidmachine.iab.vast.tags;

import android.text.TextUtils;
import io.p071bidmachine.iab.vast.a;
import io.p071bidmachine.iab.vast.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class p extends q {
    public static final String[] e = {"version"};
    public final /* synthetic */ int c;
    public final Object d;

    public p(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        a aVarValueOf;
        int i2;
        this.c = i;
        String str = null;
        int i3 = 3;
        switch (i) {
            case 1:
                x(xmlPullParser);
                this.d = new EnumMap(a.class);
                xmlPullParser.require(2, null, "TrackingEvents");
                while (xmlPullParser.next() != 3) {
                    if (xmlPullParser.getEventType() == 2) {
                        if (q.d(xmlPullParser.getName(), "Tracking")) {
                            l lVar = new l(2);
                            lVar.x(xmlPullParser);
                            String strA = lVar.a("event");
                            try {
                                aVarValueOf = a.valueOf(strA);
                            } catch (Exception unused) {
                                c.a("VastXmlTag", "Event: %s is not valid. Skipping it.", strA);
                                aVarValueOf = null;
                            }
                            if (aVarValueOf != null) {
                                String strH = q.h(xmlPullParser);
                                List list = (List) ((EnumMap) this.d).get(aVarValueOf);
                                if (list != null) {
                                    list.add(strH);
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(strH);
                                    ((EnumMap) this.d).put(aVarValueOf, arrayList);
                                }
                            } else {
                                q.i(xmlPullParser);
                            }
                        } else {
                            q.i(xmlPullParser);
                        }
                        break;
                    }
                }
                xmlPullParser.require(3, null, "TrackingEvents");
                break;
            default:
                x(xmlPullParser);
                this.d = new ArrayList();
                xmlPullParser.require(2, null, "VAST");
                while (xmlPullParser.next() != i3) {
                    if (xmlPullParser.getEventType() == 2) {
                        if (q.d(xmlPullParser.getName(), "Ad")) {
                            ArrayList arrayList2 = (ArrayList) this.d;
                            c cVar = new c();
                            cVar.x(xmlPullParser);
                            xmlPullParser.require(2, str, "Ad");
                            while (xmlPullParser.next() != i3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    String name = xmlPullParser.getName();
                                    if (q.d(name, "InLine")) {
                                        k kVar = new k();
                                        kVar.x(xmlPullParser);
                                        xmlPullParser.require(2, str, "InLine");
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                String name2 = xmlPullParser.getName();
                                                if (q.d(name2, "Creatives")) {
                                                    kVar.c = a.y(xmlPullParser);
                                                } else if (q.d(name2, "Extensions")) {
                                                    kVar.d = a.z(xmlPullParser);
                                                } else if (q.d(name2, "Impression")) {
                                                    String strH2 = q.h(xmlPullParser);
                                                    if (!TextUtils.isEmpty(strH2)) {
                                                        if (kVar.e == null) {
                                                            kVar.e = new ArrayList();
                                                        }
                                                        kVar.e.add(strH2);
                                                    }
                                                } else if (q.d(name2, "Error")) {
                                                    String strH3 = q.h(xmlPullParser);
                                                    if (!TextUtils.isEmpty(strH3)) {
                                                        if (kVar.f == null) {
                                                            kVar.f = new ArrayList();
                                                        }
                                                        kVar.f.add(strH3);
                                                    }
                                                } else if (q.d(name2, "AdSystem")) {
                                                    new b().x(xmlPullParser);
                                                } else {
                                                    q.i(xmlPullParser);
                                                }
                                            }
                                        }
                                        str = null;
                                        xmlPullParser.require(3, null, "InLine");
                                        cVar.c = kVar;
                                        i3 = 3;
                                    } else {
                                        if (q.d(name, "Wrapper")) {
                                            t tVar = new t();
                                            tVar.x(xmlPullParser);
                                            xmlPullParser.require(2, str, "Wrapper");
                                            while (true) {
                                                i2 = 3;
                                                if (xmlPullParser.next() == 3) {
                                                    str = null;
                                                    xmlPullParser.require(3, null, "Wrapper");
                                                    cVar.c = tVar;
                                                } else if (xmlPullParser.getEventType() == 2) {
                                                    String name3 = xmlPullParser.getName();
                                                    if (q.d(name3, "Creatives")) {
                                                        tVar.c = a.y(xmlPullParser);
                                                    } else if (q.d(name3, "Extensions")) {
                                                        tVar.d = a.z(xmlPullParser);
                                                    } else if (q.d(name3, "Impression")) {
                                                        String strH4 = q.h(xmlPullParser);
                                                        if (!TextUtils.isEmpty(strH4)) {
                                                            if (tVar.e == null) {
                                                                tVar.e = new ArrayList();
                                                            }
                                                            tVar.e.add(strH4);
                                                        }
                                                    } else if (q.d(name3, "Error")) {
                                                        String strH5 = q.h(xmlPullParser);
                                                        if (!TextUtils.isEmpty(strH5)) {
                                                            if (tVar.f == null) {
                                                                tVar.f = new ArrayList();
                                                            }
                                                            tVar.f.add(strH5);
                                                        }
                                                    } else if (q.d(name3, "AdSystem")) {
                                                        new b().x(xmlPullParser);
                                                    } else if (q.d(name3, "VASTAdTagURI")) {
                                                        tVar.g = q.h(xmlPullParser);
                                                    } else {
                                                        q.i(xmlPullParser);
                                                    }
                                                }
                                            }
                                        } else {
                                            i2 = 3;
                                            q.i(xmlPullParser);
                                        }
                                        i3 = i2;
                                    }
                                }
                            }
                            xmlPullParser.require(i3, str, "Ad");
                            arrayList2.add(cVar);
                        } else {
                            q.i(xmlPullParser);
                        }
                    }
                }
                xmlPullParser.require(i3, str, "VAST");
                break;
        }
    }

    @Override // io.p071bidmachine.iab.vast.tags.q
    public String[] n() {
        switch (this.c) {
            case 0:
                return e;
            default:
                return super.n();
        }
    }
}
