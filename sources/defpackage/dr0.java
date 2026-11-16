package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.p003activity.result.ActivityResult;
import androidx.p003activity.result.ActivityResultCallback;
import com.applovin.mediation.unity.MaxUnityAdManager;
import com.applovin.mediation.unity.MaxUnityPlugin;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.explorestack.protobuf.adcom.c;
import com.facebook.a0;
import com.facebook.g0;
import com.facebook.internal.b0;
import com.facebook.internal.v0;
import com.facebook.internal.x;
import com.facebook.internal.z;
import com.facebook.k0;
import com.facebook.l0;
import com.facebook.m0;
import com.facebook.n0;
import com.facebook.w0;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.HeartRating;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.mbridge.msdk.config.component.log.LogCpt;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dr0 implements ActivityResultCallback, Bundleable.Creator, Id3Decoder.FramePredicate, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate, x, Consumer, f, LoudnessCodecController.LoudnessParameterUpdateListener, MaxUnityAdManager.Listener, uj1 {
    public final /* synthetic */ int a;

    public /* synthetic */ dr0(int i) {
        this.a = i;
    }

    public static /* synthetic */ void b() {
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ void c(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void e(Object obj, Object obj2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void g(Object obj, String str, int i, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void h(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(String str, Object obj, int i) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void k(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void l(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void n() {
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ void o(Object obj, Object obj2, String str) throws IOException {
        throw new IOException(str + obj + ((Object) " to ") + obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p(String str, Object obj, int i) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void q(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void r(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // com.facebook.internal.x
    public void d(boolean z) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        final int i = 0;
        final int i2 = 1;
        switch (this.a) {
            case 12:
                if (z) {
                    synchronized (kz.b) {
                        try {
                            a0 a0Var = a0.a;
                            if (w0.c()) {
                                nl0.p();
                            }
                            if (kz.c != null) {
                                Log.w("kz", "Already enabled!");
                            } else {
                                kz kzVar = new kz(Thread.getDefaultUncaughtExceptionHandler());
                                kz.c = kzVar;
                                Thread.setDefaultUncaughtExceptionHandler(kzVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (b0.b(z.CrashShield)) {
                        si0.a = true;
                        if (w0.c() && !v0.D()) {
                            File fileB = z61.b();
                            if (fileB == null) {
                                fileArrListFiles = new File[0];
                            } else {
                                fileArrListFiles = fileB.listFiles(new mz(8));
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                final y61 y61VarV = ep0.v(file);
                                if (y61VarV.a()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", y61VarV.toString());
                                        String str = k0.j;
                                        arrayList.add(c.n(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{a0.b()}, 1)), jSONObject, new g0() { // from class: qh0
                                            @Override // com.facebook.g0
                                            public final void onCompleted(n0 n0Var) {
                                                JSONObject jSONObject2;
                                                JSONObject jSONObject3;
                                                int i3 = i2;
                                                Object obj = y61VarV;
                                                switch (i3) {
                                                    case 0:
                                                        ArrayList arrayList2 = (ArrayList) obj;
                                                        n0Var.getClass();
                                                        try {
                                                            if (n0Var.d == null && (jSONObject2 = n0Var.e) != null && jSONObject2.getBoolean("success")) {
                                                                int size = arrayList2.size();
                                                                int i4 = 0;
                                                                while (i4 < size) {
                                                                    Object obj2 = arrayList2.get(i4);
                                                                    i4++;
                                                                    z61.a(((ph0) obj2).a);
                                                                }
                                                                break;
                                                            }
                                                        } catch (JSONException unused) {
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        y61 y61Var = (y61) obj;
                                                        n0Var.getClass();
                                                        try {
                                                            if (n0Var.d == null && (jSONObject3 = n0Var.e) != null && jSONObject3.getBoolean("success")) {
                                                                z61.a(y61Var.a);
                                                                break;
                                                            }
                                                        } catch (JSONException unused2) {
                                                            return;
                                                        }
                                                        break;
                                                }
                                            }
                                        }));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                m0 m0Var = new m0(arrayList);
                                String str2 = k0.j;
                                v0.M(m0Var);
                                new l0(m0Var).executeOnExecutor(a0.c(), new Void[0]);
                            }
                        }
                        lz.b = true;
                    }
                    b0.b(z.ThreadCheck);
                    return;
                }
                return;
            case 13:
                if (z) {
                    a0 a0Var2 = a0.a;
                    if (!w0.c() || v0.D()) {
                        return;
                    }
                    File fileB2 = z61.b();
                    if (fileB2 == null) {
                        fileArrListFiles2 = new File[0];
                    } else {
                        fileArrListFiles2 = fileB2.listFiles(new mz(5));
                        fileArrListFiles2.getClass();
                    }
                    final ArrayList arrayList2 = new ArrayList();
                    for (File file2 : fileArrListFiles2) {
                        file2.getClass();
                        ph0 ph0Var = new ph0();
                        String name = file2.getName();
                        name.getClass();
                        ph0Var.a = name;
                        JSONObject jSONObjectE = z61.e(name);
                        if (jSONObjectE != null) {
                            ph0Var.c = Long.valueOf(jSONObjectE.optLong("timestamp", 0L));
                            ph0Var.b = jSONObjectE.optString("error_message", null);
                        }
                        if (ph0Var.b != null && ph0Var.c != null) {
                            arrayList2.add(ph0Var);
                        }
                    }
                    hu.M(arrayList2, new x(17));
                    JSONArray jSONArray = new JSONArray();
                    for (int i3 = 0; i3 < arrayList2.size() && i3 < 1000; i3++) {
                        jSONArray.put(arrayList2.get(i3));
                    }
                    z61.f("error_reports", jSONArray, new g0() { // from class: qh0
                        @Override // com.facebook.g0
                        public final void onCompleted(n0 n0Var) {
                            JSONObject jSONObject2;
                            JSONObject jSONObject3;
                            int i4 = i;
                            Object obj = arrayList2;
                            switch (i4) {
                                case 0:
                                    ArrayList arrayList3 = (ArrayList) obj;
                                    n0Var.getClass();
                                    try {
                                        if (n0Var.d == null && (jSONObject2 = n0Var.e) != null && jSONObject2.getBoolean("success")) {
                                            int size = arrayList3.size();
                                            int i5 = 0;
                                            while (i5 < size) {
                                                Object obj2 = arrayList3.get(i5);
                                                i5++;
                                                z61.a(((ph0) obj2).a);
                                            }
                                            break;
                                        }
                                    } catch (JSONException unused2) {
                                        return;
                                    }
                                    break;
                                default:
                                    y61 y61Var = (y61) obj;
                                    n0Var.getClass();
                                    try {
                                        if (n0Var.d == null && (jSONObject3 = n0Var.e) != null && jSONObject3.getBoolean("success")) {
                                            z61.a(y61Var.a);
                                            break;
                                        }
                                    } catch (JSONException unused3) {
                                        return;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                if (z) {
                    AtomicBoolean atomicBoolean = z.a;
                    synchronized (z.class) {
                        try {
                            Set set = lz.a;
                            if (set.contains(z.class)) {
                                return;
                            }
                            try {
                                if (z.a.getAndSet(true)) {
                                    return;
                                }
                                a0 a0Var3 = a0.a;
                                if (w0.c()) {
                                    z.a();
                                }
                                int i4 = v.a;
                                if (!set.contains(v.class)) {
                                    try {
                                        v.b.scheduleWithFixedDelay(v.d, 0L, 500L, TimeUnit.MILLISECONDS);
                                    } catch (Throwable th2) {
                                        lz.a(v.class, th2);
                                    }
                                }
                                break;
                            } catch (Throwable th3) {
                                lz.a(z.class, th3);
                            }
                            return;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                return;
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 10:
                return Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
            default:
                return androidx.media3.extractor.metadata.id3.Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        switch (this.a) {
            case 4:
                return HeartRating.fromBundle(bundle);
            default:
                return MediaItem.fromBundle(bundle);
        }
    }

    @Override // defpackage.uj1
    public int getScore(Object obj) {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        switch (this.a) {
            case 27:
                return MediaCodecUtil.lambda$applyWorkarounds$1(mediaCodecInfo);
            default:
                return MediaCodecUtil.lambda$applyWorkarounds$2(mediaCodecInfo);
        }
    }

    @Override // androidx.p003activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        FullScreenWebViewDisplay.startForResult$lambda$12((ActivityResult) obj);
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) {
        return LogCpt.a(eVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener
    public Bundle onLoudnessParameterUpdate(Bundle bundle) {
        return LoudnessCodecController.LoudnessParameterUpdateListener.lambda$static$0(bundle);
    }

    @Override // com.applovin.mediation.unity.MaxUnityAdManager.Listener
    public void onSdkInitializationComplete(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        MaxUnityPlugin.isSdkInitialized = true;
    }
}
