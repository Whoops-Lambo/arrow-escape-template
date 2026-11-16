package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class E2 extends InterfaceC4686c8.a<ISDemandOnlyBannerListener> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyBannerListener c;

        public a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            E2.this.a(this.a, "onBannerAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onBannerAdLoadFailed(this.a, this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            E2.this.a(this.a, "onBannerAdLoaded()");
            this.b.onBannerAdLoaded(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            E2.this.a(this.a, "onBannerAdShown()");
            this.b.onBannerAdShown(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            E2.this.a(this.a, "onBannerAdClicked()");
            this.b.onBannerAdClicked(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            E2.this.a(this.a, "onBannerAdLeftApplication()");
            this.b.onBannerAdLeftApplication(this.a);
        }
    }

    public void a(String str, IronSourceError ironSourceError) {
        boolean z;
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a aVar = new a(str, ironSourceError, iSDemandOnlyBannerListenerA);
        if (iSDemandOnlyBannerListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(aVar, z);
    }

    public void b(String str) {
        boolean z;
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        e eVar = new e(str, iSDemandOnlyBannerListenerA);
        if (iSDemandOnlyBannerListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(eVar, z);
    }

    public void c(String str) {
        boolean z;
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        b bVar = new b(str, iSDemandOnlyBannerListenerA);
        if (iSDemandOnlyBannerListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(bVar, z);
    }

    public void d(String str) {
        boolean z;
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        c cVar = new c(str, iSDemandOnlyBannerListenerA);
        if (iSDemandOnlyBannerListenerA != null) {
            z = true;
        } else {
            z = false;
        }
        a(cVar, z);
    }

    public void a(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new d(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }
}
