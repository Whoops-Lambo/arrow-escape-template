package io.p071bidmachine.iab.vast.tags;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends j {
    public final ArrayList d;

    public d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        x(xmlPullParser);
        this.d = new ArrayList();
        xmlPullParser.require(2, null, "AdVerifications");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (q.d(xmlPullParser.getName(), "Verification")) {
                    r rVar = new r();
                    rVar.x(xmlPullParser);
                    xmlPullParser.require(2, null, "Verification");
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            String name = xmlPullParser.getName();
                            if (q.d(name, "JavaScriptResource")) {
                                l lVar = new l(0);
                                lVar.x(xmlPullParser);
                                rVar.c = lVar;
                            } else if (q.d(name, "VerificationParameters")) {
                                rVar.d = q.h(xmlPullParser);
                            } else {
                                q.i(xmlPullParser);
                            }
                        }
                    }
                    xmlPullParser.require(3, null, "Verification");
                    this.d.add(rVar);
                } else {
                    q.i(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "AdVerifications");
    }
}
