package com.usercentrics.sdk.unity.provider;

import com.explorestack.protobuf.z;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import defpackage.cm2;
import defpackage.gd1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/usercentrics/sdk/unity/provider/UnityMessageSenderImpl;", "Lcom/usercentrics/sdk/unity/provider/UnityMessageSender;", "<init>", "()V", "", "gameObjectName", "receiver", "content", "Laz2;", "sendUnityMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "unityPlayerClassName", "Ljava/lang/String;", "unityPlayerSendMessageMethod", "Ljava/lang/reflect/Method;", "sendMessageMethod$delegate", "Lgd1;", "getSendMessageMethod", "()Ljava/lang/reflect/Method;", "sendMessageMethod", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UnityMessageSenderImpl implements UnityMessageSender {

    @NotNull
    private final String unityPlayerClassName = MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME;

    @NotNull
    private final String unityPlayerSendMessageMethod = "UnitySendMessage";

    /* JADX INFO: renamed from: sendMessageMethod$delegate, reason: from kotlin metadata */
    @NotNull
    private final gd1 sendMessageMethod = new cm2(new UnityMessageSenderImpl$sendMessageMethod$2(this));

    private final Method getSendMessageMethod() {
        Object value = this.sendMessageMethod.getValue();
        value.getClass();
        return (Method) value;
    }

    @Override // com.usercentrics.sdk.unity.provider.UnityMessageSender
    public void sendUnityMessage(@NotNull String gameObjectName, @NotNull String receiver, @NotNull String content) throws IllegalAccessException, InvocationTargetException {
        z.r(gameObjectName, receiver, content);
        getSendMessageMethod().invoke(null, gameObjectName, receiver, content);
    }
}
