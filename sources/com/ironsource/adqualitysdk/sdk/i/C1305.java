package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.vq2;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ｉ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1305 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final C0884 f3910;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C1048 f3911;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C1099 f3912;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final Charset f3909 = Charset.forName(StringFog.decrypt("UlwaB8Q=\n", "BwhcKvyQzGs=\n"));

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static final Charset f3908 = Charset.forName(StringFog.decrypt("jsReiegSMUY=\n", "25dzyLtReA8=\n"));

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m908(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 20 + bArr2.length + 2 + bArr3.length + 4 + bArr4.length);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.write(StringFog.decrypt("NlxANA==\n", "Yx0EZfUO2Mo=\n").getBytes(f3908));
            dataOutputStream.writeByte(1);
            dataOutputStream.writeShort(1);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeByte(bArr.length);
            dataOutputStream.write(bArr);
            dataOutputStream.writeByte(bArr2.length);
            dataOutputStream.write(bArr2);
            dataOutputStream.writeShort(bArr3.length);
            dataOutputStream.write(bArr3);
            dataOutputStream.writeInt(bArr4.length);
            dataOutputStream.write(bArr4);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            vq2.n(StringFog.decrypt("JSpM/89JL2gMa1b22ERucAoxQLPPQ3l5DyRV9g==\n", "Y0slk6otDxw=\n"), e);
            return null;
        }
    }

    public C1305(C1099 c1099, C1048 c1048, C0884 c0884) {
        this.f3912 = c1099;
        this.f3911 = c1048;
        this.f3910 = c0884;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m909(String str, String str2, long j, C0733 c0733) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put(StringFog.decrypt("6pfJAKUjAuTbmMo=\n", "j/mtcMpKbJA=\n"), str);
            jSONObjectJsonObjectInit.put(StringFog.decrypt("Npqsm7E0LvQqkA==\n", "Rf7HzdRGXZ0=\n"), this.f3910.f2373);
            jSONObjectJsonObjectInit.put(StringFog.decrypt("dAGbMEs+UtJ9\n", "FXHreS92M6E=\n"), this.f3910.f2372);
            jSONObjectJsonObjectInit.put(StringFog.decrypt("pBcuS4JATy+y\n", "1nJfPuczO2Y=\n"), str2);
            jSONObjectJsonObjectInit.put(StringFog.decrypt("8EGRkbYNMHH0\n", "hCj89MV5URw=\n"), j);
            jSONObjectJsonObjectInit.put(StringFog.decrypt("NCCFytEBqJckCJ3O0QA=\n", "XU7xr7ZzweM=\n"), c0733.m592());
            return jSONObjectJsonObjectInit.toString().getBytes(f3909);
        } catch (Exception e) {
            vq2.n(StringFog.decrypt("MjUORps1+9QbdAVflz2/gDUVIwq0ApTu\n", "dFRnKv5R26A=\n"), e);
            return null;
        }
    }
}
