package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitActivity;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TJWebView;
import com.tapjoy.Tapjoy;
import com.tapjoy.mraid.view.ActionHandler;
import com.tapjoy.mraid.view.Browser;
import com.tapjoy.mraid.view.MraidView;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ˊ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0488 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f1116 = StringFog.decrypt("cn6Gm3VRWch4fpy/V1FXyA==\n", "FRvyyxkwOq0=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f1115 = StringFog.decrypt("lU0h5SJm\n", "8ihVsFAKUmU=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1114 = StringFog.decrypt("VKj7RPO7eHJWvv9j6bxt\n", "M82PDIfPCCA=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f1113 = StringFog.decrypt("QtNU1poeWw==\n", "JbYgmPtzPg4=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f1112 = StringFog.decrypt("eCyCBk9NH8VxLIQ=\n", "H0n2SiY+a6A=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f1111 = StringFog.decrypt("t8amX6h/Eb+cyqF9pHURog==\n", "0KPSCcEbdNA=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f1110 = StringFog.decrypt("iF5nlLU+h6+dVw==\n", "7zsT2NRN8/o=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f1109 = StringFog.decrypt("GkB++hosncslTHnYFiad1g==\n", "aSUKrHNI+KQ=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f1108 = StringFog.decrypt("2UwBk6rWSL3MZTSeidFVsA==\n", "jQZA9/+4Ick=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f1107 = StringFog.decrypt("ZpoDLRGyFitqjEBXL5ICFGucGkIGpw83bIEX\n", "BfVuA2XTZkE=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f1106 = StringFog.decrypt("T89J3iBVmW5vxGnFJ1eVdGI=\n", "G4UKsU4h/AA=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f1105 = StringFog.decrypt("ZNCHOuEYMDJoxsRA3zovNnPahGDUGjQxcdaebQ==\n", "B7/qFJV5QFg=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f1104 = StringFog.decrypt("yBTFduNVZVr5MOFe40Jh\n", "nF6VGoI2ADc=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f1103 = StringFog.decrypt("YUyZbIHvA11C\n", "NQbOCeO5ajg=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1102 = StringFog.decrypt("sXj5AIaCnLC9brp6uLSJuIR+8Vk=\n", "0heULvLj7No=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1101 = StringFog.decrypt("9Q09hr1bj4PrFD6QgVGBkg==\n", "oUd84ug15vc=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f1100 = StringFog.decrypt("sJLQ0gA/Oq2HoQ==\n", "5NiTp3JNX8M=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f1099 = StringFog.decrypt("MTV6D13ucqkAEV4=\n", "ZX8qYzyNF8Q=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1098 = StringFog.decrypt("o0EFyNzzeHelbjXezelj\n", "9wtEq6iaFxk=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1097 = StringFog.decrypt("BS1IVneWfEQkFXtEeIdhSzgUfUR4gWo=\n", "UWcJIRbkGAc=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1096 = StringFog.decrypt("BINn9WQtDUM=\n", "UMkmkTFDZDc=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1095 = StringFog.decrypt("M2r5f1+EJwUCTt1fV5Q2DQlF2w==\n", "ZyCpEz7nQmg=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1094 = StringFog.decrypt("OLVDlgtnJaUFjGGaAWc4\n", "bP8V/28CSuk=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1093 = StringFog.decrypt("gIYaFTZkQJeDqTknCm9er72/LxQNb1s=\n", "1MxbcWMKKeM=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1092 = StringFog.decrypt("h3V3gAAO03aFVlKBOizTcadaWIEn\n", "0z825FVgugI=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1091 = StringFog.decrypt("OQc22DzNeGoIIxLiNMp4aCEkFcA4wHh1\n", "bU1mtF2uHQc=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1090 = StringFog.decrypt("9IGL4H325w3O\n", "ufPqiRmgjmg=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1089 = StringFog.decrypt("PBTAZrwvZgowAoMlui9/BHENxC2/YFsSPhLJHqErYQ==\n", "X3utSMhOFmA=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1088 = StringFog.decrypt("PNqFGpKxn0YT3Z0Wjw==\n", "fbnxc/3f1yc=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1087 = StringFog.decrypt("ANhmBkQ3kUUMziVFQjeIS03BYk1HeKBMF95kRng3j0sP0nk=\n", "Y7cLKDBW4S8=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1086 = StringFog.decrypt("irnDbRhQAg==\n", "yMusGms1cFA=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1085 = StringFog.decrypt("gEHXfXFaTzOMV5Q+d1pWPc1Y0zZyFX0rjFnJNnc=\n", "4y66UwU7P1k=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1084 = StringFog.decrypt("OPPtUm+Qn8UJ2+hLZo4=\n", "bLm+IgP565I=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1083 = StringFog.decrypt("S50wgfYUgFVHi3P7yCaAU0GGCsrgI5laXw==\n", "KPJdr4J18D8=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f1116, new C0502(this));
        map.put(f1115, new C0479(this));
        map.put(f1114, new C0478(this));
        map.put(f1113, new C0477(this));
        map.put(f1112, new C0782(this));
        map.put(f1111, new C0493(this));
        map.put(f1109, new C0492(this));
        map.put(f1110, new C0489(this));
        return map;
    }

    public C0488(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        return Tapjoy.getVersion();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1983375197:
                if (str.equals(f1098)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case -1687314074:
                if (str.equals(f1085)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case -1640254126:
                if (str.equals(f1106)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1628534628:
                if (str.equals(f1090)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -1429063965:
                if (str.equals(f1095)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case -1414965228:
                if (str.equals(f1088)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -1147119309:
                if (str.equals(f1102)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case -872754855:
                if (str.equals(f1104)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -721136035:
                if (str.equals(f1096)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case -668579974:
                if (str.equals(f1089)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -593336436:
                if (str.equals(f1097)) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case -217417742:
                if (str.equals(f1087)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case 178410181:
                if (str.equals(f1083)) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case 206635148:
                if (str.equals(f1108)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case 268330895:
                if (str.equals(f1101)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case 327820672:
                if (str.equals(f1091)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 705136807:
                if (str.equals(f1100)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case 741045788:
                if (str.equals(f1107)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 832039888:
                if (str.equals(f1093)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case 906946425:
                if (str.equals(f1094)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 1317517621:
                if (str.equals(f1084)) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case 1504750787:
                if (str.equals(f1103)) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case 1519750415:
                if (str.equals(f1099)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case 1815593736:
                if (str.equals(f1086)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case 1891461874:
                if (str.equals(f1092)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case 2041573826:
                if (str.equals(f1105)) {
                    b = 3;
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
            case 1:
                return TJAdUnitActivity.class;
            case 2:
            case 3:
                return TJContentActivity.class;
            case 4:
                return TJPlacementData.class;
            case 5:
            case 6:
                return ActionHandler.class;
            case 7:
            case 8:
                return Browser.class;
            case 9:
            case 10:
                return MraidView.class;
            case 11:
            case 12:
                return TJWebView.class;
            case 13:
                return TJAdUnit.class;
            case 14:
                return TJPlacementListener.class;
            case 15:
                return TJVideoListener.class;
            case 16:
                return TJAdUnit.TJAdUnitWebViewListener.class;
            case 17:
                return TJAdUnit.TJAdUnitVideoListener.class;
            case 18:
                return TJPlacementVideoListener.class;
            case 19:
                return TJAdUnitJSBridge.class;
            case 20:
                return TJCurrency.class;
            case 21:
                return TJPlacement.class;
            case 22:
                return TJActionRequest.class;
            case 23:
                return TJAwardCurrencyListener.class;
            case 24:
            case 25:
                return TJSplitWebView.class;
            default:
                return null;
        }
    }
}
