package com.usercentrics.sdk.unity.provider;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/usercentrics/sdk/unity/provider/UnityMessageSender;", "", "", "gameObjectName", "receiver", "content", "Laz2;", "sendUnityMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface UnityMessageSender {
    void sendUnityMessage(@NotNull String gameObjectName, @NotNull String receiver, @NotNull String content);
}
