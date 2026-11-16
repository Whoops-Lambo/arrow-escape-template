package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class C4594a8 extends InterfaceC4686c8.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    /* JADX INFO: renamed from: com.ironsource.a8$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        public a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4594a8.this.a(this.a, "onInterstitialAdReady()");
            this.b.onInterstitialAdReady(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyInterstitialListener c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4594a8.this.a(this.a, "onInterstitialAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdLoadFailed(this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        public c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4594a8.this.a(this.a, "onInterstitialAdOpened()");
            this.b.onInterstitialAdOpened(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyInterstitialListener c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4594a8.this.a(this.a, "onInterstitialAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdShowFailed(this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$e */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        public e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4594a8.this.a(this.a, "onInterstitialAdClicked()");
            this.b.onInterstitialAdClicked(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a8$f */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class f implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        public f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4594a8.this.a(this.a, "onInterstitialAdClosed()");
            this.b.onInterstitialAdClosed(this.a);
        }
    }

    public C4594a8(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        boolean z;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        e eVar = new e(str, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(eVar, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        boolean z;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        f fVar = new f(str, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(fVar, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        boolean z;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        b bVar = new b(str, ironSourceError, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(bVar, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        boolean z;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        c cVar = new c(str, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(cVar, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        boolean z;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a aVar = new a(str, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(aVar, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        boolean z;
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        d dVar = new d(str, ironSourceError, iSDemandOnlyInterstitialListenerA);
        if (iSDemandOnlyInterstitialListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(dVar, z);
    }

    public C4594a8() {
    }
}
