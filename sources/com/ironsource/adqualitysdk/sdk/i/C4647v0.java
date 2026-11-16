package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.vungle.warren.AdActivity;
import com.vungle.warren.AdvertisementPresentationFactory;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.VungleWebViewActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.presenter.MRAIDAdPresenter;
import com.vungle.warren.ui.view.LocalAdView;
import com.vungle.warren.ui.view.MRAIDAdView;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.ui.view.VungleNativeView;
import com.vungle.warren.ui.view.VungleWebClient;
import com.vungle.warren.ui.view.WebViewAPI;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4647v0 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public String f514;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f513 = StringFog.decrypt("UICX3CZrrsNQhbfIIGo=\n", "OfPeskUOwLc=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f512 = StringFog.decrypt("qZP1jP6hSZulk/WE/g==\n", "zvaBzZrsKOk=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f511 = StringFog.decrypt("/qpzWoxwI6/wqGk=\n", "mc8HGe0dU84=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f510 = StringFog.decrypt("brqtamVmVIZmvr1PaH1fv3uzqg==\n", "Cd/ZLgoROuo=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f509 = StringFog.decrypt("Rl5OT3/KRHlMXlRr\n", "ITs6HxOrJxw=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f508 = StringFog.decrypt("Btj4jJvS++Em\n", "Ub2azf+EkoQ=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f507 = StringFog.decrypt("yIOl2dq3gp7sg6ns25U=\n", "n+bHmL7n8Ps=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f506 = StringFog.decrypt("RLpotfO+LuxDlg==\n", "E98K45rbWa0=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f505 = StringFog.decrypt("lAJF0/haFwKgNEfd8VE0\n", "wncrtJQ/QGc=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f504 = StringFog.decrypt("DAYL4DeyZKQoMT0=\n", "QVRKqXPzAPI=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f503 = StringFog.decrypt("LZVaJvRjHH8FoHob1Q==\n", "YMcbb7AneRM=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f502 = StringFog.decrypt("Nq1lxOFY3YASpHbP53zGlgSsfdX2Xuu2Aax91d9Fx4cSp3bT\n", "d8kToZMstPM=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f501 = StringFog.decrypt("NVDb1wq/uhMATQ==\n", "dDSatH7WzHo=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f500 = StringFog.decrypt("cGeIXY1i\n", "JhLmOuEH9b0=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f499 = StringFog.decrypt("zn6KcfO2BdbsYpJ/66o=\n", "mAvkFp/TRLU=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f498 = StringFog.decrypt("LAsJ+5ErGlojAUqihiwGWCFKEbzJCAFTKAgBlIQqHUsmEB0=\n", "T2Rk1ededD0=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f497 = StringFog.decrypt("xSxcpYjGTULhJU+ujg==\n", "hEgqwPqyJDE=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f496 = StringFog.decrypt("MIZz0QF5azwU\n", "YOoSsmQUDlI=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f495 = StringFog.decrypt("94Ux3LLgCNTDpjbeqcQ8xciGNs+n\n", "ofBfu96FX7E=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f494 = StringFog.decrypt("uAdU9jyU4Ia3DRevK5P8hLVGTLFkt/uPvARcjy+D2Ii+H3i7Poj4iK8R\n", "22g52ErhjuE=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f493 = StringFog.decrypt("2Vgqse8ITvXlWCmpzQc=\n", "iTRLyK5sDZQ=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f492 = StringFog.decrypt("Mg++PAET\n", "YGrOU3Nnfvg=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f491 = StringFog.decrypt("fmT07c+FDGReeA==\n", "LAGEgrzseAs=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f490 = StringFog.decrypt("2W5oDzW11877fg==\n", "mAorYFvBpa8=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f489 = StringFog.decrypt("yMRdZ8DowuDrxUp0zcrS\n", "hKs+BqyppqM=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f488 = StringFog.decrypt("s4GAIjHavBKWi5Q=\n", "/+7jQ12b2EQ=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f487 = StringFog.decrypt("UQ/jV8xKKPFq\n", "HWCANqAcQZQ=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f486 = StringFog.decrypt("bOlPQCJQX5hT40JVK3I=\n", "IIYsIU4ALf0=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f485 = StringFog.decrypt("BkvgijI1G8wkW/ykODcM3zNG0IAxJAfZF13GljkvHcg1\n", "Ry+j5VxBaa0=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f484 = StringFog.decrypt("AkB8bpSNLVQmSW9lkqk2QjBBZH+HjS1ILWJraJKWNl4=\n", "QyQKC+b5RCc=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f483 = StringFog.decrypt("sBgBh7EqQ2uOEhGDsx9CSQ==\n", "/Hdi5t1rJzs=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f482 = StringFog.decrypt("d1ZufzJBQQlIYVxTGHRAKw==\n", "OgQvNnYAJVk=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f481 = StringFog.decrypt("qZ8eviFX7OORhBWr\n", "/+pw2U0yroI=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f480 = StringFog.decrypt("2QBRzG+rEH/WChKVeKwMfdRBapd3uRJ9+A5SjHys\n", "um884hnefhg=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f479 = StringFog.decrypt("11WR2VETehX1SYnbax9RAw==\n", "gSD/vj12NHQ=\n");

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f478 = StringFog.decrypt("FonVO0Y3jOUZg5ZiUTCQ5xvIzXweNIvnAsjuYF4ljuc7h8x8Rie06xCR\n", "dea4FTBC4oI=\n");

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static final String f477 = StringFog.decrypt("q7kdIbElSk6TohY0iyltWA==\n", "/cxzRt1ACC8=\n");

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static final String f476 = StringFog.decrypt("sGa/7zvzQ3y/bPy2LPRffr0np6hj8ER+pCeEtCPhQX6RaLyvKPR7crZ+\n", "0wnSwU2GLRs=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f509, new C4638q0(this));
        map.put(f513, new C4639r0(this));
        map.put(f512, new C4641s0(this));
        map.put(f511, new C4643t0(this));
        map.put(f510, new C4645u0(this));
        return map;
    }

    public C4647v0(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        String strMo342 = mo342();
        if (strMo342 != null) {
            return strMo342.split(StringFog.decrypt("Lw==\n", "AGoQyyuNpWU=\n"))[1];
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x0184  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2075872274:
                if (str.equals(f482)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case -2012803321:
                if (str.equals(f478)) {
                    b = 32;
                } else {
                    b = -1;
                }
                break;
            case -1853707364:
                if (str.equals(f476)) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case -1850654380:
                if (str.equals(f492)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case -1836618638:
                if (str.equals(f501)) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case -1740904301:
                if (str.equals(f488)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case -1721428911:
                if (str.equals(f500)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -1057659822:
                if (str.equals(f502)) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case -965507231:
                if (str.equals(f506)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case -899612152:
                if (str.equals(f494)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -828205665:
                if (str.equals(f504)) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case -747599243:
                if (str.equals(f490)) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case -498060603:
                if (str.equals(f496)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -350701718:
                if (str.equals(f491)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -92732536:
                if (str.equals(f480)) {
                    b = 28;
                } else {
                    b = -1;
                }
                break;
            case 156342925:
                if (str.equals(f479)) {
                    b = 31;
                } else {
                    b = -1;
                }
                break;
            case 315438882:
                if (str.equals(f477)) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case 332396988:
                if (str.equals(f508)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case 505165239:
                if (str.equals(f495)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case 670892517:
                if (str.equals(f497)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case 746354589:
                if (str.equals(f486)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 798818448:
                if (str.equals(f487)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case 1033471823:
                if (str.equals(f498)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case 1110462460:
                if (str.equals(f503)) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case 1205766784:
                if (str.equals(f499)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 1208038126:
                if (str.equals(f505)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case 1230133745:
                if (str.equals(f507)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case 1461477995:
                if (str.equals(f484)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case 1611471226:
                if (str.equals(f483)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case 1731532800:
                if (str.equals(f489)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case 1766407901:
                if (str.equals(f481)) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case 1777696764:
                if (str.equals(f493)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case 1861686093:
                if (str.equals(f485)) {
                    b = 18;
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
                return Vungle.class;
            case 1:
            case 2:
                return VungleActivity.class;
            case 3:
            case 4:
                return VungleWebViewActivity.class;
            case 5:
                return Advertisement.class;
            case 6:
                return Placement.class;
            case 7:
                return VungleWebClient.class;
            case 8:
                return Report.class;
            case 9:
                return PlayAdCallback.class;
            case 10:
                return Repository.class;
            case 11:
                return AdContract.class;
            case 12:
                return LocalAdContract.class;
            case 13:
                return LocalAdView.class;
            case 14:
                return LocalAdContract.LocalView.class;
            case 15:
                return LocalAdContract.LocalPresenter.class;
            case 16:
                return LocalAdPresenter.class;
            case 17:
                return MRAIDAdPresenter.class;
            case 18:
                return AdContract.AdvertisementPresenter.class;
            case 19:
                return AdvertisementPresentationFactory.class;
            case 20:
                return WebAdContract.WebAdView.class;
            case 21:
                return WebAdContract.WebAdPresenter.class;
            case 22:
                return WebViewAPI.class;
            case 23:
                return MRAIDAdView.class;
            case 24:
                return WebViewAPI.MRAIDDelegate.class;
            case 25:
                return AdContract.AdvertisementPresenter.EventListener.class;
            case 26:
                return AdActivity.class;
            case 27:
            case 28:
                return VungleBanner.class;
            case 29:
            case 30:
                return VungleBannerView.class;
            case 31:
            case 32:
                return VungleNativeView.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final String mo342() {
        if (this.f514 == null) {
            C0744 c0744 = C0891.m648().f2391;
            C0761 c0761 = new C0798().f2097;
            c0761.f2011 = String.class;
            c0761.f4014 |= 8;
            c0761.f4013 |= 16;
            C0744 c0745 = C0891.m648().f2391;
            ArrayList arrayList = new ArrayList();
            c0745.m597(VungleApiClient.class, c0761, arrayList);
            String str = null;
            try {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str2 = (String) ((Field) obj).get(null);
                    if (str2.startsWith(StringFog.decrypt("+QS+AbJRquzOC78I\n", "r3HQZt4064E=\n")) || str2.startsWith(StringFog.decrypt("xRLCXEZ8jQb8Dsg=\n", "k2esOyoZyXQ=\n"))) {
                        str = str2.split(StringFog.decrypt("AA==\n", "OyXGK1E2gLU=\n"))[0];
                        break;
                    }
                }
            } catch (Exception unused) {
            }
            this.f514 = str;
            this.f1296 = str;
        }
        return this.f514;
    }
}
