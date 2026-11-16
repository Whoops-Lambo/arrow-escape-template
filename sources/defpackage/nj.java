package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.media3.common.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.adapters.ByteDanceMediationAdapter;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventTypes;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class nj {
    public static /* synthetic */ String D(int i) {
        if (i == 1) {
            return "USER_DATA";
        }
        if (i == 2) {
            return "APP_DATA";
        }
        if (i != 3) {
            return i != 4 ? "null" : "CUSTOM_EVENTS";
        }
        return "CUSTOM_DATA";
    }

    public static /* synthetic */ boolean c(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ boolean d(int i) {
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw null;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static void A(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static String i(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String j(int i, String str) {
        return i + str;
    }

    public static String k(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String p(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    public static StringBuilder s(String str, int i, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static void t(int i, SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
        spannableStringBuilder.setSpan(new StyleSpan(i), i2, i3, i4);
    }

    public static void v(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void x(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, i3);
    }

    public static void B(StringBuilder sb, String str, ByteDanceMediationAdapter byteDanceMediationAdapter) {
        sb.append(str);
        byteDanceMediationAdapter.log(sb.toString());
    }

    public static void C(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "value";
            case 2:
                return "event_time";
            case 3:
                return "event_name";
            case 4:
                return "content_ids";
            case 5:
                return TTContentsEventConstants.Params.EVENT_PROPERTY_CONTENTS;
            case 6:
                return TTContentsEventConstants.Params.EVENT_PROPERTY_CONTENT_TYPE;
            case 7:
                return TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION;
            case 8:
                return AppLovinEventTypes.USER_COMPLETED_LEVEL;
            case 9:
                return "max_rating_value";
            case 10:
                return "num_items";
            case 11:
                return "payment_info_available";
            case 12:
                return "registration_method";
            case 13:
                return "search_string";
            case 14:
                return "success";
            case 15:
                return TTContentsEventConstants.Params.EVENT_PROPERTY_ORDER_ID;
            case 16:
                return "ad_type";
            case 17:
                return "currency";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "anon_id";
            case 2:
                return "fb_login_id";
            case 3:
                return "madid";
            case 4:
                return "page_id";
            case 5:
                return "page_scoped_user_id";
            case 6:
                return "ud";
            case 7:
                return "advertiser_tracking_enabled";
            case 8:
                return "application_tracking_enabled";
            case 9:
                return "consider_views";
            case 10:
                return "device_token";
            case 11:
                return "extInfo";
            case 12:
                return "include_dwell_data";
            case 13:
                return "include_video_data";
            case 14:
                return "install_referrer";
            case 15:
                return "installer_package";
            case 16:
                return AppLovinEventParameters.IN_APP_PURCHASE_DATA;
            case 17:
                return "url_schemes";
            case 18:
                return "add_to_messaging_customer_base_for_whatsapp";
            default:
                throw null;
        }
    }

    public static int e(int i, int i2, int i3) {
        return i3 - (Integer.numberOfLeadingZeros(i) * i2);
    }

    public static int g(int i, int i2, long j) {
        return i2 - (Long.numberOfLeadingZeros(j) * i);
    }

    public static Object h(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String l(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String m(int i, StringBuilder sb) {
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    public static String n(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String o(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String r(Throwable th, StringBuilder sb) {
        sb.append(th.getMessage());
        return sb.toString();
    }

    public static void u(int i, ComposableLambdaImpl composableLambdaImpl, SkippableUpdater skippableUpdater, ComposerImpl composerImpl, int i2) {
        composableLambdaImpl.invoke(skippableUpdater, composerImpl, Integer.valueOf(i));
        composerImpl.B(i2);
    }

    public static void w(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void y(Applier applier, SlotWriter slotWriter, RememberManager rememberManager) {
        applier.getClass();
        slotWriter.getClass();
        rememberManager.getClass();
    }

    public static void z(ComposerImpl composerImpl, boolean z, boolean z2, boolean z3, boolean z4) {
        composerImpl.R(z);
        composerImpl.R(z2);
        composerImpl.R(z3);
        composerImpl.R(z4);
    }
}
