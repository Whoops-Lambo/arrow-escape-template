package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.nj;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.w3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class CallableC5039w3 implements Callable<A3> {
    private final int a;
    private final String b;
    private final AdData c;
    private final InterfaceC5075y3 d;
    private final InterfaceC5057x3 e;
    private final NetworkSettings f;

    /* JADX INFO: renamed from: com.ironsource.w3$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements BiddingDataCallback {
        final /* synthetic */ C4844l5 a;
        final /* synthetic */ BlockingQueue b;

        public a(C4844l5 c4844l5, BlockingQueue blockingQueue) {
            this.a = c4844l5;
            this.b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(@NotNull String str) {
            this.b.add(new A3(CallableC5039w3.this.d(), CallableC5039w3.this.c(), null, C4844l5.a(this.a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(@NotNull Map<String, Object> map) {
            this.b.add(new A3(CallableC5039w3.this.d(), CallableC5039w3.this.c(), map, C4844l5.a(this.a), null));
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public A3 call() throws Exception {
        C4844l5 c4844l5 = new C4844l5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.c, ContextProvider.getInstance().getActiveContext(), new a(c4844l5, arrayBlockingQueue));
        } catch (Exception e) {
            C4950r4.d().a(e);
            String strO = nj.o(e, new StringBuilder("Exception while calling collectBiddingData - "));
            IronLog.INTERNAL.error(strO);
            InterfaceC5057x3 interfaceC5057x3 = this.e;
            if (interfaceC5057x3 != null) {
                interfaceC5057x3.a(strO);
            }
        } catch (NoClassDefFoundError e2) {
            C4950r4.d().a(e2);
            String str = "Error while calling collectBiddingData - " + e2.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC5057x3 interfaceC5057x4 = this.e;
            if (interfaceC5057x4 != null) {
                interfaceC5057x4.a(str);
            }
        }
        InterfaceC5057x3 interfaceC5057x5 = this.e;
        if (interfaceC5057x5 != null) {
            interfaceC5057x5.a(this.f);
        }
        return (A3) arrayBlockingQueue.take();
    }

    public InterfaceC5075y3 b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }

    public CallableC5039w3(int i, String str, AdData adData, InterfaceC5075y3 interfaceC5075y3, InterfaceC5057x3 interfaceC5057x3, NetworkSettings networkSettings) {
        this.a = i;
        this.b = str;
        this.c = adData;
        this.d = interfaceC5075y3;
        this.e = interfaceC5057x3;
        this.f = networkSettings;
    }
}
