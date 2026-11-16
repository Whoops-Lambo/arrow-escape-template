package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.d8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class C4704d8 extends InterfaceC4686c8.a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    /* JADX INFO: renamed from: com.ironsource.d8$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener b;

        public a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4704d8.this.a(this.a, "onRewardedVideoAdLoadSuccess()");
            this.b.onRewardedVideoAdLoadSuccess(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4704d8.this.a(this.a, "onRewardedVideoAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onRewardedVideoAdLoadFailed(this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener b;

        public c(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4704d8.this.a(this.a, "onRewardedVideoAdOpened()");
            this.b.onRewardedVideoAdOpened(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4704d8.this.a(this.a, "onRewardedVideoAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onRewardedVideoAdShowFailed(this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$e */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener b;

        public e(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4704d8.this.a(this.a, "onRewardedVideoAdClicked()");
            this.b.onRewardedVideoAdClicked(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$f */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class f implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener b;

        public f(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4704d8.this.a(this.a, "onRewardedVideoAdRewarded()");
            this.b.onRewardedVideoAdRewarded(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d8$g */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class g implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyRewardedVideoListener b;

        public g(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4704d8.this.a(this.a, "onRewardedVideoAdClosed()");
            this.b.onRewardedVideoAdClosed(this.a);
        }
    }

    public C4704d8(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        b(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        boolean z;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        e eVar = new e(str, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(eVar, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        boolean z;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        g gVar = new g(str, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(gVar, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        boolean z;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        b bVar = new b(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(bVar, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        boolean z;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a aVar = new a(str, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(aVar, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        boolean z;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        c cVar = new c(str, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(cVar, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        boolean z;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        f fVar = new f(str, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(fVar, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        boolean z;
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        d dVar = new d(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA);
        if (iSDemandOnlyRewardedVideoListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(dVar, z);
    }

    public C4704d8() {
    }
}
