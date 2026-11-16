package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.activity.HyprMXBaseViewController;
import com.hyprmx.android.sdk.activity.HyprMXMraidViewController;
import com.hyprmx.android.sdk.activity.HyprMXNoOffersActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferViewerActivity;
import com.hyprmx.android.sdk.activity.HyprMXOfferWebViewController;
import com.hyprmx.android.sdk.activity.HyprMXRequiredInformationActivity;
import com.hyprmx.android.sdk.activity.HyprMXVastViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebTrafficViewController;
import com.hyprmx.android.sdk.activity.HyprMXWebView;
import com.hyprmx.android.sdk.activity.HyprMXWebViewClient;
import com.hyprmx.android.sdk.activity.OfferViewerHandler;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMX;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.graphics.HyprMXLearnMoreController;
import com.hyprmx.android.sdk.graphics.HyprMXSkipController;
import com.hyprmx.android.sdk.graphics.HyprMXWebViewWithClosableNavBar;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.overlay.HyprMXBrowserActivity;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.hyprmx.android.sdk.utility.HyprMXProperties;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ร, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class C0745 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f1980 = StringFog.decrypt("WXODmRVC6VFfcJGnE2/fSVt1g5sCTM4=\n", "Phb3znAgvSM=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f1979 = StringFog.decrypt("7kc3chOYefHKQyBVEL1w6upJF1UHkWnk4XcxUQ==\n", "iSJDPXX+HIM=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1978 = StringFog.decrypt("Wqf1Nhxp\n", "Et6FRFExwEg=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f1977 = StringFog.decrypt("z+/6NkP5THnp4vgrYs1qZA==\n", "h5aKRA6hDxY=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f1976 = StringFog.decrypt("YOB94U19JS5E2GXyTQ==\n", "MIwcgigQQEA=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f1975 = StringFog.decrypt("JnM=\n", "ZxfoLHK+T7w=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f1974 = StringFog.decrypt("NfS1mOgnMpUS6I2S6icyiQ==\n", "cZHF/YZDV/s=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f1973 = StringFog.decrypt("yqnnrKUbiTb+jeOzvj6MJ/s=\n", "mtuCwMp67VM=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f1972 = StringFog.decrypt("IFxOExYyxfAHVVsTLwPw8Q==\n", "aCU+YVtqlYI=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f1971 = StringFog.decrypt("bgnrMOiF1MREJvIn0orq1U4z9y3WvOHNQz76NOe88Q==\n", "JnCbQqXdg6E=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f1970 = StringFog.decrypt("akn/MMTL5VhkXrx/wtbnRWBCvG3I2btNe0fidsXR5gRBX+Js4erCT2tw+3vb5fxeYWX+cd/T90Zs\naPNo7tPn\n", "CSaSHqyylSo=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f1969 = StringFog.decrypt("2U6ei7brq3jeUYicicCkdOVemJCPyg==\n", "kTfu+fuz5Rc=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f1968 = StringFog.decrypt("YZ+knMPRdo5viOfTxcx0k2uU58HPwyidYYSgxMLcf9JKibnA5vBIk02Wr9fZ20efdpm/29/R\n", "AvDJsquoBvw=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f1967 = StringFog.decrypt("9PcfXGjbj0fa6x14TOa3RM7PDFpM9alVxQ==\n", "vI5vLiWDwCE=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1966 = StringFog.decrypt("5HyInP+ZRrPqa8vT+YREru53y8Hzixig5GeMxP6UT+/PapXA2rh5p+F2l+T+hUGk9VKGxv6WX7X+\n", "hxPlspfgNsE=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1965 = StringFog.decrypt("Y3b6z7nTLLFaeuPPke83uk1g+NCV/xe7RU7pyZ39F6BS\n", "Kw+KvfSLftQ=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f1964 = StringFog.decrypt("9vwHGJpCO7f460RXnF85qvz3REWWUGWk9ucDQJtPMuvd6hpEv2MZoOTmA0SXXwKr8/wYW5NPIqr7\n0glCm00isew=\n", "lZNqNvI7S8U=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f1963 = StringFog.decrypt("jAJmAqZjBU63HkAZjkwEQKoPZB+HVyJd\n", "xHsWcOs7Ry8=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1962 = StringFog.decrypt("Hfk3T2BP4twm9BFUSGD30jv0NVJBe9HP\n", "VYBHPS0XtL0=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1961 = StringFog.decrypt("YjtbLZAMII1IFlk+uzIei3wrTiieOxmcWC1HM7gm\n", "KkIrX91Ud+g=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1960 = StringFog.decrypt("X0+3XMr7LWJ4TJRXzNE4eA==\n", "ECnRObi4TAE=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1959 = StringFog.decrypt("uZd/mtiiYCyHkVKswKZlPg==\n", "7vIdzqrDBko=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1958 = StringFog.decrypt("+KlRDw/o3LTGr2YJMQ==\n", "r8wzW32JutI=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1957 = StringFog.decrypt("e9A5G0Pg7tpS2yckYcrH/FzHPRth1M7aQQ==\n", "M6lJaQ64or8=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1956 = StringFog.decrypt("fWDRqkB8IHtUcMWOZEEaSlp31apiSAFsRw==\n", "NRmh2A0kbQk=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1955 = StringFog.decrypt("O8tDRyEulNkV10FiCRSN1hbFcFoCAqnQH95WRw==\n", "c7IzNWx2278=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1954 = StringFog.decrypt("Lsibv0LUHWIE54KoeA==\n", "ZrHrzQ+MSgc=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1953 = StringFog.decrypt("npKPsircw/q0vZalEMf49rOFiw==\n", "1uv/wGeElJ8=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1952 = StringFog.decrypt("h07r/kjQR6KpUunabO1/ob1/+uJh5G22\n", "zzebjAWICMQ=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1951 = StringFog.decrypt("7E2lc1//WVjUTrFeTMdUUcZZj39e3VVTxlk=\n", "oyvDFi2pMD0=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1950 = StringFog.decrypt("cLN0ExCY2RdRukcOM7T4E1SmYRM=\n", "OMoEYV3Ainw=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1949 = StringFog.decrypt("MRcRWnhMT2sQHiJHW2BubxUCBFp5fW90HAAEWg==\n", "eW5hKDUUHAA=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1948 = StringFog.decrypt("yH2y3QsUFB7K\n", "rxjGnG9AbW4=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1947 = StringFog.decrypt("JH+d4haBG0Muf4fGLpkIQwZ0nN8=\n", "QxrpsnrgeCY=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1946 = StringFog.decrypt("zHOWZlUGO73Pc4xBST4xv89zkGteBSqyxXWH\n", "qxbiIjB2XtM=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f1945 = StringFog.decrypt("Y1Al21S6T9ltVyTrUrtyzw==\n", "BDVRnz3JO6s=\n");

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f1944 = StringFog.decrypt("gRSA+4Z7usSLFJrfqXW31ZQemMePaA==\n", "5nH0q+oa2aE=\n");

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static final String f1943 = StringFog.decrypt("w50Xoe1UvUDFnAaV21ClTg==\n", "pPhj8Z8x0S8=\n");

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static final String f1942 = StringFog.decrypt("wdyEBrGFEa/DzZUkow==\n", "prnwVtD3cMI=\n");

    /* JADX INFO: renamed from: ᔽ, reason: contains not printable characters */
    public static final String f1941 = StringFog.decrypt("RuvkbJOtTXRh5ed7rLRscmfk/Wqn\n", "DpKUHt71DwY=\n");

    /* JADX INFO: renamed from: ᔺ, reason: contains not printable characters */
    public static final String f1940 = StringFog.decrypt("kRE0ZelqPrifBncq73c8pZsadzjleGClhBsrJ+BqYIKLDisG2VE8pYUNPDnAcDqjhBctMg==\n", "8n5ZS4ETTso=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        try {
            try {
                return (String) BuildConfig.class.getDeclaredField(StringFog.decrypt("mT5OIc+HNNKBOlE3\n", "z3sccobIeo0=\n")).get(null);
            } catch (Exception unused) {
                C0679 c0679 = C0891.m648().f2390;
                String strDecrypt = StringFog.decrypt("6DbOYhlQgO6dNs4d\n", "tmqqOUU0rrM=\n");
                c0679.getClass();
                return C0679.m570((Object) null, BuildConfig.class, strDecrypt);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f1980, new C0871(this));
        map.put(f1979, new C0870(this));
        map.put(f1948, new C0869(this));
        map.put(f1947, new C0825(this));
        map.put(f1946, new C0781(this));
        map.put(f1945, new C0776(this));
        map.put(f1944, new C0772(this));
        map.put(f1943, new C0770(this));
        map.put(f1942, new C0756(this));
        return map;
    }

    public C0745(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0177  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2118473762:
                if (str.equals(f1978)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -2115661176:
                if (str.equals(f1961)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case -2082076211:
                if (str.equals(f1949)) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case -2060981001:
                if (str.equals(f1974)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -1783324338:
                if (str.equals(f1968)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -1711062568:
                if (str.equals(f1971)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -1632261541:
                if (str.equals(f1954)) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case -1625751435:
                if (str.equals(f1964)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case -1429076201:
                if (str.equals(f1955)) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case -1345825871:
                if (str.equals(f1972)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -1289932600:
                if (str.equals(f1959)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case -1102538544:
                if (str.equals(f1951)) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case -1056910325:
                if (str.equals(f1970)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case -793729563:
                if (str.equals(f1969)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -684201479:
                if (str.equals(f1950)) {
                    b = 28;
                } else {
                    b = -1;
                }
                break;
            case -411143178:
                if (str.equals(f1966)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case -352824194:
                if (str.equals(f1973)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -58290677:
                if (str.equals(f1962)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case -52302939:
                if (str.equals(f1940)) {
                    b = 31;
                } else {
                    b = -1;
                }
                break;
            case -48720897:
                if (str.equals(f1967)) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case 2115:
                if (str.equals(f1975)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case 5206681:
                if (str.equals(f1941)) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case 99044255:
                if (str.equals(f1976)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case 217655834:
                if (str.equals(f1977)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 748493318:
                if (str.equals(f1953)) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case 902272186:
                if (str.equals(f1956)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 1056638846:
                if (str.equals(f1965)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case 1527993897:
                if (str.equals(f1960)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 1564846544:
                if (str.equals(f1963)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 1575934042:
                if (str.equals(f1952)) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case 1775126662:
                if (str.equals(f1958)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case 1872662391:
                if (str.equals(f1957)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return HyprMX.class;
            case 1:
                return HyprMXController.class;
            case 2:
                return PlacementType.class;
            case 3:
                return Ad.class;
            case 4:
                return DependencyHolder.class;
            case 5:
                return PreloadedVastData.class;
            case 6:
                return HyprMXProperties.class;
            case 7:
            case 8:
                return HyprMXWebViewWithClosableNavBar.class;
            case 9:
            case 10:
                return HyprMXNoOffersActivity.class;
            case 11:
            case 12:
                return HyprMXOfferViewerActivity.class;
            case 13:
            case 14:
                return HyprMXRequiredInformationActivity.class;
            case 15:
                return HyprMXBaseViewController.class;
            case 16:
                return HyprMXVastViewController.class;
            case 17:
                return HyprMXWebTrafficViewController.class;
            case 18:
                return OfferCacheEntity.class;
            case 19:
                return WebTrafficObject.class;
            case 20:
                return WebTrafficObject.WebTrafficURL.class;
            case 21:
                return HyprMXLearnMoreController.class;
            case 22:
                return HyprMXMraidViewController.class;
            case 23:
                return HyprMXOfferWebViewController.class;
            case 24:
                return HyprMXWebView.class;
            case 25:
                return HyprMXWebViewClient.class;
            case 26:
                return OfferViewerHandler.class;
            case 27:
                return OfferViewerHandler.OfferViewerHandlerListener.class;
            case 28:
                return HyprMXSkipController.class;
            case 29:
                return HyprMXSkipController.Listener.class;
            case 30:
            case 31:
                return HyprMXBrowserActivity.class;
            default:
                return null;
        }
    }
}
