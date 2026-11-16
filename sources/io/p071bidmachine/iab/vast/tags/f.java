package io.p071bidmachine.iab.vast.tags;

import android.text.TextUtils;
import io.p071bidmachine.iab.vast.c;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class f extends h {
    public final ArrayList c;

    public f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        x(xmlPullParser);
        this.c = new ArrayList();
        xmlPullParser.require(2, null, "CompanionAds");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (q.d(xmlPullParser.getName(), "Companion")) {
                    g gVar = new g(xmlPullParser);
                    String strA = gVar.a("width");
                    String strA2 = gVar.a("height");
                    if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strA2)) {
                        this.c.add(gVar);
                    } else {
                        c.a("VastXmlTag", "Creative Companion: is not valid. Skipping it.", new Object[0]);
                    }
                } else {
                    q.i(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, null, "CompanionAds");
    }
}
