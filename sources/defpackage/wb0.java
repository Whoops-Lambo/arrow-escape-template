package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.inmobi.media.Fi;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wb0 implements Bundleable.Creator, TrackSelector.InvalidationListener, androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener, DrmSessionManager.DrmSessionReference, androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference, zq2, yv, ListenerSet.Event, PurchasesUpdatedListener, OnFailureListener {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(int i, Object obj, Object obj2, Object obj3, String str) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void e(String str, Object obj, Object obj2, Object obj3) {
        throw new AssertionError(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    @Override // defpackage.zq2
    public Object apply(Object obj) {
        ob2 ob2Var = (ob2) obj;
        String strD = pb2.b.d(ob2Var);
        strD.getClass();
        ob2Var.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strD.getBytes(er.a);
        bytes.getClass();
        return bytes;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        switch (this.a) {
            case 0:
                return DeviceInfo.lambda$static$0(bundle);
            case 12:
                return ExoPlaybackException.a(bundle);
            default:
                return Format.fromBundle(bundle);
        }
    }

    @Override // defpackage.yv
    public Object h(lt0 lt0Var) {
        switch (this.a) {
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 11:
                Lazy lazy = ExecutorsRegistrar.a;
                return uy2.a;
            case 25:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(lt0Var);
            case 26:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(lt0Var);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(lt0Var);
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        Player.Listener listener = (Player.Listener) obj;
        switch (this.a) {
            case 13:
                listener.onSeekProcessed();
                break;
            case 14:
                listener.onPlayerError(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
                break;
            default:
                listener.onRenderedFirstFrame();
                break;
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        switch (this.a) {
            case 16:
                Fi.b(billingResult, list);
                break;
            default:
                Fi.a(billingResult, list);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        switch (this.a) {
            case 2:
                DownloadHelper.lambda$new$2();
                break;
            default:
                androidx.media3.exoplayer.offline.DownloadHelper.lambda$new$0();
                break;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
    public void release() {
        switch (this.a) {
            case 4:
                DrmSessionManager.DrmSessionReference.lambda$static$0();
                break;
            default:
                androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference.lambda$static$0();
                break;
        }
    }

    public static /* synthetic */ void g(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public /* synthetic */ wb0(int i) {
        this.a = i;
    }
}
