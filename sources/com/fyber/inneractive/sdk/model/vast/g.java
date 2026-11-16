package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.x1;
import com.ironsource.C4981t;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g {
    public String a;
    public o e;
    public v g;
    public final ArrayList d = new ArrayList();
    public int f = 0;
    public final ArrayList h = new ArrayList(1);
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final void a(Node node) {
        w wVar;
        Node nodeD = x1.d(node, "AdVerifications");
        if (nodeD != null) {
            ArrayList arrayListC = x1.c(nodeD, "Verification");
            int size = arrayListC.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                Node node2 = (Node) obj;
                com.fyber.inneractive.sdk.measurement.h hVar = null;
                if (node2 != null) {
                    com.fyber.inneractive.sdk.measurement.h hVar2 = new com.fyber.inneractive.sdk.measurement.h();
                    hVar2.e = x1.b(node2, "vendor");
                    Node nodeD2 = x1.d(node2, "JavaScriptResource");
                    if (nodeD2 != null) {
                        hVar2.g = true;
                        try {
                            hVar2.f = x1.a(nodeD2);
                            hVar2.b = x1.b(nodeD2, "apiFramework");
                            hVar2.a = new URL(hVar2.f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node nodeD3 = x1.d(node2, "TrackingEvents");
                    if (nodeD3 != null) {
                        ArrayList arrayListC2 = x1.c(nodeD3, "Tracking");
                        int size2 = arrayListC2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj2 = arrayListC2.get(i2);
                            i2++;
                            Node node3 = (Node) obj2;
                            if (node3 == null) {
                                wVar = null;
                            } else {
                                wVar = new w();
                                wVar.a = x1.b(node3, "event");
                                wVar.b = x1.a(node3);
                                wVar.c = x1.b(node3, "offset");
                            }
                            if (node3 != null && wVar.a.equalsIgnoreCase("verificationNotExecuted")) {
                                hVar2.a(x.EVENT_VERIFICATION_NOT_EXECUTED, wVar.b);
                            }
                        }
                    }
                    Node nodeD4 = x1.d(node2, "VerificationParameters");
                    if (nodeD4 != null) {
                        hVar2.d = x1.a(nodeD4);
                    }
                    hVar = hVar2;
                }
                if (hVar != null) {
                    IAlog.a("Verification Found - %s", hVar.toString());
                    this.d.add(hVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:167:0x046d  */
    public void b(Node node) {
        int i;
        Node nodeD;
        NodeList childNodes;
        NodeList childNodes2;
        m mVar;
        ArrayList arrayList;
        int i2;
        h hVar;
        ArrayList arrayList2;
        String str;
        w wVar;
        w wVar2;
        r rVar;
        g gVar = this;
        Node nodeD2 = x1.d(node, "AdSystem");
        if (nodeD2 != null) {
            x1.b(nodeD2, "version");
            x1.a(nodeD2);
        }
        Node nodeD3 = x1.d(node, "Error");
        if (nodeD3 != null) {
            String strA = x1.a(nodeD3);
            if (!TextUtils.isEmpty(strA)) {
                gVar.a = strA;
            }
        }
        ArrayList arrayListC = x1.c(node, "Impression");
        int size = arrayListC.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListC.get(i3);
            i3++;
            String strA2 = x1.a((Node) obj);
            if (!TextUtils.isEmpty(strA2)) {
                gVar.b.add(strA2);
            }
        }
        Node nodeD4 = x1.d(node, "Creatives");
        if (nodeD4 != null) {
            ArrayList arrayListC2 = x1.c(nodeD4, "Creative");
            int size2 = arrayListC2.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayListC2.get(i4);
                int i5 = i4 + 1;
                Node node2 = (Node) obj2;
                if (node2 == null) {
                    arrayList = arrayListC2;
                    i2 = size2;
                    i5 = i5;
                    mVar = null;
                } else {
                    mVar = new m();
                    if (TextUtils.isEmpty(x1.b(node2, "AdID"))) {
                        x1.b(node2, "adId");
                    }
                    x1.b(node2, "id");
                    x1.a(node2, "sequence");
                    Node nodeD5 = x1.d(node2, "Linear");
                    String str2 = "height";
                    arrayList = arrayListC2;
                    String str3 = "width";
                    i2 = size2;
                    if (nodeD5 != null) {
                        q qVar = new q();
                        Node nodeD6 = x1.d(nodeD5, "MediaFiles");
                        if (nodeD6 != null) {
                            ArrayList arrayListC3 = x1.c(nodeD6, "MediaFile");
                            if (!arrayListC3.isEmpty()) {
                                qVar.a = new ArrayList();
                                int i6 = 0;
                                for (int size3 = arrayListC3.size(); i6 < size3; size3 = size3) {
                                    Object obj3 = arrayListC3.get(i6);
                                    int i7 = i6 + 1;
                                    Node node3 = (Node) obj3;
                                    if (node3 == null) {
                                        rVar = null;
                                    } else {
                                        rVar = new r();
                                        rVar.a = x1.b(node3, C4981t.g);
                                        rVar.b = x1.a(node3, "width");
                                        rVar.c = x1.a(node3, "height");
                                        rVar.d = x1.b(node3, "type");
                                        x1.b(node3, "id");
                                        rVar.f = x1.b(node3, "apiFramework");
                                        rVar.e = x1.a(node3, "bitrate");
                                        String strB = x1.b(node3, "maintainAspectRatio");
                                        if (!TextUtils.isEmpty(strB)) {
                                            try {
                                                Boolean.valueOf(strB);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        String strB2 = x1.b(node3, "scalable");
                                        if (!TextUtils.isEmpty(strB2)) {
                                            try {
                                                Boolean.valueOf(strB2);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        rVar.g = x1.a(node3);
                                    }
                                    if (rVar != null) {
                                        qVar.a.add(rVar);
                                    }
                                    arrayListC3 = arrayListC3;
                                    i6 = i7;
                                }
                            }
                        }
                        Node nodeD7 = x1.d(nodeD5, "VideoClicks");
                        if (nodeD7 != null) {
                            qVar.c = x1.a(x1.d(nodeD7, "ClickThrough"));
                            ArrayList arrayListC4 = x1.c(nodeD7, "ClickTracking");
                            if (!arrayListC4.isEmpty()) {
                                qVar.d = new ArrayList();
                                int size4 = arrayListC4.size();
                                int i8 = 0;
                                while (i8 < size4) {
                                    Object obj4 = arrayListC4.get(i8);
                                    i8++;
                                    ArrayList arrayList3 = arrayListC4;
                                    String strA3 = x1.a((Node) obj4);
                                    if (!TextUtils.isEmpty(strA3)) {
                                        qVar.d.add(strA3);
                                        size4 = size4;
                                    }
                                    arrayListC4 = arrayList3;
                                }
                            }
                        }
                        Node nodeD8 = x1.d(nodeD5, "TrackingEvents");
                        if (nodeD8 != null) {
                            ArrayList arrayListC5 = x1.c(nodeD8, "Tracking");
                            if (!arrayListC5.isEmpty()) {
                                qVar.b = new ArrayList();
                                int size5 = arrayListC5.size();
                                int i9 = 0;
                                while (i9 < size5) {
                                    Object obj5 = arrayListC5.get(i9);
                                    int i10 = i9 + 1;
                                    ArrayList arrayList4 = arrayListC5;
                                    Node node4 = (Node) obj5;
                                    if (node4 == null) {
                                        wVar2 = null;
                                    } else {
                                        wVar2 = new w();
                                        wVar2.a = x1.b(node4, "event");
                                        wVar2.b = x1.a(node4);
                                        wVar2.c = x1.b(node4, "offset");
                                    }
                                    if (wVar2 != null) {
                                        qVar.b.add(wVar2);
                                    }
                                    size5 = size5;
                                    arrayListC5 = arrayList4;
                                    i9 = i10;
                                }
                            }
                        }
                        Node nodeD9 = x1.d(nodeD5, "Duration");
                        if (nodeD9 != null) {
                            qVar.e = x1.a(nodeD9);
                        }
                        mVar.a = qVar;
                    }
                    Node nodeD10 = x1.d(node2, "CompanionAds");
                    if (nodeD10 != null) {
                        j jVar = new j();
                        String strB3 = x1.b(nodeD10, "required");
                        if (!TtmlNode.COMBINE_ALL.equalsIgnoreCase(strB3)) {
                            "none".equalsIgnoreCase(strB3);
                        }
                        ArrayList arrayListC6 = x1.c(nodeD10, "Companion");
                        jVar.a.clear();
                        int size6 = arrayListC6.size();
                        int i11 = 0;
                        while (i11 < size6) {
                            Object obj6 = arrayListC6.get(i11);
                            i11++;
                            Node node5 = (Node) obj6;
                            if (node5 == null) {
                                arrayList2 = arrayListC6;
                                str = str3;
                                str2 = str2;
                                hVar = null;
                            } else {
                                hVar = new h();
                                arrayList2 = arrayListC6;
                                hVar.a = x1.a(node5, str3);
                                hVar.b = x1.a(node5, str2);
                                hVar.c = x1.b(node5, "id");
                                x1.b(node5, "apiFramework");
                                x1.a(node5, "expandedWidth");
                                x1.a(node5, "expandedHeight");
                                Node nodeD11 = x1.d(node5, "StaticResource");
                                str = str3;
                                if (nodeD11 != null) {
                                    l lVar = new l();
                                    lVar.a = x1.b(nodeD11, "creativeType");
                                    lVar.b = x1.a(nodeD11);
                                    hVar.d = lVar;
                                }
                                Node nodeD12 = x1.d(node5, "HTMLResource");
                                if (nodeD12 != null) {
                                    hVar.f = x1.a(nodeD12);
                                }
                                Node nodeD13 = x1.d(node5, "IFrameResource");
                                if (nodeD13 != null) {
                                    hVar.e = x1.a(nodeD13);
                                }
                                Node nodeD14 = x1.d(node5, "CompanionClickThrough");
                                if (nodeD14 != null) {
                                    hVar.g = x1.a(nodeD14);
                                }
                                hVar.h.clear();
                                ArrayList arrayListC7 = x1.c(node5, "CompanionClickTracking");
                                if (arrayListC7.size() > 0) {
                                    int size7 = arrayListC7.size();
                                    int i12 = 0;
                                    while (i12 < size7) {
                                        Object obj7 = arrayListC7.get(i12);
                                        i12++;
                                        ArrayList arrayList5 = arrayListC7;
                                        String strA4 = x1.a((Node) obj7);
                                        if (!TextUtils.isEmpty(strA4)) {
                                            hVar.h.add(strA4);
                                            size7 = size7;
                                        }
                                        arrayListC7 = arrayList5;
                                    }
                                }
                                hVar.j.clear();
                                Node nodeD15 = x1.d(node5, "TrackingEvents");
                                if (nodeD15 != null) {
                                    ArrayList arrayListC8 = x1.c(nodeD15, "Tracking");
                                    if (!arrayListC8.isEmpty()) {
                                        int i13 = 0;
                                        for (int size8 = arrayListC8.size(); i13 < size8; size8 = size8) {
                                            Object obj8 = arrayListC8.get(i13);
                                            i13++;
                                            Node node6 = (Node) obj8;
                                            if (node6 == null) {
                                                wVar = null;
                                            } else {
                                                wVar = new w();
                                                wVar.a = x1.b(node6, "event");
                                                wVar.b = x1.a(node6);
                                                wVar.c = x1.b(node6, "offset");
                                            }
                                            if (wVar != null) {
                                                hVar.j.add(wVar);
                                            }
                                            arrayListC8 = arrayListC8;
                                        }
                                    }
                                }
                            }
                            if (hVar != null) {
                                jVar.a.add(hVar);
                            }
                            arrayListC6 = arrayList2;
                            str3 = str;
                            str2 = str2;
                        }
                        mVar.b = jVar;
                    }
                }
                gVar = this;
                if (mVar != null) {
                    gVar.c.add(mVar);
                }
                arrayListC2 = arrayList;
                size2 = i2;
                i4 = i5;
            }
        }
        Node nodeD16 = x1.d(node, "Extensions");
        if (nodeD16 != null) {
            ArrayList arrayListC9 = x1.c(nodeD16, "Extension");
            int size9 = arrayListC9.size();
            int i14 = 0;
            while (i14 < size9) {
                Object obj9 = arrayListC9.get(i14);
                i14++;
                Node node7 = (Node) obj9;
                if ("AdVerifications".equalsIgnoreCase(x1.b(node7, "type"))) {
                    gVar.a(node7);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(x1.b(node7, "type"))) {
                    IAlog.a("parseFMPCompanionAssetsTag", new Object[0]);
                    Node nodeD17 = x1.d(node7, "FMPCompanionAssets");
                    if (nodeD17 != null) {
                        o oVar = new o();
                        String strB4 = x1.b(nodeD17, "enableMultipleCompanions");
                        if ("false".equalsIgnoreCase(strB4) || "0".equals(strB4)) {
                            i = 0;
                            oVar.d = false;
                        } else {
                            i = 0;
                        }
                        Node nodeD18 = x1.d(nodeD17, "Name");
                        if (nodeD18 != null) {
                            oVar.a = x1.a(nodeD18);
                        }
                        Node nodeD19 = x1.d(nodeD17, "Description");
                        if (nodeD19 != null) {
                            x1.a(nodeD19);
                        }
                        oVar.b.clear();
                        Node nodeD20 = x1.d(nodeD17, "Icons");
                        if (nodeD20 != null) {
                            ArrayList arrayListC10 = x1.c(nodeD20, "Icon");
                            int size10 = arrayListC10.size();
                            int i15 = i;
                            while (i15 < size10) {
                                Object obj10 = arrayListC10.get(i15);
                                i15++;
                                oVar.b.add(x1.a((Node) obj10));
                            }
                        }
                        Node nodeD21 = x1.d(nodeD17, "Rating");
                        if (nodeD21 != null) {
                            try {
                                Float.parseFloat(x1.a(nodeD21));
                            } catch (Exception unused3) {
                            }
                        }
                        Node nodeD22 = x1.d(nodeD17, "Screenshots");
                        if (nodeD22 != null) {
                            oVar.c = new ArrayList();
                            ArrayList arrayListC11 = x1.c(nodeD22, "Screenshot");
                            int size11 = arrayListC11.size();
                            int i16 = i;
                            while (i16 < size11) {
                                Object obj11 = arrayListC11.get(i16);
                                i16++;
                                String strA5 = x1.a((Node) obj11);
                                if (!TextUtils.isEmpty(strA5)) {
                                    oVar.c.add(strA5);
                                }
                            }
                        }
                        gVar.e = oVar;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                if ("DynamicVideoControlsURL".equalsIgnoreCase(x1.b(node7, "type"))) {
                    Node nodeD23 = x1.d(node7, "DynamicVideoControlsURL");
                    n nVar = new n();
                    if (nodeD23 != null) {
                        nVar.a = x1.a(nodeD23);
                    }
                    if (!TextUtils.isEmpty(nVar.a)) {
                        gVar.h.add(nVar);
                    }
                }
                if ("StorePromoAssets".equalsIgnoreCase(x1.b(node7, "type")) && (nodeD = x1.d(node7, "DTSPR")) != null) {
                    v vVar = new v();
                    Node nodeD24 = x1.d(nodeD, "DTSPNm");
                    if (nodeD24 != null) {
                        vVar.b = x1.a(nodeD24);
                    }
                    Node nodeD25 = x1.d(nodeD, "DTSPTUrl");
                    if (nodeD25 != null) {
                        vVar.c = x1.a(nodeD25);
                    }
                    Node nodeD26 = x1.d(nodeD, "DTSPPNm");
                    if (nodeD26 != null) {
                        vVar.i = x1.a(nodeD26);
                    }
                    Node nodeD27 = x1.d(nodeD, "DTSPIap");
                    if (nodeD27 != null) {
                        vVar.d = x1.a(nodeD27);
                    }
                    Node nodeD28 = x1.d(nodeD, "DTSPCads");
                    if (nodeD28 != null) {
                        vVar.e = x1.a(nodeD28);
                    }
                    Node nodeD29 = x1.d(nodeD, "DTSPMedia");
                    if (nodeD29 != null && (childNodes2 = nodeD29.getChildNodes()) != null && childNodes2.getLength() != 0) {
                        for (int i17 = i; i17 < childNodes2.getLength(); i17++) {
                            Node nodeItem = childNodes2.item(i17);
                            if (nodeItem != null) {
                                String nodeName = nodeItem.getNodeName();
                                String strA6 = x1.a(nodeItem);
                                if (!TextUtils.isEmpty(strA6)) {
                                    if ("DTSPScrn".equalsIgnoreCase(nodeName)) {
                                        vVar.f.add(strA6);
                                    } else if ("DTSPVid".equalsIgnoreCase(nodeName)) {
                                        vVar.g.add(strA6);
                                    } else if ("DTSPIcon".equalsIgnoreCase(nodeName)) {
                                        vVar.a = strA6;
                                    }
                                }
                            }
                        }
                    }
                    Node nodeD30 = x1.d(nodeD, "DTSPMetadata");
                    if (nodeD30 != null && (childNodes = nodeD30.getChildNodes()) != null && childNodes.getLength() != 0) {
                        String strA7 = null;
                        String strA8 = null;
                        String strA9 = null;
                        for (int i18 = i; i18 < childNodes.getLength(); i18++) {
                            Node nodeItem2 = childNodes.item(i18);
                            if (nodeItem2 != null) {
                                String nodeName2 = nodeItem2.getNodeName();
                                if ("DTSPLabel".equalsIgnoreCase(nodeName2)) {
                                    strA7 = x1.a(nodeItem2);
                                } else if ("DTSPRating".equalsIgnoreCase(nodeName2)) {
                                    strA8 = x1.a(nodeItem2);
                                } else if ("DTSPSize".equalsIgnoreCase(nodeName2)) {
                                    strA9 = x1.a(nodeItem2);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(strA7) && !TextUtils.isEmpty(strA8) && !TextUtils.isEmpty(strA9)) {
                            vVar.h = new com.fyber.inneractive.sdk.flow.storepromo.model.d(strA8, strA7, strA9);
                        }
                    }
                    gVar.g = vVar;
                }
            }
        }
        a(node);
    }
}
