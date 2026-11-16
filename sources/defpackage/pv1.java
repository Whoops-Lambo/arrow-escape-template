package defpackage;

import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ViewConfiguration;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C4664b4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class pv1 {
    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "LOWER_IS_BETTER";
        }
        if (i == 2) {
            return "HIGHER_IS_BETTER";
        }
        throw null;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    public static int v(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "PHOTO";
        }
        if (i == 2) {
            return "VIDEO";
        }
        throw null;
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "NUMERIC";
        }
        if (i == 2) {
            return "TIME";
        }
        throw null;
    }

    public static String k(int i, String str) {
        return str + i;
    }

    public static String m(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String o(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void u(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static String w(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "openPlayStore";
            case 2:
                return "openAppStore";
            case 3:
                return "markGameLoaded";
            case 4:
                return "getPlayerData";
            case 5:
                return "setPlayerData";
            case 6:
                return "getCatalog";
            case 7:
                return "getPurchases";
            case 8:
                return "purchase";
            case 9:
                return "consumePurchase";
            case 10:
                return "onReady";
            case 11:
                return "getSubscribableCatalog";
            case 12:
                return "purchaseSubscription";
            case 13:
                return "getSubscriptions";
            case 14:
                return "cancelSubscription";
            case 15:
                return "loadInterstitialAd";
            case 16:
                return "loadRewardedVideo";
            case 17:
                return "showInterstitialAd";
            case 18:
                return C4664b4.h.i;
            case 19:
                return "getAccessToken";
            case 20:
                return "getContextToken";
            case 21:
                return "getPayload";
            case 22:
                return "isEnvReady";
            case 23:
                return AppLovinEventTypes.USER_SHARED_LINK;
            case 24:
                return "canCreateShortcut";
            case 25:
                return "createShortcut";
            case 26:
                return "openGamingServicesDeepLink";
            case 27:
                return "openGameRequestsDialog";
            case 28:
                return "postSessionScore";
            case 29:
                return "postSessionScoreAsync";
            case 30:
                return "getTournamentAsync";
            case 31:
                return "tournamentCreateAsync";
            case 32:
                return "tournamentShareAsync";
            case 33:
                return "tournamentPostScoreAsync";
            case 34:
                return "getTournaments";
            case 35:
                return "joinTournament";
            case 36:
                return "openExternalLink";
            case 37:
                return "performHapticFeedbackAsync";
            case 38:
                return "contextSwitch";
            case 39:
                return "contextChoose";
            case 40:
                return "contextCreate";
            case 41:
                return "contextGetID";
            case 42:
                return "debugPrint";
            case 43:
                return "getCountryISO";
            default:
                throw null;
        }
    }

    public static int d(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int e(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int f(int i, ArrayList arrayList, int i2, int i3) {
        arrayList.add(Integer.valueOf(i));
        return i2 + i3;
    }

    public static int g(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static SkippableUpdater h(Composer composer, ViewConfiguration viewConfiguration, zr0 zr0Var, Composer composer2) {
        Updater.a(zr0Var, composer, viewConfiguration);
        composer.o();
        return new SkippableUpdater(composer2);
    }

    public static Object i(int i, List list) {
        return list.get(list.size() - i);
    }

    public static String j(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }

    public static String l(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String q(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static void s(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void t(int i, ComposableLambdaImpl composableLambdaImpl, SkippableUpdater skippableUpdater, Composer composer, int i2) {
        composableLambdaImpl.invoke(skippableUpdater, composer, Integer.valueOf(i));
        composer.B(i2);
    }
}
