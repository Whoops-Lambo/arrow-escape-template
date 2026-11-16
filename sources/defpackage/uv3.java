package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import com.ecffri.arrows.R;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.play.core.hsdp.service.HsdpLoadingPanelContainer;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import com.safedk.android.utils.Logger;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class uv3 implements nx0 {
    public final Context a;
    public final zzg b;
    public final zzg c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final wx2 g;
    public aq3 h;

    public uv3(Context context, zzg zzgVar, zzg zzgVar2, boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (z3 && (context instanceof Activity)) {
            z4 = true;
        }
        wx2 wx2Var = context instanceof Activity ? new wx2((Activity) context) : null;
        this.h = null;
        this.a = context;
        this.b = zzgVar;
        this.c = zzgVar2;
        this.d = z;
        this.e = z2;
        this.f = z4;
        this.g = wx2Var;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public final void a(String str) {
        fq3 fq3Var = (fq3) ((w65) this.c.zza());
        if (((vw3) fq3Var.c.get(str)) == null) {
            Log.w("HsdpClientImpl", "No active overlay for target package: " + str + ". Please call show() first.");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("callingPackage", fq3Var.a.getPackageName());
            bundle.putString("targetPackage", str);
            bundle.putString("sdkVersion", "2.0.0");
            bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
            fq3Var.b.a(new fj4(16, fq3Var, bundle));
        }
        c();
    }

    public final void b(String str, String str2, lx0 lx0Var, Map map, boolean z) throws PackageManager.NameNotFoundException {
        Context context = this.a;
        Intent intentL = l7.L(str, str2, context.getPackageName(), map);
        if (!this.e) {
            Activity activity = (Activity) context;
            if (this.g == null) {
                e32.i("hsdpLoadingPanel cannot be null when using activity-based HSDP.");
                return;
            }
            intentL.addFlags(536870912);
            intentL.addFlags(Constants.REFERRER_LINK_MAX_RESPONSE_CHARS);
            ResolveInfo resolveInfoResolveActivity = activity.getPackageManager().resolveActivity(intentL, 65536);
            zzg zzgVar = this.b;
            if (resolveInfoResolveActivity != null) {
                d();
                Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity found.");
                safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intentL, 0);
                lx0Var.onDeepLinkStarted();
                e(str, lx0Var, map, (nb4) zzgVar.zza(), activity);
                return;
            }
            if (!this.d) {
                safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, l7.J(str, str2, map), 0);
                return;
            } else {
                Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity not found. Ignoring error and still showing HPOA affordance.");
                e(str, lx0Var, map, (nb4) zzgVar.zza(), activity);
                return;
            }
        }
        Uri data = intentL.getData();
        if (data == null) {
            Bundle bundle = new Bundle();
            bundle.putString("errorMessage", "Deeplink URL is null.");
            lx0Var.onError(bundle);
            return;
        }
        String string = data.toString();
        if (context instanceof Activity) {
            Activity activity2 = (Activity) context;
            zzg zzgVar2 = this.c;
            tr4 tr4Var = (tr4) ((fq3) ((w65) zzgVar2.zza())).b.k;
            if (tr4Var == null || !tr4Var.asBinder().isBinderAlive()) {
                d();
            }
            ((fq3) ((w65) zzgVar2.zza())).a(str, string, activity2.getWindow().getDecorView().getWindowToken(), os2.H(activity2, activity2.getResources().getConfiguration().screenWidthDp), os2.I(activity2), z, !this.f ? new zs3(this, lx0Var, activity2, str, str2, map) : new ev3(this, lx0Var, activity2, str, str2, map));
            return;
        }
        Intent intent = new Intent(context, (Class<?>) HsdpShimActivity.class);
        intent.putExtra("target_package_name", str);
        intent.putExtra("referrer", str2);
        intent.putExtra("auto_trigger", z);
        intent.putExtra("deeplink_url", string);
        if (map != null) {
            Bundle bundle2 = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle2.putString((String) entry.getKey(), (String) entry.getValue());
            }
            intent.putExtra("extra_query_params_bundle", bundle2);
        }
        intent.addFlags(Constants.REFERRER_LINK_MAX_RESPONSE_CHARS);
        intent.addFlags(268435456);
        Log.i("HsdpDeepLinkServiceImpl", "Starting HSDP Shim Activity.");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    public final void c() {
        if (this.f) {
            Activity activity = (Activity) this.a;
            wx2 wx2Var = this.g;
            if (wx2Var == null) {
                e32.i("hsdpLoadingPanel cannot be null when loading panel is enabled.");
                return;
            }
            wx2Var.f();
            if (this.h != null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this.h);
                this.h = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    public final void d() throws PackageManager.NameNotFoundException {
        Resources resourcesForApplication;
        int i;
        Drawable drawable;
        boolean z;
        int i2;
        if (this.f) {
            Activity activity = (Activity) this.a;
            wx2 wx2Var = this.g;
            if (wx2Var == null) {
                e32.i("hsdpLoadingPanel cannot be null when enabling loading panel.");
                return;
            }
            if (((View) wx2Var.d) == null) {
                if (this.h != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this.h);
                }
                this.h = new aq3(this, activity);
                activity.getApplication().registerActivityLifecycleCallbacks(this.h);
                Activity activity2 = (Activity) wx2Var.b;
                Log.i("HsdpLoadingPanel", "try to showLoading");
                if (((View) wx2Var.d) != null) {
                    return;
                }
                Log.i("HsdpLoadingPanel", "showLoading");
                View viewInflate = LayoutInflater.from(activity2).inflate(R.layout.sdk_loading_panel, (ViewGroup) null);
                if (viewInflate == null) {
                    Log.e("HsdpLoadingPanel", "Failed to inflate loading panel layout.");
                    return;
                }
                wx2Var.d = viewInflate;
                ((HsdpLoadingPanelContainer) viewInflate).setOnConfigurationChangedListener(new l24(wx2Var, 17));
                View viewFindViewById = viewInflate.findViewById(R.id.hsdp_service_prism_with_loading_indicator);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
                try {
                    resourcesForApplication = activity2.getPackageManager().getResourcesForApplication("com.android.vending");
                } catch (Exception e) {
                    Log.e("HsdpLoadingPanel", "Error getting resources for com.android.vending", e);
                    resourcesForApplication = null;
                }
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.play_prism);
                if (imageView != null) {
                    if (resourcesForApplication != null) {
                        try {
                            int identifier = resourcesForApplication.getIdentifier("product_logo_play_prism_color_24", "drawable", "com.android.vending");
                            if (identifier != 0) {
                                imageView.setImageDrawable(resourcesForApplication.getDrawable(identifier, activity2.getTheme()));
                                Log.i("HsdpLoadingPanel", "Successfully loaded Play Prism icon as drawable from com.android.vending.");
                            } else {
                                try {
                                    imageView.setImageResource(R.drawable.logo_play_prism_24dp);
                                    Log.i("HsdpLoadingPanel", "Successfully loaded Play Prism icon from local resources.");
                                } catch (RuntimeException e2) {
                                    Log.e("HsdpLoadingPanel", "Error loading Play Prism icon from local resources.", e2);
                                    Log.e("HsdpLoadingPanel", "Failed to load Play Prism icon.");
                                    wx2Var.d = null;
                                    return;
                                }
                            }
                        } catch (RuntimeException e3) {
                            Log.e("HsdpLoadingPanel", "Error loading Play Prism icon from com.android.vending.", e3);
                        }
                    } else {
                        imageView.setImageResource(R.drawable.logo_play_prism_24dp);
                        Log.i("HsdpLoadingPanel", "Successfully loaded Play Prism icon from local resources.");
                    }
                }
                ImageButton imageButton = (ImageButton) viewInflate.findViewById(R.id.sdk_dismiss_button);
                if (imageButton != null) {
                    int color = activity2.getColor(wx2Var.k() ? R.color.dismiss_icon_grey_500 : R.color.dismiss_icon_grey_700);
                    if (resourcesForApplication != null) {
                        try {
                            int identifier2 = resourcesForApplication.getIdentifier(wx2Var.k() ? "grey_500" : "grey_700", "color", "com.android.vending");
                            if (identifier2 != 0) {
                                color = resourcesForApplication.getColor(identifier2, activity2.getTheme());
                            } else {
                                Log.w("HsdpLoadingPanel", "Could not load grey_500/grey_700 color from com.android.vending, falling back to local resources.");
                            }
                            int identifier3 = resourcesForApplication.getIdentifier("gs_close_rond100_vd_theme_24", "drawable", "com.android.vending");
                            if (identifier3 != 0) {
                                drawable = resourcesForApplication.getDrawable(identifier3, activity2.getTheme());
                                z = true;
                                i2 = color;
                            } else {
                                Log.w("HsdpLoadingPanel", "Drawable resource 'gs_close_rond100_vd_theme_24' not found in com.android.vending");
                                z = false;
                                i2 = color;
                                drawable = null;
                            }
                        } catch (RuntimeException e4) {
                            Log.e("HsdpLoadingPanel", "Error loading dismiss icon from com.android.vending.", e4);
                        }
                    } else {
                        z = false;
                        i2 = color;
                        drawable = null;
                    }
                    if (drawable == null) {
                        drawable = AppCompatResources.a(activity2, android.R.drawable.ic_menu_close_clear_cancel);
                        z = false;
                    }
                    if (drawable == null) {
                        Log.e("HsdpLoadingPanel", "Failed to load dismiss button.");
                        wx2Var.d = null;
                        return;
                    } else {
                        drawable.setTint(i2);
                        imageButton.setImageDrawable(drawable);
                        imageButton.setOnClickListener(new hi1(wx2Var));
                        Log.i("HsdpLoadingPanel", "Successfully loaded and tinted dismiss icon from ".concat(true != z ? "local resources." : "com.android.vending."));
                    }
                }
                FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.content_frame);
                if (frameLayout == null) {
                    Log.e("HsdpLoadingPanel", "content_frame not found in the layout.");
                    i = 0;
                } else {
                    GradientDrawable gradientDrawableB = q63.b(0);
                    i = 0;
                    gradientDrawableB.setCornerRadii(new float[]{os2.H(activity2, 28), os2.H(activity2, 28), os2.H(activity2, 28), os2.H(activity2, 28), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT});
                    gradientDrawableB.setColor(activity2.getColor(wx2Var.k() ? R.color.background_dark : R.color.background_light));
                    frameLayout.setBackground(gradientDrawableB);
                    frameLayout.setClipToOutline(true);
                }
                View viewFindViewById2 = viewInflate.findViewById(R.id.placeholder_loading);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setVisibility(i);
                }
                try {
                    int I = os2.I(activity2);
                    int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(R.dimen.sdk_hsdp_loading_ui_height);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2, 40, -3);
                    layoutParams.height = Math.min(activity2.getResources().getDimensionPixelSize(R.dimen.sdk_hsdp_loading_ui_height), (int) (os2.I(activity2) * 0.6f));
                    if (activity2.getResources().getConfiguration().screenWidthDp > 640) {
                        layoutParams.width = os2.H(activity2, 640);
                    }
                    layoutParams.gravity = 81;
                    Log.i("HsdpLoadingPanel", "screenHeight: " + I + ", loadingUiHeight: " + dimensionPixelSize + ", wmParams.y: " + layoutParams.y);
                    ((WindowManager) wx2Var.c).addView(viewInflate, layoutParams);
                    Log.i("HsdpLoadingPanel", "Successfully added view to WindowManager. loadingView size: " + viewInflate.getWidth() + "x" + viewInflate.getHeight());
                    FrameLayout frameLayout2 = (FrameLayout) viewInflate.findViewById(R.id.content_frame);
                    if (frameLayout2 != null) {
                        Log.i("HsdpLoadingPanel", "contentFrame size: " + frameLayout2.getWidth() + "x" + frameLayout2.getHeight());
                    }
                } catch (RuntimeException e5) {
                    Log.e("HsdpLoadingPanel", "Error adding view to WindowManager", e5);
                    wx2Var.d = null;
                }
            }
        }
    }

    public static void e(String str, lx0 lx0Var, Map map, nb4 nb4Var, Activity activity) {
        int iH = os2.H(activity, activity.getResources().getConfiguration().screenWidthDp);
        int I = os2.I(activity);
        l55 l55Var = (l55) nb4Var;
        Activity activity2 = l55Var.b;
        String packageName = activity2.getPackageName();
        IBinder windowToken = activity2.getWindow().getDecorView().getWindowToken();
        if (windowToken != null) {
            s05 s05Var = new s05(l55Var, str, packageName, windowToken, iH, I, lx0Var, map);
            gz3 gz3Var = l55Var.a;
            if (gz3Var == null) {
                Log.e("HpoaClientImpl", "HPOA service is not available");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("appId", str);
            bundle.putString("callerId", packageName);
            bundle.putBinder("windowToken", windowToken);
            gz3Var.a(new kw0(l55Var, bundle, s05Var, false, 19));
            return;
        }
        e32.i("Window token is null, cannot open HPOA service.");
    }
}
