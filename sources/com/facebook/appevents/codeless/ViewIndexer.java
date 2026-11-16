package com.facebook.appevents.codeless;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.explorestack.protobuf.adcom.c;
import com.facebook.AccessToken;
import com.facebook.a0;
import com.facebook.appevents.h;
import com.facebook.appevents.n;
import com.facebook.internal.k0;
import com.facebook.n0;
import com.ironsource.C5074y2;
import com.mbridge.msdk.foundation.tools.SameMD5;
import defpackage.e80;
import defpackage.er;
import defpackage.k7;
import defpackage.lz;
import defpackage.ok2;
import defpackage.st;
import defpackage.t6;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0011\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", ViewIndexer.TREE_PARAM, "Laz2;", "sendToServer", "(Ljava/lang/String;)V", "schedule", "()V", "unschedule", "Lcom/facebook/k0;", "request", "currentDigest", "processRequest", "(Lcom/facebook/k0;Ljava/lang/String;)V", "Landroid/os/Handler;", "uiThreadHandler", "Landroid/os/Handler;", "Ljava/lang/ref/WeakReference;", "activityReference", "Ljava/lang/ref/WeakReference;", "Ljava/util/Timer;", "indexingTimer", "Ljava/util/Timer;", "previousDigest", "Ljava/lang/String;", "Companion", "ps0", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ViewIndexer {

    @NotNull
    private static final String APP_VERSION_PARAM = "app_version";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String PLATFORM_PARAM = "platform";

    @NotNull
    private static final String REQUEST_TYPE = "request_type";

    @NotNull
    private static final String SUCCESS = "success";

    @NotNull
    private static final String TAG;

    @NotNull
    private static final String TREE_PARAM = "tree";

    @Nullable
    private static ViewIndexer instance;

    @NotNull
    private final WeakReference<Activity> activityReference;

    @Nullable
    private Timer indexingTimer;

    @Nullable
    private String previousDigest;

    @NotNull
    private final Handler uiThreadHandler;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer$Companion;", "", "<init>", "()V", "", ViewIndexer.TREE_PARAM, "Laz2;", "sendToServerUnityInstance", "(Ljava/lang/String;)V", "appIndex", "Lcom/facebook/AccessToken;", "accessToken", "appId", "requestType", "Lcom/facebook/k0;", "buildAppIndexingRequest", "(Ljava/lang/String;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/k0;", "APP_VERSION_PARAM", "Ljava/lang/String;", "PLATFORM_PARAM", CredentialProviderBaseController.REQUEST_TAG, "SUCCESS", "TAG", "TREE_PARAM", "Lcom/facebook/appevents/codeless/ViewIndexer;", C5074y2.p, "Lcom/facebook/appevents/codeless/ViewIndexer;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void buildAppIndexingRequest$lambda$0(n0 n0Var) {
            n0Var.getClass();
            n nVar = k0.c;
            ViewIndexer.access$getTAG$cp().getClass();
            synchronized (a0.b) {
            }
        }

        @RestrictTo
        @Nullable
        public final com.facebook.k0 buildAppIndexingRequest(@Nullable String appIndex, @Nullable AccessToken accessToken, @Nullable String appId, @NotNull String requestType) {
            String str;
            requestType.getClass();
            if (appIndex == null) {
                return null;
            }
            String str2 = com.facebook.k0.j;
            int i = 1;
            com.facebook.k0 k0VarN = c.n(accessToken, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{appId}, 1)), null, null);
            Bundle bundle = k0VarN.d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString(ViewIndexer.TREE_PARAM, appIndex);
            Context contextA = a0.a();
            try {
                str = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).versionName;
                str.getClass();
            } catch (PackageManager.NameNotFoundException unused) {
                str = "";
            }
            bundle.putString(ViewIndexer.APP_VERSION_PARAM, str);
            bundle.putString("platform", "android");
            bundle.putString(ViewIndexer.REQUEST_TYPE, requestType);
            if (requestType.equals("app_indexing")) {
                bundle.putString("device_session_id", st.a());
            }
            k0VarN.d = bundle;
            k0VarN.j(new k7(i));
            return k0VarN;
        }

        public final void sendToServerUnityInstance(@NotNull String tree) {
            tree.getClass();
            ViewIndexer viewIndexerAccess$getInstance$cp = ViewIndexer.access$getInstance$cp();
            if (viewIndexerAccess$getInstance$cp != null) {
                ViewIndexer.access$sendToServer(viewIndexerAccess$getInstance$cp, tree);
            }
        }

        private Companion() {
        }
    }

    static {
        String canonicalName = ViewIndexer.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        TAG = canonicalName;
    }

    public static final WeakReference access$getActivityReference$p(ViewIndexer viewIndexer) {
        if (lz.a.contains(ViewIndexer.class)) {
            return null;
        }
        try {
            return viewIndexer.activityReference;
        } catch (Throwable th) {
            lz.a(ViewIndexer.class, th);
            return null;
        }
    }

    public static final ViewIndexer access$getInstance$cp() {
        if (lz.a.contains(ViewIndexer.class)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th) {
            lz.a(ViewIndexer.class, th);
            return null;
        }
    }

    public static final String access$getTAG$cp() {
        if (lz.a.contains(ViewIndexer.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            lz.a(ViewIndexer.class, th);
            return null;
        }
    }

    public static final Handler access$getUiThreadHandler$p(ViewIndexer viewIndexer) {
        if (lz.a.contains(ViewIndexer.class)) {
            return null;
        }
        try {
            return viewIndexer.uiThreadHandler;
        } catch (Throwable th) {
            lz.a(ViewIndexer.class, th);
            return null;
        }
    }

    public static final void access$sendToServer(ViewIndexer viewIndexer, String str) {
        if (lz.a.contains(ViewIndexer.class)) {
            return;
        }
        try {
            viewIndexer.sendToServer(str);
        } catch (Throwable th) {
            lz.a(ViewIndexer.class, th);
        }
    }

    @RestrictTo
    @Nullable
    public static final com.facebook.k0 buildAppIndexingRequest(@Nullable String str, @Nullable AccessToken accessToken, @Nullable String str2, @NotNull String str3) {
        if (lz.a.contains(ViewIndexer.class)) {
            return null;
        }
        try {
            return INSTANCE.buildAppIndexingRequest(str, accessToken, str2, str3);
        } catch (Throwable th) {
            lz.a(ViewIndexer.class, th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedule$lambda$0(ViewIndexer viewIndexer, TimerTask timerTask) {
        if (lz.a.contains(ViewIndexer.class)) {
            return;
        }
        try {
            viewIndexer.getClass();
            timerTask.getClass();
            try {
                Timer timer = viewIndexer.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                viewIndexer.previousDigest = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
                viewIndexer.indexingTimer = timer2;
            } catch (Exception e) {
                Log.e(TAG, "Error scheduling indexing job", e);
            }
        } catch (Throwable th) {
            lz.a(ViewIndexer.class, th);
        }
    }

    private final void sendToServer(String tree) {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            a0.c().execute(new ok2(18, tree, this));
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendToServer$lambda$1(String str, ViewIndexer viewIndexer) {
        String string;
        if (lz.a.contains(ViewIndexer.class)) {
            return;
        }
        try {
            str.getClass();
            viewIndexer.getClass();
            byte[] bytes = str.getBytes(er.a);
            bytes.getClass();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                messageDigest.getClass();
                messageDigest.update(bytes);
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                bArrDigest.getClass();
                for (byte b : bArrDigest) {
                    sb.append(Integer.toHexString((b >> 4) & 15));
                    sb.append(Integer.toHexString(b & 15));
                }
                string = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                string = null;
            }
            Date date = AccessToken.l;
            AccessToken accessTokenP = h.p();
            if (string == null || !string.equals(viewIndexer.previousDigest)) {
                viewIndexer.processRequest(INSTANCE.buildAppIndexingRequest(str, accessTokenP, a0.b(), "app_indexing"), string);
            }
        } catch (Throwable th) {
            lz.a(ViewIndexer.class, th);
        }
    }

    public static final void sendToServerUnityInstance(@NotNull String str) {
        if (lz.a.contains(ViewIndexer.class)) {
            return;
        }
        try {
            INSTANCE.sendToServerUnityInstance(str);
        } catch (Throwable th) {
            lz.a(ViewIndexer.class, th);
        }
    }

    public final void processRequest(@Nullable com.facebook.k0 request, @Nullable String currentDigest) {
        Set set = lz.a;
        if (set.contains(this) || request == null) {
            return;
        }
        try {
            n0 n0VarC = request.c();
            try {
                JSONObject jSONObject = n0VarC.b;
                if (jSONObject == null) {
                    Log.e(TAG, "Error sending UI component tree to Facebook: " + n0VarC.d);
                    return;
                }
                if ("true".equals(jSONObject.optString("success"))) {
                    n nVar = k0.c;
                    TAG.getClass();
                    synchronized (a0.b) {
                    }
                    this.previousDigest = currentDigest;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z = jSONObject.getBoolean("is_app_indexing_enabled");
                    st stVar = st.a;
                    if (set.contains(st.class)) {
                        return;
                    }
                    try {
                        st.g.set(z);
                    } catch (Throwable th) {
                        lz.a(st.class, th);
                    }
                }
            } catch (JSONException e) {
                Log.e(TAG, "Error decoding server response.", e);
            }
        } catch (Throwable th2) {
            lz.a(this, th2);
        }
    }

    public final void schedule() {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            try {
                a0.c().execute(new ok2(17, this, new t6(this, 1)));
            } catch (RejectedExecutionException e) {
                Log.e(TAG, "Error scheduling indexing job", e);
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public final void unschedule() {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            if (this.activityReference.get() == null) {
                return;
            }
            try {
                Timer timer = this.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                this.indexingTimer = null;
            } catch (Exception e) {
                Log.e(TAG, "Error unscheduling indexing job", e);
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public ViewIndexer(@NotNull Activity activity) {
        activity.getClass();
        this.activityReference = new WeakReference<>(activity);
        this.previousDigest = null;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        instance = this;
    }
}
