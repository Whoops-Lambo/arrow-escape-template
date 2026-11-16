package com.bytedance.sdk.openadsdk.core.twf.kgy.kgy;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.twf.ra;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class uq {
    public static Set<ra> kgy(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ra raVarKgy;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(ct.fi, "vendor");
                    String strAhm = null;
                    String strAhm2 = null;
                    String strAhm3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(ct.fi, "event"))) {
                                            break;
                                        } else {
                                            strAhm3 = ct.ahm(xmlPullParser, "Tracking");
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(ct.fi, "apiFramework"))) {
                                            break;
                                        } else {
                                            strAhm = ct.ahm(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strAhm2 = ct.ahm(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strAhm) && (raVarKgy = ra.kgy(strAhm, attributeValue, strAhm2, strAhm3)) != null) {
                            hashSet.add(raVarKgy);
                        }
                    }
                } else {
                    ct.kgy(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
