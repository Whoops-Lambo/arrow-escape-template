package com.vungle.ads.internal.model;

import com.mbridge.msdk.MBridgeConstans;
import defpackage.iw;
import defpackage.j8;
import defpackage.k71;
import defpackage.qt0;
import defpackage.rj;
import defpackage.uu;
import defpackage.wz2;
import defpackage.zj2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class g implements qt0 {
    public static final g a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AdPayload.AdUnit", gVar, 29);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("ad_type", true);
        pluginGeneratedSerialDescriptor.j("ad_source", true);
        pluginGeneratedSerialDescriptor.j("expiry", true);
        pluginGeneratedSerialDescriptor.j("expiry_duration", true);
        pluginGeneratedSerialDescriptor.j("deeplink_url", true);
        pluginGeneratedSerialDescriptor.j("click_coordinates_enabled", true);
        pluginGeneratedSerialDescriptor.j("ad_load_optimization", true);
        pluginGeneratedSerialDescriptor.j("mediation_name", true);
        pluginGeneratedSerialDescriptor.j("info", true);
        pluginGeneratedSerialDescriptor.j("sleep", true);
        pluginGeneratedSerialDescriptor.j(com.safedk.android.analytics.brandsafety.creatives.discoveries.t.d, true);
        pluginGeneratedSerialDescriptor.j("tpat", true);
        pluginGeneratedSerialDescriptor.j("vm_url", true);
        pluginGeneratedSerialDescriptor.j("vm_version", true);
        pluginGeneratedSerialDescriptor.j("ad_market_id", true);
        pluginGeneratedSerialDescriptor.j("notification", true);
        pluginGeneratedSerialDescriptor.j("load_ad", true);
        pluginGeneratedSerialDescriptor.j("viewability", true);
        pluginGeneratedSerialDescriptor.j("template_type", true);
        pluginGeneratedSerialDescriptor.j("template_settings", true);
        pluginGeneratedSerialDescriptor.j("creative_id", true);
        pluginGeneratedSerialDescriptor.j(MBridgeConstans.APP_ID, true);
        pluginGeneratedSerialDescriptor.j("show_close", true);
        pluginGeneratedSerialDescriptor.j("show_close_incentivized", true);
        pluginGeneratedSerialDescriptor.j("ad_size", true);
        pluginGeneratedSerialDescriptor.j("webview_settings", true);
        pluginGeneratedSerialDescriptor.j("use_preloading", true);
        pluginGeneratedSerialDescriptor.j("max_download_retry_attempts", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        KSerializer kSerializerW = uu.w(zj2Var);
        KSerializer kSerializerW2 = uu.w(zj2Var);
        KSerializer kSerializerW3 = uu.w(zj2Var);
        k71 k71Var = k71.a;
        KSerializer kSerializerW4 = uu.w(k71Var);
        KSerializer kSerializerW5 = uu.w(k71Var);
        KSerializer kSerializerW6 = uu.w(zj2Var);
        rj rjVar = rj.a;
        return new KSerializer[]{kSerializerW, kSerializerW2, kSerializerW3, kSerializerW4, kSerializerW5, kSerializerW6, uu.w(rjVar), uu.w(rjVar), uu.w(zj2Var), uu.w(zj2Var), uu.w(k71Var), uu.w(k71Var), uu.w(w.a), uu.w(zj2Var), uu.w(zj2Var), uu.w(zj2Var), uu.w(new j8(zj2Var, 0)), uu.w(new j8(zj2Var, 0)), uu.w(x.a), uu.w(zj2Var), uu.w(t.a), uu.w(zj2Var), uu.w(zj2Var), uu.w(k71Var), uu.w(k71Var), uu.w(d.a), uu.w(d0.a), uu.w(rjVar), uu.w(k71Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        encoder.getClass();
        iVar.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        i.a(iVar, iwVarB, pluginGeneratedSerialDescriptor);
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.qt0
    public final KSerializer[] typeParametersSerializers() {
        return wz2.d;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r43) {
        /*
            Method dump skipped, instruction units count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.g.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }
}
