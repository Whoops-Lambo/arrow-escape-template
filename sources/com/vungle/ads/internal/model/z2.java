package com.vungle.ads.internal.model;

import com.ironsource.R6;
import com.singular.sdk.internal.Constants;
import defpackage.ap0;
import defpackage.hw;
import defpackage.iw;
import defpackage.jg1;
import defpackage.k71;
import defpackage.m93;
import defpackage.qt0;
import defpackage.rj;
import defpackage.uu;
import defpackage.wz2;
import defpackage.zj2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z2 implements qt0 {
    public static final z2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        z2 z2Var = new z2();
        a = z2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.VungleExt", z2Var, 23);
        pluginGeneratedSerialDescriptor.j("is_google_play_services_available", true);
        pluginGeneratedSerialDescriptor.j("app_set_id", true);
        pluginGeneratedSerialDescriptor.j("app_set_id_scope", true);
        pluginGeneratedSerialDescriptor.j("battery_level", true);
        pluginGeneratedSerialDescriptor.j("battery_state", true);
        pluginGeneratedSerialDescriptor.j("battery_saver_enabled", true);
        pluginGeneratedSerialDescriptor.j("connection_type", true);
        pluginGeneratedSerialDescriptor.j("connection_type_detail", true);
        pluginGeneratedSerialDescriptor.j("locale", true);
        pluginGeneratedSerialDescriptor.j("language", true);
        pluginGeneratedSerialDescriptor.j("time_zone", true);
        pluginGeneratedSerialDescriptor.j("volume_level", true);
        pluginGeneratedSerialDescriptor.j("sound_enabled", true);
        pluginGeneratedSerialDescriptor.j("is_tv", true);
        pluginGeneratedSerialDescriptor.j("sd_card_available", true);
        pluginGeneratedSerialDescriptor.j("is_sideload_enabled", true);
        pluginGeneratedSerialDescriptor.j(R6.X0, true);
        pluginGeneratedSerialDescriptor.j("amazon_advertising_id", true);
        pluginGeneratedSerialDescriptor.j("sit", true);
        pluginGeneratedSerialDescriptor.j("oit", true);
        pluginGeneratedSerialDescriptor.j("ort", true);
        pluginGeneratedSerialDescriptor.j("obt", true);
        pluginGeneratedSerialDescriptor.j("gp_version", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.qt0
    public final KSerializer[] childSerializers() {
        zj2 zj2Var = zj2.a;
        KSerializer kSerializerW = uu.w(zj2Var);
        k71 k71Var = k71.a;
        KSerializer kSerializerW2 = uu.w(k71Var);
        KSerializer kSerializerW3 = uu.w(zj2Var);
        KSerializer kSerializerW4 = uu.w(zj2Var);
        KSerializer kSerializerW5 = uu.w(zj2Var);
        KSerializer kSerializerW6 = uu.w(zj2Var);
        KSerializer kSerializerW7 = uu.w(zj2Var);
        KSerializer kSerializerW8 = uu.w(zj2Var);
        KSerializer kSerializerW9 = uu.w(zj2Var);
        KSerializer kSerializerW10 = uu.w(zj2Var);
        jg1 jg1Var = jg1.a;
        KSerializer kSerializerW11 = uu.w(jg1Var);
        KSerializer kSerializerW12 = uu.w(jg1Var);
        KSerializer kSerializerW13 = uu.w(jg1Var);
        KSerializer kSerializerW14 = uu.w(jg1Var);
        KSerializer kSerializerW15 = uu.w(zj2Var);
        rj rjVar = rj.a;
        ap0 ap0Var = ap0.a;
        return new KSerializer[]{rjVar, kSerializerW, kSerializerW2, ap0Var, kSerializerW3, k71Var, kSerializerW4, kSerializerW5, kSerializerW6, kSerializerW7, kSerializerW8, ap0Var, k71Var, rjVar, k71Var, rjVar, kSerializerW9, kSerializerW10, kSerializerW11, kSerializerW12, kSerializerW13, kSerializerW14, kSerializerW15};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b3 b3Var = (b3) obj;
        encoder.getClass();
        b3Var.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        iw iwVarB = encoder.b(pluginGeneratedSerialDescriptor);
        b3.a(b3Var, iwVarB, pluginGeneratedSerialDescriptor);
        iwVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.qt0
    public final KSerializer[] typeParametersSerializers() {
        return wz2.d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object obj;
        int i;
        int i2;
        decoder.getClass();
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        hw hwVarB = decoder.b(pluginGeneratedSerialDescriptor);
        float fW = 0.0f;
        float fW2 = 0.0f;
        Object objB = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        Object objB5 = null;
        Object objB6 = null;
        Object objB7 = null;
        Object objB8 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object objB9 = null;
        Object objB10 = null;
        Object objB11 = null;
        Object objB12 = null;
        boolean z = true;
        int i3 = 0;
        boolean zY = false;
        int iH = 0;
        int iH2 = 0;
        boolean zY2 = false;
        int iH3 = 0;
        boolean zY3 = false;
        Object objB13 = null;
        while (z) {
            int iT = hwVarB.t(pluginGeneratedSerialDescriptor);
            Object objB14 = obj3;
            switch (iT) {
                case -1:
                    z = false;
                    objB4 = objB4;
                    obj3 = objB14;
                    objB = objB;
                    objB2 = objB2;
                    break;
                case 0:
                    obj = objB14;
                    zY = hwVarB.y(pluginGeneratedSerialDescriptor, 0);
                    i = 1;
                    objB2 = objB2;
                    objB14 = obj;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 1:
                    obj = objB14;
                    objB13 = hwVarB.B(pluginGeneratedSerialDescriptor, 1, zj2.a, objB13);
                    objB2 = objB2;
                    i = 2;
                    objB14 = obj;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 2:
                    objB = objB;
                    objB2 = objB2;
                    i = 4;
                    objB14 = hwVarB.B(pluginGeneratedSerialDescriptor, 2, k71.a, objB14);
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 3:
                    objB = objB;
                    objB4 = objB4;
                    i = 8;
                    fW = hwVarB.w(pluginGeneratedSerialDescriptor, 3);
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 4:
                    objB = objB;
                    objB4 = hwVarB.B(pluginGeneratedSerialDescriptor, 4, zj2.a, objB4);
                    i = 16;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 5:
                    i2 = 32;
                    iH = hwVarB.h(pluginGeneratedSerialDescriptor, 5);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 6:
                    objB = hwVarB.B(pluginGeneratedSerialDescriptor, 6, zj2.a, objB);
                    i2 = 64;
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 7:
                    objB2 = hwVarB.B(pluginGeneratedSerialDescriptor, 7, zj2.a, objB2);
                    i2 = 128;
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 8:
                    objB3 = hwVarB.B(pluginGeneratedSerialDescriptor, 8, zj2.a, objB3);
                    i2 = 256;
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 9:
                    i2 = 512;
                    objB12 = hwVarB.B(pluginGeneratedSerialDescriptor, 9, zj2.a, objB12);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 10:
                    i2 = 1024;
                    objB11 = hwVarB.B(pluginGeneratedSerialDescriptor, 10, zj2.a, objB11);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 11:
                    i2 = 2048;
                    fW2 = hwVarB.w(pluginGeneratedSerialDescriptor, 11);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 12:
                    i2 = 4096;
                    iH2 = hwVarB.h(pluginGeneratedSerialDescriptor, 12);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 13:
                    i2 = 8192;
                    zY2 = hwVarB.y(pluginGeneratedSerialDescriptor, 13);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 14:
                    i2 = 16384;
                    iH3 = hwVarB.h(pluginGeneratedSerialDescriptor, 14);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 15:
                    i2 = 32768;
                    zY3 = hwVarB.y(pluginGeneratedSerialDescriptor, 15);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 16:
                    i2 = 65536;
                    objB10 = hwVarB.B(pluginGeneratedSerialDescriptor, 16, zj2.a, objB10);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 17:
                    i2 = 131072;
                    objB9 = hwVarB.B(pluginGeneratedSerialDescriptor, 17, zj2.a, objB9);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 18:
                    Object objB15 = hwVarB.B(pluginGeneratedSerialDescriptor, 18, jg1.a, obj2);
                    i2 = Constants.REFERRER_LINK_MAX_RESPONSE_CHARS;
                    obj2 = objB15;
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 19:
                    i2 = 524288;
                    objB8 = hwVarB.B(pluginGeneratedSerialDescriptor, 19, jg1.a, objB8);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 20:
                    i2 = 1048576;
                    objB7 = hwVarB.B(pluginGeneratedSerialDescriptor, 20, jg1.a, objB7);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 21:
                    i2 = 2097152;
                    objB6 = hwVarB.B(pluginGeneratedSerialDescriptor, 21, jg1.a, objB6);
                    i = i2;
                    objB = objB;
                    i3 |= i;
                    objB4 = objB4;
                    objB = objB;
                    obj3 = objB14;
                    break;
                case 22:
                    objB5 = hwVarB.B(pluginGeneratedSerialDescriptor, 22, zj2.a, objB5);
                    i3 |= 4194304;
                    objB4 = objB4;
                    obj3 = objB14;
                    break;
                default:
                    m93.c(iT);
                    return null;
            }
        }
        Object obj4 = objB2;
        Object obj5 = obj3;
        hwVarB.c(pluginGeneratedSerialDescriptor);
        return new b3(i3, zY, (String) objB13, (Integer) obj5, fW, (String) objB4, iH, (String) objB, (String) obj4, (String) objB3, (String) objB12, (String) objB11, fW2, iH2, zY2, iH3, zY3, (String) objB10, (String) objB9, (Long) obj2, (Long) objB8, (Long) objB7, (Long) objB6, (String) objB5);
    }
}
