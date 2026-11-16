package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mbridge.msdk.out.MBConfiguration;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.singular.sdk.internal.UserDetailsUtils;
import com.usercentrics.sdk.BannerInitCustomization;
import com.usercentrics.sdk.PurposeListStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rd1 {
    public static ProgressBar e;
    public static View f;
    public final /* synthetic */ int a;
    public final SideSheetBehavior b;
    public static final l71 c = new l71(12);
    public static final int[] d = {R.attr.progressBarStyleLarge, R.attr.progressBarStyleLargeInverse, R.attr.progressBarStyleSmall, R.attr.progressBarStyleSmallInverse};
    public static int g = -1;

    public /* synthetic */ rd1(SideSheetBehavior sideSheetBehavior, int i) {
        this.a = i;
        this.b = sideSheetBehavior;
    }

    public static gk a(int i, int i2, ck ckVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        ck ckVar2 = ck.a;
        if (i3 != 0) {
            ckVar = ckVar2;
        }
        if (i == -2) {
            if (ckVar != ckVar2) {
                return new xw(1, ckVar);
            }
            vp.V8.getClass();
            return new gk(up.b);
        }
        if (i == -1) {
            if (ckVar == ckVar2) {
                return new xw(1, ck.b);
            }
            d.r("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return ckVar == ckVar2 ? new gk(0) : new xw(1, ckVar);
        }
        if (i != Integer.MAX_VALUE) {
            return ckVar == ckVar2 ? new gk(i) : new xw(i, ckVar);
        }
        return new gk(Integer.MAX_VALUE);
    }

    public static final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xc3 xc3Var = (xc3) obj;
            Bundle bundle = new Bundle();
            bundle.putInt(StatsEvent.z, xc3Var.a);
            bundle.putLong("event_timestamp", xc3Var.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static void c(Activity activity, FrameLayout frameLayout, int i) {
        if (i < 0 || i >= 4) {
            return;
        }
        if (frameLayout == null) {
            d.r("ViewGroup cannot be null.");
            return;
        }
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        ProgressBar progressBar = e;
        if (progressBar != null) {
            if (g == i) {
                return;
            }
            if (f != null) {
                ViewGroup viewGroup = (ViewGroup) progressBar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(e);
                    viewGroup.removeView(f);
                }
                e = null;
                f = null;
            }
            g = -1;
        }
        g = i;
        ProgressBar progressBar2 = new ProgressBar(activity, null, d[i]);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        progressBar2.setLayoutParams(layoutParams);
        progressBar2.setBackground(new ColorDrawable(0));
        progressBar2.setIndeterminate(true);
        e = progressBar2;
        View view = new View(activity);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackgroundColor(0);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnTouchListener(new ai(1));
        view.setOnKeyListener(new zb3());
        f = view;
        frameLayout.addView(view);
        frameLayout.addView(e);
    }

    public static AdError d(int i, String str) {
        return new AdError(i, str, IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN);
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        d.w(str);
    }

    public static AdError f(int i, String str) {
        return new AdError(i, str, "com.google.ads.mediation.mintegral");
    }

    public static AdError g(int i, String str) {
        return new AdError(i, str, MBConfiguration.LOG_TAG);
    }

    public static void h(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            qv qvVar = (qv) obj;
            b40 b40Var = new b40(qvVar);
            for (l12 l12Var : qvVar.b) {
                boolean z = qvVar.e == 0;
                c40 c40Var = new c40(l12Var, !z);
                if (!map.containsKey(c40Var)) {
                    map.put(c40Var, new HashSet());
                }
                Set set = (Set) map.get(c40Var);
                if (!set.isEmpty() && z) {
                    e32.o(l12Var, UserDetailsUtils.UserDetailsLiterals.DOT, "Multiple components provide ");
                    return;
                }
                set.add(b40Var);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (b40 b40Var2 : (Set) it.next()) {
                for (pb0 pb0Var : b40Var2.a.c) {
                    if (pb0Var.c == 0) {
                        Set<b40> set2 = (Set) map.get(new c40(pb0Var.a, pb0Var.b == 2));
                        if (set2 != null) {
                            for (b40 b40Var3 : set2) {
                                b40Var2.b.add(b40Var3);
                                b40Var3.c.add(b40Var2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<b40> hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        for (b40 b40Var4 : hashSet) {
            if (b40Var4.c.isEmpty()) {
                hashSet2.add(b40Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            b40 b40Var5 = (b40) hashSet2.iterator().next();
            hashSet2.remove(b40Var5);
            i++;
            for (b40 b40Var6 : b40Var5.b) {
                b40Var6.c.remove(b40Var5);
                if (b40Var6.c.isEmpty()) {
                    hashSet2.add(b40Var6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (b40 b40Var7 : hashSet) {
            if (!b40Var7.c.isEmpty() && !b40Var7.b.isEmpty()) {
                arrayList2.add(b40Var7.a);
            }
        }
        throw new qb0(arrayList2);
    }

    public static /* synthetic */ bp0 i(ms0 ms0Var, sy syVar, int i, ck ckVar, int i2) {
        if ((i2 & 1) != 0) {
            syVar = cg0.a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            ckVar = ck.a;
        }
        return ms0Var.a(syVar, i, ckVar);
    }

    public static final jw1 n(jw1 jw1Var, BannerInitCustomization bannerInitCustomization) {
        if (bannerInitCustomization == null) {
            return jw1Var;
        }
        lw1 lw1Var = jw1Var.a;
        nw1 nw1Var = jw1Var.b;
        String str = nw1Var.a;
        int i = nw1Var.b;
        Integer num = bannerInitCustomization.f;
        if (num == null) {
            num = nw1Var.c;
        }
        Integer num2 = bannerInitCustomization.g;
        if (num2 == null) {
            num2 = nw1Var.d;
        }
        Integer num3 = bannerInitCustomization.h;
        if (num3 == null) {
            num3 = nw1Var.e;
        }
        Float f2 = bannerInitCustomization.e;
        if (f2 == null) {
            f2 = nw1Var.f;
        }
        nw1 nw1Var2 = new nw1(str, i, num, num2, num3, f2);
        String str2 = jw1Var.c;
        int i2 = jw1Var.d;
        mk mkVar = jw1Var.e;
        Integer num4 = bannerInitCustomization.a;
        if (num4 == null) {
            num4 = jw1Var.f;
        }
        Integer num5 = bannerInitCustomization.b;
        if (num5 == null) {
            num5 = jw1Var.g;
        }
        Integer num6 = bannerInitCustomization.c;
        if (num6 == null) {
            num6 = jw1Var.h;
        }
        Integer num7 = bannerInitCustomization.d;
        if (num7 == null) {
            num7 = jw1Var.i;
        }
        PurposeListStyle purposeListStyle = bannerInitCustomization.o;
        if (purposeListStyle == null) {
            purposeListStyle = jw1Var.j;
        }
        String str3 = bannerInitCustomization.m;
        if (str3 == null) {
            str3 = jw1Var.k;
        }
        Integer num8 = bannerInitCustomization.n;
        if (num8 == null) {
            num8 = jw1Var.l;
        }
        Boolean bool = bannerInitCustomization.p;
        if (bool == null) {
            bool = jw1Var.m;
        }
        Boolean bool2 = bannerInitCustomization.q;
        if (bool2 == null) {
            bool2 = jw1Var.n;
        }
        Boolean bool3 = bool2;
        Integer num9 = bannerInitCustomization.r;
        if (num9 == null) {
            num9 = jw1Var.o;
        }
        Integer num10 = num9;
        Integer num11 = bannerInitCustomization.s;
        if (num11 == null) {
            num11 = jw1Var.p;
        }
        Integer num12 = num11;
        Integer num13 = bannerInitCustomization.t;
        if (num13 == null) {
            num13 = jw1Var.q;
        }
        Integer num14 = num13;
        Boolean bool4 = bannerInitCustomization.u;
        if (bool4 == null) {
            bool4 = jw1Var.r;
        }
        Boolean bool5 = bool4;
        Boolean bool6 = bannerInitCustomization.v;
        if (bool6 == null) {
            bool6 = jw1Var.s;
        }
        Boolean bool7 = bool6;
        Integer num15 = bannerInitCustomization.w;
        if (num15 == null) {
            num15 = jw1Var.t;
        }
        Integer num16 = num15;
        String str4 = bannerInitCustomization.x;
        if (str4 == null) {
            str4 = jw1Var.u;
        }
        String str5 = str4;
        String str6 = bannerInitCustomization.y;
        if (str6 == null) {
            str6 = jw1Var.v;
        }
        String str7 = str6;
        String str8 = bannerInitCustomization.z;
        if (str8 == null) {
            str8 = jw1Var.w;
        }
        String str9 = str8;
        String str10 = bannerInitCustomization.A;
        if (str10 == null) {
            str10 = jw1Var.x;
        }
        String str11 = str10;
        Boolean bool8 = bannerInitCustomization.i;
        if (bool8 == null) {
            bool8 = jw1Var.y;
        }
        Boolean bool9 = bool8;
        Integer num17 = bannerInitCustomization.j;
        if (num17 == null) {
            num17 = jw1Var.z;
        }
        Integer num18 = num17;
        Integer num19 = bannerInitCustomization.k;
        if (num19 == null) {
            num19 = jw1Var.A;
        }
        Integer num20 = bannerInitCustomization.l;
        if (num20 == null) {
            num20 = jw1Var.B;
        }
        return new jw1(lw1Var, nw1Var2, str2, i2, mkVar, num4, num5, num6, num7, purposeListStyle, str3, num8, bool, bool3, num10, num12, num14, bool5, bool7, num16, str5, str7, str9, str11, bool9, num18, num19, num20);
    }

    public static AdError r(Context context, String str) {
        if (!(context instanceof Activity)) {
            return new AdError(102, "IronSource requires an Activity context to load ads.", IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN);
        }
        if (TextUtils.isEmpty(str)) {
            return new AdError(101, "Missing or invalid instance ID.", IronSourceMediationAdapter.ADAPTER_ERROR_DOMAIN);
        }
        return null;
    }

    public final int j() {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    public final int k() {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    public final int l(View view) {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    public static final k1 m(Object[] objArr) {
        objArr.getClass();
        return new k1(objArr);
    }

    public static int o(double d2) {
        if (!Double.isNaN(d2)) {
            if (d2 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
        d.r("Cannot round NaN value.");
        return 0;
    }

    public static int p(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        d.r("Cannot round NaN value.");
        return 0;
    }

    public static long q(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        d.r("Cannot round NaN value.");
        return 0L;
    }

    public static long s(double d2) {
        zzgvz.b("not a normal value", v(d2));
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        if (exponent == -1023) {
            return jDoubleToRawLongBits + jDoubleToRawLongBits;
        }
        return jDoubleToRawLongBits | 4503599627370496L;
    }

    public static Status t(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        if (listAsList.size() > 1) {
            return u((String) listAsList.get(0), (String) listAsList.get(1));
        }
        return u((String) listAsList.get(0), null);
    }

    public static Status u(String str, String str2) {
        int i;
        str.getClass();
        switch (str) {
            case "USER_CANCELLED":
                i = 18001;
                break;
            case "INVALID_RECIPIENT_EMAIL":
                i = 17033;
                break;
            case "WEB_CONTEXT_ALREADY_PRESENTED":
                i = 17057;
                break;
            case "INTERNAL_SUCCESS_SIGN_OUT":
                i = 17091;
                break;
            case "INVALID_IDP_RESPONSE":
            case "INVALID_LOGIN_CREDENTIALS":
            case "INVALID_PENDING_TOKEN":
                i = 17004;
                break;
            case "DYNAMIC_LINK_NOT_ACTIVATED":
                i = 17068;
                break;
            case "QUOTA_EXCEEDED":
                i = 17052;
                break;
            case "WEB_NETWORK_REQUEST_FAILED":
                i = 17061;
                break;
            case "INVALID_RECAPTCHA_VERSION":
                i = 17206;
                break;
            case "RECAPTCHA_NOT_ENABLED":
                i = 17200;
                break;
            case "EXPIRED_OOB_CODE":
                i = 17029;
                break;
            case "UNAUTHORIZED_DOMAIN":
                i = 17038;
                break;
            case "INVALID_OOB_CODE":
                i = 17030;
                break;
            case "MISSING_EMAIL":
                i = 17034;
                break;
            case "INVALID_CODE":
                i = 17044;
                break;
            case "INVALID_HOSTING_LINK_DOMAIN":
                i = 17214;
                break;
            case "TOKEN_EXPIRED":
                i = 17021;
                break;
            case "INVALID_TENANT_ID":
                i = 17079;
                break;
            case "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED":
                i = 18002;
                break;
            case "INVALID_SESSION_INFO":
                i = 17046;
                break;
            case "SECOND_FACTOR_EXISTS":
                i = 17087;
                break;
            case "INVALID_EMAIL":
            case "INVALID_IDENTIFIER":
                i = 17008;
                break;
            case "ADMIN_ONLY_OPERATION":
                i = 17085;
                break;
            case "MISSING_OR_INVALID_NONCE":
                i = 17094;
                break;
            case "INVALID_CERT_HASH":
                i = 17064;
                break;
            case "NO_SUCH_PROVIDER":
                i = 17016;
                break;
            case "MFA_ENROLLMENT_NOT_FOUND":
                i = 17084;
                break;
            case "MISSING_PASSWORD":
                i = 17035;
                break;
            case "CREDENTIAL_TOO_OLD_LOGIN_AGAIN":
                i = 17014;
                break;
            case "TIMEOUT":
            case "<<Network Error>>":
                i = 17020;
                break;
            case "INVALID_REQ_TYPE":
                i = 17207;
                break;
            case "INVALID_RECAPTCHA_ACTION":
                i = 17203;
                break;
            case "OPERATION_NOT_ALLOWED":
            case "PASSWORD_LOGIN_DISABLED":
                i = 17006;
                break;
            case "WEB_INTERNAL_ERROR":
                i = 17062;
                break;
            case "SECOND_FACTOR_LIMIT_EXCEEDED":
                i = 17088;
                break;
            case "MISSING_MFA_ENROLLMENT_ID":
                i = 17082;
                break;
            case "USER_NOT_FOUND":
            case "EMAIL_NOT_FOUND":
                i = 17011;
                break;
            case "CAPTCHA_CHECK_FAILED":
                i = 17056;
                break;
            case "WEAK_PASSWORD":
                i = 17026;
                break;
            case "UNSUPPORTED_FIRST_FACTOR":
                i = 17089;
                break;
            case "INVALID_SENDER":
                i = 17032;
                break;
            case "MISSING_PHONE_NUMBER":
                i = 17041;
                break;
            case "INVALID_DYNAMIC_LINK_DOMAIN":
                i = 17074;
                break;
            case "MISSING_MFA_PENDING_CREDENTIAL":
                i = 17081;
                break;
            case "UNSUPPORTED_PASSTHROUGH_OPERATION":
                i = 17095;
                break;
            case "EMAIL_EXISTS":
                i = 17007;
                break;
            case "INVALID_ID_TOKEN":
                i = 17017;
                break;
            case "WEB_STORAGE_UNSUPPORTED":
                i = 17065;
                break;
            case "MISSING_CLIENT_TYPE":
                i = 17204;
                break;
            case "MISSING_RECAPTCHA_VERSION":
                i = 17205;
                break;
            case "UNVERIFIED_EMAIL":
                i = 17086;
                break;
            case "REJECTED_CREDENTIAL":
                i = 17075;
                break;
            case "INVALID_MFA_PENDING_CREDENTIAL":
                i = 17083;
                break;
            case "INVALID_VERIFICATION_PROOF":
                i = 17049;
                break;
            case "INVALID_PROVIDER_ID":
                i = 17071;
                break;
            case "CREDENTIAL_MISMATCH":
                i = 17002;
                break;
            case "WEB_CONTEXT_CANCELED":
                i = 17058;
                break;
            case "REQUIRES_SECOND_FACTOR_AUTH":
                i = 17078;
                break;
            case "MISSING_CLIENT_IDENTIFIER":
                i = 17093;
                break;
            case "INVALID_MESSAGE_PAYLOAD":
                i = 17031;
                break;
            case "RESET_PASSWORD_EXCEED_LIMIT":
            case "TOO_MANY_ATTEMPTS_TRY_LATER":
                i = 17010;
                break;
            case "INVALID_CUSTOM_TOKEN":
                i = 17000;
                break;
            case "INVALID_PASSWORD":
                i = 17009;
                break;
            case "INVALID_RECAPTCHA_TOKEN":
                i = 17202;
                break;
            case "SESSION_EXPIRED":
                i = 17051;
                break;
            case "MISSING_CODE":
                i = 17043;
                break;
            case "FEDERATED_USER_ID_ALREADY_LINKED":
                i = 17025;
                break;
            case "MISSING_RECAPTCHA_TOKEN":
                i = 17201;
                break;
            case "USER_DISABLED":
                i = 17005;
                break;
            case "INVALID_PHONE_NUMBER":
                i = 17042;
                break;
            case "INVALID_APP_CREDENTIAL":
                i = 17028;
                break;
            case "MISSING_CONTINUE_URI":
                i = 17040;
                break;
            case "MISSING_SESSION_INFO":
                i = 17045;
                break;
            case "EMAIL_CHANGE_NEEDS_VERIFICATION":
                i = 17090;
                break;
            case "UNSUPPORTED_TENANT_OPERATION":
                i = 17073;
                break;
            default:
                i = 17499;
                break;
        }
        if (i == 17499) {
            if (str2 != null) {
                return new Status(i, h50.i(str, ":", str2));
            }
            return new Status(i, str);
        }
        return new Status(i, str2);
    }

    public static boolean v(double d2) {
        if (Math.getExponent(d2) <= 1023) {
            return true;
        }
        return false;
    }
}
