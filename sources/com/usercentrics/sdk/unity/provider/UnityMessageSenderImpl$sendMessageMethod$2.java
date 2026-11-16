package com.usercentrics.sdk.unity.provider;

import defpackage.rc1;
import defpackage.sr0;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class UnityMessageSenderImpl$sendMessageMethod$2 extends rc1 implements sr0 {
    final /* synthetic */ UnityMessageSenderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityMessageSenderImpl$sendMessageMethod$2(UnityMessageSenderImpl unityMessageSenderImpl) {
        super(0);
        this.this$0 = unityMessageSenderImpl;
    }

    @Override // defpackage.sr0
    public final Method invoke() {
        return Class.forName(this.this$0.unityPlayerClassName).getMethod(this.this$0.unityPlayerSendMessageMethod, String.class, String.class, String.class);
    }
}
