package com.vungle.ads.internal.model;

import com.ironsource.C5013ud;
import com.singular.sdk.internal.Constants;
import defpackage.hw;
import defpackage.hw0;
import defpackage.iw;
import defpackage.j8;
import defpackage.jg1;
import defpackage.k71;
import defpackage.m93;
import defpackage.qt0;
import defpackage.rj;
import defpackage.uu;
import defpackage.wz2;
import defpackage.zj2;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class v1 implements qt0 {
    public static final v1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        v1 v1Var = new v1();
        a = v1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload", v1Var, 20);
        pluginGeneratedSerialDescriptor.j("reuse_assets", true);
        pluginGeneratedSerialDescriptor.j("config", true);
        pluginGeneratedSerialDescriptor.j("endpoints", true);
        pluginGeneratedSerialDescriptor.j("log_metrics", true);
        pluginGeneratedSerialDescriptor.j(C5013ud.c, true);
        pluginGeneratedSerialDescriptor.j("user", true);
        pluginGeneratedSerialDescriptor.j("config_extension", true);
        pluginGeneratedSerialDescriptor.j("disable_ad_id", true);
        pluginGeneratedSerialDescriptor.j("ri_enabled", true);
        pluginGeneratedSerialDescriptor.j("session_timeout", true);
        pluginGeneratedSerialDescriptor.j("wait_for_connectivity_for_tpat", true);
        pluginGeneratedSerialDescriptor.j("sdk_session_timeout", true);
        pluginGeneratedSerialDescriptor.j("signals_disabled", true);
        pluginGeneratedSerialDescriptor.j("fpd_enabled", true);
        pluginGeneratedSerialDescriptor.j("rta_debugging", true);
        pluginGeneratedSerialDescriptor.j("config_last_validated_ts", true);
        pluginGeneratedSerialDescriptor.j("auto_redirect", true);
        pluginGeneratedSerialDescriptor.j("enable_ot", true);
        pluginGeneratedSerialDescriptor.j("prewarm_webview", true);
        pluginGeneratedSerialDescriptor.j("vm_templates", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerW = uu.w(z1.a);
        KSerializer kSerializerW2 = uu.w(d2.a);
        KSerializer kSerializerW3 = uu.w(g2.a);
        KSerializer kSerializerW4 = uu.w(q2.a);
        KSerializer kSerializerW5 = uu.w(new j8(h3.a, 0));
        KSerializer kSerializerW6 = uu.w(t2.a);
        zj2 zj2Var = zj2.a;
        KSerializer kSerializerW7 = uu.w(zj2Var);
        rj rjVar = rj.a;
        KSerializer kSerializerW8 = uu.w(rjVar);
        KSerializer kSerializerW9 = uu.w(rjVar);
        k71 k71Var = k71.a;
        return new KSerializer[]{kSerializerW, kSerializerW2, kSerializerW3, kSerializerW4, kSerializerW5, kSerializerW6, kSerializerW7, kSerializerW8, kSerializerW9, uu.w(k71Var), uu.w(rjVar), uu.w(k71Var), uu.w(rjVar), uu.w(rjVar), uu.w(rjVar), uu.w(jg1.a), uu.w(w1.a), uu.w(rjVar), uu.w(rjVar), uu.w(new hw0(zj2Var, k71Var, 1))};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w2 w2Var = (w2) obj;
        encoder.getClass();
        w2Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        w2.a(w2Var, iwVarB, pluginGeneratedSerialDescriptor);
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.qt0
    public final KSerializer[] typeParametersSerializers() {
        return wz2.d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i;
        decoder.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        Object obj = null;
        Object objB = null;
        boolean z = true;
        Object objB2 = null;
        Object obj2 = null;
        Object objB3 = null;
        Object objB4 = null;
        Object objB5 = null;
        Object objB6 = null;
        Object objB7 = null;
        Object objB8 = null;
        Object objB9 = null;
        Object objB10 = null;
        Object objB11 = null;
        Object objB12 = null;
        Object objB13 = null;
        Object objB14 = null;
        Object objB15 = null;
        Object objB16 = null;
        Object objB17 = null;
        Object objB18 = null;
        int i2 = 0;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            switch (iT) {
                case -1:
                    z = false;
                    obj = obj;
                    objB16 = objB16;
                    objB15 = objB15;
                    objB13 = objB13;
                    break;
                case 0:
                    objB18 = hwVarB.B(pluginGeneratedSerialDescriptor, 0, z1.a, objB18);
                    objB17 = objB17;
                    i = 1;
                    objB16 = objB16;
                    objB15 = objB15;
                    objB13 = objB13;
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 1:
                    objB17 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, d2.a, objB17);
                    objB16 = objB16;
                    i = 2;
                    objB15 = objB15;
                    objB13 = objB13;
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 2:
                    obj = obj;
                    z = z;
                    objB16 = hwVarB.B(pluginGeneratedSerialDescriptor, 2, g2.a, objB16);
                    objB15 = objB15;
                    objB13 = objB13;
                    i = 4;
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 3:
                    obj = obj;
                    z = z;
                    objB15 = hwVarB.B(pluginGeneratedSerialDescriptor, 3, q2.a, objB15);
                    i = 8;
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 4:
                    obj = obj;
                    z = z;
                    objB14 = hwVarB.B(pluginGeneratedSerialDescriptor, 4, new j8(h3.a, 0), objB14);
                    objB13 = objB13;
                    i = 16;
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 5:
                    obj = obj;
                    i = 32;
                    objB13 = hwVarB.B(pluginGeneratedSerialDescriptor, 5, t2.a, objB13);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 6:
                    obj = obj;
                    i = 64;
                    objB12 = hwVarB.B(pluginGeneratedSerialDescriptor, 6, zj2.a, objB12);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 7:
                    obj = obj;
                    i = 128;
                    objB11 = hwVarB.B(pluginGeneratedSerialDescriptor, 7, rj.a, objB11);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 8:
                    Object objB19 = hwVarB.B(pluginGeneratedSerialDescriptor, 8, rj.a, obj);
                    i = 256;
                    obj = objB19;
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 9:
                    obj = obj;
                    i = 512;
                    objB = hwVarB.B(pluginGeneratedSerialDescriptor, 9, k71.a, objB);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 10:
                    obj = obj;
                    i = 1024;
                    objB10 = hwVarB.B(pluginGeneratedSerialDescriptor, 10, rj.a, objB10);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 11:
                    obj = obj;
                    i = 2048;
                    objB9 = hwVarB.B(pluginGeneratedSerialDescriptor, 11, k71.a, objB9);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 12:
                    obj = obj;
                    i = 4096;
                    objB8 = hwVarB.B(pluginGeneratedSerialDescriptor, 12, rj.a, objB8);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 13:
                    obj = obj;
                    i = 8192;
                    objB7 = hwVarB.B(pluginGeneratedSerialDescriptor, 13, rj.a, objB7);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 14:
                    obj = obj;
                    i = 16384;
                    objB6 = hwVarB.B(pluginGeneratedSerialDescriptor, 14, rj.a, objB6);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 15:
                    obj = obj;
                    i = 32768;
                    objB5 = hwVarB.B(pluginGeneratedSerialDescriptor, 15, jg1.a, objB5);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 16:
                    obj = obj;
                    i = 65536;
                    objB4 = hwVarB.B(pluginGeneratedSerialDescriptor, 16, w1.a, objB4);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 17:
                    obj = obj;
                    i = 131072;
                    objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 17, rj.a, objB3);
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 18:
                    obj = obj;
                    Object objB20 = hwVarB.B(pluginGeneratedSerialDescriptor, 18, rj.a, obj2);
                    i = Constants.REFERRER_LINK_MAX_RESPONSE_CHARS;
                    obj2 = objB20;
                    i2 |= i;
                    z = z;
                    obj = obj;
                    break;
                case 19:
                    objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 19, new hw0(zj2.a, k71.a, 1), objB2);
                    i2 |= 524288;
                    z = z;
                    obj = obj;
                    objB = objB;
                    break;
                default:
                    m93.c(iT);
                    return null;
            }
        }
        Object obj3 = obj;
        Object obj4 = objB13;
        Object obj5 = objB15;
        Object obj6 = objB16;
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new w2(i2, (b2) objB18, (f2) objB17, (i2) obj6, (s2) obj5, (List) objB14, (v2) obj4, (String) objB12, (Boolean) objB11, (Boolean) obj3, (Integer) objB, (Boolean) objB10, (Integer) objB9, (Boolean) objB8, (Boolean) objB7, (Boolean) objB6, (Long) objB5, (y1) objB4, (Boolean) objB3, (Boolean) obj2, (Map) objB2);
    }
}
