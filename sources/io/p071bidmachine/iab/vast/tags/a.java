package io.p071bidmachine.iab.vast.tags;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import io.p071bidmachine.iab.vast.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends q {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;

    public static ArrayList y(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "Creatives");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (q.d(xmlPullParser.getName(), "Creative")) {
                    i iVar = new i();
                    iVar.x(xmlPullParser);
                    xmlPullParser.require(2, null, "Creative");
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            String name = xmlPullParser.getName();
                            if (q.d(name, "Linear")) {
                                m mVar = new m();
                                mVar.x(xmlPullParser);
                                xmlPullParser.require(2, null, "Linear");
                                q.j(mVar.a("skipoffset"));
                                while (xmlPullParser.next() != 3) {
                                    if (xmlPullParser.getEventType() == 2) {
                                        String name2 = xmlPullParser.getName();
                                        if (q.d(name2, "Duration")) {
                                            float fJ = q.j(q.h(xmlPullParser));
                                            if (fJ > -1.0f) {
                                                mVar.c = Float.valueOf(fJ);
                                            }
                                        } else if (q.d(name2, "MediaFiles")) {
                                            xmlPullParser.require(2, null, "MediaFiles");
                                            ArrayList arrayList2 = new ArrayList();
                                            while (xmlPullParser.next() != 3) {
                                                if (xmlPullParser.getEventType() == 2) {
                                                    if (q.d(xmlPullParser.getName(), "MediaFile")) {
                                                        n nVar = new n();
                                                        nVar.x(xmlPullParser);
                                                        String strA = nVar.a("type");
                                                        String strA2 = nVar.a("width");
                                                        String strA3 = nVar.a("height");
                                                        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2) || TextUtils.isEmpty(strA3) || TextUtils.isEmpty(nVar.a)) {
                                                            c.a("VastXmlTag", "MediaFile: is not valid. Skipping it.", new Object[0]);
                                                            q.i(xmlPullParser);
                                                        } else {
                                                            arrayList2.add(nVar);
                                                        }
                                                    } else {
                                                        q.i(xmlPullParser);
                                                    }
                                                }
                                            }
                                            xmlPullParser.require(3, null, "MediaFiles");
                                            mVar.d = arrayList2;
                                        } else if (q.d(name2, "VideoClicks")) {
                                            s sVar = new s();
                                            sVar.x(xmlPullParser);
                                            xmlPullParser.require(2, null, "VideoClicks");
                                            while (xmlPullParser.next() != 3) {
                                                if (xmlPullParser.getEventType() == 2) {
                                                    String name3 = xmlPullParser.getName();
                                                    if (q.d(name3, "ClickThrough")) {
                                                        sVar.c = q.h(xmlPullParser);
                                                    } else if (q.d(name3, "ClickTracking")) {
                                                        String strH = q.h(xmlPullParser);
                                                        if (!TextUtils.isEmpty(strH)) {
                                                            if (sVar.d == null) {
                                                                sVar.d = new ArrayList();
                                                            }
                                                            sVar.d.add(strH);
                                                        }
                                                    } else if (q.d(name3, "CustomClick")) {
                                                        String strH2 = q.h(xmlPullParser);
                                                        if (!TextUtils.isEmpty(strH2)) {
                                                            if (sVar.e == null) {
                                                                sVar.e = new ArrayList();
                                                            }
                                                            sVar.e.add(strH2);
                                                        }
                                                    } else {
                                                        q.i(xmlPullParser);
                                                    }
                                                }
                                            }
                                            xmlPullParser.require(3, null, "VideoClicks");
                                            mVar.e = sVar;
                                        } else if (q.d(name2, "AdParameters")) {
                                            q.h(xmlPullParser);
                                        } else if (q.d(name2, "TrackingEvents")) {
                                            mVar.f = (EnumMap) new p(xmlPullParser, 1).d;
                                        } else {
                                            q.i(xmlPullParser);
                                        }
                                    }
                                }
                                xmlPullParser.require(3, null, "Linear");
                                iVar.c = mVar;
                            } else if (q.d(name, "CompanionAds")) {
                                iVar.c = new f(xmlPullParser);
                            } else {
                                q.i(xmlPullParser);
                            }
                        }
                    }
                    xmlPullParser.require(3, null, "Creative");
                    arrayList.add(iVar);
                } else {
                    q.i(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Creatives");
        return arrayList;
    }

    public static ArrayList z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        q dVar;
        xmlPullParser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (q.d(xmlPullParser.getName(), "Extension")) {
                    xmlPullParser.require(2, null, "Extension");
                    j jVar = new j();
                    jVar.x(xmlPullParser);
                    String strA = jVar.a("type");
                    if (q.d(strA, AppLovinMediationProvider.APPODEAL)) {
                        dVar = new e(xmlPullParser);
                    } else if (q.d(strA, "AdVerifications")) {
                        dVar = null;
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (q.d(xmlPullParser.getName(), "AdVerifications")) {
                                    dVar = new d(xmlPullParser);
                                } else {
                                    q.i(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        q.i(xmlPullParser);
                        dVar = null;
                    }
                    xmlPullParser.require(3, null, "Extension");
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    q.i(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "Extensions");
        return arrayList;
    }
}
