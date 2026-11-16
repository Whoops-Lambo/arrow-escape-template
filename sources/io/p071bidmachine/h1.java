package io.p071bidmachine;

import android.text.TextUtils;
import com.explorestack.protobuf.adcom.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class h1 {
    public static Context.App.Release a(android.content.Context context) {
        String str;
        BuildInfo buildInfoObtain = BuildInfo.obtain(context);
        Context.App.Release.Builder builderNewBuilder = Context.App.Release.newBuilder();
        if (buildInfoObtain.isDebuggable()) {
            str = "debug";
        } else {
            str = "release";
        }
        builderNewBuilder.setType(str);
        String sha1Signature = buildInfoObtain.getSha1Signature(context);
        if (!TextUtils.isEmpty(sha1Signature)) {
            builderNewBuilder.setSignatureSHA1(sha1Signature);
        }
        String sha256Signature = buildInfoObtain.getSha256Signature(context);
        if (!TextUtils.isEmpty(sha256Signature)) {
            builderNewBuilder.setSignatureSHA256(sha256Signature);
        }
        return builderNewBuilder.build();
    }
}
