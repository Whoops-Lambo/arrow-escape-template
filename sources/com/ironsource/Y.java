package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class Y implements X {

    @NotNull
    private final InterfaceC5030vc a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements Tc {
        final /* synthetic */ C4741f9 a;
        final /* synthetic */ InitListener b;

        public a(C4741f9 c4741f9, InitListener initListener) {
            this.a = c4741f9;
            this.b = initListener;
        }

        @Override // com.ironsource.Tc
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            W wE = this.a.e();
            ironLog.verbose("controllerURL = " + (wE != null ? wE.a() : null));
            W wE2 = this.a.e();
            ironLog.verbose("controllerConfig = " + (wE2 != null ? wE2.b() : null));
            W wE3 = this.a.e();
            ironLog.verbose("debugMode = " + (wE3 != null ? Integer.valueOf(wE3.c()) : null));
            ironLog.verbose("applicationKey = " + this.a.d());
            ironLog.verbose("userId = " + this.a.h());
            this.b.onInitSuccess();
        }

        @Override // com.ironsource.Tc
        public void onFail(C5008u8 c5008u8) {
            c5008u8.getClass();
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + c5008u8);
            this.b.onInitFailed(C5095z5.a.a(new IronSourceError(c5008u8.a(), c5008u8.b())));
        }
    }

    public Y(@NotNull InterfaceC5030vc interfaceC5030vc) {
        interfaceC5030vc.getClass();
        this.a = interfaceC5030vc;
    }

    @Override // com.ironsource.X
    public void a(@NotNull Context context, @NotNull C4741f9 c4741f9, @NotNull InitListener initListener) {
        int iC;
        JSONObject jSONObjectB;
        String strA;
        context.getClass();
        c4741f9.getClass();
        initListener.getClass();
        InterfaceC5030vc interfaceC5030vc = this.a;
        W wE = c4741f9.e();
        if (wE != null) {
            iC = wE.c();
        } else {
            iC = 0;
        }
        interfaceC5030vc.a(iC);
        W wE2 = c4741f9.e();
        if (wE2 != null && (strA = wE2.a()) != null) {
            this.a.b(strA);
        }
        W wE3 = c4741f9.e();
        if (wE3 != null && (jSONObjectB = wE3.b()) != null) {
            InterfaceC5030vc interfaceC5030vc2 = this.a;
            String string = jSONObjectB.toString();
            string.getClass();
            interfaceC5030vc2.a(string);
        }
        Map<String, String> mapA = new C4994tc().a();
        this.a.a(new a(c4741f9, initListener));
        this.a.a(context, c4741f9.d(), c4741f9.h(), mapA);
    }
}
