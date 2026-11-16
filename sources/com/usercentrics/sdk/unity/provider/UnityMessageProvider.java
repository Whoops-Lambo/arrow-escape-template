package com.usercentrics.sdk.unity.provider;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/usercentrics/sdk/unity/provider/UnityMessageProvider;", "", "()V", "provide", "Lcom/usercentrics/sdk/unity/provider/UnityMessageSender;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class UnityMessageProvider {
    @NotNull
    public UnityMessageSender provide() {
        return new UnityMessageSenderImpl();
    }
}
