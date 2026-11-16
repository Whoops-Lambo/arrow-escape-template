package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import defpackage.n30;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class M5 {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.i);
        p0.startActivity(p1);
    }

    public static int b(Context context, String str, Ji ji, String str2, Y9 y9) {
        try {
            return Y3.a(context, str, ji, str2);
        } catch (ActivityNotFoundException unused) {
            return a(context, str, null, ji, str2, y9);
        } catch (NullPointerException unused2) {
            return a(context, str, null, ji, str2, y9);
        } catch (SecurityException unused3) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "SecurityException");
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "uriSyntaxException");
            }
            return 5;
        } catch (Exception e) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }

    public static int a(Context context, String str, Ji ji, String str2, Y9 y9) {
        context.getClass();
        str.getClass();
        ji.getClass();
        str2.getClass();
        if (y9 != null) {
            ((Z9) y9).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (str.length() == 0) {
            if (y9 != null) {
                ((Z9) y9).c("DeeplinkHandler", "AppLink url is Empty or null");
                return 2;
            }
            return 2;
        }
        try {
            List listA = Y3.a(context, str);
            if (!listA.isEmpty()) {
                if (y9 != null) {
                    ((Z9) y9).c("DeeplinkHandler", n30.y("Resolve Info ", ((ResolveInfo) listA.get(0)).activityInfo.name));
                }
                return a(context, str, (ResolveInfo) listA.get(0), ji, str2, y9);
            }
            if (y9 != null) {
                ((Z9) y9).c("DeeplinkHandler", " Resolve Info Empty");
            }
            return b(context, str, ji, str2, y9);
        } catch (URISyntaxException unused) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "URISyntaxException for url: ".concat(str));
                return 5;
            }
            return 5;
        }
    }

    public static boolean a(String str, Context context, Ji ji, Y9 y9) {
        str.getClass();
        context.getClass();
        ji.getClass();
        Y5.a.getClass();
        if (!Y5.t() || !ji.a() || !((TelemetryConfig) AbstractC4563z4.a.a(TelemetryConfig.class)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            uri.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setFlags(268436992);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            if (y9 == null) {
                return true;
            }
            ((Z9) y9).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, Ji ji, String str2, Y9 y9) {
        try {
            return Y3.a(context, str, resolveInfo, ji, str2);
        } catch (ActivityNotFoundException unused) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", n30.y("ActivityNotFoundException for url: ", str));
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", n30.y("NullPointerException for url: ", str));
            }
            return 13;
        } catch (SecurityException unused3) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", n30.y("SecurityException for url: ", str));
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", n30.y("URISyntaxException for url: ", str));
            }
            return 5;
        } catch (Exception e) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }
}
