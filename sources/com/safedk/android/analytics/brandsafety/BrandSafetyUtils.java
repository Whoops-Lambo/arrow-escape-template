package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.C4664b4;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.singular.sdk.internal.UserDetailsUtils;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class BrandSafetyUtils {
    private static final int A = 26;
    private static final float B = 0.2f;
    private static final float C = 0.2f;
    private static final float D = 0.2f;
    private static final float E = 0.2f;
    private static int L = 0;
    private static int M = 0;
    public static final String a = ".jpg";
    static final String b = ".txt";
    static final String c = "unknown";
    static final String d = "com.appsaholic";
    static final int e = 1000;
    static final int f = 500;
    public static final int g = 86400000;
    public static final int h = 20000;
    public static final int i = 5000;
    public static final String j = "INTER";
    public static final String k = "REWARDED";
    public static final String l = "APPOPEN";
    public static final String m = "BANNER";
    public static final String n = "LEADER";
    public static final String o = "MREC";
    public static final String p = "NATIVE";
    private static final String q = "BrandSafetyUtils";
    private static final Set<String> s;
    private static final Set<String> t;
    private static final int v = 100;
    private static final int w = 0;
    private static final int x = 8947848;
    private static final int y = 4473924;
    private static final int z = 10;
    private static final List<Integer> u = new LinkedList();
    private static n F = null;
    private static RedirectDetails G = null;
    private static final ExecutorService H = Executors.newSingleThreadExecutor();
    private static Map<String, z> I = new ConcurrentHashMap();
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> J = new LimitedConcurrentHashMap<>();
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> K = new LimitedConcurrentHashMap<>();
    private static final String INTERSTITIAL_ACTIVITIES = "Y29tLnVuaXR5M2QuYWRzLmFuZHJvaWQudmlldy5Vbml0eUFkc0Z1bGxzY3JlZW5BY3Rpdml0eXxjb20udW5pdHkzZC5hZHMuYWR1bml0LkFkVW5pdEFjdGl2aXR5fGNvbS51bml0eTNkLmFkcy5hZHVuaXQuQWRVbml0U29mdHdhcmVBY3Rpdml0eXxjb20udW5pdHkzZC5zZXJ2aWNlcy5hZHMuYWR1bml0LkFkVW5pdEFjdGl2aXR5fGNvbS51bml0eTNkLnNlcnZpY2VzLmFkcy5hZHVuaXQuQWRVbml0U29mdHdhcmVBY3Rpdml0eXxjb20udW5pdHkzZC5hZHMuYWRwbGF5ZXIuRnVsbFNjcmVlbldlYlZpZXdEaXNwbGF5fGNvbS5nb29nbGUuYW5kcm9pZC5nbXMuYWRzLkFkQWN0aXZpdHl8Y29tLmdvb2dsZS5hZHMuQWRBY3Rpdml0eXxjb20udnVuZ2xlLnB1Ymxpc2hlci5GdWxsU2NyZWVuQWRBY3Rpdml0eXxjb20udnVuZ2xlLnB1Ymxpc2hlci5NcmFpZEZ1bGxTY3JlZW5BZEFjdGl2aXR5fGNvbS52dW5nbGUucHVibGlzaGVyLlZpZGVvRnVsbFNjcmVlbkFkQWN0aXZpdHl8Y29tLnZ1bmdsZS5wdWJsaXNoZXIuRmxleFZpZXdBZEFjdGl2aXR5fGNvbS52dW5nbGUud2FycmVuLnVpLlZ1bmdsZUFjdGl2aXR5fGNvbS52dW5nbGUud2FycmVuLnVpLlZ1bmdsZUZsZXhWaWV3QWN0aXZpdHl8Y29tLnZ1bmdsZS5hZHMuaW50ZXJuYWwudWkuVnVuZ2xlQWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5hcHBsb3Zpbi5hZHZpZXcuQXBwTG92aW5GdWxsc2NyZWVuQWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkZ1bGxzY3JlZW5UaGVtZWRBY3Rpdml0eXxjb20uYXBwbG92aW4uaW1wbC5hZHZpZXcuQXBwTG92aW5PcmllbnRhdGlvbkF3YXJlSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLnN1cGVyc29uaWNhZHMuc2RrLmNvbnRyb2xsZXIuQ29udHJvbGxlckFjdGl2aXR5fGNvbS5zdXBlcnNvbmljYWRzLnNkay5jb250cm9sbGVyLkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5pcm9uc291cmNlLnNkay5jb250cm9sbGVyLkNvbnRyb2xsZXJBY3Rpdml0eXxjb20uaXJvbnNvdXJjZS5zZGsuY29udHJvbGxlci5JbnRlcnN0aXRpYWxBY3Rpdml0eXxjb20ubWludGVncmFsLm1zZGsuaW50ZXJzdGl0aWFsLnZpZXcuTVRHSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLm1pbnRlZ3JhbC5tc2RrLnJld2FyZC5wbGF5ZXIuTVRHUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20ubWludGVncmFsLm1zZGsubmV3cmV3YXJkLnBsYXllci5NVEdSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5taW50ZWdyYWwubXNkay5pbnRlcmFjdGl2ZWFkcy5hY3Rpdml0eS5JbnRlcmFjdGl2ZVNob3dBY3Rpdml0eXxjb20ubWJyaWRnZS5tc2RrLmludGVyc3RpdGlhbC52aWV3Lk1CSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLm1icmlkZ2UubXNkay5yZXdhcmQucGxheWVyLk1CUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20ubWJyaWRnZS5tc2RrLm5ld3Jld2FyZC5wbGF5ZXIuTUJSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5tYnJpZGdlLm1zZGsuaW50ZXJhY3RpdmVhZHMuYWN0aXZpdHkuSW50ZXJhY3RpdmVTaG93QWN0aXZpdHl8Y29tLm1icmlkZ2UubXNkay5hY3Rpdml0eS5NQkNvbW1vbkFjdGl2aXR5fGNvbS5tYnJpZGdlLm1zZGsuY29uZmlnLmFjdGl2aXR5Lk1CUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20ubWJyaWRnZS5tc2RrLm91dC5Mb2FkaW5nQWN0aXZpdHl8Y29tLmZ5YmVyLmlubmVyYWN0aXZlLnNkay5hY3Rpdml0aWVzLklubmVyYWN0aXZlRnVsbHNjcmVlbkFkQWN0aXZpdHl8Y29tLmZpdmVfY29ycC5hZC5BZEFjdGl2aXR5fGNvbS5pbm1vYmkuYWRzLnJlbmRlcmluZy5Jbk1vYmlBZEFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEZ1bGxTY3JlZW5WaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEZ1bGxTY3JlZW5FeHByZXNzVmlkZW9BY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuVFRSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVFJld2FyZEV4cHJlc3NWaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEFwcE9wZW5BZEFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5BZEFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEFkQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUSW50ZXJzdGl0aWFsRXhwcmVzc0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5zaW5nbGUuVFRGdWxsU2NyZWVuVmlkZW9BY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuc2luZ2xlLlRURnVsbFNjcmVlbkV4cHJlc3NWaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5zaW5nbGUuVFRSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5zaW5nbGUuVFRSZXdhcmRFeHByZXNzVmlkZW9BY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuc2luZ2xlLlRUQXBwT3BlbkFkQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LnNpbmdsZS5UVEFwcE9wZW5BZFRyYW5zQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LnNpbmdsZS5UVEFkQWN0aXZpdHl8Y29tLnNtYWF0by5zZGsuaW50ZXJzdGl0aWFsLkludGVyc3RpdGlhbEFkQWN0aXZpdHl8Y29tLnNtYWF0by5zZGsuaW50ZXJzdGl0aWFsLnZpZXcuSW50ZXJzdGl0aWFsQWRBY3Rpdml0eXxjb20uc21hYXRvLnNkay5yZXdhcmRlZC53aWRnZXQuUmV3YXJkZWRJbnRlcnN0aXRpYWxBZEFjdGl2aXR5fGNvbS5zbWFhdG8uc2RrLnJld2FyZGVkLnZpZXcuUmV3YXJkZWRJbnRlcnN0aXRpYWxBZEFjdGl2aXR5fGNvbS52ZXJ2ZS5uZy5zZGsuaW50ZXJzdGl0aWFsLmFjdGl2aXR5Lk1yYWlkSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLnZlcnZlLm5nLnNkay5pbnRlcnN0aXRpYWwuYWN0aXZpdHkuVmFzdEludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS52ZXJ2ZS5uZy5zZGsucmV3YXJkZWQuYWN0aXZpdHkuTXJhaWRSZXdhcmRlZEFjdGl2aXR5fGNvbS52ZXJ2ZS5uZy5zZGsucmV3YXJkZWQuYWN0aXZpdHkuVmFzdFJld2FyZGVkQWN0aXZpdHl8Y29tLm1vbG9jby5zZGsueGVub3NzLnNka2RldmtpdC5hbmRyb2lkLmFkcmVuZGVyZXIuaW50ZXJuYWwubXJhaWQuTXJhaWRBY3Rpdml0eXxjb20ubW9sb2NvLnNkay54ZW5vc3Muc2RrZGV2a2l0LmFuZHJvaWQuYWRyZW5kZXJlci5pbnRlcm5hbC5zdGF0aWNyZW5kZXJlci5TdGF0aWNBZEFjdGl2aXR5fGNvbS5tb2xvY28uc2RrLnhlbm9zcy5zZGtkZXZraXQuYW5kcm9pZC5hZHJlbmRlcmVyLmludGVybmFsLnZhc3QuVmFzdEFjdGl2aXR5fGNvbS5tb2xvY28uc2RrLnhlbm9zcy5zZGtkZXZraXQuYW5kcm9pZC5hZHJlbmRlcmVyLmludGVybmFsLnRlbXBsYXRlcy5yZW5kZXJlci5mdWxsc2NyZWVuLkZ1bGxzY3JlZW5XZWJ2aWV3QWN0aXZpdHl8Y29tLmV4cGxvcmVzdGFjay5pYWIubXJhaWQuTXJhaWRBY3Rpdml0eXxjb20uZXhwbG9yZXN0YWNrLmlhYi52YXN0LmFjdGl2aXR5LlZhc3RBY3Rpdml0eXxpby5iaWRtYWNoaW5lLnJlbmRlcmluZy5hZC5mdWxsc2NyZWVuLkZ1bGxTY3JlZW5BY3Rpdml0eXxpby5iaWRtYWNoaW5lLmlhYi52YXN0LmFjdGl2aXR5LlZhc3RBY3Rpdml0eXxuZXQucHVibmF0aXZlLmxpdGUuc2RrLmludGVyc3RpdGlhbC5hY3Rpdml0eS5NcmFpZEludGVyc3RpdGlhbEFjdGl2aXR5fG5ldC5wdWJuYXRpdmUubGl0ZS5zZGsuaW50ZXJzdGl0aWFsLmFjdGl2aXR5LlZhc3RJbnRlcnN0aXRpYWxBY3Rpdml0eXxuZXQucHVibmF0aXZlLmxpdGUuc2RrLnJld2FyZGVkLmFjdGl2aXR5Lk1yYWlkUmV3YXJkZWRBY3Rpdml0eXxuZXQucHVibmF0aXZlLmxpdGUuc2RrLnJld2FyZGVkLmFjdGl2aXR5LlZhc3RSZXdhcmRlZEFjdGl2aXR5fGNvbS5tb2JpbGVmdXNlLnNkay5Nb2JpbGVGdXNlRnVsbHNjcmVlbkFjdGl2aXR5fGNvbS5jaGFydGJvb3N0LnNkay52aWV3LkNCSW1wcmVzc2lvbkFjdGl2aXR5fGNvbS5jaGFydGJvb3N0LnNkay52aWV3LkZ1bGxzY3JlZW5BZEFjdGl2aXR5fGNvbS5wdWJtYXRpYy5zZGsud2VicmVuZGVyaW5nLm1yYWlkLlBPQlZpZGVvUGxheWVyQWN0aXZpdHl8Y29tLnB1Ym1hdGljLnNkay53ZWJyZW5kZXJpbmcudWkuUE9CRnVsbFNjcmVlbkFjdGl2aXR5fGNvbS5hbWF6b24uYXBzLmFkcy5hY3Rpdml0eS5BcHNJbnRlcnN0aXRpYWxBY3Rpdml0eXxjb20ueWFuZGV4Lm1vYmlsZS5hZHMuY29tbW9uLkFkQWN0aXZpdHk=";
    private static final Set<String> r = new HashSet(Arrays.asList(new String(Base64.decode(INTERSTITIAL_ACTIVITIES, 0)).split("\\|")));

    public enum AdType {
        INTERSTITIAL,
        MREC,
        BANNER,
        NATIVE
    }

    public enum ScreenShotOrientation {
        NOT_INITIALIZED,
        PORTRAIT,
        LANDSCAPE
    }

    public enum ScreenshotValidity {
        VALID,
        UNIFORMITY_BLACK,
        UNIFORMITY_VERY_HIGH,
        UNIFORMITY_HIGH,
        UNIFORMITY_GRAY,
        NOT_SUITABLE_FOR_DASHBOARD
    }

    static {
        Logger.d(q, "BrandSafetyUtils initialized with ", r, ",  INTERSTITIAL_ACTIVITIES=", INTERSTITIAL_ACTIVITIES);
        s = new HashSet(Arrays.asList(new String(Base64.decode("Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LnNpbmdsZS5UVExhbmRpbmdQYWdlQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LnNpbmdsZS5UVFBsYXlhYmxlTGFuZGluZ1BhZ2VBY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuc2luZ2xlLlRUVmlkZW9MYW5kaW5nUGFnZUxpbmsyQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LnNpbmdsZS5UVENlaWxpbmdMYW5kaW5nUGFnZUFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5zaW5nbGUuVFREZWxlZ2F0ZUFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5zaW5nbGUuVFRXZWJzaXRlQWN0aXZpdHl8Y29tLmZ5YmVyLmlubmVyYWN0aXZlLnNkay5hY3Rpdml0aWVzLklubmVyYWN0aXZlSW50ZXJuYWxCcm93c2VyQWN0aXZpdHl8Y29tLmlyb25zb3VyY2Uuc2RrLmNvbnRyb2xsZXIuT3BlblVybEFjdGl2aXR5", 0)).split("\\|")));
        Logger.d(q, "BrandSafetyUtils initialized with ", s, ",  INTERNAL_BROWSER_ACTIVITIES=", INTERSTITIAL_ACTIVITIES);
        t = new HashSet();
        L = 0;
        M = 0;
    }

    public static void a(String str) {
        s.add(str);
    }

    public static BrandSafetyEvent.AdFormatType a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("ad_format");
            if ("BANNER".equals(string) || n.equals(string)) {
                return BrandSafetyEvent.AdFormatType.BANNER;
            }
            if (o.equals(string)) {
                return BrandSafetyEvent.AdFormatType.MREC;
            }
            if ("REWARDED".equals(string)) {
                return BrandSafetyEvent.AdFormatType.REWARD;
            }
            if (j.equals(string)) {
                return BrandSafetyEvent.AdFormatType.INTER;
            }
            if (l.equals(string)) {
                return BrandSafetyEvent.AdFormatType.APPOPEN;
            }
            if ("NATIVE".equals(string)) {
                return BrandSafetyEvent.AdFormatType.NATIVE;
            }
            return null;
        }
        return null;
    }

    public static BrandSafetyEvent.AdFormatType a(AdType adType) {
        if (adType != null) {
            switch (adType) {
                case INTERSTITIAL:
                    return BrandSafetyEvent.AdFormatType.INTER;
                case BANNER:
                    return BrandSafetyEvent.AdFormatType.BANNER;
                case MREC:
                    return BrandSafetyEvent.AdFormatType.MREC;
                case NATIVE:
                    return BrandSafetyEvent.AdFormatType.NATIVE;
                default:
                    return null;
            }
        }
        return null;
    }

    public static AdType b(String str) {
        if (str != null) {
            return a(BrandSafetyEvent.AdFormatType.valueOf(str));
        }
        return null;
    }

    public static AdType a(BrandSafetyEvent.AdFormatType adFormatType) {
        if (adFormatType != null) {
            switch (adFormatType) {
                case INTER:
                case REWARD:
                case APPOPEN:
                    return AdType.INTERSTITIAL;
                case BANNER:
                case LEADER:
                    return AdType.BANNER;
                case MREC:
                    return AdType.MREC;
                case NATIVE:
                    return AdType.NATIVE;
                default:
                    return null;
            }
        }
        return null;
    }

    static class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String name) {
            return name.endsWith(BrandSafetyUtils.a);
        }
    }

    static class b implements FilenameFilter {
        private String a;

        public b(String str) {
            this.a = null;
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String name) {
            return name.contains(this.a);
        }
    }

    public static void detectAdClick(Intent intent, String sdkPackageName) {
        a(intent, sdkPackageName, false);
    }

    public static void a(final Intent intent, final String str, final boolean z2) {
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p()) {
            return;
        }
        Logger.d(q, "detect ad click invoked, sdk=", str);
        if (com.safedk.android.utils.n.c()) {
            H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    BrandSafetyUtils.c(intent, str, z2);
                }
            });
        } else {
            c(intent, str, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:108:0x037a A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0399 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x03d3 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x03db A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:119:0x03f8 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x040d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0410  */
    /* JADX WARN: Code duplicated, block: B:124:0x041c  */
    /* JADX WARN: Code duplicated, block: B:125:0x041f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0436  */
    /* JADX WARN: Code duplicated, block: B:131:0x0499 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x04c7 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x04f8 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x04fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:149:0x04ff A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x050d A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0556  */
    /* JADX WARN: Code duplicated, block: B:158:0x0559  */
    /* JADX WARN: Code duplicated, block: B:160:0x056d A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x058b A[Catch: Throwable -> 0x0599, TRY_LEAVE, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:26:0x0102 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x010e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0111 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x011b  */
    /* JADX WARN: Code duplicated, block: B:32:0x011d A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0121  */
    /* JADX WARN: Code duplicated, block: B:35:0x0124 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0130  */
    /* JADX WARN: Code duplicated, block: B:39:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x0160 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x017a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x017b A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b0 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c0 A[Catch: Throwable -> 0x0599, TryCatch #1 {Throwable -> 0x0599, blocks: (B:3:0x0003, B:6:0x004f, B:8:0x005c, B:10:0x0090, B:13:0x00a3, B:14:0x00a7, B:16:0x00b1, B:23:0x00f1, B:36:0x0128, B:40:0x0134, B:42:0x0143, B:144:0x04d6, B:146:0x04f8, B:149:0x04ff, B:151:0x050d, B:153:0x053e, B:155:0x0543, B:159:0x055b, B:160:0x056d, B:161:0x058b, B:45:0x014b, B:47:0x0160, B:49:0x0166, B:51:0x0174, B:54:0x017b, B:57:0x0198, B:59:0x01b0, B:61:0x01b6, B:63:0x01c0, B:72:0x01de, B:74:0x0249, B:77:0x026c, B:81:0x0288, B:89:0x02d0, B:91:0x02db, B:95:0x02f2, B:97:0x0308, B:99:0x0346, B:102:0x034f, B:106:0x0367, B:94:0x02e4, B:82:0x0294, B:86:0x02b4, B:108:0x037a, B:110:0x0399, B:111:0x03cd, B:113:0x03d3, B:115:0x03db, B:119:0x03f8, B:123:0x0412, B:129:0x043b, B:131:0x0499, B:135:0x04a3, B:137:0x04a8, B:141:0x04b3, B:142:0x04c7, B:35:0x0124, B:32:0x011d, B:29:0x0111, B:26:0x0102, B:17:0x00c3, B:20:0x00e1), top: B:167:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01da A[ADDED_TO_REGION] */
    public static void c(Intent intent, String str, boolean z2) {
        String string;
        String str2;
        w wVarA;
        long jLongValue;
        long jLongValue2;
        String str3;
        String str4;
        String str5;
        long jElapsedRealtime;
        String str6;
        AdNetworkDiscovery adNetworkDiscoveryJ;
        Activity foregroundActivity;
        InterstitialFinder interstitialFinderZ;
        o oVarD;
        String str7;
        String str8;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        Iterator it;
        com.safedk.android.analytics.brandsafety.a aVar;
        long j8;
        Iterator it2;
        String str9;
        long j9;
        long j10;
        String str10;
        String str11;
        long j11;
        long j12;
        int i2;
        StatsCollector statsCollector;
        long j13;
        long j14;
        boolean z3;
        long j15;
        long j16;
        Activity foregroundActivity2;
        String str12;
        String string2;
        try {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            Logger.printFullVerboseLog(q, "detect ad click started, current timestamp (elapsed)=", Long.valueOf(jElapsedRealtime2), ", sdk=", mainSdkPackage, ", intent=", com.safedk.android.utils.n.a(intent), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (SafeDK.getInstance().s()) {
                Logger.d(q, "detect ad click - should monitor");
                if (intent != null) {
                    Intent intent2 = (Intent) intent.clone();
                    Logger.d(q, "detect ad click - intent cloned");
                    int iF = SafeDK.getInstance().f();
                    Logger.d(q, "detect ad click - redirect click timeout is ", Integer.valueOf(iF));
                    Uri data = intent2.getData();
                    String strA = a(mainSdkPackage, intent2);
                    if (strA != null) {
                        Logger.d(q, "detect ad click - uri extracted from intent extras");
                        data = Uri.parse(strA);
                    }
                    if (data != null) {
                        string = data.toString();
                        try {
                            if (com.safedk.android.utils.n.p(data.toString())) {
                                Logger.d(q, "detect ad click - Uri is a store url: ", data);
                                string2 = data.toString();
                            } else {
                                URL url = new URL(data.toString());
                                Logger.d(q, "detect ad click - Uri is a standard url: ", url);
                                string2 = url.toString();
                            }
                            str2 = string2;
                        } catch (MalformedURLException e2) {
                            Logger.d(q, "detect ad click - Uri is not a valid url: ", data);
                            str2 = null;
                        }
                        String strB = b(mainSdkPackage, intent2);
                        wVarA = DetectTouchUtils.a(mainSdkPackage);
                        if (wVarA == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = wVarA.a.longValue();
                        }
                        if (wVarA == null) {
                            jLongValue2 = wVarA.b.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        if (wVarA == null) {
                            str3 = wVarA.c;
                        } else {
                            str3 = null;
                        }
                        if (wVarA == null) {
                            str4 = wVarA.d;
                        } else {
                            str4 = null;
                        }
                        str5 = str3;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (z2) {
                            str6 = RedirectEvent.j;
                        } else {
                            str6 = null;
                        }
                        a(mainSdkPackage, string, strB, str6);
                        if ((!"android.intent.action.VIEW".equals(intent2.getAction()) || intent2.getAction() == null) && str2 != null) {
                            Logger.d(q, "detect ad click - has URL, intentUrl: ", str2);
                            adNetworkDiscoveryJ = CreativeInfoManager.j(mainSdkPackage);
                            if (adNetworkDiscoveryJ == null && adNetworkDiscoveryJ.k(str2)) {
                                Logger.d(q, "detect ad click - url should be ignored (by discovery class), skipping");
                                return;
                            }
                            if (a(intent)) {
                                return;
                            }
                            Logger.d(q, "detect ad click - not handled (yet)");
                            foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                            StatsCollector statsCollectorC = StatsCollector.c();
                            if (foregroundActivity != null && statsCollectorC != null) {
                                Logger.d(q, "detect ad click - has foreground");
                                interstitialFinderZ = SafeDK.getInstance().z();
                                if (interstitialFinderZ != null) {
                                    oVarD = interstitialFinderZ.d(foregroundActivity);
                                } else {
                                    oVarD = null;
                                }
                                if (SafeDK.getInstance().A() != null) {
                                    str7 = str5;
                                    boolean z4 = SafeDK.getInstance().A().m(str7);
                                    if (interstitialFinderZ == null && oVarD != null && !z4) {
                                        Logger.d(q, "detect ad click - has interstitial");
                                        boolean zD = oVarD.d();
                                        Logger.d(q, "detect ad click - clicked ", Boolean.valueOf(zD));
                                        String str13 = str7;
                                        long j17 = jLongValue2;
                                        Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(jLongValue), " last touch event(current time millis): ", Long.valueOf(j17), ", activityAddress=", a(foregroundActivity.getClass().getName(), true));
                                        long j18 = jElapsedRealtime - jLongValue;
                                        if (j18 < 20000) {
                                            j12 = j18;
                                            statsCollector = statsCollectorC;
                                            j11 = jElapsedRealtime;
                                            j13 = jLongValue;
                                            i2 = iF;
                                            if (interstitialFinderZ.a(str2, mainSdkPackage, str13, true, str4)) {
                                                if (str13 != null) {
                                                    m.a[] aVarArr = new m.a[2];
                                                    aVarArr[0] = new m.a("url", str2);
                                                    j14 = j17;
                                                    aVarArr[1] = new m.a(m.J, z2 ? RedirectEvent.j : "intent");
                                                    com.safedk.android.analytics.brandsafety.b.a(str13, m.n, aVarArr);
                                                } else {
                                                    j14 = j17;
                                                    o oVarD2 = interstitialFinderZ.d(foregroundActivity);
                                                    m.a[] aVarArr2 = new m.a[2];
                                                    aVarArr2[0] = new m.a("url", str2);
                                                    aVarArr2[1] = new m.a(m.J, z2 ? RedirectEvent.j : "intent");
                                                    oVarD2.a(m.n, aVarArr2);
                                                }
                                            } else {
                                                j14 = j17;
                                            }
                                        } else {
                                            j11 = jElapsedRealtime;
                                            j12 = j18;
                                            i2 = iF;
                                            statsCollector = statsCollectorC;
                                            j13 = jLongValue;
                                            j14 = j17;
                                        }
                                        String strA2 = u.a(mainSdkPackage, j13);
                                        if (!SafeDK.b() || !statsCollector.a(mainSdkPackage, strA2)) {
                                            Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        Logger.d(q, "detect ad click - should handle click ", Boolean.valueOf(z3));
                                        if (z3) {
                                            long j19 = j12;
                                            Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j11), ", activity last touched: ", Long.valueOf(j13), ", diff: ", Long.valueOf(j19), ", isClicked: ", Boolean.valueOf(zD));
                                            if ((j13 == 0 || j19 > i2) && !zD) {
                                                Logger.d(q, "detect ad click - redirect");
                                                a(mainSdkPackage, jElapsedRealtime2, j14, r(mainSdkPackage) ? RedirectEvent.k : "external", str2, foregroundActivity.getClass().getName());
                                            }
                                        }
                                    } else {
                                        str8 = str7;
                                        long j20 = jLongValue;
                                        j2 = jLongValue2;
                                        Logger.d(q, "detect ad click - no interstitial");
                                        j3 = jElapsedRealtime - j20;
                                        if (j3 < 20000) {
                                            j7 = jElapsedRealtime;
                                            Logger.d(q, "detect ad click - updating click URL. address : ", str8);
                                            it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C()).iterator();
                                            while (it.hasNext()) {
                                                aVar = (com.safedk.android.analytics.brandsafety.a) it.next();
                                                if (aVar != null) {
                                                    j10 = j7;
                                                    it2 = it;
                                                    str10 = str8;
                                                    j8 = j3;
                                                    j9 = j2;
                                                    if (aVar.a(str2, mainSdkPackage, str8, true, (String) null)) {
                                                        str9 = str10;
                                                        if (str9 != null) {
                                                            m.a[] aVarArr3 = new m.a[2];
                                                            aVarArr3[0] = new m.a("url", str2);
                                                            if (z2) {
                                                                str11 = RedirectEvent.j;
                                                            } else {
                                                                str11 = "intent";
                                                            }
                                                            aVarArr3[1] = new m.a(m.J, str11);
                                                            com.safedk.android.analytics.brandsafety.b.a(str9, m.n, aVarArr3);
                                                        }
                                                    } else {
                                                        str9 = str10;
                                                    }
                                                } else {
                                                    j8 = j3;
                                                    it2 = it;
                                                    str9 = str8;
                                                    j9 = j2;
                                                    j10 = j7;
                                                }
                                                j2 = j9;
                                                str8 = str9;
                                                it = it2;
                                                j7 = j10;
                                                j3 = j8;
                                            }
                                            j4 = j3;
                                            j6 = j2;
                                            j5 = j7;
                                        } else {
                                            j4 = j3;
                                            j5 = jElapsedRealtime;
                                            j6 = j2;
                                        }
                                        String strA3 = u.a(mainSdkPackage, j20);
                                        Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(j20), ", last touch event(current time millis): ", Long.valueOf(j6), ", redirectInfoKey: ", strA3);
                                        long j21 = j4;
                                        Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j5), ", last touch event(elapsed): ", Long.valueOf(j20), ", diff: ", Long.valueOf(j21));
                                        if (!SafeDK.b() && !statsCollectorC.a(mainSdkPackage, strA3) && (j20 == 0 || j21 > iF)) {
                                            a(mainSdkPackage, jElapsedRealtime2, j6, r(mainSdkPackage) ? RedirectEvent.k : "external", str2, foregroundActivity.getClass().getName());
                                        } else {
                                            Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                        }
                                    }
                                } else {
                                    str7 = str5;
                                }
                                if (interstitialFinderZ == null) {
                                    str8 = str7;
                                    long j22 = jLongValue;
                                    j2 = jLongValue2;
                                    Logger.d(q, "detect ad click - no interstitial");
                                    j3 = jElapsedRealtime - j22;
                                    if (j3 < 20000) {
                                        j7 = jElapsedRealtime;
                                        Logger.d(q, "detect ad click - updating click URL. address : ", str8);
                                        it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C()).iterator();
                                        while (it.hasNext()) {
                                            aVar = (com.safedk.android.analytics.brandsafety.a) it.next();
                                            if (aVar != null) {
                                                j10 = j7;
                                                it2 = it;
                                                str10 = str8;
                                                j8 = j3;
                                                j9 = j2;
                                                if (aVar.a(str2, mainSdkPackage, str8, true, (String) null)) {
                                                    str9 = str10;
                                                    if (str9 != null) {
                                                        m.a[] aVarArr4 = new m.a[2];
                                                        aVarArr4[0] = new m.a("url", str2);
                                                        if (z2) {
                                                            str11 = RedirectEvent.j;
                                                        } else {
                                                            str11 = "intent";
                                                        }
                                                        aVarArr4[1] = new m.a(m.J, str11);
                                                        com.safedk.android.analytics.brandsafety.b.a(str9, m.n, aVarArr4);
                                                    }
                                                } else {
                                                    str9 = str10;
                                                }
                                            } else {
                                                j8 = j3;
                                                it2 = it;
                                                str9 = str8;
                                                j9 = j2;
                                                j10 = j7;
                                            }
                                            j2 = j9;
                                            str8 = str9;
                                            it = it2;
                                            j7 = j10;
                                            j3 = j8;
                                        }
                                        j4 = j3;
                                        j6 = j2;
                                        j5 = j7;
                                    } else {
                                        j4 = j3;
                                        j5 = jElapsedRealtime;
                                        j6 = j2;
                                    }
                                    String strA4 = u.a(mainSdkPackage, j22);
                                    Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(j22), ", last touch event(current time millis): ", Long.valueOf(j6), ", redirectInfoKey: ", strA4);
                                    long j23 = j4;
                                    Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j5), ", last touch event(elapsed): ", Long.valueOf(j22), ", diff: ", Long.valueOf(j23));
                                    if (!SafeDK.b()) {
                                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    } else {
                                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    }
                                } else {
                                    str8 = str7;
                                    long j24 = jLongValue;
                                    j2 = jLongValue2;
                                    Logger.d(q, "detect ad click - no interstitial");
                                    j3 = jElapsedRealtime - j24;
                                    if (j3 < 20000) {
                                        j7 = jElapsedRealtime;
                                        Logger.d(q, "detect ad click - updating click URL. address : ", str8);
                                        it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C()).iterator();
                                        while (it.hasNext()) {
                                            aVar = (com.safedk.android.analytics.brandsafety.a) it.next();
                                            if (aVar != null) {
                                                j10 = j7;
                                                it2 = it;
                                                str10 = str8;
                                                j8 = j3;
                                                j9 = j2;
                                                if (aVar.a(str2, mainSdkPackage, str8, true, (String) null)) {
                                                    str9 = str10;
                                                    if (str9 != null) {
                                                        m.a[] aVarArr5 = new m.a[2];
                                                        aVarArr5[0] = new m.a("url", str2);
                                                        if (z2) {
                                                            str11 = RedirectEvent.j;
                                                        } else {
                                                            str11 = "intent";
                                                        }
                                                        aVarArr5[1] = new m.a(m.J, str11);
                                                        com.safedk.android.analytics.brandsafety.b.a(str9, m.n, aVarArr5);
                                                    }
                                                } else {
                                                    str9 = str10;
                                                }
                                            } else {
                                                j8 = j3;
                                                it2 = it;
                                                str9 = str8;
                                                j9 = j2;
                                                j10 = j7;
                                            }
                                            j2 = j9;
                                            str8 = str9;
                                            it = it2;
                                            j7 = j10;
                                            j3 = j8;
                                        }
                                        j4 = j3;
                                        j6 = j2;
                                        j5 = j7;
                                    } else {
                                        j4 = j3;
                                        j5 = jElapsedRealtime;
                                        j6 = j2;
                                    }
                                    String strA5 = u.a(mainSdkPackage, j24);
                                    Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(j24), ", last touch event(current time millis): ", Long.valueOf(j6), ", redirectInfoKey: ", strA5);
                                    long j25 = j4;
                                    Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j5), ", last touch event(elapsed): ", Long.valueOf(j24), ", diff: ", Long.valueOf(j25));
                                    if (!SafeDK.b()) {
                                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    } else {
                                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    }
                                }
                            }
                            return;
                        }
                        j15 = jLongValue2;
                        j16 = jLongValue;
                        Logger.d(q, "detect ad click - Intent doesn't have url");
                        foregroundActivity2 = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                        if (foregroundActivity2 != null) {
                            if (a(intent)) {
                                return;
                            }
                            if (h(foregroundActivity2.getClass().getName())) {
                                long j26 = jElapsedRealtime - j16;
                                Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(jElapsedRealtime), ", webview last touched: ", Long.valueOf(j16), ", diff: ", Long.valueOf(j26));
                                if (j16 != 0 || j26 > iF) {
                                    Logger.d(q, "detect ad click - Redirecting through ad");
                                    if (r(mainSdkPackage)) {
                                        str12 = RedirectEvent.k;
                                    } else {
                                        str12 = RedirectEvent.i;
                                    }
                                    a(mainSdkPackage, jElapsedRealtime2, j15, str12, str2, foregroundActivity2.getClass().getName());
                                    return;
                                }
                                return;
                            }
                            Logger.d(q, "detect ad click - activity ", foregroundActivity2.getClass().getName(), " is not in the redirect tracked activities, ignoring");
                            return;
                        }
                        Logger.d(q, "detect ad click - current foreground activity is null");
                    }
                    string = null;
                    str2 = null;
                    String strB2 = b(mainSdkPackage, intent2);
                    wVarA = DetectTouchUtils.a(mainSdkPackage);
                    if (wVarA == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = wVarA.a.longValue();
                    }
                    if (wVarA == null) {
                        jLongValue2 = wVarA.b.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    if (wVarA == null) {
                        str3 = wVarA.c;
                    } else {
                        str3 = null;
                    }
                    if (wVarA == null) {
                        str4 = wVarA.d;
                    } else {
                        str4 = null;
                    }
                    str5 = str3;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (z2) {
                        str6 = RedirectEvent.j;
                    } else {
                        str6 = null;
                    }
                    a(mainSdkPackage, string, strB2, str6);
                    if (!"android.intent.action.VIEW".equals(intent2.getAction())) {
                        Logger.d(q, "detect ad click - has URL, intentUrl: ", str2);
                        adNetworkDiscoveryJ = CreativeInfoManager.j(mainSdkPackage);
                        if (adNetworkDiscoveryJ == null) {
                        }
                        if (a(intent)) {
                            return;
                        }
                        Logger.d(q, "detect ad click - not handled (yet)");
                        foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                        StatsCollector statsCollectorC2 = StatsCollector.c();
                        if (foregroundActivity != null) {
                            Logger.d(q, "detect ad click - has foreground");
                            interstitialFinderZ = SafeDK.getInstance().z();
                            if (interstitialFinderZ != null) {
                                oVarD = interstitialFinderZ.d(foregroundActivity);
                            } else {
                                oVarD = null;
                            }
                            if (SafeDK.getInstance().A() != null) {
                                str7 = str5;
                                if (SafeDK.getInstance().A().m(str7)) {
                                }
                                if (interstitialFinderZ == null) {
                                    str8 = str7;
                                    long j27 = jLongValue;
                                    j2 = jLongValue2;
                                    Logger.d(q, "detect ad click - no interstitial");
                                    j3 = jElapsedRealtime - j27;
                                    if (j3 < 20000) {
                                        j7 = jElapsedRealtime;
                                        Logger.d(q, "detect ad click - updating click URL. address : ", str8);
                                        it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C()).iterator();
                                        while (it.hasNext()) {
                                            aVar = (com.safedk.android.analytics.brandsafety.a) it.next();
                                            if (aVar != null) {
                                                j10 = j7;
                                                it2 = it;
                                                str10 = str8;
                                                j8 = j3;
                                                j9 = j2;
                                                if (aVar.a(str2, mainSdkPackage, str8, true, (String) null)) {
                                                    str9 = str10;
                                                    if (str9 != null) {
                                                        m.a[] aVarArr6 = new m.a[2];
                                                        aVarArr6[0] = new m.a("url", str2);
                                                        if (z2) {
                                                            str11 = RedirectEvent.j;
                                                        } else {
                                                            str11 = "intent";
                                                        }
                                                        aVarArr6[1] = new m.a(m.J, str11);
                                                        com.safedk.android.analytics.brandsafety.b.a(str9, m.n, aVarArr6);
                                                    }
                                                } else {
                                                    str9 = str10;
                                                }
                                            } else {
                                                j8 = j3;
                                                it2 = it;
                                                str9 = str8;
                                                j9 = j2;
                                                j10 = j7;
                                            }
                                            j2 = j9;
                                            str8 = str9;
                                            it = it2;
                                            j7 = j10;
                                            j3 = j8;
                                        }
                                        j4 = j3;
                                        j6 = j2;
                                        j5 = j7;
                                    } else {
                                        j4 = j3;
                                        j5 = jElapsedRealtime;
                                        j6 = j2;
                                    }
                                    String strA6 = u.a(mainSdkPackage, j27);
                                    Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(j27), ", last touch event(current time millis): ", Long.valueOf(j6), ", redirectInfoKey: ", strA6);
                                    long j28 = j4;
                                    Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j5), ", last touch event(elapsed): ", Long.valueOf(j27), ", diff: ", Long.valueOf(j28));
                                    if (!SafeDK.b()) {
                                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    } else {
                                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    }
                                } else {
                                    str8 = str7;
                                    long j29 = jLongValue;
                                    j2 = jLongValue2;
                                    Logger.d(q, "detect ad click - no interstitial");
                                    j3 = jElapsedRealtime - j29;
                                    if (j3 < 20000) {
                                        j7 = jElapsedRealtime;
                                        Logger.d(q, "detect ad click - updating click URL. address : ", str8);
                                        it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C()).iterator();
                                        while (it.hasNext()) {
                                            aVar = (com.safedk.android.analytics.brandsafety.a) it.next();
                                            if (aVar != null) {
                                                j10 = j7;
                                                it2 = it;
                                                str10 = str8;
                                                j8 = j3;
                                                j9 = j2;
                                                if (aVar.a(str2, mainSdkPackage, str8, true, (String) null)) {
                                                    str9 = str10;
                                                    if (str9 != null) {
                                                        m.a[] aVarArr7 = new m.a[2];
                                                        aVarArr7[0] = new m.a("url", str2);
                                                        if (z2) {
                                                            str11 = RedirectEvent.j;
                                                        } else {
                                                            str11 = "intent";
                                                        }
                                                        aVarArr7[1] = new m.a(m.J, str11);
                                                        com.safedk.android.analytics.brandsafety.b.a(str9, m.n, aVarArr7);
                                                    }
                                                } else {
                                                    str9 = str10;
                                                }
                                            } else {
                                                j8 = j3;
                                                it2 = it;
                                                str9 = str8;
                                                j9 = j2;
                                                j10 = j7;
                                            }
                                            j2 = j9;
                                            str8 = str9;
                                            it = it2;
                                            j7 = j10;
                                            j3 = j8;
                                        }
                                        j4 = j3;
                                        j6 = j2;
                                        j5 = j7;
                                    } else {
                                        j4 = j3;
                                        j5 = jElapsedRealtime;
                                        j6 = j2;
                                    }
                                    String strA7 = u.a(mainSdkPackage, j29);
                                    Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(j29), ", last touch event(current time millis): ", Long.valueOf(j6), ", redirectInfoKey: ", strA7);
                                    long j210 = j4;
                                    Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j5), ", last touch event(elapsed): ", Long.valueOf(j29), ", diff: ", Long.valueOf(j210));
                                    if (!SafeDK.b()) {
                                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    } else {
                                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    }
                                }
                            } else {
                                str7 = str5;
                            }
                            if (interstitialFinderZ == null) {
                                str8 = str7;
                                long j211 = jLongValue;
                                j2 = jLongValue2;
                                Logger.d(q, "detect ad click - no interstitial");
                                j3 = jElapsedRealtime - j211;
                                if (j3 < 20000) {
                                    j7 = jElapsedRealtime;
                                    Logger.d(q, "detect ad click - updating click URL. address : ", str8);
                                    it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C()).iterator();
                                    while (it.hasNext()) {
                                        aVar = (com.safedk.android.analytics.brandsafety.a) it.next();
                                        if (aVar != null) {
                                            j10 = j7;
                                            it2 = it;
                                            str10 = str8;
                                            j8 = j3;
                                            j9 = j2;
                                            if (aVar.a(str2, mainSdkPackage, str8, true, (String) null)) {
                                                str9 = str10;
                                                if (str9 != null) {
                                                    m.a[] aVarArr8 = new m.a[2];
                                                    aVarArr8[0] = new m.a("url", str2);
                                                    if (z2) {
                                                        str11 = RedirectEvent.j;
                                                    } else {
                                                        str11 = "intent";
                                                    }
                                                    aVarArr8[1] = new m.a(m.J, str11);
                                                    com.safedk.android.analytics.brandsafety.b.a(str9, m.n, aVarArr8);
                                                }
                                            } else {
                                                str9 = str10;
                                            }
                                        } else {
                                            j8 = j3;
                                            it2 = it;
                                            str9 = str8;
                                            j9 = j2;
                                            j10 = j7;
                                        }
                                        j2 = j9;
                                        str8 = str9;
                                        it = it2;
                                        j7 = j10;
                                        j3 = j8;
                                    }
                                    j4 = j3;
                                    j6 = j2;
                                    j5 = j7;
                                } else {
                                    j4 = j3;
                                    j5 = jElapsedRealtime;
                                    j6 = j2;
                                }
                                String strA8 = u.a(mainSdkPackage, j211);
                                Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(j211), ", last touch event(current time millis): ", Long.valueOf(j6), ", redirectInfoKey: ", strA8);
                                long j212 = j4;
                                Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j5), ", last touch event(elapsed): ", Long.valueOf(j211), ", diff: ", Long.valueOf(j212));
                                if (!SafeDK.b()) {
                                    Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                } else {
                                    Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                }
                            } else {
                                str8 = str7;
                                long j213 = jLongValue;
                                j2 = jLongValue2;
                                Logger.d(q, "detect ad click - no interstitial");
                                j3 = jElapsedRealtime - j213;
                                if (j3 < 20000) {
                                    j7 = jElapsedRealtime;
                                    Logger.d(q, "detect ad click - updating click URL. address : ", str8);
                                    it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C()).iterator();
                                    while (it.hasNext()) {
                                        aVar = (com.safedk.android.analytics.brandsafety.a) it.next();
                                        if (aVar != null) {
                                            j10 = j7;
                                            it2 = it;
                                            str10 = str8;
                                            j8 = j3;
                                            j9 = j2;
                                            if (aVar.a(str2, mainSdkPackage, str8, true, (String) null)) {
                                                str9 = str10;
                                                if (str9 != null) {
                                                    m.a[] aVarArr9 = new m.a[2];
                                                    aVarArr9[0] = new m.a("url", str2);
                                                    if (z2) {
                                                        str11 = RedirectEvent.j;
                                                    } else {
                                                        str11 = "intent";
                                                    }
                                                    aVarArr9[1] = new m.a(m.J, str11);
                                                    com.safedk.android.analytics.brandsafety.b.a(str9, m.n, aVarArr9);
                                                }
                                            } else {
                                                str9 = str10;
                                            }
                                        } else {
                                            j8 = j3;
                                            it2 = it;
                                            str9 = str8;
                                            j9 = j2;
                                            j10 = j7;
                                        }
                                        j2 = j9;
                                        str8 = str9;
                                        it = it2;
                                        j7 = j10;
                                        j3 = j8;
                                    }
                                    j4 = j3;
                                    j6 = j2;
                                    j5 = j7;
                                } else {
                                    j4 = j3;
                                    j5 = jElapsedRealtime;
                                    j6 = j2;
                                }
                                String strA9 = u.a(mainSdkPackage, j213);
                                Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(j213), ", last touch event(current time millis): ", Long.valueOf(j6), ", redirectInfoKey: ", strA9);
                                long j214 = j4;
                                Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j5), ", last touch event(elapsed): ", Long.valueOf(j213), ", diff: ", Long.valueOf(j214));
                                if (!SafeDK.b()) {
                                    Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                } else {
                                    Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                }
                            }
                        }
                        return;
                    }
                    Logger.d(q, "detect ad click - has URL, intentUrl: ", str2);
                    adNetworkDiscoveryJ = CreativeInfoManager.j(mainSdkPackage);
                    if (adNetworkDiscoveryJ == null) {
                    }
                    if (a(intent)) {
                        return;
                    }
                    Logger.d(q, "detect ad click - not handled (yet)");
                    foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                    StatsCollector statsCollectorC3 = StatsCollector.c();
                    if (foregroundActivity != null) {
                        Logger.d(q, "detect ad click - has foreground");
                        interstitialFinderZ = SafeDK.getInstance().z();
                        if (interstitialFinderZ != null) {
                            oVarD = interstitialFinderZ.d(foregroundActivity);
                        } else {
                            oVarD = null;
                        }
                        if (SafeDK.getInstance().A() != null) {
                            str7 = str5;
                            if (SafeDK.getInstance().A().m(str7)) {
                            }
                            if (interstitialFinderZ == null) {
                                str8 = str7;
                                long j215 = jLongValue;
                                j2 = jLongValue2;
                                Logger.d(q, "detect ad click - no interstitial");
                                j3 = jElapsedRealtime - j215;
                                if (j3 < 20000) {
                                    j7 = jElapsedRealtime;
                                    Logger.d(q, "detect ad click - updating click URL. address : ", str8);
                                    it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C()).iterator();
                                    while (it.hasNext()) {
                                        aVar = (com.safedk.android.analytics.brandsafety.a) it.next();
                                        if (aVar != null) {
                                            j10 = j7;
                                            it2 = it;
                                            str10 = str8;
                                            j8 = j3;
                                            j9 = j2;
                                            if (aVar.a(str2, mainSdkPackage, str8, true, (String) null)) {
                                                str9 = str10;
                                                if (str9 != null) {
                                                    m.a[] aVarArr10 = new m.a[2];
                                                    aVarArr10[0] = new m.a("url", str2);
                                                    if (z2) {
                                                        str11 = RedirectEvent.j;
                                                    } else {
                                                        str11 = "intent";
                                                    }
                                                    aVarArr10[1] = new m.a(m.J, str11);
                                                    com.safedk.android.analytics.brandsafety.b.a(str9, m.n, aVarArr10);
                                                }
                                            } else {
                                                str9 = str10;
                                            }
                                        } else {
                                            j8 = j3;
                                            it2 = it;
                                            str9 = str8;
                                            j9 = j2;
                                            j10 = j7;
                                        }
                                        j2 = j9;
                                        str8 = str9;
                                        it = it2;
                                        j7 = j10;
                                        j3 = j8;
                                    }
                                    j4 = j3;
                                    j6 = j2;
                                    j5 = j7;
                                } else {
                                    j4 = j3;
                                    j5 = jElapsedRealtime;
                                    j6 = j2;
                                }
                                String strA10 = u.a(mainSdkPackage, j215);
                                Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(j215), ", last touch event(current time millis): ", Long.valueOf(j6), ", redirectInfoKey: ", strA10);
                                long j216 = j4;
                                Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j5), ", last touch event(elapsed): ", Long.valueOf(j215), ", diff: ", Long.valueOf(j216));
                                if (!SafeDK.b()) {
                                    Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                } else {
                                    Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                }
                            } else {
                                str8 = str7;
                                long j217 = jLongValue;
                                j2 = jLongValue2;
                                Logger.d(q, "detect ad click - no interstitial");
                                j3 = jElapsedRealtime - j217;
                                if (j3 < 20000) {
                                    j7 = jElapsedRealtime;
                                    Logger.d(q, "detect ad click - updating click URL. address : ", str8);
                                    it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C()).iterator();
                                    while (it.hasNext()) {
                                        aVar = (com.safedk.android.analytics.brandsafety.a) it.next();
                                        if (aVar != null) {
                                            j10 = j7;
                                            it2 = it;
                                            str10 = str8;
                                            j8 = j3;
                                            j9 = j2;
                                            if (aVar.a(str2, mainSdkPackage, str8, true, (String) null)) {
                                                str9 = str10;
                                                if (str9 != null) {
                                                    m.a[] aVarArr11 = new m.a[2];
                                                    aVarArr11[0] = new m.a("url", str2);
                                                    if (z2) {
                                                        str11 = RedirectEvent.j;
                                                    } else {
                                                        str11 = "intent";
                                                    }
                                                    aVarArr11[1] = new m.a(m.J, str11);
                                                    com.safedk.android.analytics.brandsafety.b.a(str9, m.n, aVarArr11);
                                                }
                                            } else {
                                                str9 = str10;
                                            }
                                        } else {
                                            j8 = j3;
                                            it2 = it;
                                            str9 = str8;
                                            j9 = j2;
                                            j10 = j7;
                                        }
                                        j2 = j9;
                                        str8 = str9;
                                        it = it2;
                                        j7 = j10;
                                        j3 = j8;
                                    }
                                    j4 = j3;
                                    j6 = j2;
                                    j5 = j7;
                                } else {
                                    j4 = j3;
                                    j5 = jElapsedRealtime;
                                    j6 = j2;
                                }
                                String strA11 = u.a(mainSdkPackage, j217);
                                Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(j217), ", last touch event(current time millis): ", Long.valueOf(j6), ", redirectInfoKey: ", strA11);
                                long j218 = j4;
                                Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j5), ", last touch event(elapsed): ", Long.valueOf(j217), ", diff: ", Long.valueOf(j218));
                                if (!SafeDK.b()) {
                                    Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                } else {
                                    Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                }
                            }
                        } else {
                            str7 = str5;
                        }
                        if (interstitialFinderZ == null) {
                            str8 = str7;
                            long j219 = jLongValue;
                            j2 = jLongValue2;
                            Logger.d(q, "detect ad click - no interstitial");
                            j3 = jElapsedRealtime - j219;
                            if (j3 < 20000) {
                                j7 = jElapsedRealtime;
                                Logger.d(q, "detect ad click - updating click URL. address : ", str8);
                                it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C()).iterator();
                                while (it.hasNext()) {
                                    aVar = (com.safedk.android.analytics.brandsafety.a) it.next();
                                    if (aVar != null) {
                                        j10 = j7;
                                        it2 = it;
                                        str10 = str8;
                                        j8 = j3;
                                        j9 = j2;
                                        if (aVar.a(str2, mainSdkPackage, str8, true, (String) null)) {
                                            str9 = str10;
                                            if (str9 != null) {
                                                m.a[] aVarArr12 = new m.a[2];
                                                aVarArr12[0] = new m.a("url", str2);
                                                if (z2) {
                                                    str11 = RedirectEvent.j;
                                                } else {
                                                    str11 = "intent";
                                                }
                                                aVarArr12[1] = new m.a(m.J, str11);
                                                com.safedk.android.analytics.brandsafety.b.a(str9, m.n, aVarArr12);
                                            }
                                        } else {
                                            str9 = str10;
                                        }
                                    } else {
                                        j8 = j3;
                                        it2 = it;
                                        str9 = str8;
                                        j9 = j2;
                                        j10 = j7;
                                    }
                                    j2 = j9;
                                    str8 = str9;
                                    it = it2;
                                    j7 = j10;
                                    j3 = j8;
                                }
                                j4 = j3;
                                j6 = j2;
                                j5 = j7;
                            } else {
                                j4 = j3;
                                j5 = jElapsedRealtime;
                                j6 = j2;
                            }
                            String strA12 = u.a(mainSdkPackage, j219);
                            Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(j219), ", last touch event(current time millis): ", Long.valueOf(j6), ", redirectInfoKey: ", strA12);
                            long j2110 = j4;
                            Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j5), ", last touch event(elapsed): ", Long.valueOf(j219), ", diff: ", Long.valueOf(j2110));
                            if (!SafeDK.b()) {
                                Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                            } else {
                                Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                            }
                        } else {
                            str8 = str7;
                            long j2111 = jLongValue;
                            j2 = jLongValue2;
                            Logger.d(q, "detect ad click - no interstitial");
                            j3 = jElapsedRealtime - j2111;
                            if (j3 < 20000) {
                                j7 = jElapsedRealtime;
                                Logger.d(q, "detect ad click - updating click URL. address : ", str8);
                                it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C()).iterator();
                                while (it.hasNext()) {
                                    aVar = (com.safedk.android.analytics.brandsafety.a) it.next();
                                    if (aVar != null) {
                                        j10 = j7;
                                        it2 = it;
                                        str10 = str8;
                                        j8 = j3;
                                        j9 = j2;
                                        if (aVar.a(str2, mainSdkPackage, str8, true, (String) null)) {
                                            str9 = str10;
                                            if (str9 != null) {
                                                m.a[] aVarArr13 = new m.a[2];
                                                aVarArr13[0] = new m.a("url", str2);
                                                if (z2) {
                                                    str11 = RedirectEvent.j;
                                                } else {
                                                    str11 = "intent";
                                                }
                                                aVarArr13[1] = new m.a(m.J, str11);
                                                com.safedk.android.analytics.brandsafety.b.a(str9, m.n, aVarArr13);
                                            }
                                        } else {
                                            str9 = str10;
                                        }
                                    } else {
                                        j8 = j3;
                                        it2 = it;
                                        str9 = str8;
                                        j9 = j2;
                                        j10 = j7;
                                    }
                                    j2 = j9;
                                    str8 = str9;
                                    it = it2;
                                    j7 = j10;
                                    j3 = j8;
                                }
                                j4 = j3;
                                j6 = j2;
                                j5 = j7;
                            } else {
                                j4 = j3;
                                j5 = jElapsedRealtime;
                                j6 = j2;
                            }
                            String strA13 = u.a(mainSdkPackage, j2111);
                            Logger.d(q, "detect ad click - last touch event(elapsed): ", Long.valueOf(j2111), ", last touch event(current time millis): ", Long.valueOf(j6), ", redirectInfoKey: ", strA13);
                            long j2112 = j4;
                            Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(j5), ", last touch event(elapsed): ", Long.valueOf(j2111), ", diff: ", Long.valueOf(j2112));
                            if (!SafeDK.b()) {
                                Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                            } else {
                                Logger.d(q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                            }
                        }
                    }
                    return;
                    j15 = jLongValue2;
                    j16 = jLongValue;
                    Logger.d(q, "detect ad click - Intent doesn't have url");
                    foregroundActivity2 = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                    if (foregroundActivity2 != null) {
                        if (a(intent)) {
                            return;
                        }
                        if (h(foregroundActivity2.getClass().getName())) {
                            long j220 = jElapsedRealtime - j16;
                            Logger.d(q, "detect ad click - current elapsed realtime: ", Long.valueOf(jElapsedRealtime), ", webview last touched: ", Long.valueOf(j16), ", diff: ", Long.valueOf(j220));
                            if (j16 != 0) {
                            }
                            Logger.d(q, "detect ad click - Redirecting through ad");
                            if (r(mainSdkPackage)) {
                                str12 = RedirectEvent.k;
                            } else {
                                str12 = RedirectEvent.i;
                            }
                            a(mainSdkPackage, jElapsedRealtime2, j15, str12, str2, foregroundActivity2.getClass().getName());
                            return;
                        }
                        Logger.d(q, "detect ad click - activity ", foregroundActivity2.getClass().getName(), " is not in the redirect tracked activities, ignoring");
                        return;
                    }
                    Logger.d(q, "detect ad click - current foreground activity is null");
                }
            }
        } catch (Throwable th) {
            Logger.d(q, "error in detect ad click", th);
            new CrashReporter().caughtException(th);
        }
    }

    private static String a(String str, Intent intent) {
        AdNetworkDiscovery adNetworkDiscoveryJ;
        Logger.d(q, "Attempting to extract url from intent extra, sdkPackageName is ", str, ", intent : ", com.safedk.android.utils.n.a(intent));
        String str2 = null;
        if (intent == null) {
            return null;
        }
        try {
            if (intent.getExtras() == null || (adNetworkDiscoveryJ = CreativeInfoManager.j(str)) == null) {
                return null;
            }
            for (String str3 : adNetworkDiscoveryJ.e()) {
                Logger.d(q, "looking for url in intent extra with name : ", str3);
                String string = intent.getExtras().getString(str3);
                if (string == null) {
                    str2 = string;
                } else {
                    try {
                        Logger.d(q, "found url in intent : ", string);
                        return string;
                    } catch (Throwable th) {
                        str2 = string;
                    }
                }
            }
            return str2;
        } catch (Throwable th2) {
        }
        Logger.e(q, "Exception when attempting to extract url from intent extra");
        return str2;
    }

    private static String b(String str, Intent intent) {
        AdNetworkDiscovery adNetworkDiscoveryJ;
        Logger.d(q, "Attempting to extract expanded ad webview address from intent extra, sdkPackageName is ", str, ", intent: ", com.safedk.android.utils.n.a(intent));
        if (intent != null) {
            try {
                if (intent.getExtras() != null && (adNetworkDiscoveryJ = CreativeInfoManager.j(str)) != null) {
                    return adNetworkDiscoveryJ.a(intent.getExtras());
                }
                return null;
            } catch (Throwable th) {
                Logger.e(q, "Exception when attempting to extract expanded ad webview address from intent extra");
                return null;
            }
        }
        return null;
    }

    public static void detectAdClick(final Uri uri, final String sdkPackageName) {
        if (com.safedk.android.utils.n.c()) {
            H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.5
                @Override // java.lang.Runnable
                public void run() {
                    BrandSafetyUtils.b(uri, sdkPackageName);
                }
            });
        } else {
            b(uri, sdkPackageName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Uri uri, String str) {
        long jLongValue;
        RedirectDetails redirectDetailsH;
        try {
            Logger.d(q, "detect ad click Uri invoked, sdk=", str, ", url = ", uri.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(uri);
            if (com.safedk.android.utils.h.i.equals(str) && SafeDK.S()) {
                w wVarA = DetectTouchUtils.a(str);
                if (wVarA != null) {
                    jLongValue = wVarA.a.longValue();
                } else {
                    jLongValue = 0;
                }
                if ((jLongValue == 0 || SystemClock.elapsedRealtime() - jLongValue > ((long) SafeDK.getInstance().f())) && ((redirectDetailsH = h()) == null || redirectDetailsH.g == null || !redirectDetailsH.g.equals(uri.toString()))) {
                    try {
                        throw new Exception("redirect potential source");
                    } catch (Exception e2) {
                        Logger.d(q, "detect ad click, redirect potential source", e2);
                    }
                }
            }
            a(intent, str, true);
        } catch (Throwable th) {
            Logger.e(q, "detect ad click exception", th);
        }
    }

    private static boolean a(Intent intent) {
        int iIdentityHashCode = System.identityHashCode(intent);
        if (u.contains(Integer.valueOf(iIdentityHashCode))) {
            Logger.d(q, "mark intent as handled found ", Integer.valueOf(iIdentityHashCode));
            return true;
        }
        if (u.size() >= 100) {
            Logger.d(q, "mark intent as handled > MAX events");
            u.remove(0);
        }
        Logger.d(q, "mark intent as handled add ", Integer.valueOf(iIdentityHashCode));
        u.add(Integer.valueOf(iIdentityHashCode));
        return false;
    }

    public static void a(String str, String str2, WebView webView) {
        InterstitialFinder interstitialFinderZ;
        try {
            Logger.d(q, "attach loaded url to detected click started, sdk=", str, ", url=", str2, ", webview=", webView.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            SafeDK safeDK = SafeDK.getInstance();
            if (SafeDK.ab() && safeDK != null && str2 != null) {
                if (!str2.equals(AndroidWebViewClient.BLANK_PAGE) && !str2.equals("About:blank")) {
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
                    if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.k(str2)) {
                        Logger.d(q, "url should be ignored (by discovery class), skipping");
                        return;
                    }
                    if ((str2.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v) || str2.startsWith("https://")) && (interstitialFinderZ = SafeDK.getInstance().z()) != null) {
                        interstitialFinderZ.a(str2, str, a((Object) webView));
                    }
                    if (SafeDK.b() && StatsCollector.c() != null) {
                        ConcurrentHashMap<String, StatsEvent> concurrentHashMapA = StatsCollector.c().a(StatsCollector.EventType.redirect);
                        Iterator<String> it = concurrentHashMapA.keySet().iterator();
                        while (it.hasNext()) {
                            RedirectEvent redirectEvent = (RedirectEvent) concurrentHashMapA.get(it.next());
                            if (redirectEvent.k().equals(str) && redirectEvent.f() == null) {
                                Logger.d(q, "Attaching url to url-less redirect event. event = ", redirectEvent.toString(), ", url = ", str2);
                                redirectEvent.a(str2);
                            }
                        }
                    } else {
                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null, skipping");
                    }
                    return;
                }
                Logger.d(q, "url is blank, skipping");
                return;
            }
            Logger.d(q, "attach loaded url to detected click loaded url is empty or app not initialized yet, skipping.");
        } catch (Throwable th) {
            Logger.e(q, "failed to attach url to detected click (internal browser)", th);
        }
    }

    static String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(byteArray, 0, byteArray.length);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e2) {
            Logger.e(q, "Failed to get hash value for bitmap", e2);
            return "";
        }
    }

    static String a(Bitmap bitmap, AdType adType, String str, String str2, String str3, ScreenShotOrientation screenShotOrientation) {
        return b(bitmap, a(adType, str, str2, str3, screenShotOrientation), 90);
    }

    public static String a(Bitmap bitmap, String str, int i2) {
        return b(bitmap, str, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.graphics.Bitmap] */
    static String b(Bitmap bitmap, String str, int i2) throws Throwable {
        String str2;
        Object[] objArr;
        if (new File(str).exists()) {
            new File(str).delete();
            Logger.d(q, "found existing file, deleted : ", str);
        }
        Logger.d(q, "Saving image to file: ", str);
        ?? r0 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                Logger.d(q, "Saving screenshot to file ", str);
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                if (fileOutputStream2 != null) {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i2, fileOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        Logger.e(q, "Failed to save screenshot to file, error : ", th.getMessage(), th);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                str2 = q;
                                String message = e2.getMessage();
                                Object[] objArr2 = {"Failed to save screenshot to file (fos close) , error : ", message, e2};
                                r0 = message;
                                objArr = objArr2;
                                Logger.e(str2, objArr);
                                return "";
                            }
                        }
                        return "";
                    }
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e3) {
                        str2 = q;
                        String message2 = e3.getMessage();
                        Object[] objArr3 = {"Failed to save screenshot to file (fos close) , error : ", message2, e3};
                        r0 = message2;
                        objArr = objArr3;
                        Logger.e(str2, objArr);
                        return "";
                    }
                }
                return str;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static void a(String str, AdType adType, String str2, String str3, String str4, ScreenShotOrientation screenShotOrientation) throws Throwable {
        if (str == null) {
            return;
        }
        String strReplace = a(adType, str2, str3, str4, screenShotOrientation).replace(a, b);
        Logger.d(q, "Saving ad text to file: ", strReplace);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(strReplace);
                    try {
                        fileOutputStream2.write(str.getBytes());
                        fileOutputStream2.close();
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        Logger.e(q, "Failed to save ad text to file", th);
                        if (fileOutputStream == null) {
                        } else {
                            fileOutputStream.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e2) {
        }
    }

    public static String a(String str, boolean z2) {
        try {
            if (str == null) {
                Logger.d(q, "Parameter name 'activityName' cannot be null");
                return null;
            }
            String[] strArrSplit = str.split(UserDetailsUtils.UserDetailsLiterals.AT);
            return strArrSplit.length > 1 ? strArrSplit[z2 ? 1 : 0] : "";
        } catch (Throwable th) {
            Logger.e(q, "Failed to get activity address for ", str, th);
            return "";
        }
    }

    public static long c(String str) {
        try {
            return new File(str).length();
        } catch (Throwable th) {
            Logger.e(q, "Failed to create new file for screenshot", th);
            return 0L;
        }
    }

    static synchronized void d(String str) {
        if (str != null) {
            Logger.d(q, "remove ad files started, filepath ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (new File(str).exists()) {
                if (!new File(str).delete()) {
                    Logger.d(q, "remove ad files failed to delete file ", str);
                } else {
                    Logger.d(q, "remove ad files deleted file ", str);
                }
            } else {
                Logger.d(q, "remove ad files filePath does not exist. file=", str);
            }
            File file = new File(str.replace(a, b));
            if (file.exists()) {
                Logger.d(q, "remove ad files deleting file ", file.getAbsolutePath());
                if (!file.delete()) {
                    Logger.d(q, "remove ad files failed to delete file ", file.getAbsolutePath());
                }
            }
        }
    }

    static synchronized void a(AdType adType, String str) {
        Logger.d(q, "remove all ad files started, adType = ", adType.name(), " , impression = ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (str.contains("_")) {
            String str2 = str.split("_")[1];
            File file = new File(SafeDK.getInstance().ae() + adType);
            Logger.d(q, "remove all ad files impressionId = ", str2);
            File[] fileArrListFiles = file.listFiles(new b(str2));
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    Logger.d(q, "remove all ad files deleting file for impression ", str2, " : ", file2.getAbsolutePath());
                    d(file2.getAbsolutePath());
                }
            }
        }
    }

    public static String a(Class cls) {
        return e(cls.getName());
    }

    public static String e(String str) {
        if (str != null) {
            return g(str) ? com.safedk.android.utils.h.h : SdksMapping.getSdkPackageByClass(str);
        }
        return null;
    }

    public static String b(Class cls) {
        String name = cls.getName();
        String strE = e(name);
        if (strE == null) {
            strE = name;
        }
        Logger.v(q, "SDK package for class ", name, " is ", strE);
        return strE == null ? "unknown" : strE;
    }

    public static boolean f(String str) {
        return g(str) || SdksMapping.getSdkPackageByClass(str) != null;
    }

    public static boolean g(String str) {
        if (str.startsWith("maps.bi.f") || str.startsWith("avu") || str.startsWith(MobileAds.ERROR_DOMAIN)) {
            return true;
        }
        return false;
    }

    public static a a(String str, Bitmap bitmap) {
        return a(str, bitmap, 1000, AdType.INTERSTITIAL);
    }

    public static a b(String str, Bitmap bitmap) {
        return a(str, bitmap, 500, AdType.BANNER);
    }

    private static a a(String str, Bitmap bitmap, int i2, AdType adType) {
        a aVar = new a();
        Random random = new Random();
        HashMap map = new HashMap();
        float fA = CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_TOP_MARGIN_PERCENT, 0.2f);
        float fA2 = CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_RIGHT_MARGIN_PERCENT, 0.2f);
        float fA3 = CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_LEFT_MARGIN_PERCENT, 0.2f);
        float fA4 = CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, 0.2f);
        Logger.d(q, "bitmap scan started, sdkPackage = ", str, ", adType = ", adType.name(), " bitmap scan : margins are : top ", Float.valueOf(fA), " , right ", Float.valueOf(fA2), ", left ", Float.valueOf(fA3), ", right ", Float.valueOf(fA4), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        float width = bitmap.getWidth();
        int i3 = (int) (fA3 * width);
        int i4 = (int) (width - (fA2 * width));
        float height = bitmap.getHeight();
        int i5 = (int) (fA * height);
        int i6 = (int) (height - (fA4 * height));
        for (int i7 = 0; i7 < i2; i7++) {
            int pixel = bitmap.getPixel(random.nextInt(i4 - i3) + i3, random.nextInt(i6 - i5) + i5) & 16777215;
            Integer num = (Integer) map.get(Integer.valueOf(pixel));
            if (num == null) {
                map.put(Integer.valueOf(pixel), 1);
            } else {
                map.put(Integer.valueOf(pixel), Integer.valueOf(num.intValue() + 1));
            }
        }
        Iterator it = map.values().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue > i8) {
                aVar.a(iIntValue);
                i8 = iIntValue;
            }
        }
        int iA = a(map, 0, 26);
        int i9 = (iA * 100) / i2;
        aVar.b(i9);
        int iA2 = a(map, x, 10);
        int i10 = (iA2 * 100) / i2;
        aVar.c(i10);
        int iA3 = a(map, y, 10);
        int i11 = (iA3 * 100) / i2;
        aVar.d(i11);
        Logger.d(q, "bitmap scan, pixel percentages: black=", Integer.valueOf(i9), "% (", Integer.valueOf(iA), "/", Integer.valueOf(i2), ")", ", gray-1=", Integer.valueOf(i10), "% (", Integer.valueOf(iA2), "/", Integer.valueOf(i2), ")", ", gray-2=", Integer.valueOf(i11), "% (", Integer.valueOf(iA3), "/", Integer.valueOf(i2), ")");
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            aVar.a(a((Map<Integer, Integer>) map));
        }
        return aVar;
    }

    private static boolean a(Map<Integer, Integer> map) {
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (Color.red(iIntValue) != Color.blue(iIntValue) || Color.blue(iIntValue) != Color.green(iIntValue)) {
                Logger.d(q, "Image is not Greyscale");
                return false;
            }
        }
        Logger.d(q, "Image is Greyscale");
        return true;
    }

    private static int d(int i2) {
        return (i2 >> 16) & 255;
    }

    private static int e(int i2) {
        return (i2 >> 8) & 255;
    }

    private static int f(int i2) {
        return i2 & 255;
    }

    private static boolean a(int i2, int i3, int i4) {
        return Math.abs(d(i2) - d(i3)) <= i4 && d(i2) == e(i2) && d(i2) == f(i2);
    }

    private static int a(Map<Integer, Integer> map, int i2, int i3) {
        int iIntValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (a(entry.getKey().intValue(), i2, i3)) {
                iIntValue += entry.getValue().intValue();
            }
        }
        return iIntValue;
    }

    public static boolean a(int i2) {
        return a(i2, 1000, SafeDK.getInstance().G());
    }

    public static boolean b(int i2) {
        return a(i2, 500, SafeDK.getInstance().W());
    }

    public static boolean c(int i2) {
        return b(i2);
    }

    private static boolean a(int i2, int i3, float f2) {
        Logger.d(q, "isScreenshotEnough Max Uniform Pixel Percentage to Stop Sampling is ", Float.valueOf(f2));
        return ((float) i2) < (f2 / 100.0f) * ((float) i3);
    }

    public static ScreenshotValidity a(String str, a aVar) {
        return a(str, aVar, 1000, CreativeInfoManager.a(str, AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, SafeDK.getInstance().H()));
    }

    public static ScreenshotValidity b(String str, a aVar) {
        return a(str, aVar, 500, SafeDK.getInstance().X());
    }

    public static ScreenshotValidity c(String str, a aVar) {
        return b(str, aVar);
    }

    public static ScreenshotValidity a(String str, a aVar, int i2, float f2) {
        Logger.d(q, "screenshot validity check started, number of samples: ", Integer.valueOf(i2), ", BitmapScanResult: ", aVar);
        if (aVar.b() > 98) {
            Logger.d(q, "screenshot validity check, black pixel percentage is above threshold, image is black (not valid)");
            return ScreenshotValidity.UNIFORMITY_BLACK;
        }
        int iA = (aVar.a() * 100) / i2;
        if (iA > 98) {
            Logger.d(q, "screenshot validity check, uniform pixel count is ", Integer.valueOf(iA), "% => above threshold, image is uniform (not valid)");
            return ScreenshotValidity.UNIFORMITY_VERY_HIGH;
        }
        if (iA > f2) {
            Logger.d(q, "screenshot validity check, uniformity check : Screenshot max color pixel count is above uniformity threshold, image is not valid (result = ", Integer.valueOf(iA), "%)");
            return ScreenshotValidity.UNIFORMITY_HIGH;
        }
        if (aVar.b() > 10 && (aVar.c() > 10 || aVar.d() > 10)) {
            Logger.d(q, "screenshot validity check, black=", Integer.valueOf(aVar.b()), "% , grey-1=", Integer.valueOf(aVar.c()), "% , grey-2=", Integer.valueOf(aVar.d()), "%, => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (aVar.c() > 50 || aVar.d() > 50) {
            Logger.d(q, "screenshot validity check, grey-1=", Integer.valueOf(aVar.c()), "%, grey-2=", Integer.valueOf(aVar.d()), "%  => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            if (aVar.e()) {
                Logger.d(q, "screenshot validity check, Screenshot is NSFD");
                return ScreenshotValidity.NOT_SUITABLE_FOR_DASHBOARD;
            }
            Logger.d(q, "screenshot validity check, Screenshot is NOT NSFD");
        }
        return ScreenshotValidity.VALID;
    }

    public static String a(AdType adType, String str, String str2, String str3, ScreenShotOrientation screenShotOrientation) {
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str2);
        Logger.d(q, "getFileName Sdk UUID is ", sdkUUIDByPackage, " for sdk ", str2);
        return SafeDK.getInstance().ae() + adType + File.separator + str + "_" + sdkUUIDByPackage + "_" + str3 + "_" + screenShotOrientation.name().toLowerCase() + a;
    }

    public static boolean c(Class cls) {
        return h(cls.getName());
    }

    public static boolean h(String str) {
        Logger.d(q, "Internal browser activity check started, Activity name : ", str, ", result : ", Boolean.valueOf(s.contains(str)), ", redirectDetectionInterstitialActivities= ", s);
        return s.contains(str);
    }

    public static boolean d(Class cls) {
        return i(cls.getName());
    }

    public static boolean i(String str) {
        Logger.d(q, "Interstitial activity check started, Activity name : ", str, ", result : ", Boolean.valueOf(r.contains(str)), ", interstitialActivities= ", r);
        return r.contains(str);
    }

    public static String j(String str) {
        for (String str2 : r) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return "";
    }

    public static com.safedk.android.analytics.brandsafety.c k(String str) {
        if (str != null) {
            Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().y().iterator();
            while (it.hasNext()) {
                com.safedk.android.analytics.brandsafety.c cVarL = it.next().l(str);
                if (cVarL != null) {
                    return cVarL;
                }
            }
            return null;
        }
        return null;
    }

    public static com.safedk.android.analytics.brandsafety.c l(String str) {
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && str != null) {
            Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().y().iterator();
            while (it.hasNext()) {
                com.safedk.android.analytics.brandsafety.c cVarC = it.next().c(str);
                if (cVarC != null) {
                    return cVarC;
                }
            }
        }
        return null;
    }

    public static void m(String str) {
        Logger.d(q, "addInterstitialActivity started name=", str);
        r.add(str);
    }

    public static void n(String str) {
        Logger.d(q, "removeInterstitialActivity started name=", str);
        r.remove(str);
    }

    public static int b(AdType adType) {
        try {
            Logger.d(q, "get image count by ad type started, adType = ", adType.name(), " : ", adType);
            File file = new File(SafeDK.getInstance().ae() + adType);
            File[] fileArrListFiles = file.listFiles();
            String str = "";
            for (File file2 : fileArrListFiles) {
                str = str + ", " + file2.getName();
            }
            Logger.d(q, "get image count by ad type all files in ", file.getName(), " : ", str);
            Logger.d(q, "get image count by ad type returned ", Integer.valueOf(fileArrListFiles.length), " for adType ", adType.name());
            return fileArrListFiles.length;
        } catch (Throwable th) {
            Logger.d(q, "get image count by ad type  error :  ", th.getMessage(), th);
            return -1;
        }
    }

    public static List<d> c(AdType adType) {
        ScreenShotOrientation screenShotOrientationValueOf;
        ArrayList arrayList = new ArrayList();
        try {
            Logger.d(q, "Restoring ", adType, " images for upload", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            File[] fileArrListFiles = new File(SafeDK.getInstance().ae() + adType).listFiles(new c());
            if (fileArrListFiles != null) {
                Logger.d(q, "Found ", Integer.valueOf(fileArrListFiles.length), " candidate images for upload");
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    Logger.d(q, "Checking file ", name);
                    String absolutePath = file.getAbsolutePath();
                    File file2 = new File(absolutePath.replace(a, b));
                    Logger.d(q, "Deleting file ", file.getAbsolutePath());
                    file.delete();
                    if (file2.exists()) {
                        file2.delete();
                    }
                    String[] strArrSplit = name.replace(a, "").split("_");
                    if (strArrSplit.length == 4) {
                        String str = strArrSplit[0];
                        String sdkPackageByPackageUUID = strArrSplit[1];
                        Logger.d(q, "sdk = ", strArrSplit[1]);
                        if (SdksMapping.getSdkPackageByPackageUUID(strArrSplit[1]) != null) {
                            sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(strArrSplit[1]);
                            Logger.d(q, "sdk value replaced : ", sdkPackageByPackageUUID);
                        }
                        String str2 = sdkPackageByPackageUUID;
                        String str3 = strArrSplit[2];
                        try {
                            screenShotOrientationValueOf = ScreenShotOrientation.valueOf(strArrSplit[3].toUpperCase());
                        } catch (IllegalArgumentException e2) {
                            screenShotOrientationValueOf = ScreenShotOrientation.NOT_INITIALIZED;
                        }
                        Logger.d(q, "Restore image for upload: ", absolutePath);
                        arrayList.add(new d(str, str2, str3, screenShotOrientationValueOf, absolutePath, null));
                    }
                }
            }
        } catch (Throwable th) {
            Logger.d(q, "Error while restoring ads for upload", th);
            new CrashReporter().caughtException(th);
        }
        return arrayList;
    }

    private static void j() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().m().getResources().getDisplayMetrics();
        M = displayMetrics.heightPixels;
        L = displayMetrics.widthPixels;
    }

    static int a() {
        if (L == 0) {
            j();
        }
        return L;
    }

    static int b() {
        if (M == 0) {
            j();
        }
        return M;
    }

    static ScreenShotOrientation c() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().m().getResources().getDisplayMetrics();
        return displayMetrics.heightPixels > displayMetrics.widthPixels ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    static ScreenShotOrientation b(Bitmap bitmap) {
        if (bitmap == null) {
            return ScreenShotOrientation.NOT_INITIALIZED;
        }
        return bitmap.getHeight() > bitmap.getWidth() ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    public static String o(String str) {
        if (str != null) {
            String[] strArrSplit = str.split(UserDetailsUtils.UserDetailsLiterals.AT);
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
            return "";
        }
        return "";
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Integer.toHexString(obj.hashCode());
    }

    public static class d {
        String a;
        String b;
        String c;
        ScreenShotOrientation d;
        String e;
        String f;

        public d(String str, String str2, String str3, ScreenShotOrientation screenShotOrientation, String str4, String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = screenShotOrientation;
            this.e = str4;
            this.f = str5;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.c;
        }

        public ScreenShotOrientation d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public String f() {
            return this.f;
        }
    }

    private static void a(String str, long j2, long j3, String str2, String str3, String str4) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "Report click url with no impression to server starting, sdkPackageName=", str, ", url=", str3, ", currentForegroundActivityName=", str4, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                if (!e.a(str)) {
                    Logger.d(q, "Redirect reporting not supported for Sdk ", str, ", report will not be sent");
                    return;
                }
                if (str3 == null) {
                    return;
                }
                Uri uri = Uri.parse(str3);
                if (uri.getScheme() != null && uri.getHost() != null) {
                    if (e.a(str, str3)) {
                        Logger.d(q, "Ignoring this intent as it was already reported , sdkPackageName=", str, " ,intentUrl=", str);
                        return;
                    }
                    RedirectEvent redirectEvent = new RedirectEvent(str, str3, str2, str4, j2, j3);
                    redirectEvent.a(q.a().b());
                    if (SafeDK.b()) {
                        StatsCollector.c().a(redirectEvent);
                    } else {
                        Logger.d(q, "Reporter thread not initialized or stats collector instance is null, skipping");
                    }
                }
            } catch (Throwable th) {
                Logger.e(q, "Exception during attempt to create redirect event", th);
            }
        }
    }

    private static class e {
        private static final String a = "SdkUrlRedirectManager";
        private static Map<String, Long> b = new HashMap();
        private static int c = 1000;

        private e() {
        }

        private static String b(String str, String str2) {
            return str + "_" + str2;
        }

        private static boolean c(String str, String str2) {
            Logger.d(a, "Check : does timestamp exist for Sdk and url ?  sdkPackageName=", str, ", url=", str2, " , result = ", Boolean.valueOf(b.containsKey(b(str, str2))));
            return b.containsKey(b(str, str2));
        }

        private static long d(String str, String str2) {
            Logger.d(a, "getting latest timestamp for Sdk and url started. sdkPackageName=", str, ", url=", str2);
            if (c(str, str2)) {
                return b.get(b(str, str2)).longValue();
            }
            return 0L;
        }

        public static boolean a(String str, String str2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            a();
            long jD = d(str, str2);
            Logger.d(a, "Checking if we should ignore the redirect instance sdkPackageName=", str, ", url=", str2, ", timestamp=", Long.valueOf(jCurrentTimeMillis), ",System.currentTimeMillis()=", Long.valueOf(System.currentTimeMillis()), ", latestTimestamp=", Long.valueOf(jD), ", diff=", Long.valueOf(System.currentTimeMillis() - jD));
            if (jD != 0 && System.currentTimeMillis() - jD < c) {
                Logger.d(a, "should ignore this redirect.");
                return true;
            }
            a(str, str2, jCurrentTimeMillis);
            return false;
        }

        private static void a(String str, String str2, long j) {
            Logger.d(a, "Update latest timestamp for Sdk and url started. sdkPackageName=", str, ", url=", str2);
            b.put(b(str, str2), Long.valueOf(j));
            Logger.d(a, "timestamps : ", b.toString());
        }

        private static void a() {
            Logger.d(a, "Clear data started, (", Integer.valueOf(b.size()), ") : ", b.toString());
            ArrayList<String> arrayList = new ArrayList();
            for (String str : b.keySet()) {
                Logger.d(a, "Clear System.currentTimeMillis()-sdkAndUrlToTimestamp.get(key)=", Long.valueOf(System.currentTimeMillis() - b.get(str).longValue()));
                if (System.currentTimeMillis() - b.get(str).longValue() > c) {
                    Logger.d(a, "Added key for removal : ", str);
                    arrayList.add(str);
                }
            }
            if (arrayList.size() > 0) {
                for (String str2 : arrayList) {
                    Logger.d(a, "Removing key ", str2);
                    b.remove(str2);
                }
            }
            Logger.d(a, "Clear data finished, Items (", Integer.valueOf(b.size()), ") : ", b.toString());
        }

        public static boolean a(String str) {
            String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str);
            if (sdkUUIDByPackage != null && sdkUUIDByPackage.length() > 0 && SdksMapping.getRedirectSupportedSdks() != null) {
                Logger.d(a, "sdk=", str, ", sdkUid=", sdkUUIDByPackage, ", supported ? ", Boolean.valueOf(SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage)));
                return SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage);
            }
            Logger.d(a, "Cannot determine if sdk is redirect detection supported, sdk=", str);
            return false;
        }
    }

    public static void p(String str) {
        Logger.d(q, "adding to redirect current open fullscreen ad collection. sdk = ", str, ", redirectDetectionCurrentInterstitialBySdk = ", t.toString());
        t.add(str);
    }

    public static void q(String str) {
        Logger.d(q, "removing from redirect current open fullscreen ad collection. sdk = ", str, ", redirectDetectionCurrentInterstitialBySdk = ", t.toString());
        t.remove(str);
    }

    public static boolean r(String str) {
        Logger.d(q, "checking if there is a redirect current open fullscreen ad in collection. sdk = ", str, ", result is ", Boolean.valueOf(t.contains(str)), ", redirectDetectionCurrentInterstitialBySdk = ", t.toString());
        return t.contains(str);
    }

    public static class a {
        private static final String a = "BitmapScanResult";
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f = false;

        public int a() {
            return this.b;
        }

        public void a(int i) {
            this.b = i;
        }

        public int b() {
            return this.c;
        }

        public void b(int i) {
            this.c = i;
        }

        public int c() {
            return this.d;
        }

        public void c(int i) {
            this.d = i;
        }

        public int d() {
            return this.e;
        }

        public void d(int i) {
            this.e = i;
        }

        public boolean e() {
            return this.c > 50 && this.f;
        }

        public void a(boolean z) {
            this.f = z;
        }

        public String toString() {
            return "{max count: " + this.b + ", black: " + this.c + "%, gray-1: " + this.d + "%, gray-2: " + this.e + "%}";
        }
    }

    public static String s(String str) {
        byte[] bArr = new byte[0];
        if (new File(str).exists()) {
            byte[] bArr2 = new byte[0];
            try {
                return new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(a(new File(str)))).toString(16);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
        return "";
    }

    public static String a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        try {
            return new BigInteger(1, MessageDigest.getInstance(SameMD5.TAG).digest(bArr)).toString(16);
        } catch (NoSuchAlgorithmException e2) {
            return "";
        }
    }

    private static byte[] a(File file) {
        byte[] bArr = new byte[100];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i2 = bufferedInputStream.read(bArr);
                if (i2 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i2);
                } else {
                    bufferedInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception e2) {
            Logger.d(q, "Exception reading file : ", e2.getMessage(), e2);
            return null;
        }
    }

    public static void onMraidOpen(String sdkPackageName, String urlJsonString, Object obj, String originatedMethod) {
        if (SafeDK.ab()) {
            Logger.d(q, "on mraid open, sdk: ", sdkPackageName, ", urlJsonString: ", urlJsonString, ", object: ", obj, ", originated method: ", originatedMethod);
            if (obj != null && urlJsonString != null) {
                try {
                    onMraidOpen(sdkPackageName, new JSONObject(urlJsonString), obj, originatedMethod);
                } catch (JSONException e2) {
                    Logger.d(q, "on mraid open, failed build a JSON object: ", urlJsonString);
                }
            }
        }
    }

    public static void onMraidOpen(String sdkPackageName, JSONObject urlJsonObject, Object obj, String originatedMethod) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "on mraid open, sdk: ", sdkPackageName, ", urlJsonObject: ", urlJsonObject, ", object: ", obj, ", originated method: ", originatedMethod);
                if (obj != null && urlJsonObject != null) {
                    String strOptString = urlJsonObject.optString("url");
                    Logger.d(q, "on mraid open, url: ", strOptString);
                    ArrayList<Field> arrayList = new ArrayList();
                    for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
                    }
                    for (Field field : arrayList) {
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 instanceof WebView) {
                                onMraidOpen(sdkPackageName, null, strOptString, (WebView) obj2, originatedMethod);
                                return;
                            }
                            continue;
                        } catch (IllegalAccessException e2) {
                            Logger.d(q, "on mraid open, failed to get webview from: ", obj);
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.d(q, "on mraid open exception: ", th);
            }
        }
    }

    public static void onMraidExpand(String sdkPackageName, String urlJsonString, Object obj, String originatedMethod) {
        String strOptString;
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "on mraid expand, sdk: ", sdkPackageName, ", urlJsonString: ", urlJsonString, ", object: ", obj, ", originated method: ", originatedMethod);
                if (obj != null && urlJsonString != null) {
                    try {
                        strOptString = new JSONObject(urlJsonString).optString("url");
                    } catch (JSONException e2) {
                        Logger.d(q, "on mraid expand, failed to get url from: ", urlJsonString);
                        strOptString = null;
                    }
                    for (Field field : obj.getClass().getFields()) {
                        try {
                            if (field.get(obj) instanceof WebView) {
                                onMraidExpand(sdkPackageName, null, strOptString, (WebView) field.get(obj), originatedMethod);
                            }
                        } catch (IllegalAccessException e3) {
                            Logger.d(q, "on mraid expand, failed to get webview from: ", obj);
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.d(q, "on mraid expand exception: ", th);
            }
        }
    }

    public static void onMraidOpen(final String sdkPackageName, String str, final String url, final WebView view, final String originatedMethod) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, Logger.FeatureTag.REDIRECTS, "on mraid open, sdk: ", sdkPackageName, ", str: ", str, ", url: ", url, ", webview: ", view, ", originated method: ", originatedMethod);
                if (sdkPackageName != null && url != null) {
                    H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.6
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                BrandSafetyUtils.a(sdkPackageName, view, url, RedirectDetails.RedirectType.REDIRECT, originatedMethod);
                            } catch (Throwable th) {
                                Logger.e(BrandSafetyUtils.q, "exception while handling mraid open", th);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                Logger.d(q, "on mraid open exception: ", th);
            }
        }
    }

    public static void onMraidExpand(final String sdkPackageName, String str, final String url, final WebView view, final String originatedMethod) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, Logger.FeatureTag.REDIRECTS, "on mraid expand, sdk: ", sdkPackageName, ", str: ", str, ", url: ", url, ", webview: ", view, ", originated method: ", originatedMethod);
                if (sdkPackageName != null) {
                    H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.7
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                BrandSafetyUtils.a(sdkPackageName, view, url, RedirectDetails.RedirectType.EXPAND, originatedMethod);
                            } catch (Throwable th) {
                                Logger.e(BrandSafetyUtils.q, "exception while handling mraid expand", th);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                Logger.d(q, "on mraid expand exception: ", th);
            }
        }
    }

    public static void onMraidProcessExpand(String sdkPackageName, String url) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "on mraid process expand, sdk: ", sdkPackageName, ", url: ", url);
                a(sdkPackageName, url, (String) null, RedirectEvent.i);
            } catch (Throwable th) {
                Logger.d(q, "on mraid process expand exception: ", th);
            }
        }
    }

    public static void onMraidWasExpanded(String sdkPackageName) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "on mraid was expanded, sdk: ", sdkPackageName);
                t(sdkPackageName);
            } catch (Throwable th) {
                Logger.d(q, "on mraid was expand exception: ", th);
            }
        }
    }

    public static boolean a(String str, WebView webView) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strA = a((Object) webView);
        w wVarA = DetectTouchUtils.a(str, strA);
        long jLongValue = wVarA == null ? 0L : wVarA.a.longValue();
        boolean z2 = jElapsedRealtime - jLongValue < 20000;
        Logger.d(q, "is ad clicked recently - for package: ", str, " and view address: ", strA, " returned: ", Boolean.valueOf(z2), " last touch event: ", Long.valueOf(jLongValue), " vs current: ", Long.valueOf(jElapsedRealtime));
        return z2;
    }

    public static void onWebViewPageCommitVisible(String sdkPackage, WebView webView, String url) {
        if (SafeDK.ab()) {
            Logger.d(q, "WebView page commit visible, sdk: ", sdkPackage, ", webView : ", webView, ", url ", url);
        }
    }

    public static void onWebViewPageStarted(final String sdkPackage, WebView webView, final String url) {
        com.safedk.android.analytics.brandsafety.c cVarC;
        CreativeInfo creativeInfoJ;
        if (SafeDK.ab()) {
            try {
                SafeDKWebAppInterface.a(sdkPackage, webView, url, false);
                final String strA = a((Object) webView);
                InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
                if (interstitialFinderZ != null && (cVarC = interstitialFinderZ.c(strA)) != null && (creativeInfoJ = cVarC.j()) != null && creativeInfoJ.aq()) {
                    Logger.d(q, "WebView page started, ignore url from website end card");
                } else {
                    Logger.d(q, "WebView page started, sdk: ", sdkPackage, ", webView : ", webView, ", url ", url);
                    H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.8
                        @Override // java.lang.Runnable
                        public void run() {
                            com.safedk.android.analytics.brandsafety.a aVar;
                            try {
                                z zVar = (z) BrandSafetyUtils.I.get(strA);
                                if (zVar != null && zVar.a().equals(url) && zVar.d().equals(sdkPackage)) {
                                    zVar.a(url);
                                    Iterator it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().z()).iterator();
                                    while (it.hasNext() && ((aVar = (com.safedk.android.analytics.brandsafety.a) it.next()) == null || !aVar.a(sdkPackage, zVar))) {
                                    }
                                    Logger.d(BrandSafetyUtils.q, "handle website opened, started loading: ", BrandSafetyUtils.I);
                                    BrandSafetyUtils.b(zVar, strA, "commit");
                                }
                            } catch (Throwable th) {
                                Logger.e(BrandSafetyUtils.q, "exception while WebView page started", th);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                Logger.d(q, "WebView page started exception: ", th);
            }
        }
    }

    public static void onWebViewReceivedError(final String sdkPackage, WebView webView, int errorCode, String description, final String failingUrl) {
        com.safedk.android.analytics.brandsafety.c cVarC;
        CreativeInfo creativeInfoJ;
        if (SafeDK.ab()) {
            try {
                final String strA = a((Object) webView);
                InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
                if (interstitialFinderZ != null && (cVarC = interstitialFinderZ.c(strA)) != null && (creativeInfoJ = cVarC.j()) != null && creativeInfoJ.aq()) {
                    Logger.d(q, "WebView received error, ignore url from website end card");
                } else {
                    Logger.d(q, "WebView received error, sdk: ", sdkPackage, ", webView: ", webView.toString(), ", errorCode: ", Integer.valueOf(errorCode), ", description: ", description, ", failingUrl: ", failingUrl);
                    H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.9
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                z zVar = (z) BrandSafetyUtils.I.get(strA);
                                if (zVar != null && zVar.a().equals(failingUrl) && zVar.d().equals(sdkPackage)) {
                                    BrandSafetyUtils.I.remove(strA);
                                    Logger.d(BrandSafetyUtils.q, "handle suspicion of website loaded into banner, load failed: ", BrandSafetyUtils.I);
                                    BrandSafetyUtils.b(zVar, strA, C4664b4.g.e);
                                }
                            } catch (Throwable th) {
                                Logger.e(BrandSafetyUtils.q, "exception while WebView received error", th);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                Logger.d(q, "WebView received error exception: ", th);
            }
        }
    }

    public static void onWebViewReceivedError(String sdkPackage, WebView webView, WebResourceRequest request, WebResourceError error) {
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "WebView received error, sdk: ", sdkPackage, ", webView: ", webView.toString(), ", request: ", request, ", error: ", error);
                if (Build.VERSION.SDK_INT >= 23) {
                    onWebViewReceivedError(sdkPackage, webView, error.getErrorCode(), error.getDescription().toString(), request.getUrl() != null ? request.getUrl().toString() : "");
                } else {
                    onWebViewReceivedError(sdkPackage, webView, -1, "", "");
                }
            } catch (Throwable th) {
                Logger.d(q, "WebView received error exception: ", th);
            }
        }
    }

    public static void onShouldOverrideUrlLoading(String sdkPackageName, WebView view, String url, boolean ret) {
        com.safedk.android.analytics.brandsafety.c cVarC;
        CreativeInfo creativeInfoJ;
        if (SafeDK.ab()) {
            try {
                Logger.d(q, "on should override url loading, sdk: ", sdkPackageName, ", webview: ", view, ", url: ", url, ", ret: ", Boolean.valueOf(ret));
                CreativeInfoManager.a(sdkPackageName, view, url);
                String strA = a((Object) view);
                if (sdkPackageName != null && view != null && url != null) {
                    com.safedk.android.analytics.brandsafety.c cVarL = l(strA);
                    if (cVarL != null) {
                        m.a[] aVarArr = new m.a[3];
                        aVarArr[0] = new m.a("api", "so");
                        aVarArr[1] = new m.a("url", url);
                        aVarArr[2] = new m.a(m.Q, ret ? "cancel" : "allow");
                        cVarL.a(m.v, aVarArr);
                    } else {
                        m.a[] aVarArr2 = new m.a[3];
                        aVarArr2[0] = new m.a("api", "so");
                        aVarArr2[1] = new m.a("url", url);
                        aVarArr2[2] = new m.a(m.Q, ret ? "cancel" : "allow");
                        com.safedk.android.analytics.brandsafety.b.a(strA, m.v, aVarArr2);
                    }
                    if (ret) {
                        a(sdkPackageName, view, url, strA);
                        return;
                    }
                    InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
                    if (interstitialFinderZ != null && (cVarC = interstitialFinderZ.c(strA)) != null && (creativeInfoJ = cVarC.j()) != null && creativeInfoJ.aq()) {
                        Logger.d(q, "on should override url loading, ignore url from website end card");
                    } else {
                        a(sdkPackageName, url, strA);
                    }
                }
            } catch (Throwable th) {
                Logger.d(q, "on should override url loading exception: ", th);
            }
        }
    }

    public static void onShouldOverrideUrlLoading(String sdkPackageName, WebView view, WebResourceRequest webResourceRequest, boolean ret) {
        if (SafeDK.ab() && Build.VERSION.SDK_INT >= 21 && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            onShouldOverrideUrlLoading(sdkPackageName, view, webResourceRequest.getUrl().toString(), ret);
        }
    }

    public static void onWebChromeClientCreateWindow(String sdkPackageName, WebView view, Message msg, boolean ret) {
        if (SafeDK.ab() && sdkPackageName != null && view != null && msg != null && ret) {
            try {
                WebView webView = ((WebView.WebViewTransport) msg.obj).getWebView();
                Logger.d(q, "on web chrome client create window, sdk: ", sdkPackageName, ", view: ", view, ", transport view: ", webView);
                if (webView != null) {
                    J.put(a((Object) webView), new WeakReference<>(view));
                }
            } catch (Throwable th) {
                Logger.d(q, "on web chrome client create window exception: ", th);
            }
        }
    }

    private static void a(final String str, final WebView webView, final String str2, final String str3) {
        H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
                    if (adNetworkDiscoveryJ != null) {
                        RedirectDetails.RedirectType redirectTypeL = adNetworkDiscoveryJ.l(str2);
                        String strM = adNetworkDiscoveryJ.m(str2);
                        Logger.d(BrandSafetyUtils.q, Logger.FeatureTag.REDIRECTS, "on should override url loading: target url is: ", strM, " redirect type is: ", redirectTypeL);
                        if (redirectTypeL != null) {
                            BrandSafetyUtils.a(str, webView, strM, redirectTypeL, "shouldOverrideUrlLoading");
                            if (BrandSafetyUtils.a(str, webView)) {
                                Logger.d(BrandSafetyUtils.q, "on should override url loading, updating click URL. address : ", str3);
                                for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C())) {
                                    if (aVar != null && aVar.a(strM, str, str3, false, (String) null)) {
                                        com.safedk.android.analytics.brandsafety.b.a(str3, m.n, new m.a("url", strM), new m.a(m.J, "shouldOverrideUrlLoading"));
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        Logger.d(BrandSafetyUtils.q, "on should override url loading, ignore redirect, sdk: ", str, ", webview: ", webView, ", url: ", str2);
                    }
                } catch (Throwable th) {
                    Logger.e(BrandSafetyUtils.q, "exception while handling potential redirect", th);
                }
            }
        });
    }

    private static void a(final String str, final String str2, final String str3) {
        H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (str2 == null || !str2.startsWith(com.safedk.android.analytics.brandsafety.creatives.g.e)) {
                        return;
                    }
                    for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().z())) {
                        if (aVar != null) {
                            w wVarA = null;
                            com.safedk.android.analytics.brandsafety.c cVarC = aVar.c(str3);
                            if (cVarC != null && cVarC.c().equals(str)) {
                                l lVarI = cVarC.i();
                                if (lVarI != null) {
                                    lVarI.m();
                                }
                                for (int size = cVarC.x().size() - 1; size >= 0; size--) {
                                    wVarA = DetectTouchUtils.a(str, cVarC.x().get(size));
                                    if (wVarA != null) {
                                        break;
                                    }
                                }
                                z zVar = new z(str, str2, str3, wVarA, cVarC);
                                BrandSafetyUtils.I.put(str3, zVar);
                                Logger.d(BrandSafetyUtils.q, "handle suspicion of website loaded into banner: ", zVar);
                                BrandSafetyUtils.b(zVar, str3, "suspect");
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    Logger.e(BrandSafetyUtils.q, "exception while handling suspicion of website loaded into banner", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(z zVar, String str, String str2) {
        int iH = SafeDK.getInstance().h();
        w wVarF = zVar.f();
        boolean z2 = wVarF != null && SystemClock.elapsedRealtime() - wVarF.a.longValue() < ((long) iH);
        if (wVarF != null) {
            float fElapsedRealtime = ((SystemClock.elapsedRealtime() - wVarF.a.longValue()) / 100) / 10.0f;
            m.a[] aVarArr = new m.a[4];
            aVarArr[0] = new m.a(m.K, str2);
            aVarArr[1] = new m.a("url", zVar.a());
            aVarArr[2] = new m.a(m.U, z2 ? "true" : "false");
            aVarArr[3] = new m.a(m.V, String.valueOf(fElapsedRealtime));
            BannerFinder.a(str, m.F, aVarArr);
            return;
        }
        BannerFinder.a(str, m.F, new m.a(m.K, str2), new m.a("url", zVar.a()), new m.a(m.U, "false"));
    }

    public static void a(String str, WebView webView, WebChromeClient webChromeClient) {
        Logger.d(q, "handle set web chrome client, sdk: ", str, ", webview: ", webView, ", chrome client: ", webChromeClient);
        K.put(a(webChromeClient), new WeakReference<>(webView));
    }

    public static void handleOnConsoleMessage(String sdkPackageName, WebChromeClient chromeClient, ConsoleMessage consoleMessage) {
        String strMessage;
        try {
            if (Build.VERSION.SDK_INT >= 8) {
                strMessage = consoleMessage.message();
            } else {
                strMessage = null;
            }
            Logger.d(q, "handle console message, chromeClient: ", chromeClient, ", message: ", strMessage);
            if (strMessage != null && strMessage.contains("mraid.open")) {
                String[] strArrSplit = strMessage.split("\\s+");
                if (strArrSplit.length > 1) {
                    String str = strArrSplit[1];
                    WeakReference<WebView> weakReference = K.get(a(chromeClient));
                    if (weakReference != null && weakReference.get() != null) {
                        Logger.d(q, "handle console message, mraid.open detected, sdk: ", sdkPackageName, ", webview: ", weakReference.get(), ", url: ", str);
                        a(sdkPackageName, weakReference.get(), str, RedirectDetails.RedirectType.REDIRECT, "OnConsoleMessage");
                    }
                }
            }
        } catch (Throwable th) {
            Logger.e(q, "handle console message exception", th);
        }
    }

    public static void onJsPrompt(String sdkPackageName, WebView webview, String requestingUrl, final String message, boolean ret) {
        Logger.d(q, "on JS prompt, sdk: ", sdkPackageName, ", webview: ", webview, ", requestingUrl: ", requestingUrl, ", message: ", message, ", ret: ", Boolean.valueOf(ret));
        if (ret && webview != null) {
            try {
                final AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(sdkPackageName);
                if (adNetworkDiscoveryJ != null) {
                    final WeakReference weakReference = new WeakReference(webview);
                    H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.12
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                adNetworkDiscoveryJ.a(weakReference, message);
                            } catch (Throwable th) {
                                Logger.e(BrandSafetyUtils.q, "on JS prompt exception", th);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                Logger.e(q, "on JS prompt exception", th);
            }
        }
    }

    public static synchronized void a(String str, WebView webView, String str2, RedirectDetails.RedirectType redirectType, String str3) {
        SafeDK safeDK = SafeDK.getInstance();
        if (SafeDK.ab() && safeDK != null) {
            WebView webViewA = a(webView);
            AdType adTypeA = com.safedk.android.analytics.brandsafety.b.a(str, webViewA);
            l();
            RedirectDetails redirectDetails = G != null ? G : null;
            String strA = webViewA != null ? a((Object) webViewA) : null;
            G = new RedirectDetails(str, adTypeA, redirectType, strA, str2, str3, redirectDetails);
            Logger.d(q, Logger.FeatureTag.REDIRECTS, "handle redirect: last redirect - ", G);
            e();
            if (com.safedk.android.utils.h.o.equals(str)) {
                BannerFinder.a(G);
            }
            if (!str3.equals("shouldOverrideUrlLoading")) {
                com.safedk.android.analytics.brandsafety.c cVarL = l(strA);
                if (cVarL != null) {
                    cVarL.a(m.u, new m.a("api", str3), new m.a(m.K, redirectType.name().toLowerCase()), new m.a("url", str2));
                } else {
                    com.safedk.android.analytics.brandsafety.b.a(strA, m.u, new m.a("api", str3), new m.a(m.K, redirectType.name().toLowerCase()), new m.a("url", str2));
                }
            }
        } else {
            Logger.d(q, "handle redirect, Max/SafeDK not initialized, skipping. ");
        }
    }

    private static WebView a(WebView webView) {
        WeakReference<WebView> weakReference = J.get(a((Object) webView));
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            Logger.d(q, "get redirect view, view: ", webView, ", redirect view: ", webView2);
            return webView2;
        }
        return webView;
    }

    public static synchronized void a(String str, String str2, String str3, String str4) {
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(mainSdkPackage);
        if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.l(str2) != null) {
            k();
            n nVar = null;
            if (F != null) {
                nVar = F;
            }
            F = new n(mainSdkPackage, str2, str3, str4, nVar);
            Logger.d(q, Logger.FeatureTag.REDIRECTS, "handle redirect, last intent details: ", F);
            e();
            if (com.safedk.android.utils.h.o.equals(mainSdkPackage)) {
                BannerFinder.a(F);
            }
            return;
        }
        Logger.d(q, "handle redirect, ignore intent for sdk: ", mainSdkPackage, ", url: ", str2);
    }

    public static synchronized String d() {
        long jLongValue;
        l();
        k();
        if (G != null && F != null && F.c != null && F.c.equals(G.c)) {
            boolean zA = CreativeInfoManager.a(G.c, AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
            if (G.e == RedirectDetails.RedirectType.REDIRECT && zA) {
                w wVarA = DetectTouchUtils.a(F.c, G.f);
                if (wVarA != null) {
                    jLongValue = wVarA.a.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jLongValue == 0 || SystemClock.elapsedRealtime() - jLongValue > ((long) SafeDK.getInstance().f())) {
                    Logger.d(q, "check for potential auto redirect, identified for ", F.c, ", view address: ", G.f, ", webviewReqURL: ", G.g, ", landingPageURL: ", F.d);
                    return F.d;
                }
            }
        }
        return null;
    }

    public static synchronized void e() {
        l();
        k();
        if (G != null && F != null && F.c != null && F.c.equals(G.c)) {
            a(F.c, true, false);
        }
    }

    public static synchronized void f() {
        l();
        k();
        if (G != null && F != null && G.e == RedirectDetails.RedirectType.EXPAND && F.c != null && F.c.equals(G.c) && CreativeInfoManager.a(G.c, AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, false)) {
            a(F.c, false, true);
        }
    }

    public static synchronized void g() {
        l();
        k();
        if (G != null && F != null && F.c != null && F.c.equals(G.c)) {
            a(F.c, true, true);
        }
    }

    public static synchronized com.safedk.android.analytics.brandsafety.c t(String str) {
        l();
        k();
        if (G != null && F != null) {
            Logger.d(q, "handle redirect if needed with sdk: ", str);
            if (str != null && str.equals(F.c) && str.equals(G.c)) {
                return a(str, false, true);
            }
        }
        return null;
    }

    public static synchronized com.safedk.android.analytics.brandsafety.c a(Activity activity) {
        l();
        k();
        if (G != null && F != null) {
            String sdkPackageByClass = SdksMapping.getSdkPackageByClass(activity.toString());
            Logger.d(q, "handle redirect if needed with activity sdk: ", sdkPackageByClass);
            if (sdkPackageByClass != null && sdkPackageByClass.equals(F.c) && sdkPackageByClass.equals(G.c)) {
                return a(sdkPackageByClass, false, true);
            }
        }
        return null;
    }

    private static synchronized com.safedk.android.analytics.brandsafety.c a(String str, boolean z2, boolean z3) {
        int i2;
        com.safedk.android.analytics.brandsafety.c cVarA;
        BannerFinder bannerFinderA;
        Logger.d(q, Logger.FeatureTag.REDIRECTS, "handle redirect report: last redirect name: ", G.e.name().toLowerCase(), ", intent: ", F, ", redirect: ", G);
        boolean zA = CreativeInfoManager.a(G.c, AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, false);
        boolean zA2 = CreativeInfoManager.a(G.c, AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
        if ((G.e == RedirectDetails.RedirectType.REDIRECT && !zA2) || (G.e == RedirectDetails.RedirectType.EXPAND && !zA)) {
            Logger.d(q, Logger.FeatureTag.REDIRECTS, "handle ", G.e.name().toLowerCase(), " is not supported for: ", G.c);
            return null;
        }
        if (G.d != null) {
            Logger.d(q, "handle ", G.e.name().toLowerCase(), ", for ", str, " ", G.d, ", view address: ", G.f, ", webviewReqURL: ", G.g, ", landingPageURL: ", F.d);
            com.safedk.android.analytics.brandsafety.a aVarA = SafeDK.getInstance().a(G.d);
            if (aVarA != null) {
                cVarA = aVarA.a(str, G, F, z2, z3);
            } else {
                cVarA = null;
            }
        } else {
            InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
            if (interstitialFinderZ != null) {
                Logger.d(q, "handle ", G.e.name().toLowerCase(), ", for ", str, " ", interstitialFinderZ.a(), ", view address: ", G.f, ", webviewReqURL: ", G.g, ", landingPageURL: ", F.d);
                i2 = 12;
                cVarA = interstitialFinderZ.a(str, G, F, z2, z3);
            } else {
                i2 = 12;
                cVarA = null;
            }
            if (cVarA == null && (bannerFinderA = SafeDK.getInstance().A()) != null) {
                Object[] objArr = new Object[i2];
                objArr[0] = "handle ";
                objArr[1] = G.e.name().toLowerCase();
                objArr[2] = ", for ";
                objArr[3] = str;
                objArr[4] = " ";
                objArr[5] = bannerFinderA.a();
                objArr[6] = ", view address: ";
                objArr[7] = G.f;
                objArr[8] = ", webviewReqURL: ";
                objArr[9] = G.g;
                objArr[10] = ", landingPageURL: ";
                objArr[11] = F.d;
                Logger.d(q, objArr);
                cVarA = bannerFinderA.a(str, G, F, z2, z3);
            }
        }
        if (z3) {
            G = null;
            F = null;
        }
        return cVarA;
    }

    private static void k() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iG = SafeDK.getInstance().g();
        if (F != null && jElapsedRealtime - F.b.longValue() > iG) {
            Logger.d(q, "remove old intent: ", F);
            F = null;
        }
    }

    private static void l() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iG = SafeDK.getInstance().g();
        if (G != null && jElapsedRealtime - G.b.longValue() > iG) {
            Logger.d(q, "remove old redirect: ", G);
            G = null;
        }
    }

    public static RedirectDetails h() {
        l();
        return G;
    }

    public static AdType a(long j2, long j3) {
        float f2 = j2;
        float f3 = j3;
        if (com.safedk.android.utils.n.a(f2, f3)) {
            Logger.d(q, "get ad type, banner identified");
            return AdType.BANNER;
        }
        if (com.safedk.android.utils.n.b(f2, f3)) {
            Logger.d(q, "get ad type, mrec identified");
            return AdType.MREC;
        }
        Logger.d(q, "get ad type, inter identified");
        return AdType.INTERSTITIAL;
    }

    public static void b(Activity activity) {
        Logger.d(q, "report landing page loaded. activity: ", activity);
        o oVarR = SafeDK.getInstance().z().r(SdksMapping.getSdkPackageByClass(activity.getClass().getName()));
        if (oVarR != null && oVarR.ao) {
            oVarR.i().a(m.r, new m.a("ads", Integer.toString(SafeDK.getInstance().A().j() + 1 + SafeDK.getInstance().C().f())), new m.a(m.T, activity.getClass().getCanonicalName()));
        }
    }

    public static void c(Activity activity) {
        Logger.d(q, "report landing page removed. activity: ", activity);
        o oVarR = SafeDK.getInstance().z().r(SdksMapping.getSdkPackageByClass(activity.getClass().getName()));
        if (oVarR != null && oVarR.ao) {
            oVarR.i().a(m.s, new m.a[0]);
        }
    }

    public static void onMobileFuseSetState(String state) {
        Logger.d(q, "on mobilefuse set state - state= ", state);
        if (!TextUtils.isEmpty(state) && state.equals("EXPANDED")) {
            try {
                Logger.d(q, "on mobilefuse set state - calling handle redirect (intent)");
                a(com.safedk.android.utils.h.E, (String) null, (String) null, RedirectEvent.i);
            } catch (Throwable th) {
                Logger.e(q, "on mobilefuse set state exception", th);
            }
        }
    }

    public static void onMobileFuseFullscreenChanged(boolean isChanged) {
        Logger.d(q, "on mobilefuse fullscreen changed - is changed= ", Boolean.valueOf(isChanged));
        if (SafeDK.ab() && isChanged) {
            try {
                Logger.d(q, "on mobilefuse fullscreen changed - calling handle redirect");
                t(com.safedk.android.utils.h.E);
            } catch (Throwable th) {
                Logger.e(q, "on mobilefuse fullscreen changed exception", th);
            }
        }
    }

    public static void onBidMachineOnExpandIntention(WebView expandedWebview) {
        try {
            Logger.d(q, "on bidMachine on expand intention - calling handle redirect (intent), expanded webview: ", expandedWebview);
            a("io.bidmachine", (String) null, a((Object) expandedWebview), RedirectEvent.i);
        } catch (Throwable th) {
            Logger.e(q, "on bidMachine on expand intention exception", th);
        }
    }

    public static void onBidMachineOnExpanded() {
        try {
            Logger.d(q, "on bidMachine on expanded - calling handle redirect (intent)");
            a("io.bidmachine", (String) null, (String) null, RedirectEvent.i);
        } catch (Throwable th) {
            Logger.e(q, "on bidMachine on expanded exception", th);
        }
    }

    public static void onBidMachineOnClose() {
        try {
            Logger.d(q, "on bidMachine on close - calling handle redirect");
            if (SafeDK.ab()) {
                t("io.bidmachine");
            }
        } catch (Throwable th) {
            Logger.e(q, "on bidMachine on close exception", th);
        }
    }

    public static void onMintegralNativeController(final Object instance, final JSONObject object) {
        Logger.d(q, "on mintegral native controller - instance= ", instance);
        if (instance != null && object != null) {
            H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.safedk.android.analytics.brandsafety.creatives.discoveries.k.a(instance, object);
                    } catch (Throwable th) {
                        Logger.e(BrandSafetyUtils.q, "on mintegral native controller exception", th);
                    }
                }
            });
        }
    }

    public static void onPubmaticNativeCall(final WebView webview, final String message) {
        Logger.d(q, "on pubmatic native call - webview: ", webview, ", message:", message);
        H.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.3
            @Override // java.lang.Runnable
            public void run() {
                RedirectDetails.RedirectType redirectType;
                try {
                    JSONObject jSONObject = new JSONObject(message);
                    String string = jSONObject.getString("name");
                    if (string.equals(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) {
                        redirectType = RedirectDetails.RedirectType.REDIRECT;
                    } else if (string.equals("expand")) {
                        redirectType = RedirectDetails.RedirectType.EXPAND;
                    } else {
                        return;
                    }
                    BrandSafetyUtils.a(com.safedk.android.utils.h.F, webview, jSONObject.getJSONObject("params").getString("url"), redirectType, "NativeCall");
                } catch (Exception e2) {
                    Logger.d(BrandSafetyUtils.q, "on pubmatic native call - webview: ", webview, ", failed to parse message", e2);
                }
            }
        });
    }

    public static void onWindVaneSignalCommunicationHandleMessage(String sdkPackageName, Object obj, Message msg) {
        Throwable th;
        boolean z2 = true;
        try {
            Logger.d(q, "onWindVaneSignalCommunicationHandleMessage, sdk: ", sdkPackageName, ", calling obj: ", obj, ", msg: ", msg);
            Object obj2 = msg.obj;
            Class<?> cls = obj2.getClass();
            ArrayList arrayList = new ArrayList();
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            String str = null;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                try {
                    field.setAccessible(z2);
                    Object obj3 = field.get(obj2);
                    String string = obj3 != null ? obj3.toString() : "null";
                    try {
                        if (string.length() > 128) {
                            try {
                                string = string.substring(0, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) + "...";
                            } catch (Throwable th2) {
                                th = th2;
                                Logger.d(q, "onWindVaneSignalCommunicationHandleMessage exception: ", th);
                            }
                        }
                        arrayList.add(string);
                        Object[] objArr = new Object[4];
                        objArr[0] = "onWindVaneSignalCommunicationHandleMessage, fieldObj class: ";
                        objArr[1] = obj3 != null ? obj3.getClass() : "null";
                        objArr[2] = ", value: ";
                        objArr[3] = obj3;
                        Logger.d(q, objArr);
                        if (obj3 instanceof WebView) {
                            String strA = a(obj3);
                            try {
                                Logger.d(q, "onWindVaneSignalCommunicationHandleMessage, found webview address: ", strA);
                                str = strA;
                            } catch (Throwable th3) {
                                th = th3;
                                str = strA;
                                th = th;
                                Logger.d(q, "onWindVaneSignalCommunicationHandleMessage exception: ", th);
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                i2++;
                z2 = true;
            }
            BannerFinder.a(str, arrayList);
        } catch (Throwable th6) {
            Logger.d(q, "onWindVaneSignalCommunicationHandleMessage exception: ", th6);
        }
    }
}
