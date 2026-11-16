package com.unity3d.ads.adplayer.webviewpool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.UnityAdsNetworkBridge;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.ep0;
import defpackage.fv;
import defpackage.fy;
import defpackage.gv;
import defpackage.t50;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.uy;
import defpackage.wz2;
import defpackage.zr0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 32\u00020\u0001:\u00013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0083@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fH\u0096@¢\u0006\u0004\b \u0010\u001fJ\u0018\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b!\u0010\u0010J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\"\u0010\u0010J\u0018\u0010#\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b#\u0010\u0010J\u0010\u0010%\u001a\u00020\fH\u0090@¢\u0006\u0004\b$\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/unity3d/ads/adplayer/webviewpool/AndroidWebViewPool;", "Lcom/unity3d/ads/adplayer/webviewpool/WebViewPool;", "Landroid/content/Context;", "context", "Luy;", "mainDispatcher", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "getCachedAsset", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Landroid/content/Context;Luy;Lcom/unity3d/ads/core/domain/GetCachedAsset;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lcom/unity3d/ads/adplayer/webviewpool/PoolEntry;", "entry", "", "isHealthy", "(Lcom/unity3d/ads/adplayer/webviewpool/PoolEntry;Ldy;)Ljava/lang/Object;", "Laz2;", "destroyEntry", "Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "createClient", "()Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "client", "Landroid/webkit/WebView;", "createWebView", "(Lcom/unity3d/ads/adplayer/AndroidWebViewClient;Ldy;)Ljava/lang/Object;", "", "size", "initialize", "(ILdy;)Ljava/lang/Object;", "acquireFreshEntry", "(Ldy;)Ljava/lang/Object;", "acquireForShow", "resetEntry", "enqueueRecycled", "release", "createFreshEntry$unity_ads_defaultRelease", "createFreshEntry", "Landroid/content/Context;", "Luy;", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "freshViews", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "recycledViews", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "poolSize", "I", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AndroidWebViewPool implements WebViewPool {
    private static final long ACQUIRE_TIMEOUT_MS = 2000;
    private static final long HEALTH_CHECK_TIMEOUT_MS = 500;

    @NotNull
    private final Context context;

    @NotNull
    private final ConcurrentLinkedQueue<PoolEntry> freshViews;

    @NotNull
    private final GetCachedAsset getCachedAsset;

    @NotNull
    private final AtomicBoolean isInitialized;

    @NotNull
    private final uy mainDispatcher;
    private volatile int poolSize;

    @NotNull
    private final ConcurrentLinkedQueue<PoolEntry> recycledViews;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool", f = "AndroidWebViewPool.kt", l = {58, 69}, m = "acquireForShow$suspendImpl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends fy {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dy dyVar) {
            super(dyVar);
        }

        @Override // defpackage.ph
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewPool.acquireForShow$suspendImpl(AndroidWebViewPool.this, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Lcom/unity3d/ads/adplayer/webviewpool/PoolEntry;", "<anonymous>", "(Lcz;)Lcom/unity3d/ads/adplayer/webviewpool/PoolEntry;"}, k = 3, mv = {2, 1, 0})
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireForShow$2", f = "AndroidWebViewPool.kt", l = {62, 63}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends ul2 implements zr0 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass2(dy dyVar) {
            super(2, dyVar);
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return AndroidWebViewPool.this.new AnonymousClass2(dyVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x004b A[PHI: r9
  0x004b: PHI (r9v6 java.util.Iterator) = (r9v5 java.util.Iterator), (r9v13 java.util.Iterator) binds: [B:10:0x0030, B:15:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:13:0x0051  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0057). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0091 -> B:14:0x0057). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.ph
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                r1 = 0
                r2 = 2
                r3 = 1
                dz r4 = defpackage.dz.a
                if (r0 == 0) goto L30
                if (r0 == r3) goto L20
                if (r0 != r2) goto L1a
                java.lang.Object r0 = r8.L$1
                java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
                java.lang.Object r5 = r8.L$0
                java.util.Iterator r5 = (java.util.Iterator) r5
                defpackage.wz2.a0(r9)
                r9 = r5
                goto L57
            L1a:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.e32.i(r8)
                return r1
            L20:
                java.lang.Object r0 = r8.L$2
                com.unity3d.ads.adplayer.webviewpool.PoolEntry r0 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r0
                java.lang.Object r5 = r8.L$1
                java.util.concurrent.ConcurrentLinkedQueue r5 = (java.util.concurrent.ConcurrentLinkedQueue) r5
                java.lang.Object r6 = r8.L$0
                java.util.Iterator r6 = (java.util.Iterator) r6
                defpackage.wz2.a0(r9)
                goto L77
            L30:
                defpackage.wz2.a0(r9)
                com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r9 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.this
                java.util.concurrent.ConcurrentLinkedQueue r9 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getFreshViews$p(r9)
                com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r0 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.this
                java.util.concurrent.ConcurrentLinkedQueue r0 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getRecycledViews$p(r0)
                java.util.concurrent.ConcurrentLinkedQueue[] r9 = new java.util.concurrent.ConcurrentLinkedQueue[]{r9, r0}
                java.util.List r9 = defpackage.eu.z(r9)
                java.util.Iterator r9 = r9.iterator()
            L4b:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L94
                java.lang.Object r0 = r9.next()
                java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            L57:
                java.lang.Object r5 = r0.poll()
                com.unity3d.ads.adplayer.webviewpool.PoolEntry r5 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r5
                if (r5 != 0) goto L60
                goto L4b
            L60:
                com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.this
                r8.L$0 = r9
                r8.L$1 = r0
                r8.L$2 = r5
                r8.label = r3
                java.lang.Object r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$isHealthy(r6, r5, r8)
                if (r6 != r4) goto L71
                goto L90
            L71:
                r7 = r6
                r6 = r9
                r9 = r7
                r7 = r5
                r5 = r0
                r0 = r7
            L77:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L80
                return r0
            L80:
                com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r9 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.this
                r8.L$0 = r6
                r8.L$1 = r5
                r8.L$2 = r1
                r8.label = r2
                java.lang.Object r9 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$destroyEntry(r9, r0, r8)
                if (r9 != r4) goto L91
            L90:
                return r4
            L91:
                r0 = r5
                r9 = r6
                goto L57
            L94:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.zr0
        public final Object invoke(cz czVar, dy dyVar) {
            return ((AnonymousClass2) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireFreshEntry$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Lcom/unity3d/ads/adplayer/webviewpool/PoolEntry;", "<anonymous>", "(Lcz;)Lcom/unity3d/ads/adplayer/webviewpool/PoolEntry;"}, k = 3, mv = {2, 1, 0})
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$acquireFreshEntry$2", f = "AndroidWebViewPool.kt", l = {49, 50}, m = "invokeSuspend")
    public static final class C51412 extends ul2 implements zr0 {
        Object L$0;
        int label;

        public C51412(dy dyVar) {
            super(2, dyVar);
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return AndroidWebViewPool.this.new C51412(dyVar);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0031  */
        /* JADX WARN: Code duplicated, block: B:15:0x003e A[PHI: r0 r6
  0x003e: PHI (r0v2 com.unity3d.ads.adplayer.webviewpool.PoolEntry) = (r0v3 com.unity3d.ads.adplayer.webviewpool.PoolEntry), (r0v7 com.unity3d.ads.adplayer.webviewpool.PoolEntry) binds: [B:13:0x003b, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r6v5 java.lang.Object) = (r6v11 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x003b, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:17:0x0046 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x0047  */
        /* JADX WARN: Code duplicated, block: B:22:0x0062 A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        
            if (r6.destroyEntry(r0, r5) == r4) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:21:0x0054). Please report as a decompilation issue!!! */
        @Override // defpackage.ph
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 0
                r2 = 2
                r3 = 1
                dz r4 = defpackage.dz.a
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.wz2.a0(r6)
                goto L54
            L11:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.e32.i(r5)
                return r1
            L17:
                java.lang.Object r0 = r5.L$0
                com.unity3d.ads.adplayer.webviewpool.PoolEntry r0 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r0
                defpackage.wz2.a0(r6)
                goto L3e
            L1f:
                defpackage.wz2.a0(r6)
                com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.this
                java.util.concurrent.ConcurrentLinkedQueue r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getFreshViews$p(r6)
                java.lang.Object r6 = r6.poll()
                com.unity3d.ads.adplayer.webviewpool.PoolEntry r6 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r6
                r0 = r6
            L2f:
                if (r0 == 0) goto L62
                com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.this
                r5.L$0 = r0
                r5.label = r3
                java.lang.Object r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$isHealthy(r6, r0, r5)
                if (r6 != r4) goto L3e
                goto L53
            L3e:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L47
                return r0
            L47:
                com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.this
                r5.L$0 = r1
                r5.label = r2
                java.lang.Object r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$destroyEntry(r6, r0, r5)
                if (r6 != r4) goto L54
            L53:
                return r4
            L54:
                com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.this
                java.util.concurrent.ConcurrentLinkedQueue r6 = com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.access$getFreshViews$p(r6)
                java.lang.Object r6 = r6.poll()
                r0 = r6
                com.unity3d.ads.adplayer.webviewpool.PoolEntry r0 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r0
                goto L2f
            L62:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.C51412.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.zr0
        public final Object invoke(cz czVar, dy dyVar) {
            return ((C51412) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$createWebView$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Landroid/webkit/WebView;", "<anonymous>", "(Lcz;)Landroid/webkit/WebView;"}, k = 3, mv = {2, 1, 0})
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$createWebView$2", f = "AndroidWebViewPool.kt", l = {}, m = "invokeSuspend")
    public static final class C51422 extends ul2 implements zr0 {
        final /* synthetic */ AndroidWebViewClient $client;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51422(AndroidWebViewClient androidWebViewClient, dy dyVar) {
            super(2, dyVar);
            this.$client = androidWebViewClient;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return AndroidWebViewPool.this.new C51422(this.$client, dyVar);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
            WebView webView = new WebView(AndroidWebViewPool.this.context);
            AndroidWebViewClient androidWebViewClient = this.$client;
            WebSettings settings = webView.getSettings();
            settings.setAllowFileAccess(false);
            settings.setBlockNetworkImage(false);
            settings.setBlockNetworkLoads(false);
            settings.setBuiltInZoomControls(false);
            settings.setCacheMode(-1);
            settings.setDatabaseEnabled(false);
            settings.setDisplayZoomControls(false);
            settings.setDomStorageEnabled(false);
            settings.setGeolocationEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setMixedContentMode(1);
            settings.setNeedInitialFocus(true);
            settings.setSupportMultipleWindows(false);
            settings.setSupportZoom(false);
            settings.setUseWideViewPort(true);
            webView.setWebViewClient(androidWebViewClient);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setVerticalScrollBarEnabled(false);
            webView.setInitialScale(0);
            webView.setBackgroundColor(0);
            webView.setBackgroundResource(0);
            return webView;
        }

        @Override // defpackage.zr0
        public final Object invoke(cz czVar, dy dyVar) {
            return ((C51422) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$destroyEntry$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {2, 1, 0})
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$destroyEntry$2", f = "AndroidWebViewPool.kt", l = {}, m = "invokeSuspend")
    public static final class C51432 extends ul2 implements zr0 {
        final /* synthetic */ PoolEntry $entry;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51432(PoolEntry poolEntry, dy dyVar) {
            super(2, dyVar);
            this.$entry = poolEntry;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new C51432(this.$entry, dyVar);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
            this.$entry.getWebView().destroy();
            return az2.a;
        }

        @Override // defpackage.zr0
        public final Object invoke(cz czVar, dy dyVar) {
            return ((C51432) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$initialize$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool", f = "AndroidWebViewPool.kt", l = {41}, m = "initialize$suspendImpl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C51441 extends fy {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C51441(dy dyVar) {
            super(dyVar);
        }

        @Override // defpackage.ph
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewPool.initialize$suspendImpl(AndroidWebViewPool.this, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool", f = "AndroidWebViewPool.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE}, m = "isHealthy")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C51451 extends fy {
        int label;
        /* synthetic */ Object result;

        public C51451(dy dyVar) {
            super(dyVar);
        }

        @Override // defpackage.ph
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewPool.this.isHealthy(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "", "<anonymous>", "(Lcz;)Z"}, k = 3, mv = {2, 1, 0})
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2", f = "AndroidWebViewPool.kt", l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend")
    public static final class C51462 extends ul2 implements zr0 {
        final /* synthetic */ PoolEntry $entry;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {2, 1, 0})
        @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$isHealthy$2$1", f = "AndroidWebViewPool.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends ul2 implements zr0 {
            final /* synthetic */ PoolEntry $entry;
            final /* synthetic */ fv $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PoolEntry poolEntry, fv fvVar, dy dyVar) {
                super(2, dyVar);
                this.$entry = poolEntry;
                this.$result = fvVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(fv fvVar, String str) {
                ((gv) fvVar).M(Boolean.valueOf(str != null));
            }

            @Override // defpackage.ph
            public final dy create(Object obj, dy dyVar) {
                return new AnonymousClass1(this.$entry, this.$result, dyVar);
            }

            @Override // defpackage.ph
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
                WebView webView = this.$entry.getWebView();
                final fv fvVar = this.$result;
                webView.evaluateJavascript("1", new ValueCallback() { // from class: com.unity3d.ads.adplayer.webviewpool.a
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        AndroidWebViewPool.C51462.AnonymousClass1.invokeSuspend$lambda$0(fvVar, (String) obj2);
                    }
                });
                return az2.a;
            }

            @Override // defpackage.zr0
            public final Object invoke(cz czVar, dy dyVar) {
                return ((AnonymousClass1) create(czVar, dyVar)).invokeSuspend(az2.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51462(PoolEntry poolEntry, dy dyVar) {
            super(2, dyVar);
            this.$entry = poolEntry;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return AndroidWebViewPool.this.new C51462(this.$entry, dyVar);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            fv gvVar;
            int i = this.label;
            dz dzVar = dz.a;
            if (i == 0) {
                wz2.a0(obj);
                gvVar = new gv();
                uy uyVar = AndroidWebViewPool.this.mainDispatcher;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$entry, gvVar, null);
                this.L$0 = gvVar;
                this.label = 1;
                if (tb5.E(uyVar, anonymousClass1, this) != dzVar) {
                }
            }
            if (i != 1) {
                if (i == 2) {
                    wz2.a0(obj);
                    return obj;
                }
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gvVar = (fv) this.L$0;
            wz2.a0(obj);
            this.L$0 = null;
            this.label = 2;
            Object objM = ((gv) gvVar).m(this);
            return objM == dzVar ? dzVar : objM;
        }

        @Override // defpackage.zr0
        public final Object invoke(cz czVar, dy dyVar) {
            return ((C51462) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$release$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool", f = "AndroidWebViewPool.kt", l = {113, 113}, m = "release$suspendImpl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C51471 extends fy {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C51471(dy dyVar) {
            super(dyVar);
        }

        @Override // defpackage.ph
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewPool.release$suspendImpl(AndroidWebViewPool.this, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool", f = "AndroidWebViewPool.kt", l = {83, 95, 97}, m = "resetEntry$suspendImpl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C51481 extends fy {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C51481(dy dyVar) {
            super(dyVar);
        }

        @Override // defpackage.ph
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewPool.resetEntry$suspendImpl(AndroidWebViewPool.this, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {2, 1, 0})
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$2", f = "AndroidWebViewPool.kt", l = {}, m = "invokeSuspend")
    public static final class C51492 extends ul2 implements zr0 {
        final /* synthetic */ PoolEntry $entry;
        final /* synthetic */ AndroidWebViewPool$resetEntry$resetClient$1 $resetClient;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51492(PoolEntry poolEntry, AndroidWebViewPool$resetEntry$resetClient$1 androidWebViewPool$resetEntry$resetClient$1, dy dyVar) {
            super(2, dyVar);
            this.$entry = poolEntry;
            this.$resetClient = androidWebViewPool$resetEntry$resetClient$1;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new C51492(this.$entry, this.$resetClient, dyVar);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
            ViewParent parent = this.$entry.getWebView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.$entry.getWebView());
            }
            this.$entry.getWebView().removeJavascriptInterface("webviewbridge");
            this.$entry.getWebView().setWebViewClient(this.$resetClient);
            UnityAdsNetworkBridge.webviewLoadUrl(this.$entry.getWebView(), AndroidWebViewClient.BLANK_PAGE);
            this.$entry.getWebView().clearHistory();
            return az2.a;
        }

        @Override // defpackage.zr0
        public final Object invoke(cz czVar, dy dyVar) {
            return ((C51492) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {2, 1, 0})
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$3", f = "AndroidWebViewPool.kt", l = {95}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends ul2 implements zr0 {
        final /* synthetic */ fv $blankLoaded;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(fv fvVar, dy dyVar) {
            super(2, dyVar);
            this.$blankLoaded = fvVar;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new AnonymousClass3(this.$blankLoaded, dyVar);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                wz2.a0(obj);
                fv fvVar = this.$blankLoaded;
                this.label = 1;
                Object objM = ((gv) fvVar).m(this);
                dz dzVar = dz.a;
                if (objM == dzVar) {
                    return dzVar;
                }
            } else {
                if (i != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
            return az2.a;
        }

        @Override // defpackage.zr0
        public final Object invoke(cz czVar, dy dyVar) {
            return ((AnonymousClass3) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {2, 1, 0})
    @t50(c = "com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$4", f = "AndroidWebViewPool.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends ul2 implements zr0 {
        final /* synthetic */ PoolEntry $entry;
        final /* synthetic */ AndroidWebViewClient $freshClient;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PoolEntry poolEntry, AndroidWebViewClient androidWebViewClient, dy dyVar) {
            super(2, dyVar);
            this.$entry = poolEntry;
            this.$freshClient = androidWebViewClient;
        }

        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new AnonymousClass4(this.$entry, this.$freshClient, dyVar);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
            this.$entry.getWebView().setWebViewClient(this.$freshClient);
            return az2.a;
        }

        @Override // defpackage.zr0
        public final Object invoke(cz czVar, dy dyVar) {
            return ((AnonymousClass4) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object acquireForShow$suspendImpl(AndroidWebViewPool androidWebViewPool, dy dyVar) {
        AnonymousClass1 anonymousClass1;
        if (dyVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dyVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = androidWebViewPool.new AnonymousClass1(dyVar);
            }
        } else {
            anonymousClass1 = androidWebViewPool.new AnonymousClass1(dyVar);
        }
        Object objN = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(objN);
            AnonymousClass2 anonymousClass2 = androidWebViewPool.new AnonymousClass2(null);
            anonymousClass1.L$0 = androidWebViewPool;
            anonymousClass1.label = 1;
            objN = ep0.N(2000L, anonymousClass2, anonymousClass1);
            if (objN != dzVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                wz2.a0(objN);
                return objN;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        androidWebViewPool = (AndroidWebViewPool) anonymousClass1.L$0;
        wz2.a0(objN);
        PoolEntry poolEntry = (PoolEntry) objN;
        if (poolEntry != null) {
            return poolEntry;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        Object objCreateFreshEntry$unity_ads_defaultRelease = androidWebViewPool.createFreshEntry$unity_ads_defaultRelease(anonymousClass1);
        return objCreateFreshEntry$unity_ads_defaultRelease == dzVar ? dzVar : objCreateFreshEntry$unity_ads_defaultRelease;
    }

    public static /* synthetic */ Object acquireFreshEntry$suspendImpl(AndroidWebViewPool androidWebViewPool, dy dyVar) {
        return ep0.N(2000L, androidWebViewPool.new C51412(null), dyVar);
    }

    private final AndroidWebViewClient createClient() {
        return new AndroidWebViewClient(this.getCachedAsset, this.sendDiagnosticEvent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object createFreshEntry$suspendImpl(AndroidWebViewPool androidWebViewPool, dy dyVar) {
        AndroidWebViewPool$createFreshEntry$1 androidWebViewPool$createFreshEntry$1;
        AndroidWebViewClient androidWebViewClient;
        if (dyVar instanceof AndroidWebViewPool$createFreshEntry$1) {
            androidWebViewPool$createFreshEntry$1 = (AndroidWebViewPool$createFreshEntry$1) dyVar;
            int i = androidWebViewPool$createFreshEntry$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidWebViewPool$createFreshEntry$1.label = i - Integer.MIN_VALUE;
            } else {
                androidWebViewPool$createFreshEntry$1 = new AndroidWebViewPool$createFreshEntry$1(androidWebViewPool, dyVar);
            }
        } else {
            androidWebViewPool$createFreshEntry$1 = new AndroidWebViewPool$createFreshEntry$1(androidWebViewPool, dyVar);
        }
        Object obj = androidWebViewPool$createFreshEntry$1.result;
        int i2 = androidWebViewPool$createFreshEntry$1.label;
        if (i2 == 0) {
            wz2.a0(obj);
            AndroidWebViewClient androidWebViewClientCreateClient = androidWebViewPool.createClient();
            androidWebViewPool$createFreshEntry$1.L$0 = androidWebViewClientCreateClient;
            androidWebViewPool$createFreshEntry$1.label = 1;
            Object objCreateWebView = androidWebViewPool.createWebView(androidWebViewClientCreateClient, androidWebViewPool$createFreshEntry$1);
            Object obj2 = dz.a;
            if (objCreateWebView == obj2) {
                return obj2;
            }
            obj = objCreateWebView;
            androidWebViewClient = androidWebViewClientCreateClient;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            androidWebViewClient = (AndroidWebViewClient) androidWebViewPool$createFreshEntry$1.L$0;
            wz2.a0(obj);
        }
        return new PoolEntry((WebView) obj, androidWebViewClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public final Object createWebView(AndroidWebViewClient androidWebViewClient, dy dyVar) {
        return tb5.E(this.mainDispatcher, new C51422(androidWebViewClient, null), dyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object destroyEntry(PoolEntry poolEntry, dy dyVar) throws Throwable {
        Object objE = tb5.E(this.mainDispatcher, new C51432(poolEntry, null), dyVar);
        return objE == dz.a ? objE : az2.a;
    }

    public static Object enqueueRecycled$suspendImpl(AndroidWebViewPool androidWebViewPool, PoolEntry poolEntry, dy dyVar) throws Throwable {
        az2 az2Var = az2.a;
        if (androidWebViewPool.recycledViews.size() < androidWebViewPool.poolSize) {
            androidWebViewPool.recycledViews.offer(poolEntry);
            return az2Var;
        }
        Object objDestroyEntry = androidWebViewPool.destroyEntry(poolEntry, dyVar);
        return objDestroyEntry == dz.a ? objDestroyEntry : az2Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:12:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object initialize$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r7, int r8, defpackage.dy r9) {
        /*
            az2 r0 = defpackage.az2.a
            boolean r1 = r9 instanceof com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.C51441
            if (r1 == 0) goto L15
            r1 = r9
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$initialize$1 r1 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.C51441) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$initialize$1 r1 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$initialize$1
            r1.<init>(r9)
        L1a:
            java.lang.Object r9 = r1.result
            dz r2 = defpackage.dz.a
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L3a
            int r7 = r1.I$1
            int r8 = r1.I$0
            java.lang.Object r3 = r1.L$1
            java.util.concurrent.ConcurrentLinkedQueue r3 = (java.util.concurrent.ConcurrentLinkedQueue) r3
            java.lang.Object r5 = r1.L$0
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r5 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool) r5
            defpackage.wz2.a0(r9)
            r6 = r1
            r1 = r8
            r8 = r5
        L37:
            r5 = r3
            r3 = r6
            goto L6c
        L3a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r7)
            r7 = 0
            return r7
        L41:
            defpackage.wz2.a0(r9)
            r7.poolSize = r8
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.isInitialized
            r3 = 0
            boolean r9 = r9.compareAndSet(r3, r4)
            if (r9 != 0) goto L50
            return r0
        L50:
            r9 = r8
            r8 = r7
            r7 = r3
        L53:
            if (r7 >= r9) goto L73
            java.util.concurrent.ConcurrentLinkedQueue<com.unity3d.ads.adplayer.webviewpool.PoolEntry> r3 = r8.freshViews
            r1.L$0 = r8
            r1.L$1 = r3
            r1.I$0 = r9
            r1.I$1 = r7
            r1.label = r4
            java.lang.Object r5 = r8.createFreshEntry$unity_ads_defaultRelease(r1)
            if (r5 != r2) goto L68
            return r2
        L68:
            r6 = r1
            r1 = r9
            r9 = r5
            goto L37
        L6c:
            r5.offer(r9)
            int r7 = r7 + r4
            r9 = r1
            r1 = r3
            goto L53
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.initialize$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, int, dy):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object isHealthy(PoolEntry poolEntry, dy dyVar) {
        C51451 c51451;
        if (dyVar instanceof C51451) {
            c51451 = (C51451) dyVar;
            int i = c51451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c51451.label = i - Integer.MIN_VALUE;
            } else {
                c51451 = new C51451(dyVar);
            }
        } else {
            c51451 = new C51451(dyVar);
        }
        Object objN = c51451.result;
        int i2 = c51451.label;
        if (i2 == 0) {
            wz2.a0(objN);
            C51462 c51462 = new C51462(poolEntry, null);
            c51451.label = 1;
            objN = ep0.N(500L, c51462, c51451);
            dz dzVar = dz.a;
            if (objN == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objN);
        }
        Boolean bool = (Boolean) objN;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6.enqueueRecycled((com.unity3d.ads.adplayer.webviewpool.PoolEntry) r8, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object release$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6, com.unity3d.ads.adplayer.webviewpool.PoolEntry r7, defpackage.dy r8) {
        /*
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.C51471
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$release$1 r0 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.C51471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$release$1 r0 = new com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$release$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.wz2.a0(r8)
            goto L54
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r6)
            return r2
        L31:
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool r6 = (com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool) r6
            defpackage.wz2.a0(r8)
            goto L47
        L39:
            defpackage.wz2.a0(r8)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r8 = r6.resetEntry(r7, r0)
            if (r8 != r5) goto L47
            goto L53
        L47:
            com.unity3d.ads.adplayer.webviewpool.PoolEntry r8 = (com.unity3d.ads.adplayer.webviewpool.PoolEntry) r8
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.enqueueRecycled(r8, r0)
            if (r6 != r5) goto L54
        L53:
            return r5
        L54:
            az2 r6 = defpackage.az2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool.release$suspendImpl(com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool, com.unity3d.ads.adplayer.webviewpool.PoolEntry, dy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$resetClient$1] */
    public static Object resetEntry$suspendImpl(AndroidWebViewPool androidWebViewPool, PoolEntry poolEntry, dy dyVar) {
        C51481 c51481;
        AndroidWebViewPool androidWebViewPool2;
        fv fvVar;
        PoolEntry poolEntry2;
        AndroidWebViewPool androidWebViewPool3;
        AndroidWebViewClient androidWebViewClientCreateClient;
        uy uyVar;
        AnonymousClass4 anonymousClass4;
        PoolEntry poolEntry3;
        AndroidWebViewClient androidWebViewClient;
        if (dyVar instanceof C51481) {
            c51481 = (C51481) dyVar;
            int i = c51481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c51481.label = i - Integer.MIN_VALUE;
            } else {
                c51481 = androidWebViewPool.new C51481(dyVar);
            }
        } else {
            c51481 = androidWebViewPool.new C51481(dyVar);
        }
        Object obj = c51481.result;
        int i2 = c51481.label;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(obj);
            final gv gvVar = new gv();
            ?? r1 = new WebViewClientCompat() { // from class: com.unity3d.ads.adplayer.webviewpool.AndroidWebViewPool$resetEntry$resetClient$1
                @Override // android.webkit.WebViewClient
                public void onLoadResource(WebView view, String url) {
                    super.onLoadResource(view, url);
                    CreativeInfoManager.onResourceLoaded("com.unity3d.ads", view, url);
                }

                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    BrandSafetyUtils.onWebViewPageStarted("com.unity3d.ads", view, url);
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                    return CreativeInfoManager.onWebViewResponseWithHeaders("com.unity3d.ads", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                    BrandSafetyUtils.onShouldOverrideUrlLoading("com.unity3d.ads", view, url, zShouldOverrideUrlLoading);
                    return zShouldOverrideUrlLoading;
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView view, String url) {
                    view.getClass();
                    url.getClass();
                    if (url.equals(AndroidWebViewClient.BLANK_PAGE)) {
                        ((gv) gvVar).M(az2.a);
                    }
                }
            };
            uy uyVar2 = androidWebViewPool.mainDispatcher;
            C51492 c51492 = new C51492(poolEntry, r1, null);
            c51481.L$0 = androidWebViewPool;
            c51481.L$1 = poolEntry;
            c51481.L$2 = gvVar;
            c51481.label = 1;
            if (tb5.E(uyVar2, c51492, c51481) != dzVar) {
                androidWebViewPool2 = androidWebViewPool;
                fvVar = gvVar;
            }
            return dzVar;
        }
        if (i2 == 1) {
            fvVar = (fv) c51481.L$2;
            poolEntry = (PoolEntry) c51481.L$1;
            androidWebViewPool2 = (AndroidWebViewPool) c51481.L$0;
            wz2.a0(obj);
        } else {
            if (i2 == 2) {
                poolEntry2 = (PoolEntry) c51481.L$1;
                androidWebViewPool3 = (AndroidWebViewPool) c51481.L$0;
                wz2.a0(obj);
                androidWebViewClientCreateClient = androidWebViewPool3.createClient();
                uyVar = androidWebViewPool3.mainDispatcher;
                anonymousClass4 = new AnonymousClass4(poolEntry2, androidWebViewClientCreateClient, null);
                c51481.L$0 = poolEntry2;
                c51481.L$1 = androidWebViewClientCreateClient;
                c51481.label = 3;
                if (tb5.E(uyVar, anonymousClass4, c51481) != dzVar) {
                    poolEntry3 = poolEntry2;
                    androidWebViewClient = androidWebViewClientCreateClient;
                }
                return dzVar;
            }
            if (i2 != 3) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            androidWebViewClient = (AndroidWebViewClient) c51481.L$1;
            poolEntry3 = (PoolEntry) c51481.L$0;
            wz2.a0(obj);
        }
        return new PoolEntry(poolEntry3.getWebView(), androidWebViewClient);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(fvVar, null);
        c51481.L$0 = androidWebViewPool2;
        c51481.L$1 = poolEntry;
        c51481.L$2 = null;
        c51481.label = 2;
        if (ep0.N(500L, anonymousClass3, c51481) != dzVar) {
            poolEntry2 = poolEntry;
            androidWebViewPool3 = androidWebViewPool2;
            androidWebViewClientCreateClient = androidWebViewPool3.createClient();
            uyVar = androidWebViewPool3.mainDispatcher;
            anonymousClass4 = new AnonymousClass4(poolEntry2, androidWebViewClientCreateClient, null);
            c51481.L$0 = poolEntry2;
            c51481.L$1 = androidWebViewClientCreateClient;
            c51481.label = 3;
            if (tb5.E(uyVar, anonymousClass4, c51481) != dzVar) {
                poolEntry3 = poolEntry2;
                androidWebViewClient = androidWebViewClientCreateClient;
                return new PoolEntry(poolEntry3.getWebView(), androidWebViewClient);
            }
        }
        return dzVar;
    }

    public AndroidWebViewPool(@NotNull Context context, @NotNull uy uyVar, @NotNull GetCachedAsset getCachedAsset, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        context.getClass();
        uyVar.getClass();
        getCachedAsset.getClass();
        sendDiagnosticEvent.getClass();
        this.context = context;
        this.mainDispatcher = uyVar;
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.freshViews = new ConcurrentLinkedQueue<>();
        this.recycledViews = new ConcurrentLinkedQueue<>();
        this.isInitialized = new AtomicBoolean(false);
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    @Nullable
    public Object acquireForShow(@NotNull dy dyVar) {
        return acquireForShow$suspendImpl(this, dyVar);
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    @Nullable
    public Object acquireFreshEntry(@NotNull dy dyVar) {
        return acquireFreshEntry$suspendImpl(this, dyVar);
    }

    @Nullable
    public Object createFreshEntry$unity_ads_defaultRelease(@NotNull dy dyVar) {
        return createFreshEntry$suspendImpl(this, dyVar);
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    @Nullable
    public Object enqueueRecycled(@NotNull PoolEntry poolEntry, @NotNull dy dyVar) {
        return enqueueRecycled$suspendImpl(this, poolEntry, dyVar);
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    @Nullable
    public Object initialize(int i, @NotNull dy dyVar) {
        return initialize$suspendImpl(this, i, dyVar);
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    @Nullable
    public Object release(@NotNull PoolEntry poolEntry, @NotNull dy dyVar) {
        return release$suspendImpl(this, poolEntry, dyVar);
    }

    @Override // com.unity3d.ads.adplayer.webviewpool.WebViewPool
    @Nullable
    public Object resetEntry(@NotNull PoolEntry poolEntry, @NotNull dy dyVar) {
        return resetEntry$suspendImpl(this, poolEntry, dyVar);
    }
}
